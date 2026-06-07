package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ft0 extends d21 implements pu1 {
    public de0 s;
    public zs0 t;
    public sb1 u;
    public boolean v;
    public xr1 w;
    public final dt0 x = new dt0(this, 0);
    public dt0 y;

    public ft0(de0 de0Var, zs0 zs0Var, sb1 sb1Var, boolean z) {
        this.s = de0Var;
        this.t = zs0Var;
        this.u = sb1Var;
        this.v = z;
        L0();
    }

    @Override // defpackage.d21
    public final boolean A0() {
        return false;
    }

    public final void L0() {
        dt0 dt0Var;
        this.w = new xr1(new et0(this, 0), new et0(this, 1));
        if (this.v) {
            dt0Var = new dt0(this, 1);
        } else {
            dt0Var = null;
        }
        this.y = dt0Var;
    }

    @Override // defpackage.pu1
    public final void u0(av1 av1Var) {
        xu1.g(av1Var);
        av1Var.a(vu1.M, this.x);
        sb1 sb1Var = this.u;
        xr1 xr1Var = this.w;
        if (sb1Var == sb1.e) {
            if (xr1Var != null) {
                zu1 zu1Var = vu1.v;
                ep0 ep0Var = xu1.a[13];
                av1Var.a(zu1Var, xr1Var);
            } else {
                sn0.V("scrollAxisRange");
                throw null;
            }
        } else if (xr1Var != null) {
            zu1 zu1Var2 = vu1.u;
            ep0 ep0Var2 = xu1.a[12];
            av1Var.a(zu1Var2, xr1Var);
        } else {
            sn0.V("scrollAxisRange");
            throw null;
        }
        dt0 dt0Var = this.y;
        if (dt0Var != null) {
            av1Var.a(lu1.f, new s0(null, dt0Var));
        }
        av1Var.a(lu1.C, new s0(null, new n3(new et0(this, 2), 24)));
        un f = this.t.f();
        zu1 zu1Var3 = vu1.f;
        ep0 ep0Var3 = xu1.a[23];
        av1Var.a(zu1Var3, f);
    }
}
