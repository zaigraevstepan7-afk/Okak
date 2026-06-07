package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class x2 implements se0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ float f;
    public final /* synthetic */ fq g;

    public /* synthetic */ x2(float f, fq fqVar) {
        this.f = f;
        this.g = fqVar;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.e;
        od2 od2Var = od2.a;
        fq fqVar = this.g;
        float f = this.f;
        ur urVar = (ur) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                f3.b(f, fqVar, urVar, lo.b0(391));
                return od2Var;
            default:
                int intValue = num.intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar.O(intValue & 1, z)) {
                    e21 a = hy1.a(b21.a, f, 56.0f);
                    j01 d = hj.d(g3.j, false);
                    int x = io.x(urVar);
                    sf1 l = urVar.l();
                    e21 Q = fp.Q(urVar, a);
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
        }
    }

    public /* synthetic */ x2(float f, fq fqVar, int i) {
        this.f = f;
        this.g = fqVar;
    }
}
