package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class um extends jo0 {
    public final /* synthetic */ int i;
    public final pl j;

    public /* synthetic */ um(pl plVar, int i) {
        this.i = i;
        this.j = plVar;
    }

    @Override // defpackage.jo0
    public final boolean k() {
        switch (this.i) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.jo0
    public final void l(Throwable th) {
        int i = this.i;
        pl plVar = this.j;
        switch (i) {
            case 0:
                Throwable p = plVar.p(j());
                if (plVar.w()) {
                    g10 g10Var = (g10) plVar.h;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g10.l;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(g10Var);
                        ad0 ad0Var = mp0.p;
                        if (sn0.r(obj, ad0Var)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(g10Var, ad0Var, p)) {
                                if (atomicReferenceFieldUpdater.get(g10Var) != ad0Var) {
                                    break;
                                }
                            }
                            return;
                        } else {
                            if (obj instanceof Throwable) {
                                return;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(g10Var, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(g10Var) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                plVar.h(p);
                if (!plVar.w()) {
                    plVar.n();
                    return;
                }
                return;
            default:
                plVar.resumeWith(od2.a);
                return;
        }
    }
}
