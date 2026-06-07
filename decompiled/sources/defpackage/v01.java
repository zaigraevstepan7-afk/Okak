package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class v01 implements se0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ Object f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ v01(se0 se0Var, dy dyVar, boolean z, fq fqVar) {
        this.f = se0Var;
        this.i = dyVar;
        this.g = z;
        this.h = fqVar;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        long j;
        boolean z2;
        long j2;
        boolean z3;
        boolean z4;
        boolean z5;
        long j3;
        long j4;
        int i = this.e;
        boolean z6 = this.g;
        od2 od2Var = od2.a;
        boolean z7 = false;
        Object obj3 = this.h;
        Object obj4 = this.f;
        Object obj5 = this.i;
        switch (i) {
            case 0:
                s01 s01Var = (s01) obj5;
                se0 se0Var = (se0) obj4;
                fq fqVar = (fq) obj3;
                ur urVar = (ur) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar.O(intValue & 1, z)) {
                    urVar.X(-913082743);
                    urVar.p(false);
                    js jsVar = et.a;
                    if (z6) {
                        j = s01Var.a;
                    } else {
                        j = s01Var.d;
                    }
                    vn.b(jsVar.a(new co(j)), go.N(-893579015, new b3(se0Var, fqVar), urVar), urVar, 56);
                    if (se0Var != null) {
                        urVar.X(-863399043);
                        if (z6) {
                            j2 = s01Var.c;
                        } else {
                            j2 = s01Var.f;
                        }
                        vn.b(jsVar.a(new co(j2)), go.N(-782441013, new v2(3, se0Var), urVar), urVar, 56);
                        z2 = false;
                    } else {
                        z2 = false;
                        urVar.X(-913082743);
                    }
                    urVar.p(z2);
                } else {
                    urVar.R();
                }
                return od2Var;
            case 1:
                se0 se0Var2 = (se0) obj4;
                dy dyVar = (dy) obj5;
                fq fqVar2 = (fq) obj3;
                ur urVar2 = (ur) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (urVar2.O(intValue2 & 1, z3)) {
                    b21 b21Var = b21.a;
                    e21 O = sn0.O(b21Var, 16.0f, 0.0f, 24.0f, 0.0f, 10);
                    up1 a = tp1.a(c01.e, g3.p, urVar2, 48);
                    int x = io.x(urVar2);
                    sf1 l = urVar2.l();
                    e21 Q = fp.Q(urVar2, O);
                    lr.b.getClass();
                    hs hsVar = kr.b;
                    urVar2.a0();
                    if (urVar2.S) {
                        urVar2.k(hsVar);
                    } else {
                        urVar2.k0();
                    }
                    gb gbVar = kr.f;
                    op1.q(urVar2, gbVar, a);
                    gb gbVar2 = kr.e;
                    op1.q(urVar2, gbVar2, l);
                    gb gbVar3 = kr.g;
                    if (urVar2.S || !sn0.r(urVar2.L(), Integer.valueOf(x))) {
                        l90.s(x, urVar2, x, gbVar3);
                    }
                    gb gbVar4 = kr.d;
                    op1.q(urVar2, gbVar4, Q);
                    if (se0Var2 != null) {
                        urVar2.X(-2013920011);
                        urVar2.X(1141354218);
                        z4 = z6;
                        if (z6) {
                            j4 = dyVar.a;
                        } else {
                            j4 = dyVar.b;
                        }
                        o41 p = fr1.p(new co(j4), urVar2);
                        urVar2.p(false);
                        vn.b(et.a.a(new co(((co) p.getValue()).a)), se0Var2, urVar2, 8);
                        xp1.a(urVar2, hy1.j(b21Var, 12.0f));
                        z5 = false;
                    } else {
                        z4 = z6;
                        z5 = false;
                        urVar2.X(-2062873134);
                    }
                    urVar2.p(z5);
                    pr0 pr0Var = new pr0(1.0f, true);
                    j01 d = hj.d(g3.f, z5);
                    int x2 = io.x(urVar2);
                    sf1 l2 = urVar2.l();
                    e21 Q2 = fp.Q(urVar2, pr0Var);
                    urVar2.a0();
                    if (urVar2.S) {
                        urVar2.k(hsVar);
                    } else {
                        urVar2.k0();
                    }
                    op1.q(urVar2, gbVar, d);
                    op1.q(urVar2, gbVar2, l2);
                    if (urVar2.S || !sn0.r(urVar2.L(), Integer.valueOf(x2))) {
                        l90.s(x2, urVar2, x2, gbVar3);
                    }
                    op1.q(urVar2, gbVar4, Q2);
                    urVar2.X(1275109558);
                    if (z4) {
                        j3 = dyVar.c;
                    } else {
                        j3 = dyVar.d;
                    }
                    o41 p2 = fr1.p(new co(j3), urVar2);
                    urVar2.p(false);
                    vn.b(et.a.a(new co(((co) p2.getValue()).a)), fqVar2, urVar2, 8);
                    urVar2.p(true);
                    urVar2.X(-2062873134);
                    urVar2.p(false);
                    urVar2.p(true);
                } else {
                    urVar2.R();
                }
                return od2Var;
            default:
                r31 r31Var = (r31) obj5;
                c72 c72Var = (c72) obj4;
                kw1 kw1Var = (kw1) obj3;
                ur urVar3 = (ur) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z7 = true;
                }
                if (urVar3.O(intValue3 & 1, z7)) {
                    g3.U.c(this.g, r31Var, null, c72Var, kw1Var, 0.0f, 0.0f, urVar3, 100663296, 200);
                } else {
                    urVar3.R();
                }
                return od2Var;
        }
    }

    public /* synthetic */ v01(s01 s01Var, boolean z, se0 se0Var, fq fqVar) {
        this.i = s01Var;
        this.g = z;
        this.f = se0Var;
        this.h = fqVar;
    }

    public /* synthetic */ v01(boolean z, r31 r31Var, c72 c72Var, kw1 kw1Var) {
        this.g = z;
        this.i = r31Var;
        this.f = c72Var;
        this.h = kw1Var;
    }
}
