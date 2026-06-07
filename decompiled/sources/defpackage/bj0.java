package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class bj0 implements se0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ fq f;

    public /* synthetic */ bj0(fq fqVar, int i) {
        this.e = i;
        this.f = fqVar;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = this.e;
        zo zoVar = zo.a;
        b21 b21Var = b21.a;
        boolean z5 = false;
        od2 od2Var = od2.a;
        fq fqVar = this.f;
        ur urVar = (ur) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar.O(intValue & 1, z)) {
                    long j = g3.j();
                    p90 p90Var = hy1.a;
                    e21 g = hy1.g(b21Var, j20.b(j), j20.a(j));
                    j01 d = hj.d(g3.j, false);
                    int x = io.x(urVar);
                    sf1 l = urVar.l();
                    e21 Q = fp.Q(urVar, g);
                    lr.b.getClass();
                    hs hsVar = kr.b;
                    urVar.a0();
                    if (urVar.S) {
                        urVar.k(hsVar);
                    } else {
                        urVar.k0();
                    }
                    op1.q(urVar, kr.f, d);
                    op1.q(urVar, kr.e, l);
                    gb gbVar = kr.g;
                    if (urVar.S || !sn0.r(urVar.L(), Integer.valueOf(x))) {
                        l90.s(x, urVar, x, gbVar);
                    }
                    op1.q(urVar, kr.d, Q);
                    fqVar.invoke(urVar, 0);
                    urVar.p(true);
                } else {
                    urVar.R();
                }
                return od2Var;
            case 1:
                int intValue2 = num.intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (urVar.O(intValue2 & 1, z2)) {
                    yo a = wo.a(c01.g, g3.r, urVar, 0);
                    int x2 = io.x(urVar);
                    sf1 l2 = urVar.l();
                    e21 Q2 = fp.Q(urVar, b21Var);
                    lr.b.getClass();
                    hs hsVar2 = kr.b;
                    urVar.a0();
                    if (urVar.S) {
                        urVar.k(hsVar2);
                    } else {
                        urVar.k0();
                    }
                    op1.q(urVar, kr.f, a);
                    op1.q(urVar, kr.e, l2);
                    gb gbVar2 = kr.g;
                    if (urVar.S || !sn0.r(urVar.L(), Integer.valueOf(x2))) {
                        l90.s(x2, urVar, x2, gbVar2);
                    }
                    op1.q(urVar, kr.d, Q2);
                    fqVar.invoke(zoVar, urVar, 6);
                    urVar.p(true);
                } else {
                    urVar.R();
                }
                return od2Var;
            case 2:
                int intValue3 = num.intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (urVar.O(intValue3 & 1, z3)) {
                    yo a2 = wo.a(c01.g, g3.r, urVar, 0);
                    int x3 = io.x(urVar);
                    sf1 l3 = urVar.l();
                    e21 Q3 = fp.Q(urVar, b21Var);
                    lr.b.getClass();
                    hs hsVar3 = kr.b;
                    urVar.a0();
                    if (urVar.S) {
                        urVar.k(hsVar3);
                    } else {
                        urVar.k0();
                    }
                    op1.q(urVar, kr.f, a2);
                    op1.q(urVar, kr.e, l3);
                    gb gbVar3 = kr.g;
                    if (urVar.S || !sn0.r(urVar.L(), Integer.valueOf(x3))) {
                        l90.s(x3, urVar, x3, gbVar3);
                    }
                    op1.q(urVar, kr.d, Q3);
                    fqVar.invoke(zoVar, urVar, 6);
                    urVar.p(true);
                } else {
                    urVar.R();
                }
                return od2Var;
            case 3:
                int intValue4 = num.intValue();
                if ((intValue4 & 3) != 2) {
                    z5 = true;
                }
                if (urVar.O(intValue4 & 1, z5)) {
                    fqVar.invoke(xb0.a, urVar, 6);
                } else {
                    urVar.R();
                }
                return od2Var;
            case 4:
                num.getClass();
                hp.c(fqVar, urVar, lo.b0(7));
                return od2Var;
            case 5:
                int intValue5 = num.intValue();
                if ((intValue5 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (urVar.O(intValue5 & 1, z4)) {
                    fqVar.invoke(urVar, 0);
                } else {
                    urVar.R();
                }
                return od2Var;
            default:
                num.getClass();
                di1.a(fqVar, urVar, lo.b0(7));
                return od2Var;
        }
    }

    public /* synthetic */ bj0(fq fqVar, int i, int i2) {
        this.e = i2;
        this.f = fqVar;
    }
}
