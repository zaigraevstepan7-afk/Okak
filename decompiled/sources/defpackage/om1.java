package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class om1 implements su0 {
    public final /* synthetic */ mu0 e;
    public final /* synthetic */ wl1 f;
    public final /* synthetic */ gv g;
    public final /* synthetic */ mu0 h;
    public final /* synthetic */ pl i;
    public final /* synthetic */ b51 j;
    public final /* synthetic */ l k;

    public om1(mu0 mu0Var, wl1 wl1Var, gv gvVar, mu0 mu0Var2, pl plVar, b51 b51Var, l lVar) {
        this.e = mu0Var;
        this.f = wl1Var;
        this.g = gvVar;
        this.h = mu0Var2;
        this.i = plVar;
        this.j = b51Var;
        this.k = lVar;
    }

    @Override // defpackage.su0
    public final void g(uu0 uu0Var, mu0 mu0Var) {
        mu0 mu0Var2 = this.e;
        wl1 wl1Var = this.f;
        if (mu0Var == mu0Var2) {
            wl1Var.e = rx.C(this.g, null, new a8(this.j, this.k, (vt) null, 9), 3);
            return;
        }
        if (mu0Var == this.h) {
            go0 go0Var = (go0) wl1Var.e;
            if (go0Var != null) {
                go0Var.c(null);
            }
            wl1Var.e = null;
        }
        if (mu0Var == mu0.ON_DESTROY) {
            this.i.resumeWith(od2.a);
        }
    }
}
