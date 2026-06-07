package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class o20 extends d21 implements ub2, gq0 {
    public o20 s;
    public o20 t;
    public long u;

    @Override // defpackage.d21
    public final void E0() {
        this.t = null;
        this.s = null;
    }

    public final boolean L0() {
        o20 o20Var = this.s;
        if (o20Var == null) {
            o20 o20Var2 = this.t;
            if (o20Var2 != null) {
                return o20Var2.L0();
            }
            return false;
        }
        return o20Var.L0();
    }

    public final void M0() {
        o20 o20Var = this.t;
        if (o20Var == null) {
            o20 o20Var2 = this.s;
            if (o20Var2 != null) {
                o20Var2.M0();
                return;
            }
            return;
        }
        o20Var.M0();
    }

    public final void N0() {
        o20 o20Var = this.t;
        if (o20Var != null) {
            o20Var.N0();
        }
        o20 o20Var2 = this.s;
        if (o20Var2 != null) {
            o20Var2.N0();
        }
        this.s = null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, wl1] */
    public final void O0(rg2 rg2Var) {
        ub2 ub2Var;
        o20 o20Var;
        o20 o20Var2 = this.s;
        int i = 1;
        if (o20Var2 != null && io.l(o20Var2, lo.F(rg2Var))) {
            o20Var = o20Var2;
        } else {
            if (!this.e.r) {
                ub2Var = null;
            } else {
                ?? obj = new Object();
                fr1.w(this, new cb(obj, this, rg2Var, i));
                ub2Var = (ub2) obj.e;
            }
            o20Var = (o20) ub2Var;
        }
        if (o20Var != null && o20Var2 == null) {
            o20Var.M0();
            o20Var.O0(rg2Var);
            o20 o20Var3 = this.t;
            if (o20Var3 != null) {
                o20Var3.N0();
            }
        } else if (o20Var == null && o20Var2 != null) {
            o20 o20Var4 = this.t;
            if (o20Var4 != null) {
                o20Var4.M0();
                o20Var4.O0(rg2Var);
            }
            o20Var2.N0();
        } else if (!sn0.r(o20Var, o20Var2)) {
            if (o20Var != null) {
                o20Var.M0();
                o20Var.O0(rg2Var);
            }
            if (o20Var2 != null) {
                o20Var2.N0();
            }
        } else if (o20Var != null) {
            o20Var.O0(rg2Var);
        } else {
            o20 o20Var5 = this.t;
            if (o20Var5 != null) {
                o20Var5.O0(rg2Var);
            }
        }
        this.s = o20Var;
    }

    public final void P0() {
        o20 o20Var = this.t;
        if (o20Var == null) {
            o20 o20Var2 = this.s;
            if (o20Var2 != null) {
                o20Var2.P0();
                return;
            }
            return;
        }
        o20Var.P0();
    }

    @Override // defpackage.ub2
    public final Object m() {
        return g3.D;
    }

    @Override // defpackage.gq0
    public final void o(long j) {
        this.u = j;
    }
}
