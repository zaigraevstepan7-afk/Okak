package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class s32 extends rz implements th1, bc0, qc0 {
    public de0 u;
    public boolean v;
    public final w42 w;

    public s32(de0 de0Var) {
        this.u = de0Var;
        i7 i7Var = new i7(this, 5);
        jh1 jh1Var = s42.a;
        w42 w42Var = new w42(null, null, i7Var);
        L0(w42Var);
        this.w = w42Var;
    }

    @Override // defpackage.bc0
    public final void A(sc0 sc0Var) {
        this.v = sc0Var.a();
    }

    @Override // defpackage.th1
    public final void E() {
        this.w.E();
    }

    @Override // defpackage.th1
    public final long n() {
        k20 k20Var = rx.z;
        c00 c00Var = hp.M(this).C;
        k20Var.getClass();
        int i = ya2.b;
        return wm1.t(c00Var.j0(10.0f), c00Var.j0(40.0f), c00Var.j0(10.0f), c00Var.j0(40.0f));
    }

    @Override // defpackage.th1
    public final void u(jh1 jh1Var, kh1 kh1Var, long j) {
        this.w.u(jh1Var, kh1Var, j);
    }
}
