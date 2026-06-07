package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class uj extends d21 implements mj, gq0 {
    public jt s;
    public boolean t;

    public static final pl1 L0(uj ujVar, e81 e81Var, f5 f5Var) {
        pl1 pl1Var;
        if (ujVar.r && ujVar.t) {
            e81 L = hp.L(ujVar);
            if (!e81Var.V0().r) {
                e81Var = null;
            }
            if (e81Var != null && (pl1Var = (pl1) f5Var.invoke()) != null) {
                return pl1Var.i(L.O(e81Var, false).d());
            }
        }
        return null;
    }

    @Override // defpackage.d21
    public final boolean A0() {
        return false;
    }

    @Override // defpackage.mj
    public final Object C(e81 e81Var, f5 f5Var, wt wtVar) {
        Object u = fp.u(new tj(this, e81Var, f5Var, new qd(this, e81Var, f5Var, 3), null, 0), wtVar);
        if (u == hv.e) {
            return u;
        }
        return od2.a;
    }

    @Override // defpackage.gq0
    public final void l(iq0 iq0Var) {
        this.t = true;
    }
}
