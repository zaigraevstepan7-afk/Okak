package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class z10 implements se0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ float f;
    public final /* synthetic */ long g;
    public final /* synthetic */ Object h;

    public /* synthetic */ z10(float f, long j, fq fqVar) {
        this.f = f;
        this.g = j;
        this.h = fqVar;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.e;
        od2 od2Var = od2.a;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                vn.h((e21) obj3, this.f, this.g, (ur) obj, lo.b0(7));
                return od2Var;
            default:
                fq fqVar = (fq) obj3;
                ur urVar = (ur) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar.O(intValue & 1, z)) {
                    e21 J = sn0.J(hy1.i(b21.a, 40.0f, 24.0f, this.f, 8), qa2.a);
                    j01 d = hj.d(g3.f, false);
                    int x = io.x(urVar);
                    sf1 l = urVar.l();
                    e21 Q = fp.Q(urVar, J);
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
                    vn.c(new zj1[]{et.a.a(new co(this.g)), t82.a.a(rc2.a(c01.t, urVar))}, fqVar, urVar, 8);
                    urVar.p(true);
                } else {
                    urVar.R();
                }
                return od2Var;
        }
    }

    public /* synthetic */ z10(e21 e21Var, float f, long j, int i) {
        this.h = e21Var;
        this.f = f;
        this.g = j;
    }
}
