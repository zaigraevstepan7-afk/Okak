package defpackage;

import android.view.autofill.AutofillValue;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ja2 extends kn {
    public boolean Q;
    public oe0 R;
    public final vm1 S;

    public ja2(boolean z, r31 r31Var, boolean z2, ap1 ap1Var, oe0 oe0Var) {
        super(r31Var, null, false, z2, null, ap1Var, new st(z, oe0Var));
        this.Q = z;
        this.R = oe0Var;
        this.S = new vm1(this, 16);
    }

    @Override // defpackage.kn
    public final void O0(av1 av1Var) {
        ka2 ka2Var;
        if (this.Q) {
            ka2Var = ka2.e;
        } else {
            ka2Var = ka2.f;
        }
        ep0[] ep0VarArr = xu1.a;
        zu1 zu1Var = vu1.J;
        ep0[] ep0VarArr2 = xu1.a;
        ep0 ep0Var = ep0VarArr2[25];
        av1Var.a(zu1Var, ka2Var);
        q6 q6Var = g3.x;
        zu1 zu1Var2 = vu1.r;
        ep0 ep0Var2 = ep0VarArr2[9];
        av1Var.a(zu1Var2, q6Var);
        m7 m7Var = new m7(AutofillValue.forToggle(this.Q));
        zu1 zu1Var3 = vu1.s;
        ep0 ep0Var3 = ep0VarArr2[10];
        av1Var.a(zu1Var3, m7Var);
        av1Var.a(lu1.h, new s0(null, new ym(av1Var, 1)));
    }
}
