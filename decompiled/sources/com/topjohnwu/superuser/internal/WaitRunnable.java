package com.topjohnwu.superuser.internal;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class WaitRunnable implements Runnable {
    private Runnable r;

    public WaitRunnable(Runnable runnable) {
        this.r = runnable;
    }

    @Override // java.lang.Runnable
    public synchronized void run() {
        this.r.run();
        this.r = null;
        notifyAll();
    }

    public synchronized void waitUntilDone() {
        while (this.r != null) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
