package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class nt1 extends ns implements n81 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(nt1.class, "cleanedAndPointers$volatile");
    public final long c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public nt1(long j, nt1 nt1Var, int i) {
        super(nt1Var);
        this.c = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // defpackage.ns
    public final boolean c() {
        if (d.get(this) == f() && b() != null) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (d.addAndGet(this, -65536) == f() && b() != null) {
            return true;
        }
        return false;
    }

    public abstract int f();

    public abstract void g(int i, xu xuVar);

    public final void h() {
        if (d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = d;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
