package com.topjohnwu.superuser.internal;

import com.topjohnwu.superuser.NoShellException;
import com.topjohnwu.superuser.Shell;
import defpackage.n6;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class MainShell {
    private static boolean isInitMain;
    private static BuilderImpl mainBuilder;
    private static final ShellImpl[] mainShell = new ShellImpl[1];

    private MainShell() {
    }

    public static synchronized ShellImpl get() {
        ShellImpl cached;
        synchronized (MainShell.class) {
            try {
                cached = getCached();
                if (cached == null) {
                    if (!isInitMain) {
                        isInitMain = true;
                        if (mainBuilder == null) {
                            mainBuilder = new BuilderImpl();
                        }
                        cached = mainBuilder.build();
                        isInitMain = false;
                    } else {
                        throw new NoShellException("The main shell died during initialization");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cached;
    }

    public static ShellImpl getCached() {
        ShellImpl shellImpl;
        ShellImpl[] shellImplArr = mainShell;
        synchronized (shellImplArr) {
            try {
                shellImpl = shellImplArr[0];
                if (shellImpl != null && shellImpl.getStatus() < 0) {
                    shellImpl = null;
                    shellImplArr[0] = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return shellImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$get$1(Executor executor, Shell.GetShellCallback getShellCallback) {
        try {
            returnShell(get(), executor, getShellCallback);
        } catch (NoShellException unused) {
        }
    }

    public static Shell.Job newJob(InputStream inputStream) {
        return new PendingJob().add(inputStream);
    }

    private static void returnShell(Shell shell, Executor executor, Shell.GetShellCallback getShellCallback) {
        if (executor == null) {
            getShellCallback.onShell(shell);
        } else {
            executor.execute(new n6(3, getShellCallback, shell));
        }
    }

    public static synchronized void setBuilder(Shell.Builder builder) {
        synchronized (MainShell.class) {
            if (!isInitMain && getCached() == null) {
                mainBuilder = (BuilderImpl) builder;
            } else {
                throw new IllegalStateException("The main shell was already created");
            }
        }
    }

    public static synchronized void setCached(ShellImpl shellImpl) {
        synchronized (MainShell.class) {
            if (isInitMain) {
                ShellImpl[] shellImplArr = mainShell;
                synchronized (shellImplArr) {
                    shellImplArr[0] = shellImpl;
                }
            }
        }
    }

    public static Shell.Job newJob(String... strArr) {
        return new PendingJob().add(strArr);
    }

    public static void get(Executor executor, Shell.GetShellCallback getShellCallback) {
        ShellImpl cached = getCached();
        if (cached != null) {
            returnShell(cached, executor, getShellCallback);
        } else {
            Shell.EXECUTOR.execute(new n6(4, executor, getShellCallback));
        }
    }
}
