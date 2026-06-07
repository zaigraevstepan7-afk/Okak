package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class l0 extends sn0 {
    public final AtomicReferenceFieldUpdater R;
    public final AtomicReferenceFieldUpdater S;
    public final AtomicReferenceFieldUpdater T;
    public final AtomicReferenceFieldUpdater U;
    public final AtomicReferenceFieldUpdater V;

    public l0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.R = atomicReferenceFieldUpdater;
        this.S = atomicReferenceFieldUpdater2;
        this.T = atomicReferenceFieldUpdater3;
        this.U = atomicReferenceFieldUpdater4;
        this.V = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.sn0
    public final void P(n0 n0Var, n0 n0Var2) {
        this.S.lazySet(n0Var, n0Var2);
    }

    @Override // defpackage.sn0
    public final void Q(n0 n0Var, Thread thread) {
        this.R.lazySet(n0Var, thread);
    }

    @Override // defpackage.sn0
    public final boolean w(o0 o0Var, k0 k0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.U;
            if (atomicReferenceFieldUpdater.compareAndSet(o0Var, k0Var, k0.b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(o0Var) == k0Var);
        return false;
    }

    @Override // defpackage.sn0
    public final boolean x(o0 o0Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.V;
            if (atomicReferenceFieldUpdater.compareAndSet(o0Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(o0Var) == obj);
        return false;
    }

    @Override // defpackage.sn0
    public final boolean y(o0 o0Var, n0 n0Var, n0 n0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.T;
            if (atomicReferenceFieldUpdater.compareAndSet(o0Var, n0Var, n0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(o0Var) == n0Var);
        return false;
    }
}
