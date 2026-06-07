package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class pn1 implements ue0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ oe0 f;
    public final /* synthetic */ List g;
    public final /* synthetic */ Object h;

    public pn1(ArrayList arrayList, se0 se0Var, oe0 oe0Var) {
        this.e = 0;
        this.g = arrayList;
        this.h = se0Var;
        this.f = oe0Var;
    }

    @Override // defpackage.ue0
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4 = this.e;
        od2 od2Var = od2.a;
        Object obj5 = this.h;
        Object obj6 = or.a;
        List list = this.g;
        int i5 = 16;
        oe0 oe0Var = this.f;
        int i6 = 2;
        int i7 = 4;
        switch (i4) {
            case 0:
                tr0 tr0Var = (tr0) obj;
                int intValue = ((Number) obj2).intValue();
                ur urVar = (ur) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (urVar.f(tr0Var)) {
                        i6 = 4;
                    }
                    i = intValue2 | i6;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (urVar.d(intValue)) {
                        i5 = 32;
                    }
                    i |= i5;
                }
                if ((i & 147) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar.O(i & 1, z)) {
                    List<zm1> list2 = (List) ((ArrayList) list).get(intValue);
                    urVar.X(340876852);
                    e21 b = hy1.b(b21.a, 1.0f);
                    up1 a = tp1.a(new pe(10.0f, true, new le(0)), g3.o, urVar, 6);
                    int hashCode = Long.hashCode(urVar.T);
                    sf1 l = urVar.l();
                    e21 Q = fp.Q(urVar, b);
                    lr.b.getClass();
                    hs hsVar = kr.b;
                    urVar.a0();
                    if (urVar.S) {
                        urVar.k(hsVar);
                    } else {
                        urVar.k0();
                    }
                    op1.q(urVar, kr.f, a);
                    op1.q(urVar, kr.e, l);
                    op1.l(urVar, Integer.valueOf(hashCode), kr.g);
                    op1.o(urVar, kr.h);
                    op1.q(urVar, kr.d, Q);
                    urVar.X(-429128519);
                    for (zm1 zm1Var : list2) {
                        se0 se0Var = (se0) obj5;
                        boolean f = urVar.f(oe0Var) | urVar.f(zm1Var);
                        Object L = urVar.L();
                        if (f || L == obj6) {
                            L = new nn1(4, oe0Var, zm1Var);
                            urVar.h0(L);
                        }
                        ur urVar2 = urVar;
                        bf.a(zm1Var, se0Var, (de0) L, vp1.a(), urVar2, 0);
                        urVar = urVar2;
                    }
                    ur urVar3 = urVar;
                    urVar3.p(false);
                    if (list2.size() == 1) {
                        urVar3.X(-429115819);
                        xp1.a(urVar3, vp1.a());
                    } else {
                        urVar3.X(-417651981);
                    }
                    urVar3.p(false);
                    urVar3.p(true);
                    urVar3.p(false);
                } else {
                    urVar.R();
                }
                return od2Var;
            case 1:
                tr0 tr0Var2 = (tr0) obj;
                int intValue3 = ((Number) obj2).intValue();
                ur urVar4 = (ur) obj3;
                int intValue4 = ((Number) obj4).intValue();
                oe0 oe0Var2 = (oe0) obj5;
                if ((intValue4 & 6) == 0) {
                    if (!urVar4.f(tr0Var2)) {
                        i7 = 2;
                    }
                    i2 = intValue4 | i7;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (urVar4.d(intValue3)) {
                        i5 = 32;
                    }
                    i2 |= i5;
                }
                if ((i2 & 147) != 146) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (urVar4.O(i2 & 1, z2)) {
                    zm1 zm1Var2 = (zm1) list.get(intValue3);
                    urVar4.X(450653394);
                    boolean f2 = urVar4.f(oe0Var) | urVar4.f(zm1Var2);
                    Object L2 = urVar4.L();
                    if (f2 || L2 == obj6) {
                        L2 = new nn1(2, oe0Var, zm1Var2);
                        urVar4.h0(L2);
                    }
                    de0 de0Var = (de0) L2;
                    boolean f3 = urVar4.f(oe0Var2) | urVar4.f(zm1Var2);
                    Object L3 = urVar4.L();
                    if (f3 || L3 == obj6) {
                        L3 = new nn1(3, oe0Var2, zm1Var2);
                        urVar4.h0(L3);
                    }
                    bf.h(zm1Var2, de0Var, (de0) L3, urVar4, 0);
                    urVar4.p(false);
                } else {
                    urVar4.R();
                }
                return od2Var;
            default:
                tr0 tr0Var3 = (tr0) obj;
                int intValue5 = ((Number) obj2).intValue();
                ur urVar5 = (ur) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    if (urVar5.f(tr0Var3)) {
                        i6 = 4;
                    }
                    i3 = intValue6 | i6;
                } else {
                    i3 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    if (urVar5.d(intValue5)) {
                        i5 = 32;
                    }
                    i3 |= i5;
                }
                if ((i3 & 147) != 146) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (urVar5.O(i3 & 1, z3)) {
                    ef2 ef2Var = (ef2) ((ArrayList) list).get(intValue5);
                    urVar5.X(2017790610);
                    boolean f4 = urVar5.f(oe0Var) | urVar5.f(ef2Var);
                    Object L4 = urVar5.L();
                    if (f4 || L4 == obj6) {
                        L4 = new nn1(5, oe0Var, ef2Var);
                        urVar5.h0(L4);
                    }
                    d6.n(ef2Var, (de0) L4, (h32) obj5, urVar5, 0);
                    urVar5.p(false);
                } else {
                    urVar5.R();
                }
                return od2Var;
        }
    }

    public /* synthetic */ pn1(List list, oe0 oe0Var, Object obj, int i) {
        this.e = i;
        this.g = list;
        this.f = oe0Var;
        this.h = obj;
    }
}
