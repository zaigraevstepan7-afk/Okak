package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class lj2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(lj2.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(lj2.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(lj2.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(lj2.class, "blockingTasksInBuffer$volatile");
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final y52 a(y52 y52Var) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return y52Var;
        }
        if (y52Var.f) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(i) != null) {
                Thread.yield();
            } else {
                atomicReferenceArray.lazySet(i, y52Var);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
        }
    }

    public final y52 b() {
        y52 y52Var;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (y52Var = (y52) this.a.getAndSet(i2, null)) != null) {
                if (y52Var.f) {
                    e.decrementAndGet(this);
                }
                return y52Var;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r6 == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
    
        defpackage.lj2.e.decrementAndGet(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r1.f == r6) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r0.compareAndSet(r5, r1, null) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r0.get(r5) == r1) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.y52 c(int r5, boolean r6) {
        /*
            r4 = this;
            r5 = r5 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r4.a
            java.lang.Object r1 = r0.get(r5)
            y52 r1 = (defpackage.y52) r1
            r2 = 0
            if (r1 == 0) goto L25
            boolean r3 = r1.f
            if (r3 != r6) goto L25
        L11:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L1f
            if (r6 == 0) goto L1e
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.lj2.e
            r5.decrementAndGet(r4)
        L1e:
            return r1
        L1f:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L11
        L25:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lj2.c(int, boolean):y52");
    }
}
