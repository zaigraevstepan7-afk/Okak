package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class cq1 implements vt, iv {
    public static final AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(cq1.class, Object.class, "result");
    public final vt e;
    private volatile Object result;

    public cq1(vt vtVar) {
        hv hvVar = hv.e;
        this.e = vtVar;
        this.result = hvVar;
    }

    @Override // defpackage.iv
    public final iv getCallerFrame() {
        vt vtVar = this.e;
        if (vtVar instanceof iv) {
            return (iv) vtVar;
        }
        return null;
    }

    @Override // defpackage.vt
    public final xu getContext() {
        return this.e.getContext();
    }

    @Override // defpackage.vt
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            hv hvVar = hv.f;
            if (obj2 == hvVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, hvVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != hvVar) {
                        break;
                    }
                }
                return;
            }
            hv hvVar2 = hv.e;
            if (obj2 == hvVar2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f;
                hv hvVar3 = hv.g;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, hvVar2, hvVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != hvVar2) {
                        break;
                    }
                }
                this.e.resumeWith(obj);
                return;
            }
            se.p("Already resumed");
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.e;
    }
}
