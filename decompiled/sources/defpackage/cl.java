package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class cl extends d21 implements w81, qk, b40 {
    public final dl s;
    public boolean t;
    public oe0 u;

    public cl(dl dlVar, oe0 oe0Var) {
        this.s = dlVar;
        this.u = oe0Var;
        dlVar.e = this;
    }

    @Override // defpackage.d21
    public final void F0() {
        L0();
    }

    @Override // defpackage.b40
    public final void I() {
        L0();
    }

    @Override // defpackage.qz
    public final void L() {
        L0();
    }

    public final void L0() {
        this.t = false;
        this.s.f = null;
        fp.I(this);
    }

    @Override // defpackage.qk
    public final c00 a() {
        return hp.M(this).C;
    }

    @Override // defpackage.qz
    public final void c() {
        L0();
    }

    @Override // defpackage.qk
    public final long d() {
        return vn.O(hp.K(this, 4).g);
    }

    @Override // defpackage.w81
    public final void e0() {
        L0();
    }

    @Override // defpackage.b40
    public final void f0(cr0 cr0Var) {
        boolean z = this.t;
        dl dlVar = this.s;
        if (!z) {
            dlVar.f = null;
            io.F(this, new f5(4, this, dlVar));
            if (dlVar.f != null) {
                this.t = true;
            } else {
                throw l90.f("DrawResult not defined, did you forget to call onDraw?");
            }
        }
        rg2 rg2Var = dlVar.f;
        rg2Var.getClass();
        ((oe0) rg2Var.f).invoke(cr0Var);
    }

    @Override // defpackage.qk
    public final jq0 getLayoutDirection() {
        return hp.M(this).D;
    }

    @Override // defpackage.d21
    public final void E0() {
    }
}
