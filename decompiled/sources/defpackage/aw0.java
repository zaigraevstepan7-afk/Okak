package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class aw0 implements se0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ fq h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ af0 j;

    public /* synthetic */ aw0(se0 se0Var, se0 se0Var2, fq fqVar, se0 se0Var3, se0 se0Var4, int i) {
        this.e = 1;
        this.f = se0Var;
        this.g = se0Var2;
        this.h = fqVar;
        this.i = se0Var3;
        this.j = se0Var4;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.e;
        boolean z2 = false;
        od2 od2Var = od2.a;
        af0 af0Var = this.j;
        Object obj3 = this.i;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                se0 se0Var = (se0) obj5;
                se0 se0Var2 = (se0) obj4;
                se0 se0Var3 = (se0) obj3;
                se0 se0Var4 = (se0) af0Var;
                ur urVar = (ur) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                if (urVar.O(1 & intValue, z2)) {
                    cw0.b(se0Var, se0Var2, this.h, se0Var3, se0Var4, urVar, 384);
                } else {
                    urVar.R();
                }
                return od2Var;
            case 1:
                ((Integer) obj2).getClass();
                cw0.b((se0) obj5, (se0) obj4, this.h, (se0) obj3, (se0) af0Var, (ur) obj, lo.b0(385));
                return od2Var;
            default:
                e21 e21Var = (e21) obj5;
                o41 o41Var = (o41) obj4;
                nh nhVar = (nh) obj3;
                de0 de0Var = (de0) af0Var;
                ur urVar2 = (ur) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar2.O(intValue2 & 1, z)) {
                    Object L = urVar2.L();
                    if (L == or.a) {
                        L = new aa(o41Var, 2);
                        urVar2.h0(L);
                    }
                    e21 C = f2.C(e21Var, (oe0) L);
                    j01 d = hj.d(g3.f, true);
                    int hashCode = Long.hashCode(urVar2.T);
                    sf1 l = urVar2.l();
                    e21 Q = fp.Q(urVar2, C);
                    lr.b.getClass();
                    hs hsVar = kr.b;
                    urVar2.a0();
                    if (urVar2.S) {
                        urVar2.k(hsVar);
                    } else {
                        urVar2.k0();
                    }
                    op1.q(urVar2, kr.f, d);
                    op1.q(urVar2, kr.e, l);
                    op1.l(urVar2, Integer.valueOf(hashCode), kr.g);
                    op1.o(urVar2, kr.h);
                    op1.q(urVar2, kr.d, Q);
                    this.h.invoke(urVar2, 0);
                    nhVar.b(de0Var, urVar2, 6);
                    urVar2.p(true);
                } else {
                    urVar2.R();
                }
                return od2Var;
        }
    }

    public /* synthetic */ aw0(Object obj, Object obj2, fq fqVar, Object obj3, af0 af0Var, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = fqVar;
        this.i = obj3;
        this.j = af0Var;
    }
}
