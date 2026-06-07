package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class s6 implements se0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;

    public /* synthetic */ s6(long j, e21 e21Var) {
        this.f = j;
        this.g = e21Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.e;
        od2 od2Var = od2.a;
        long j = this.f;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                e21 e21Var = (e21) obj3;
                ur urVar = (ur) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar.O(intValue & 1, z)) {
                    if (j != 9205357640488583168L) {
                        urVar.X(-1244013944);
                        e21 e = hy1.e(e21Var, j20.b(j), j20.a(j), 0.0f, 0.0f, 12);
                        j01 d = hj.d(g3.g, false);
                        int hashCode = Long.hashCode(urVar.T);
                        sf1 l = urVar.l();
                        e21 Q = fp.Q(urVar, e);
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
                        op1.l(urVar, Integer.valueOf(hashCode), kr.g);
                        op1.o(urVar, kr.h);
                        op1.q(urVar, kr.d, Q);
                        x6.b(null, urVar, 0, 1);
                        urVar.p(true);
                        urVar.p(false);
                    } else {
                        urVar.X(-1243644858);
                        x6.b(e21Var, urVar, 0, 0);
                        urVar.p(false);
                    }
                } else {
                    urVar.R();
                }
                return od2Var;
            default:
                ((Integer) obj2).getClass();
                jk1.a((ia0) obj3, j, (ur) obj, lo.b0(1));
                return od2Var;
        }
    }

    public /* synthetic */ s6(ia0 ia0Var, long j, int i) {
        this.g = ia0Var;
        this.f = j;
    }
}
