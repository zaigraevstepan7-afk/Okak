package com.topjohnwu.superuser.internal;

import com.topjohnwu.superuser.NoShellException;
import com.topjohnwu.superuser.Shell;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class PendingJob extends JobTask {
    private Runnable retryTask;

    public PendingJob() {
        to(JobTask.UNSET_LIST);
    }

    public void exec0() {
        try {
            try {
                MainShell.get().execTask(this);
            } catch (IOException unused) {
            }
        } catch (NoShellException unused2) {
            super.shellDied();
        }
    }

    public /* synthetic */ void lambda$submit0$0(Shell shell) {
        ((ShellImpl) shell).submitTask(this);
    }

    public void submit0() {
        MainShell.get(null, new f(this, 0));
    }

    @Override // com.topjohnwu.superuser.Shell.Job
    public Future<Shell.Result> enqueue() {
        this.retryTask = new e(this, 0);
        ResultFuture resultFuture = new ResultFuture();
        this.callback = resultFuture;
        this.callbackExecutor = null;
        submit0();
        return resultFuture;
    }

    @Override // com.topjohnwu.superuser.Shell.Job
    public Shell.Result exec() {
        this.retryTask = new e(this, 1);
        ResultHolder resultHolder = new ResultHolder();
        this.callback = resultHolder;
        this.callbackExecutor = null;
        exec0();
        return resultHolder.getResult();
    }

    @Override // com.topjohnwu.superuser.internal.JobTask, com.topjohnwu.superuser.Shell.Task
    public void shellDied() {
        Runnable runnable = this.retryTask;
        if (runnable != null) {
            this.retryTask = null;
            runnable.run();
        } else {
            super.shellDied();
        }
    }

    @Override // com.topjohnwu.superuser.Shell.Job
    public void submit(Executor executor, Shell.ResultCallback resultCallback) {
        this.retryTask = new e(this, 0);
        this.callbackExecutor = executor;
        this.callback = resultCallback;
        submit0();
    }
}
