package com.topjohnwu.superuser.internal;

import com.topjohnwu.superuser.Shell;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
class ShellJob extends JobTask {
    private final ShellImpl shell;

    public ShellJob(ShellImpl shellImpl) {
        this.shell = shellImpl;
    }

    @Override // com.topjohnwu.superuser.Shell.Job
    public Future<Shell.Result> enqueue() {
        ResultFuture resultFuture = new ResultFuture();
        this.callback = resultFuture;
        this.callbackExecutor = null;
        this.shell.submitTask(this);
        return resultFuture;
    }

    @Override // com.topjohnwu.superuser.Shell.Job
    public Shell.Result exec() {
        ResultHolder resultHolder = new ResultHolder();
        this.callback = resultHolder;
        this.callbackExecutor = null;
        try {
            this.shell.execTask(this);
        } catch (IOException unused) {
        }
        return resultHolder.getResult();
    }

    @Override // com.topjohnwu.superuser.Shell.Job
    public void submit(Executor executor, Shell.ResultCallback resultCallback) {
        this.callbackExecutor = executor;
        this.callback = resultCallback;
        this.shell.submitTask(this);
    }
}
