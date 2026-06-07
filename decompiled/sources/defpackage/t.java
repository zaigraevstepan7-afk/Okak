package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class t extends cq0 implements se0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(u uVar, int i, int i2) {
        super(2);
        this.e = i2;
        this.f = uVar;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.e;
        b21 b21Var = b21.a;
        boolean z4 = false;
        od2 od2Var = od2.a;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                ur urVar = (ur) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar.O(intValue & 1, z)) {
                    ((u) obj3).a(0, urVar);
                } else {
                    urVar.R();
                }
                return od2Var;
            case 1:
                ((p6) obj3).l(((Number) obj).intValue(), (ru1) obj2);
                return od2Var;
            case 2:
                ur urVar2 = (ur) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (urVar2.O(intValue2 & 1, z2)) {
                    Object L = urVar2.L();
                    if (L == or.a) {
                        L = i5.j;
                        urVar2.h0(L);
                    }
                    bf.u(ou1.a(b21Var, false, (oe0) L), (se0) ((o41) obj3).getValue(), urVar2, 0);
                } else {
                    urVar2.R();
                }
                return od2Var;
            case 3:
                r60 r60Var = (r60) obj;
                r60 r60Var2 = (r60) obj2;
                r60 r60Var3 = r60.g;
                if (r60Var == r60Var3 && r60Var2 == r60Var3 && !((u70) obj3).a.e) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 4:
                ((Number) obj2).intValue();
                ((mr) obj3).a(lo.b0(1), (ur) obj);
                return od2Var;
            case 5:
                e21 e21Var = (e21) obj;
                e21 e21Var2 = (c21) obj2;
                ur urVar3 = (ur) obj3;
                if (e21Var2 instanceof nr) {
                    te0 te0Var = ((nr) e21Var2).a;
                    fc2.t(3, te0Var);
                    e21Var2 = fp.P(urVar3, (e21) te0Var.invoke(b21Var, urVar3, 0));
                }
                return e21Var.d(e21Var2);
            case 6:
                ((Number) obj2).intValue();
                ((w00) obj3).a(lo.b0(1), (ur) obj);
                return od2Var;
            case 7:
                ur urVar4 = (ur) obj;
                int intValue3 = ((Number) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (urVar4.O(intValue3 & 1, z3)) {
                    List list = (List) obj3;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        se0 se0Var = (se0) list.get(i2);
                        int hashCode = Long.hashCode(urVar4.T);
                        lr.b.getClass();
                        e6 e6Var = kr.c;
                        urVar4.a0();
                        if (urVar4.S) {
                            urVar4.k(e6Var);
                        } else {
                            urVar4.k0();
                        }
                        op1.l(urVar4, Integer.valueOf(hashCode), kr.g);
                        se0Var.invoke(urVar4, 0);
                        urVar4.p(true);
                    }
                } else {
                    urVar4.R();
                }
                return od2Var;
            default:
                ((Number) obj2).intValue();
                ((ai1) obj3).a(lo.b0(1), (ur) obj);
                return od2Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, int i) {
        super(2);
        this.e = i;
        this.f = obj;
    }
}
