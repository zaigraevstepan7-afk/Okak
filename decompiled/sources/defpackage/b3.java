package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class b3 implements se0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ fq f;
    public final /* synthetic */ se0 g;

    public /* synthetic */ b3(se0 se0Var, fq fqVar) {
        this.e = 2;
        this.g = se0Var;
        this.f = fqVar;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        float f;
        int i = this.e;
        od2 od2Var = od2.a;
        boolean z3 = false;
        fq fqVar = this.f;
        se0 se0Var = this.g;
        int i2 = 1;
        ur urVar = (ur) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if ((intValue & 3) != 2) {
                    z3 = true;
                }
                if (urVar.O(intValue & 1, z3)) {
                    float f2 = ((f20) urVar.j(kn0.c)).e;
                    if (Float.isNaN(f2)) {
                        f2 = 0.0f;
                    }
                    f20 f20Var = new f20(8.0f - (f2 - sk.d));
                    f20 f20Var2 = new f20(0.0f);
                    f20 f20Var3 = new f20(8.0f);
                    if (f20Var2.compareTo(f20Var3) <= 0) {
                        if (f20Var.compareTo(f20Var2) < 0) {
                            f20Var = f20Var2;
                        } else if (f20Var.compareTo(f20Var3) > 0) {
                            f20Var = f20Var3;
                        }
                        f3.b(f20Var.e, go.N(-459506658, new b3(fqVar, se0Var, i2), urVar), urVar, 390);
                        return od2Var;
                    }
                    se.j("Cannot coerce value to an empty range: maximum ", f20Var3, " is less than minimum ", f20Var2, 46);
                    return null;
                }
                urVar.R();
                return od2Var;
            case 1:
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar.O(intValue & 1, z)) {
                    fqVar.invoke(urVar, 0);
                    if (se0Var == null) {
                        urVar.X(-1102003461);
                    } else {
                        urVar.X(795735494);
                        se0Var.invoke(urVar, 0);
                    }
                    urVar.p(false);
                } else {
                    urVar.R();
                }
                return od2Var;
            default:
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (urVar.O(intValue & 1, z2)) {
                    e21 a = vp1.a();
                    if (se0Var != null) {
                        f = 12.0f;
                    } else {
                        f = 0.0f;
                    }
                    e21 O = sn0.O(a, 0.0f, 0.0f, f, 0.0f, 10);
                    j01 d = hj.d(g3.f, false);
                    int x = io.x(urVar);
                    sf1 l = urVar.l();
                    e21 Q = fp.Q(urVar, O);
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

    public /* synthetic */ b3(fq fqVar, se0 se0Var, int i) {
        this.e = i;
        this.f = fqVar;
        this.g = se0Var;
    }
}
