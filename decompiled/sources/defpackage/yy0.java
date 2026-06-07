package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class yy0 extends cq0 implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ zy0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yy0(zy0 zy0Var, int i) {
        super(0);
        this.e = i;
        this.f = zy0Var;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        vy0 T0;
        int i = this.e;
        od2 od2Var = od2.a;
        zy0 zy0Var = this.f;
        switch (i) {
            case 0:
                er0 er0Var = zy0Var.j;
                er0Var.h = 0;
                q41 z = er0Var.a.z();
                Object[] objArr = z.e;
                int i2 = z.g;
                for (int i3 = 0; i3 < i2; i3++) {
                    zy0 zy0Var2 = ((ar0) objArr[i3]).K.q;
                    zy0Var2.getClass();
                    zy0Var2.l = zy0Var2.m;
                    zy0Var2.m = Integer.MAX_VALUE;
                    if (zy0Var2.n == yq0.f) {
                        zy0Var2.n = yq0.g;
                    }
                }
                ar0 ar0Var = er0Var.a;
                ar0 ar0Var2 = er0Var.a;
                q41 z2 = ar0Var.z();
                Object[] objArr2 = z2.e;
                int i4 = z2.g;
                for (int i5 = 0; i5 < i4; i5++) {
                    zy0 zy0Var3 = ((ar0) objArr2[i5]).K.q;
                    zy0Var3.getClass();
                    zy0Var3.v.d = false;
                }
                pl0 pl0Var = zy0Var.h().W;
                if (pl0Var != null) {
                    boolean z3 = pl0Var.o;
                    z31 z31Var = (z31) ar0Var2.n();
                    int i6 = ((q41) z31Var.f).g;
                    for (int i7 = 0; i7 < i6; i7++) {
                        vy0 T02 = ((ar0) z31Var.get(i7)).J.d.T0();
                        if (T02 != null) {
                            T02.o = z3;
                        }
                    }
                }
                pl0 pl0Var2 = zy0Var.h().W;
                pl0Var2.getClass();
                pl0Var2.D0().a();
                if (zy0Var.h().W != null) {
                    z31 z31Var2 = (z31) ar0Var2.n();
                    int i8 = ((q41) z31Var2.f).g;
                    for (int i9 = 0; i9 < i8; i9++) {
                        vy0 T03 = ((ar0) z31Var2.get(i9)).J.d.T0();
                        if (T03 != null) {
                            T03.o = false;
                        }
                    }
                }
                q41 z4 = ar0Var2.z();
                Object[] objArr3 = z4.e;
                int i10 = z4.g;
                for (int i11 = 0; i11 < i10; i11++) {
                    zy0 zy0Var4 = ((ar0) objArr3[i11]).K.q;
                    zy0Var4.getClass();
                    int i12 = zy0Var4.l;
                    int i13 = zy0Var4.m;
                    if (i12 != i13 && i13 == Integer.MAX_VALUE) {
                        zy0Var4.u0(true);
                    }
                }
                q41 z5 = ar0Var2.z();
                Object[] objArr4 = z5.e;
                int i14 = z5.g;
                for (int i15 = 0; i15 < i14; i15++) {
                    zy0 zy0Var5 = ((ar0) objArr4[i15]).K.q;
                    zy0Var5.getClass();
                    br0 br0Var = zy0Var5.v;
                    br0Var.e = br0Var.d;
                }
                return od2Var;
            case 1:
                er0 er0Var2 = zy0Var.j;
                hg1 hg1Var = null;
                if (!vn.F(er0Var2.a) && !er0Var2.c) {
                    e81 e81Var = er0Var2.a().u;
                    if (e81Var != null && (T0 = e81Var.T0()) != null) {
                        hg1Var = T0.p;
                    }
                } else {
                    e81 e81Var2 = er0Var2.a().u;
                    if (e81Var2 != null) {
                        hg1Var = e81Var2.p;
                    }
                }
                if (hg1Var == null) {
                    hg1Var = ((q5) dr0.a(er0Var2.a)).getPlacementScope();
                }
                vy0 T04 = er0Var2.a().T0();
                T04.getClass();
                hg1.j(hg1Var, T04, zy0Var.s);
                return od2Var;
            default:
                vy0 T05 = zy0Var.j.a().T0();
                T05.getClass();
                T05.x(zy0Var.C);
                return od2Var;
        }
    }
}
