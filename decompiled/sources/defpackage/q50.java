package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class q50 implements se0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ag f;
    public final /* synthetic */ bi0 g;
    public final /* synthetic */ vf2 h;
    public final /* synthetic */ ew1 i;
    public final /* synthetic */ co1 j;
    public final /* synthetic */ el0 k;
    public final /* synthetic */ c22 l;
    public final /* synthetic */ o22 m;

    public /* synthetic */ q50(ag agVar, bi0 bi0Var, vf2 vf2Var, ew1 ew1Var, co1 co1Var, el0 el0Var, c22 c22Var, o22 o22Var, int i) {
        this.e = i;
        this.f = agVar;
        this.g = bi0Var;
        this.h = vf2Var;
        this.i = ew1Var;
        this.j = co1Var;
        this.k = el0Var;
        this.l = c22Var;
        this.m = o22Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.e;
        od2 od2Var = od2.a;
        boolean z2 = false;
        switch (i) {
            case 0:
                ur urVar = (ur) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                if (urVar.O(intValue & 1, z2)) {
                    l42.a(hy1.c, null, ((mo) urVar.j(oo.a)).n, 0L, 0.0f, 0.0f, go.N(990162975, new q50(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, 1), urVar), urVar, 12582918, 122);
                } else {
                    urVar.R();
                }
                return od2Var;
            default:
                ur urVar2 = (ur) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar2.O(intValue2 & 1, z)) {
                    o22 o22Var = this.m;
                    z12 z12Var = (z12) o22Var.getValue();
                    if (z12Var instanceof u12) {
                        urVar2.X(-1936118386);
                        c01.g(0, urVar2);
                        urVar2.p(false);
                        return od2Var;
                    }
                    if (z12Var instanceof v12) {
                        urVar2.X(109941093);
                        z12 z12Var2 = (z12) o22Var.getValue();
                        z12Var2.getClass();
                        f2.b(((v12) z12Var2).a, this.f, this.g, this.h, this.i, this.j, this.k, urVar2, 0);
                        urVar2.p(false);
                        return od2Var;
                    }
                    if (z12Var instanceof w12) {
                        urVar2.X(110390252);
                        c22 c22Var = this.l;
                        boolean h = urVar2.h(c22Var);
                        Object L = urVar2.L();
                        if (h || L == or.a) {
                            L = new v3(c22Var, 10);
                            urVar2.h0(L);
                        }
                        mp0.c((de0) L, urVar2, 0);
                        urVar2.p(false);
                        return od2Var;
                    }
                    if (z12Var instanceof y12) {
                        urVar2.X(110521878);
                        z12 z12Var3 = (z12) o22Var.getValue();
                        z12Var3.getClass();
                        c01.n(((y12) z12Var3).a, urVar2, 0);
                        urVar2.p(false);
                        return od2Var;
                    }
                    if (z12Var instanceof x12) {
                        urVar2.X(110681187);
                        c01.m(0, urVar2);
                        urVar2.p(false);
                        return od2Var;
                    }
                    urVar2.X(-1936119194);
                    urVar2.p(false);
                    se.m();
                    return null;
                }
                urVar2.R();
                return od2Var;
        }
    }
}
