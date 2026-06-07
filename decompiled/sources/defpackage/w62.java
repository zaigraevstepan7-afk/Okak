package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class w62 extends rz implements es, i62 {
    public h12 u;
    public dx v;
    public w72 w;
    public zt x;
    public i22 y;
    public final j00 z = fr1.h(new vm1(this, 14));
    public pl1 A = pl1.e;

    public w62(h12 h12Var, dx dxVar, w72 w72Var, zt ztVar) {
        this.u = h12Var;
        this.v = dxVar;
        this.w = w72Var;
        this.x = ztVar;
    }

    @Override // defpackage.d21
    public final void D0() {
        h12 h12Var = this.u;
        h12Var.g = ma2.g;
        h12Var.f = this;
    }

    @Override // defpackage.d21
    public final void E0() {
        h12 h12Var = this.u;
        h12Var.g = ma2.f;
        h12Var.f = null;
    }

    @Override // defpackage.i62
    public final h62 data() {
        return (h62) this.z.getValue();
    }

    @Override // defpackage.i62
    public final long h(iq0 iq0Var) {
        return k(iq0Var).d();
    }

    @Override // defpackage.i62
    public final pl1 k(iq0 iq0Var) {
        if (!this.r) {
            return this.A;
        }
        pl1 pl1Var = (pl1) this.x.invoke(iq0Var);
        if (pl1Var == null) {
            return this.A;
        }
        this.A = pl1Var;
        return pl1Var;
    }
}
