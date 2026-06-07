package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class mx0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(mx0.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new ox0(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            ox0 ox0Var = (ox0) atomicReferenceFieldUpdater.get(this);
            int a2 = ox0Var.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                if (a2 == 2) {
                    return false;
                }
            } else {
                ox0 c = ox0Var.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, ox0Var, c) && atomicReferenceFieldUpdater.get(this) == ox0Var) {
                }
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            ox0 ox0Var = (ox0) atomicReferenceFieldUpdater.get(this);
            if (ox0Var.b()) {
                return;
            }
            ox0 c = ox0Var.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, ox0Var, c) && atomicReferenceFieldUpdater.get(this) == ox0Var) {
            }
        }
    }

    public final int c() {
        ox0 ox0Var = (ox0) a.get(this);
        ox0Var.getClass();
        long j = ox0.f.get(ox0Var);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            ox0 ox0Var = (ox0) atomicReferenceFieldUpdater.get(this);
            Object d = ox0Var.d();
            if (d != ox0.g) {
                return d;
            }
            ox0 c = ox0Var.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, ox0Var, c) && atomicReferenceFieldUpdater.get(this) == ox0Var) {
            }
        }
    }
}
