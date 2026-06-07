package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class o1 implements te0 {
    public final /* synthetic */ int e;

    public /* synthetic */ o1(int i) {
        this.e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.te0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.e;
        m60 m60Var = m60.e;
        b21 b21Var = b21.a;
        int i2 = 2;
        od2 od2Var = od2.a;
        boolean z4 = true;
        boolean z5 = false;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                l01 l01Var = (l01) obj;
                int j0 = l01Var.j0(10.0f);
                int i3 = j0 * 2;
                ig1 x = ((e01) obj2).x(vs.i(((us) obj3).a, i3, 0));
                return l01Var.s0(x.e - i3, x.f, m60Var, new q1(j0, 0, x));
            case 1:
                l01 l01Var2 = (l01) obj;
                int j02 = l01Var2.j0(10.0f);
                int i4 = j02 * 2;
                ig1 x2 = ((e01) obj2).x(vs.i(((us) obj3).a, 0, i4));
                return l01Var2.s0(x2.e, x2.f - i4, m60Var, new q1(j02, 1, x2));
            case 2:
                e21 e21Var = (e21) obj;
                ur urVar = (ur) obj2;
                ((Integer) obj3).getClass();
                urVar.X(-2126899193);
                long j = ((e92) urVar.j(f92.a)).a;
                boolean e = urVar.e(j);
                Object L = urVar.L();
                if (e || L == or.a) {
                    L = new v6(objArr == true ? 1 : 0, j);
                    urVar.h0(L);
                }
                e21 d = e21Var.d(rx.u(b21Var, (oe0) L));
                urVar.p(false);
                return d;
            case 3:
                ur urVar2 = (ur) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 17) != 16) {
                    z5 = true;
                }
                if (!urVar2.O(intValue & 1, z5)) {
                    urVar2.R();
                }
                return od2Var;
            case 4:
                pt ptVar = (pt) obj;
                ur urVar3 = (ur) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    if (urVar3.f(ptVar)) {
                        i2 = 4;
                    }
                    intValue2 |= i2;
                }
                if ((intValue2 & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar3.O(intValue2 & 1, z)) {
                    hj.a(f2.k(hy1.c(hy1.b(sn0.M(b21Var, 0.0f, rt.g, 1), 1.0f), rt.f), ptVar.c, d6.w), urVar3, 0);
                } else {
                    urVar3.R();
                }
                return od2Var;
            case 5:
                ur urVar4 = (ur) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((zo) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (urVar4.O(intValue3 & 1, z2)) {
                    e21 K = sn0.K(b21Var, 20.0f);
                    yo a = wo.a(c01.g, g3.r, urVar4, 0);
                    int hashCode = Long.hashCode(urVar4.T);
                    sf1 l = urVar4.l();
                    e21 Q = fp.Q(urVar4, K);
                    lr.b.getClass();
                    hs hsVar = kr.b;
                    urVar4.a0();
                    if (urVar4.S) {
                        urVar4.k(hsVar);
                    } else {
                        urVar4.k0();
                    }
                    op1.q(urVar4, kr.f, a);
                    op1.q(urVar4, kr.e, l);
                    op1.l(urVar4, Integer.valueOf(hashCode), kr.g);
                    op1.o(urVar4, kr.h);
                    op1.q(urVar4, kr.d, Q);
                    rx.i(hy1.g(b21Var, 64.0f, 24.0f), null, urVar4, 6);
                    xp1.a(urVar4, hy1.c(b21Var, 12.0f));
                    rx.i(hy1.c(hy1.b(b21Var, 0.6f), 20.0f), null, urVar4, 6);
                    xp1.a(urVar4, hy1.c(b21Var, 8.0f));
                    rx.i(hy1.c(hy1.b(b21Var, 1.0f), 14.0f), null, urVar4, 6);
                    xp1.a(urVar4, hy1.c(b21Var, 4.0f));
                    rx.i(hy1.c(hy1.b(b21Var, 0.8f), 14.0f), null, urVar4, 6);
                    xp1.a(urVar4, hy1.c(b21Var, 16.0f));
                    rx.i(hy1.g(b21Var, 96.0f, 18.0f), null, urVar4, 6);
                    urVar4.p(true);
                } else {
                    urVar4.R();
                }
                return od2Var;
            case 6:
                ur urVar5 = (ur) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((zo) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (urVar5.O(intValue4 & 1, z3)) {
                    e21 K2 = sn0.K(b21Var, 20.0f);
                    yo a2 = wo.a(c01.g, g3.r, urVar5, 0);
                    int hashCode2 = Long.hashCode(urVar5.T);
                    sf1 l2 = urVar5.l();
                    e21 Q2 = fp.Q(urVar5, K2);
                    lr.b.getClass();
                    hs hsVar2 = kr.b;
                    urVar5.a0();
                    if (urVar5.S) {
                        urVar5.k(hsVar2);
                    } else {
                        urVar5.k0();
                    }
                    op1.q(urVar5, kr.f, a2);
                    op1.q(urVar5, kr.e, l2);
                    op1.l(urVar5, Integer.valueOf(hashCode2), kr.g);
                    op1.o(urVar5, kr.h);
                    op1.q(urVar5, kr.d, Q2);
                    rx.i(hy1.c(hy1.b(b21Var, 0.4f), 14.0f), null, urVar5, 6);
                    xp1.a(urVar5, hy1.c(b21Var, 8.0f));
                    rx.i(hy1.c(hy1.b(b21Var, 0.7f), 20.0f), null, urVar5, 6);
                    urVar5.p(true);
                } else {
                    urVar5.R();
                }
                return od2Var;
            default:
                pz1 pz1Var = (pz1) obj;
                ur urVar6 = (ur) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    if (urVar6.f(pz1Var)) {
                        i2 = 4;
                    }
                    intValue5 |= i2;
                }
                if ((intValue5 & 19) == 18) {
                    z4 = false;
                }
                if (urVar6.O(intValue5 & 1, z4)) {
                    rp1.c(pz1Var, null, null, 0L, 0L, 0L, 0L, 0L, urVar6, intValue5 & 14);
                } else {
                    urVar6.R();
                }
                return od2Var;
        }
    }
}
