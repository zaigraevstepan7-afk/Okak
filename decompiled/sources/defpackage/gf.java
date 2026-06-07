package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class gf extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ff ffVar;
        ReentrantLock reentrantLock;
        ff ffVar2;
        kf b;
        ff ffVar3;
        kf kfVar;
        ff ffVar4;
        while (true) {
            try {
                ffVar = kf.Companion;
                ffVar.getClass();
                reentrantLock = kf.lock;
                reentrantLock.lock();
                try {
                    ffVar2 = kf.Companion;
                    ffVar2.getClass();
                    b = ff.b();
                    ffVar3 = kf.Companion;
                    ffVar3.getClass();
                    kfVar = kf.idleSentinel;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (b == kfVar) {
                ffVar4 = kf.Companion;
                ffVar4.getClass();
                kf.idleSentinel = null;
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            if (b != null) {
                b.timedOut();
            }
        }
    }
}
