package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class dj1 extends v implements dm, iv1 {
    public final lk h;

    public dj1(xu xuVar, lk lkVar) {
        super(xuVar, true);
        this.h = lkVar;
    }

    @Override // defpackage.iv1
    public final Object a(vt vtVar, Object obj) {
        return this.h.a(vtVar, obj);
    }

    @Override // defpackage.no0, defpackage.go0, defpackage.dm
    public final void c(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new ho0(x(), null, this);
        }
        v(cancellationException);
    }

    @Override // defpackage.dm
    public final Object d() {
        return this.h.d();
    }

    @Override // defpackage.v
    public final void e0(Throwable th, boolean z) {
        if (!this.h.i(th, false) && !z) {
            qo.O(this.g, th);
        }
    }

    @Override // defpackage.dm
    public final Object f(vt vtVar) {
        return this.h.f(vtVar);
    }

    @Override // defpackage.v
    public final void f0(Object obj) {
        this.h.i(null, false);
    }

    public final void h0(bk bkVar) {
        lk lkVar = this.h;
        lkVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = lk.n;
        while (!atomicReferenceFieldUpdater.compareAndSet(lkVar, null, bkVar)) {
            if (atomicReferenceFieldUpdater.get(lkVar) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(lkVar);
                    ad0 ad0Var = nk.q;
                    if (obj == ad0Var) {
                        ad0 ad0Var2 = nk.r;
                        while (!atomicReferenceFieldUpdater.compareAndSet(lkVar, ad0Var, ad0Var2)) {
                            if (atomicReferenceFieldUpdater.get(lkVar) != ad0Var) {
                                break;
                            }
                        }
                        bkVar.invoke(lkVar.o());
                        return;
                    }
                    if (obj == nk.r) {
                        se.p("Another handler was already registered and successfully invoked");
                        return;
                    } else {
                        se.t(obj, "Another handler is already registered: ");
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.dm
    public final kk iterator() {
        lk lkVar = this.h;
        lkVar.getClass();
        return new kk(lkVar);
    }

    @Override // defpackage.iv1
    public final Object j(Object obj) {
        return this.h.j(obj);
    }

    @Override // defpackage.no0
    public final void v(CancellationException cancellationException) {
        this.h.i(cancellationException, true);
        u(cancellationException);
    }
}
