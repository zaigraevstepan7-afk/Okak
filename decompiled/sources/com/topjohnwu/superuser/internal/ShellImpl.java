package com.topjohnwu.superuser.internal;

import android.text.TextUtils;
import com.topjohnwu.superuser.Shell;
import com.topjohnwu.superuser.ShellUtils;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class ShellImpl extends Shell {
    private final NoCloseInputStream STDERR;
    private final NoCloseOutputStream STDIN;
    private final NoCloseInputStream STDOUT;
    private final Condition idle;
    private boolean isRunningTask;
    private final Process process;
    private final ReentrantLock scheduleLock;
    private volatile int status;
    private final ArrayDeque<Shell.Task> tasks;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class NoCloseOutputStream extends FilterOutputStream {
        public NoCloseOutputStream(OutputStream outputStream) {
            super(outputStream instanceof BufferedOutputStream ? outputStream : new BufferedOutputStream(outputStream));
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ((FilterOutputStream) this).out.flush();
        }

        public void close0() {
            super.close();
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            ((FilterOutputStream) this).out.write(bArr, i, i2);
        }
    }

    public ShellImpl(BuilderImpl builderImpl, Process process) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.scheduleLock = reentrantLock;
        this.idle = reentrantLock.newCondition();
        this.tasks = new ArrayDeque<>();
        this.isRunningTask = false;
        this.status = -1;
        this.process = process;
        this.STDIN = new NoCloseOutputStream(process.getOutputStream());
        this.STDOUT = new NoCloseInputStream(process.getInputStream());
        this.STDERR = new NoCloseInputStream(process.getErrorStream());
        FutureTask futureTask = new FutureTask(new Callable() { // from class: com.topjohnwu.superuser.internal.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer shellCheck;
                shellCheck = ShellImpl.this.shellCheck();
                return shellCheck;
            }
        });
        Shell.EXECUTOR.execute(futureTask);
        try {
            try {
                this.status = ((Integer) futureTask.get(builderImpl.timeout, TimeUnit.SECONDS)).intValue();
            } catch (InterruptedException e) {
                throw new IOException("Shell check interrupted", e);
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new IOException("Unknown ExecutionException", cause);
            } catch (TimeoutException e3) {
                throw new IOException("Shell check timeout", e3);
            }
        } catch (IOException e4) {
            release();
            throw e4;
        }
    }

    private synchronized void exec0(Shell.Task task) {
        if (this.status < 0) {
            task.shellDied();
            return;
        }
        ShellUtils.cleanInputStream(this.STDOUT);
        ShellUtils.cleanInputStream(this.STDERR);
        try {
            this.STDIN.write(10);
            this.STDIN.flush();
            task.run(this.STDIN, this.STDOUT, this.STDERR);
        } catch (IOException unused) {
            release();
            task.shellDied();
        }
    }

    private Shell.Task processNextTask(boolean z) {
        this.scheduleLock.lock();
        try {
            Shell.Task poll = this.tasks.poll();
            if (poll == null) {
                this.isRunningTask = false;
                this.idle.signalAll();
                return null;
            }
            if (poll instanceof SyncTask) {
                ((SyncTask) poll).signal();
                return null;
            }
            if (z) {
                this.tasks.offerFirst(poll);
                this.scheduleLock.unlock();
                Shell.EXECUTOR.execute(new a(this, 1));
                return null;
            }
            return poll;
        } finally {
            this.scheduleLock.unlock();
        }
    }

    public void processTasks() {
        while (true) {
            Shell.Task processNextTask = processNextTask(false);
            if (processNextTask != null) {
                try {
                    exec0(processNextTask);
                } catch (IOException unused) {
                }
            } else {
                return;
            }
        }
    }

    private void release() {
        this.status = -1;
        try {
            this.STDIN.close0();
        } catch (IOException unused) {
        }
        try {
            this.STDERR.close0();
        } catch (IOException unused2) {
        }
        try {
            this.STDOUT.close0();
        } catch (IOException unused3) {
        }
        this.process.destroy();
    }

    public Integer shellCheck() {
        int i;
        try {
            this.process.exitValue();
            throw new IOException("Created process has terminated");
        } catch (IllegalThreadStateException unused) {
            ShellUtils.cleanInputStream(this.STDOUT);
            ShellUtils.cleanInputStream(this.STDERR);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.STDOUT));
            try {
                NoCloseOutputStream noCloseOutputStream = this.STDIN;
                Charset charset = StandardCharsets.UTF_8;
                noCloseOutputStream.write("echo SHELL_TEST\n".getBytes(charset));
                this.STDIN.flush();
                String readLine = bufferedReader.readLine();
                if (!TextUtils.isEmpty(readLine) && readLine.contains("SHELL_TEST")) {
                    this.STDIN.write("id\n".getBytes(charset));
                    this.STDIN.flush();
                    String readLine2 = bufferedReader.readLine();
                    if (!TextUtils.isEmpty(readLine2) && readLine2.contains("uid=0")) {
                        i = 1;
                        Utils.setConfirmedRootState(true);
                        String escapedString = ShellUtils.escapedString(System.getProperty("user.dir"));
                        this.STDIN.write(("cd " + escapedString + "\n").getBytes(charset));
                        this.STDIN.flush();
                    } else {
                        i = 0;
                    }
                    bufferedReader.close();
                    return Integer.valueOf(i);
                }
                throw new IOException("Created process is not a shell");
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.status < 0) {
            return;
        }
        release();
    }

    @Override // com.topjohnwu.superuser.Shell
    public void execTask(Shell.Task task) {
        this.scheduleLock.lock();
        try {
            if (this.isRunningTask) {
                SyncTask syncTask = new SyncTask(this.scheduleLock.newCondition());
                this.tasks.offer(syncTask);
                syncTask.await();
            }
            this.isRunningTask = true;
            this.scheduleLock.unlock();
            exec0(task);
            processNextTask(true);
        } catch (Throwable th) {
            this.scheduleLock.unlock();
            throw th;
        }
    }

    @Override // com.topjohnwu.superuser.Shell
    public int getStatus() {
        return this.status;
    }

    @Override // com.topjohnwu.superuser.Shell
    public boolean isAlive() {
        if (this.status < 0) {
            return false;
        }
        try {
            this.process.exitValue();
            release();
            return false;
        } catch (IllegalThreadStateException unused) {
            return true;
        }
    }

    @Override // com.topjohnwu.superuser.Shell
    public Shell.Job newJob() {
        return new ShellJob(this);
    }

    @Override // com.topjohnwu.superuser.Shell
    public void submitTask(Shell.Task task) {
        this.scheduleLock.lock();
        try {
            this.tasks.offer(task);
            if (!this.isRunningTask) {
                this.isRunningTask = true;
                Shell.EXECUTOR.execute(new a(this, 1));
            }
        } finally {
            this.scheduleLock.unlock();
        }
    }

    @Override // com.topjohnwu.superuser.Shell
    public boolean waitAndClose(long j, TimeUnit timeUnit) {
        if (this.status < 0) {
            return true;
        }
        this.scheduleLock.lock();
        try {
            if (this.isRunningTask && !this.idle.await(j, timeUnit)) {
                this.scheduleLock.unlock();
                return false;
            }
            close();
            return true;
        } finally {
            this.scheduleLock.unlock();
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class NoCloseInputStream extends FilterInputStream {
        public NoCloseInputStream(InputStream inputStream) {
            super(inputStream);
        }

        public void close0() {
            ((FilterInputStream) this).in.close();
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class SyncTask implements Shell.Task {
        private final Condition condition;
        private boolean set = false;

        public SyncTask(Condition condition) {
            this.condition = condition;
        }

        public void await() {
            while (!this.set) {
                try {
                    this.condition.await();
                } catch (InterruptedException unused) {
                }
            }
        }

        public void signal() {
            this.set = true;
            this.condition.signal();
        }

        @Override // com.topjohnwu.superuser.Shell.Task
        public void run(OutputStream outputStream, InputStream inputStream, InputStream inputStream2) {
        }
    }
}
