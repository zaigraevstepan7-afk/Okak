package com.topjohnwu.superuser.internal;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ PendingJob f;

    public /* synthetic */ e(PendingJob pendingJob, int i) {
        this.e = i;
        this.f = pendingJob;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        PendingJob pendingJob = this.f;
        switch (i) {
            case 0:
                PendingJob.d(pendingJob);
                return;
            default:
                PendingJob.b(pendingJob);
                return;
        }
    }
}
