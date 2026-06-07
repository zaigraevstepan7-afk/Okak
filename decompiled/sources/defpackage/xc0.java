package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class xc0 extends ef0 implements se0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, wl1] */
    /* JADX WARN: Type inference failed for: r4v5, types: [cc0, java.lang.Object, hn0] */
    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean a;
        sc0 sc0Var = (sc0) obj;
        sc0 sc0Var2 = (sc0) obj2;
        yc0 yc0Var = (yc0) this.receiver;
        if (yc0Var.r && (a = sc0Var2.a()) != sc0Var.a()) {
            oe0 oe0Var = yc0Var.v;
            if (oe0Var != null) {
                oe0Var.invoke(Boolean.valueOf(a));
            }
            vt vtVar = null;
            if (a) {
                rx.C(yc0Var.z0(), null, new vf(yc0Var, vtVar, 3), 3);
                ?? obj3 = new Object();
                io.F(yc0Var, new j1(15, (Object) obj3, yc0Var));
                qs0 qs0Var = (qs0) obj3.e;
                if (qs0Var != null) {
                    qs0Var.a();
                } else {
                    qs0Var = null;
                }
                yc0Var.x = qs0Var;
                e81 e81Var = yc0Var.y;
                if (e81Var != null && e81Var.V0().r) {
                    yc0Var.P0();
                }
            } else {
                qs0 qs0Var2 = yc0Var.x;
                if (qs0Var2 != null) {
                    qs0Var2.b();
                }
                yc0Var.x = null;
                yc0Var.P0();
            }
            xp1.m(yc0Var);
            r31 r31Var = yc0Var.u;
            if (r31Var != null) {
                cc0 cc0Var = yc0Var.w;
                if (a) {
                    if (cc0Var != null) {
                        yc0Var.O0(r31Var, new dc0(cc0Var));
                        yc0Var.w = null;
                    }
                    ?? obj4 = new Object();
                    yc0Var.O0(r31Var, obj4);
                    yc0Var.w = obj4;
                } else if (cc0Var != null) {
                    yc0Var.O0(r31Var, new dc0(cc0Var));
                    yc0Var.w = null;
                }
            }
        }
        return od2.a;
    }
}
