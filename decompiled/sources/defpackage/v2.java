package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class v2 implements se0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ se0 f;

    public /* synthetic */ v2(int i, se0 se0Var) {
        this.e = i;
        this.f = se0Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        oq1 oq1Var;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i = this.e;
        b21 b21Var = b21.a;
        od2 od2Var = od2.a;
        se0 se0Var = this.f;
        switch (i) {
            case 0:
                ur urVar = (ur) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar.O(intValue & 1, z)) {
                    e21 d = sn0.J(new pr0(1.0f, false), f3.d).d(new ci0(g3.r));
                    j01 d2 = hj.d(g3.f, false);
                    int x = io.x(urVar);
                    sf1 l = urVar.l();
                    e21 Q = fp.Q(urVar, d);
                    lr.b.getClass();
                    hs hsVar = kr.b;
                    urVar.a0();
                    if (urVar.S) {
                        urVar.k(hsVar);
                    } else {
                        urVar.k0();
                    }
                    op1.q(urVar, kr.f, d2);
                    op1.q(urVar, kr.e, l);
                    gb gbVar = kr.g;
                    if (urVar.S || !sn0.r(urVar.L(), Integer.valueOf(x))) {
                        l90.s(x, urVar, x, gbVar);
                    }
                    op1.q(urVar, kr.d, Q);
                    se0Var.invoke(urVar, 0);
                    urVar.p(true);
                } else {
                    urVar.R();
                }
                return od2Var;
            case 1:
                ur urVar2 = (ur) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (urVar2.O(intValue2 & 1, z2)) {
                    e21 d3 = sn0.J(b21Var, f3.b).d(new ci0(g3.s));
                    j01 d4 = hj.d(g3.f, false);
                    int x2 = io.x(urVar2);
                    sf1 l2 = urVar2.l();
                    e21 Q2 = fp.Q(urVar2, d3);
                    lr.b.getClass();
                    hs hsVar2 = kr.b;
                    urVar2.a0();
                    if (urVar2.S) {
                        urVar2.k(hsVar2);
                    } else {
                        urVar2.k0();
                    }
                    op1.q(urVar2, kr.f, d4);
                    op1.q(urVar2, kr.e, l2);
                    gb gbVar2 = kr.g;
                    if (urVar2.S || !sn0.r(urVar2.L(), Integer.valueOf(x2))) {
                        l90.s(x2, urVar2, x2, gbVar2);
                    }
                    op1.q(urVar2, kr.d, Q2);
                    se0Var.invoke(urVar2, 0);
                    urVar2.p(true);
                } else {
                    urVar2.R();
                }
                return od2Var;
            case 2:
                kq1 kq1Var = (kq1) obj;
                List list = (List) se0Var.invoke(kq1Var, obj2);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj3 = list.get(i2);
                    if (obj3 != null && (oq1Var = kq1Var.f) != null && !oq1Var.c(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i2 + " can't be saved: " + obj3).toString());
                    }
                }
                if (!list.isEmpty()) {
                    return new ArrayList(list);
                }
                return null;
            case 3:
                ur urVar3 = (ur) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (urVar3.O(intValue3 & 1, z3)) {
                    e21 a = hy1.a(b21Var, bf.h0, Float.NaN);
                    j01 d5 = hj.d(g3.f, false);
                    int x3 = io.x(urVar3);
                    sf1 l3 = urVar3.l();
                    e21 Q3 = fp.Q(urVar3, a);
                    lr.b.getClass();
                    hs hsVar3 = kr.b;
                    urVar3.a0();
                    if (urVar3.S) {
                        urVar3.k(hsVar3);
                    } else {
                        urVar3.k0();
                    }
                    op1.q(urVar3, kr.f, d5);
                    op1.q(urVar3, kr.e, l3);
                    gb gbVar3 = kr.g;
                    if (urVar3.S || !sn0.r(urVar3.L(), Integer.valueOf(x3))) {
                        l90.s(x3, urVar3, x3, gbVar3);
                    }
                    op1.q(urVar3, kr.d, Q3);
                    se0Var.invoke(urVar3, 0);
                    urVar3.p(true);
                } else {
                    urVar3.R();
                }
                return od2Var;
            case 4:
                ur urVar4 = (ur) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (urVar4.O(intValue4 & 1, z4)) {
                    j01 d6 = hj.d(g3.f, false);
                    int x4 = io.x(urVar4);
                    sf1 l4 = urVar4.l();
                    e21 Q4 = fp.Q(urVar4, b21Var);
                    lr.b.getClass();
                    hs hsVar4 = kr.b;
                    urVar4.a0();
                    if (urVar4.S) {
                        urVar4.k(hsVar4);
                    } else {
                        urVar4.k0();
                    }
                    op1.q(urVar4, kr.f, d6);
                    op1.q(urVar4, kr.e, l4);
                    gb gbVar4 = kr.g;
                    if (urVar4.S || !sn0.r(urVar4.L(), Integer.valueOf(x4))) {
                        l90.s(x4, urVar4, x4, gbVar4);
                    }
                    op1.q(urVar4, kr.d, Q4);
                    se0Var.invoke(urVar4, 0);
                    urVar4.p(true);
                } else {
                    urVar4.R();
                }
                return od2Var;
            case 5:
                ur urVar5 = (ur) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (urVar5.O(intValue5 & 1, z5)) {
                    j01 d7 = hj.d(g3.f, false);
                    int x5 = io.x(urVar5);
                    sf1 l5 = urVar5.l();
                    e21 Q5 = fp.Q(urVar5, b21Var);
                    lr.b.getClass();
                    hs hsVar5 = kr.b;
                    urVar5.a0();
                    if (urVar5.S) {
                        urVar5.k(hsVar5);
                    } else {
                        urVar5.k0();
                    }
                    op1.q(urVar5, kr.f, d7);
                    op1.q(urVar5, kr.e, l5);
                    gb gbVar5 = kr.g;
                    if (urVar5.S || !sn0.r(urVar5.L(), Integer.valueOf(x5))) {
                        l90.s(x5, urVar5, x5, gbVar5);
                    }
                    op1.q(urVar5, kr.d, Q5);
                    se0Var.invoke(urVar5, 0);
                    urVar5.p(true);
                } else {
                    urVar5.R();
                }
                return od2Var;
            case 6:
                ur urVar6 = (ur) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (urVar6.O(intValue6 & 1, z6)) {
                    j01 d8 = hj.d(g3.f, false);
                    int x6 = io.x(urVar6);
                    sf1 l6 = urVar6.l();
                    e21 Q6 = fp.Q(urVar6, b21Var);
                    lr.b.getClass();
                    hs hsVar6 = kr.b;
                    urVar6.a0();
                    if (urVar6.S) {
                        urVar6.k(hsVar6);
                    } else {
                        urVar6.k0();
                    }
                    op1.q(urVar6, kr.f, d8);
                    op1.q(urVar6, kr.e, l6);
                    gb gbVar6 = kr.g;
                    if (urVar6.S || !sn0.r(urVar6.L(), Integer.valueOf(x6))) {
                        l90.s(x6, urVar6, x6, gbVar6);
                    }
                    op1.q(urVar6, kr.d, Q6);
                    se0Var.invoke(urVar6, 0);
                    urVar6.p(true);
                } else {
                    urVar6.R();
                }
                return od2Var;
            default:
                ur urVar7 = (ur) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (urVar7.O(intValue7 & 1, z7)) {
                    j01 d9 = hj.d(g3.f, false);
                    int x7 = io.x(urVar7);
                    sf1 l7 = urVar7.l();
                    e21 Q7 = fp.Q(urVar7, b21Var);
                    lr.b.getClass();
                    hs hsVar7 = kr.b;
                    urVar7.a0();
                    if (urVar7.S) {
                        urVar7.k(hsVar7);
                    } else {
                        urVar7.k0();
                    }
                    op1.q(urVar7, kr.f, d9);
                    op1.q(urVar7, kr.e, l7);
                    gb gbVar7 = kr.g;
                    if (urVar7.S || !sn0.r(urVar7.L(), Integer.valueOf(x7))) {
                        l90.s(x7, urVar7, x7, gbVar7);
                    }
                    op1.q(urVar7, kr.d, Q7);
                    se0Var.invoke(urVar7, 0);
                    urVar7.p(true);
                } else {
                    urVar7.R();
                }
                return od2Var;
        }
    }
}
