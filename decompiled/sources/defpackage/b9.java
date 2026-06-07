package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class b9 extends cq0 implements se0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ai1 f;
    public final /* synthetic */ o41 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b9(ai1 ai1Var, o41 o41Var, int i) {
        super(2);
        this.e = i;
        this.f = ai1Var;
        this.g = o41Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        float f;
        boolean z2;
        int i = this.e;
        od2 od2Var = od2.a;
        o41 o41Var = this.g;
        ai1 ai1Var = this.f;
        int i2 = 0;
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
                    Object L = urVar.L();
                    xl1 xl1Var = or.a;
                    if (L == xl1Var) {
                        L = i5.m;
                        urVar.h0(L);
                    }
                    e21 a = ou1.a(b21.a, false, (oe0) L);
                    boolean h = urVar.h(ai1Var);
                    Object L2 = urVar.L();
                    if (h || L2 == xl1Var) {
                        L2 = new y8(ai1Var, 1);
                        urVar.h0(L2);
                    }
                    e21 C = d6.C(a, (oe0) L2);
                    if (ai1Var.getCanCalculatePosition()) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    e21 p = sn0.p(C, f);
                    js jsVar = c9.a;
                    se0 se0Var = (se0) o41Var.getValue();
                    Object L3 = urVar.L();
                    if (L3 == xl1Var) {
                        L3 = b7.c;
                        urVar.h0(L3);
                    }
                    j01 j01Var = (j01) L3;
                    int hashCode = Long.hashCode(urVar.T);
                    sf1 l = urVar.l();
                    e21 Q = fp.Q(urVar, p);
                    lr.b.getClass();
                    hs hsVar = kr.b;
                    urVar.a0();
                    if (urVar.S) {
                        urVar.k(hsVar);
                    } else {
                        urVar.k0();
                    }
                    op1.q(urVar, kr.f, j01Var);
                    op1.q(urVar, kr.e, l);
                    op1.l(urVar, Integer.valueOf(hashCode), kr.g);
                    op1.o(urVar, kr.h);
                    op1.q(urVar, kr.d, Q);
                    se0Var.invoke(urVar, 0);
                    urVar.p(true);
                } else {
                    urVar.R();
                }
                return od2Var;
            default:
                ur urVar2 = (ur) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (urVar2.O(intValue2 & 1, z2)) {
                    vn.b(c9.b.a(Boolean.TRUE), go.N(1022273628, new b9(ai1Var, o41Var, i2), urVar2), urVar2, 56);
                } else {
                    urVar2.R();
                }
                return od2Var;
        }
    }
}
