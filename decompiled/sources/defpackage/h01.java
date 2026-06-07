package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class h01 extends cq0 implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ i01 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h01(i01 i01Var, int i) {
        super(0);
        this.e = i;
        this.f = i01Var;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        hg1 placementScope;
        int i = this.e;
        od2 od2Var = od2.a;
        i01 i01Var = this.f;
        switch (i) {
            case 0:
                er0 er0Var = i01Var.j;
                er0Var.i = 0;
                q41 z = er0Var.a.z();
                Object[] objArr = z.e;
                int i2 = z.g;
                for (int i3 = 0; i3 < i2; i3++) {
                    i01 i01Var2 = ((ar0) objArr[i3]).K.p;
                    i01Var2.l = i01Var2.m;
                    i01Var2.m = Integer.MAX_VALUE;
                    i01Var2.x = false;
                    if (i01Var2.p == yq0.f) {
                        i01Var2.p = yq0.g;
                    }
                }
                ar0 ar0Var = er0Var.a;
                ar0 ar0Var2 = er0Var.a;
                q41 z2 = ar0Var.z();
                Object[] objArr2 = z2.e;
                int i4 = z2.g;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((ar0) objArr2[i5]).K.p.B.d = false;
                }
                if (i01Var.h().o) {
                    z31 z31Var = (z31) ar0Var2.n();
                    int i6 = ((q41) z31Var.f).g;
                    for (int i7 = 0; i7 < i6; i7++) {
                        ((ar0) z31Var.get(i7)).J.d.o = true;
                    }
                }
                i01Var.h().D0().a();
                if (i01Var.h().o) {
                    z31 z31Var2 = (z31) ar0Var2.n();
                    int i8 = ((q41) z31Var2.f).g;
                    for (int i9 = 0; i9 < i8; i9++) {
                        ((ar0) z31Var2.get(i9)).J.d.o = false;
                    }
                }
                q41 z3 = ar0Var2.z();
                Object[] objArr3 = z3.e;
                int i10 = z3.g;
                for (int i11 = 0; i11 < i10; i11++) {
                    ar0 ar0Var3 = (ar0) objArr3[i11];
                    er0 er0Var2 = ar0Var3.K;
                    if (er0Var2.p.l != ar0Var3.w()) {
                        ar0Var2.O();
                        ar0Var2.C();
                        if (ar0Var3.w() == Integer.MAX_VALUE) {
                            if (er0Var2.c || vn.F(ar0Var3)) {
                                zy0 zy0Var = er0Var2.q;
                                zy0Var.getClass();
                                zy0Var.u0(false);
                            }
                            er0Var2.p.w0();
                        }
                    }
                }
                q41 z4 = ar0Var2.z();
                Object[] objArr4 = z4.e;
                int i12 = z4.g;
                for (int i13 = 0; i13 < i12; i13++) {
                    br0 br0Var = ((ar0) objArr4[i13]).K.p.B;
                    br0Var.e = br0Var.d;
                }
                return od2Var;
            case 1:
                i01Var.j.a().x(i01Var.F);
                return od2Var;
            default:
                er0 er0Var3 = i01Var.j;
                e81 e81Var = er0Var3.a().u;
                if (e81Var == null || (placementScope = e81Var.p) == null) {
                    placementScope = ((q5) dr0.a(er0Var3.a)).getPlacementScope();
                }
                oe0 oe0Var = i01Var.K;
                if (oe0Var == null) {
                    e81 a = er0Var3.a();
                    long j = i01Var.L;
                    float f = i01Var.M;
                    placementScope.getClass();
                    hg1.b(placementScope, a);
                    a.m0(xm0.c(j, a.i), f, null);
                } else {
                    e81 a2 = er0Var3.a();
                    long j2 = i01Var.L;
                    float f2 = i01Var.M;
                    placementScope.getClass();
                    hg1.b(placementScope, a2);
                    a2.m0(xm0.c(j2, a2.i), f2, oe0Var);
                }
                return od2Var;
        }
    }
}
