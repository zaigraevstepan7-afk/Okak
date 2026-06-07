package com.topjohnwu.superuser.internal;

import com.topjohnwu.superuser.Shell;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
class ResultFuture extends ResultHolder implements Future<Shell.Result> {
    private final CountDownLatch latch = new CountDownLatch(1);

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        if (this.latch.getCount() != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Future
    public Shell.Result get(long j, TimeUnit timeUnit) {
        if (this.latch.await(j, timeUnit)) {
            return getResult();
        }
        throw new TimeoutException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        if (this.latch.getCount() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.topjohnwu.superuser.internal.ResultHolder, com.topjohnwu.superuser.Shell.ResultCallback
    public void onResult(Shell.Result result) {
        super.onResult(result);
        this.latch.countDown();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Future
    public Shell.Result get() {
        this.latch.await();
        return getResult();
    }
}
