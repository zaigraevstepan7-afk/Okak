package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class ay0 implements se0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ af0 m;

    public /* synthetic */ ay0(a32 a32Var, String str, String str2, String str3, String str4, de0 de0Var, de0 de0Var2, int i) {
        this.g = a32Var;
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.k = str4;
        this.l = de0Var;
        this.m = de0Var2;
        this.f = i;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int j0;
        int j02;
        int i2;
        u80 u80Var;
        final Integer num;
        float K;
        float K2;
        Integer num2;
        int c;
        int j03;
        int c2;
        int i3 = this.e;
        af0 af0Var = this.m;
        Object obj3 = this.l;
        Object obj4 = this.k;
        int i4 = this.f;
        Object obj5 = this.j;
        Object obj6 = this.i;
        Object obj7 = this.h;
        Object obj8 = this.g;
        switch (i3) {
            case 0:
                ((Integer) obj2).getClass();
                fc2.m((a32) obj8, (String) obj7, (String) obj6, (String) obj5, (String) obj4, (de0) obj3, (de0) af0Var, (ur) obj, lo.b0(i4 | 1));
                return od2.a;
            default:
                final th2 th2Var = (th2) obj8;
                se0 se0Var = (se0) obj4;
                or1 or1Var = (or1) obj3;
                se0 se0Var2 = (se0) af0Var;
                final c42 c42Var = (c42) obj;
                us usVar = (us) obj2;
                final int h = us.h(usVar.a);
                final int g = us.g(usVar.a);
                long a = us.a(usVar.a, 0, 0, 0, 0, 10);
                int d = th2Var.d(c42Var, c42Var.getLayoutDirection());
                int b = th2Var.b(c42Var, c42Var.getLayoutDirection());
                int c3 = th2Var.c(c42Var);
                boolean z = true;
                final ig1 x = ((e01) wn.g0(c42Var.t((se0) obj7, pr1.e))).x(a);
                int i5 = (-d) - b;
                int i6 = -c3;
                final ig1 x2 = ((e01) wn.g0(c42Var.t((se0) obj6, pr1.g))).x(vs.i(a, i5, i6));
                final ig1 x3 = ((e01) wn.g0(c42Var.t((se0) obj5, pr1.h))).x(vs.i(a, i5, i6));
                int i7 = x3.e;
                if (i7 == 0 && x3.f == 0) {
                    u80Var = null;
                } else {
                    int i8 = x3.f;
                    jq0 jq0Var = jq0.e;
                    if (i4 == 0) {
                        i = d;
                        if (c42Var.getLayoutDirection() == jq0Var) {
                            j0 = c42Var.j0(16.0f);
                            i2 = j0 + i;
                        } else {
                            j02 = c42Var.j0(16.0f);
                            i2 = ((h - j02) - i7) - b;
                        }
                    } else {
                        i = d;
                        if (i4 == 2 || i4 == 3) {
                            if (c42Var.getLayoutDirection() == jq0Var) {
                                j02 = c42Var.j0(16.0f);
                                i2 = ((h - j02) - i7) - b;
                            } else {
                                j0 = c42Var.j0(16.0f);
                                i2 = j0 + i;
                            }
                        } else {
                            i2 = (((h - i7) + i) - b) / 2;
                        }
                    }
                    u80Var = new u80(i2, i8);
                }
                final ig1 x4 = ((e01) wn.g0(c42Var.t(se0Var, pr1.i))).x(a);
                int i9 = 0;
                if (x4.e != 0 || x4.f != 0) {
                    z = false;
                }
                if (u80Var != null) {
                    int i10 = u80Var.f;
                    if (!z && i4 != 3) {
                        j03 = x4.f + i10;
                        c2 = c42Var.j0(16.0f);
                    } else {
                        j03 = c42Var.j0(16.0f) + i10;
                        c2 = th2Var.c(c42Var);
                    }
                    num = Integer.valueOf(c2 + j03);
                } else {
                    num = null;
                }
                int i11 = x2.f;
                if (i11 != 0) {
                    if (num != null) {
                        c = num.intValue();
                    } else {
                        Integer valueOf = Integer.valueOf(x4.f);
                        if (!z) {
                            num2 = valueOf;
                        } else {
                            num2 = null;
                        }
                        if (num2 != null) {
                            c = num2.intValue();
                        } else {
                            c = th2Var.c(c42Var);
                        }
                    }
                    i9 = i11 + c;
                }
                gm0 gm0Var = new gm0(th2Var, c42Var);
                if (x.e == 0 && x.f == 0) {
                    K = gm0Var.d();
                } else {
                    K = c42Var.K(x.f);
                }
                if (z) {
                    K2 = gm0Var.a();
                } else {
                    K2 = c42Var.K(x4.f);
                }
                or1Var.a.setValue(new rc1(sn0.u(gm0Var, c42Var.getLayoutDirection()), K, sn0.t(gm0Var, c42Var.getLayoutDirection()), K2));
                final ig1 x5 = ((e01) wn.g0(c42Var.t(se0Var2, pr1.f))).x(a);
                final u80 u80Var2 = u80Var;
                final int i12 = i9;
                return c42Var.s0(h, g, m60.e, new oe0() { // from class: mr1
                    @Override // defpackage.oe0
                    public final Object invoke(Object obj9) {
                        hg1 hg1Var = (hg1) obj9;
                        hg1.i(hg1Var, ig1.this, 0, 0);
                        hg1.i(hg1Var, x, 0, 0);
                        ig1 ig1Var = x2;
                        int i13 = h - ig1Var.e;
                        c42 c42Var2 = c42Var;
                        jq0 layoutDirection = c42Var2.getLayoutDirection();
                        th2 th2Var2 = th2Var;
                        int d2 = ((th2Var2.d(c42Var2, layoutDirection) + i13) - th2Var2.b(c42Var2, c42Var2.getLayoutDirection())) / 2;
                        int i14 = g;
                        hg1.i(hg1Var, ig1Var, d2, i14 - i12);
                        ig1 ig1Var2 = x4;
                        hg1.i(hg1Var, ig1Var2, 0, i14 - ig1Var2.f);
                        u80 u80Var3 = u80Var2;
                        if (u80Var3 != null) {
                            int i15 = u80Var3.e;
                            Integer num3 = num;
                            num3.getClass();
                            hg1.i(hg1Var, x3, i15, i14 - num3.intValue());
                        }
                        return od2.a;
                    }
                });
        }
    }

    public /* synthetic */ ay0(th2 th2Var, se0 se0Var, se0 se0Var2, se0 se0Var3, int i, se0 se0Var4, or1 or1Var, se0 se0Var5) {
        this.g = th2Var;
        this.h = se0Var;
        this.i = se0Var2;
        this.j = se0Var3;
        this.f = i;
        this.k = se0Var4;
        this.l = or1Var;
        this.m = se0Var5;
    }
}
