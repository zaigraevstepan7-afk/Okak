package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ff {
    public static final void a(ff ffVar, kf kfVar) {
        kf kfVar2;
        vi1 vi1Var;
        Condition condition;
        ffVar.getClass();
        kfVar2 = kf.idleSentinel;
        if (kfVar2 == null) {
            kf.idleSentinel = new kf();
            Thread thread = new Thread("Okio Watchdog");
            thread.setDaemon(true);
            thread.start();
        }
        kf.setTimeoutAt$okio$default(kfVar, 0L, 1, null);
        vi1Var = kf.queue;
        vi1Var.getClass();
        int i = vi1Var.a + 1;
        vi1Var.a = i;
        kf[] kfVarArr = vi1Var.b;
        if (i == kfVarArr.length) {
            kf[] kfVarArr2 = new kf[i * 2];
            bf.G(kfVarArr, kfVarArr2, 0, 0, 14);
            vi1Var.b = kfVarArr2;
        }
        vi1Var.a(kfVar, i);
        if (kfVar.index == 1) {
            condition = kf.condition;
            condition.signal();
        }
    }

    public static kf b() {
        vi1 vi1Var;
        vi1 vi1Var2;
        Condition condition;
        Condition condition2;
        long j;
        vi1 vi1Var3;
        long j2;
        kf kfVar;
        vi1Var = kf.queue;
        kf kfVar2 = vi1Var.b[1];
        if (kfVar2 == null) {
            long nanoTime = System.nanoTime();
            condition2 = kf.condition;
            j = kf.IDLE_TIMEOUT_MILLIS;
            condition2.await(j, TimeUnit.MILLISECONDS);
            vi1Var3 = kf.queue;
            if (vi1Var3.b[1] == null) {
                long nanoTime2 = System.nanoTime() - nanoTime;
                j2 = kf.IDLE_TIMEOUT_NANOS;
                if (nanoTime2 >= j2) {
                    kfVar = kf.idleSentinel;
                    return kfVar;
                }
            }
            return null;
        }
        long remainingNanos$okio = kfVar2.remainingNanos$okio(System.nanoTime());
        if (remainingNanos$okio > 0) {
            condition = kf.condition;
            condition.await(remainingNanos$okio, TimeUnit.NANOSECONDS);
            return null;
        }
        vi1Var2 = kf.queue;
        vi1Var2.b(kfVar2);
        kfVar2.state = 2;
        return kfVar2;
    }
}
