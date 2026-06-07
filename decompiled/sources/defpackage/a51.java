package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class a51 implements nl, bh2 {
    public final pl e;
    public final /* synthetic */ b51 f;

    public a51(b51 b51Var, pl plVar) {
        this.f = b51Var;
        this.e = plVar;
    }

    @Override // defpackage.bh2
    public final void a(nt1 nt1Var, int i) {
        this.e.a(nt1Var, i);
    }

    @Override // defpackage.nl
    public final ad0 e(Object obj, te0 te0Var) {
        b51 b51Var = this.f;
        ol olVar = new ol(b51Var, this);
        ad0 e = this.e.e((od2) obj, olVar);
        if (e != null) {
            b51.g.set(b51Var, null);
        }
        return e;
    }

    @Override // defpackage.vt
    public final xu getContext() {
        return this.e.i;
    }

    @Override // defpackage.nl
    public final boolean h(Throwable th) {
        return this.e.h(th);
    }

    @Override // defpackage.nl
    public final void l(Object obj) {
        this.e.l(obj);
    }

    @Override // defpackage.vt
    public final void resumeWith(Object obj) {
        this.e.resumeWith(obj);
    }
}
