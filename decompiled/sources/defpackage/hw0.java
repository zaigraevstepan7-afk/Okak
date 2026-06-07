package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hw0 implements e31 {
    public static int f(mn0 mn0Var, ArrayList arrayList, int i, se0 se0Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        boolean z2;
        boolean z3;
        int i7;
        float f;
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        float f2 = cw0.a;
        int T = xn.T(i, mn0Var.j0(32.0f));
        e01 e01Var = (e01) wn.h0(list4);
        if (e01Var != null) {
            i2 = ((Number) se0Var.invoke(e01Var, Integer.valueOf(T))).intValue();
            T = xn.T(T, e01Var.s(Integer.MAX_VALUE));
        } else {
            i2 = 0;
        }
        e01 e01Var2 = (e01) wn.h0(list5);
        if (e01Var2 != null) {
            i3 = ((Number) se0Var.invoke(e01Var2, Integer.valueOf(T))).intValue();
            T = xn.T(T, e01Var2.s(Integer.MAX_VALUE));
        } else {
            i3 = 0;
        }
        Object obj = (e01) wn.h0(list2);
        if (obj != null) {
            i4 = ((Number) se0Var.invoke(obj, Integer.valueOf(T))).intValue();
        } else {
            i4 = 0;
        }
        Object obj2 = (e01) wn.h0(list);
        if (obj2 != null) {
            i5 = ((Number) se0Var.invoke(obj2, Integer.valueOf(T))).intValue();
        } else {
            i5 = 0;
        }
        Object obj3 = (e01) wn.h0(list3);
        if (obj3 != null) {
            i6 = ((Number) se0Var.invoke(obj3, Integer.valueOf(T))).intValue();
        } else {
            i6 = 0;
        }
        if (i6 > mn0Var.d0(pp1.s(30))) {
            z = true;
        } else {
            z = false;
        }
        if (i4 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i6 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((z2 && z3) || z) {
            i7 = 3;
        } else if (!z2 && !z3) {
            i7 = 1;
        } else {
            i7 = 2;
        }
        if (i7 == 3) {
            f = 12.0f;
        } else {
            f = 8.0f;
        }
        return cw0.d(mn0Var, i2, i3, i5, i4, i6, i7, mn0Var.j0(f * 2.0f), vs.b(0, 0, 15));
    }

    public static int g(mn0 mn0Var, ArrayList arrayList, int i, se0 se0Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        e01 e01Var = (e01) wn.h0(list4);
        if (e01Var != null) {
            i2 = ((Number) se0Var.invoke(e01Var, Integer.valueOf(i))).intValue();
        } else {
            i2 = 0;
        }
        e01 e01Var2 = (e01) wn.h0(list5);
        if (e01Var2 != null) {
            i3 = ((Number) se0Var.invoke(e01Var2, Integer.valueOf(i))).intValue();
        } else {
            i3 = 0;
        }
        e01 e01Var3 = (e01) wn.h0(list);
        if (e01Var3 != null) {
            i4 = ((Number) se0Var.invoke(e01Var3, Integer.valueOf(i))).intValue();
        } else {
            i4 = 0;
        }
        e01 e01Var4 = (e01) wn.h0(list2);
        if (e01Var4 != null) {
            i5 = ((Number) se0Var.invoke(e01Var4, Integer.valueOf(i))).intValue();
        } else {
            i5 = 0;
        }
        e01 e01Var5 = (e01) wn.h0(list3);
        if (e01Var5 != null) {
            i6 = ((Number) se0Var.invoke(e01Var5, Integer.valueOf(i))).intValue();
        } else {
            i6 = 0;
        }
        float f = cw0.a;
        int j0 = mn0Var.j0(32.0f);
        long b = vs.b(0, 0, 15);
        if (us.d(b)) {
            return us.h(b);
        }
        return j0 + i2 + Math.max(i4, Math.max(i5, i6)) + i3;
    }

    @Override // defpackage.e31
    public final int a(mn0 mn0Var, List list, int i) {
        return g(mn0Var, (ArrayList) list, i, ew0.e);
    }

    @Override // defpackage.e31
    public final k01 b(l01 l01Var, List list, long j) {
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        ig1 ig1Var;
        int i4;
        float f2;
        ig1 ig1Var2;
        int i5;
        ig1 ig1Var3;
        int i6;
        ig1 ig1Var4;
        int i7;
        boolean z4;
        ig1 ig1Var5;
        boolean z5;
        boolean z6;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int max;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        final boolean z7;
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        List list5 = (List) arrayList.get(3);
        List list6 = (List) arrayList.get(4);
        long a = us.a(j, 0, 0, 0, 0, 10);
        float f3 = cw0.a;
        int j0 = l01Var.j0(32.0f);
        e01 e01Var = (e01) wn.h0(list5);
        if (e01Var != null) {
            i = e01Var.n(us.g(j));
        } else {
            i = 0;
        }
        e01 e01Var2 = (e01) wn.h0(list6);
        if (e01Var2 != null) {
            i2 = e01Var2.n(us.g(j));
        } else {
            i2 = 0;
        }
        int T = xn.T(us.h(a), i + i2 + j0);
        e01 e01Var3 = (e01) wn.h0(list4);
        if (e01Var3 != null) {
            i3 = e01Var3.Y(T);
        } else {
            i3 = 0;
        }
        if (i3 > l01Var.d0(pp1.s(30))) {
            z = true;
        } else {
            z = false;
        }
        if (wn.h0(list3) != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (wn.h0(list4) != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        float f4 = 8.0f;
        if ((z2 && z3) || z) {
            f = 12.0f;
        } else {
            f = 8.0f;
        }
        long i19 = vs.i(a, -j0, -l01Var.j0(f * 2.0f));
        e01 e01Var4 = (e01) wn.h0(list5);
        if (e01Var4 != null) {
            ig1Var = e01Var4.x(i19);
        } else {
            ig1Var = null;
        }
        if (ig1Var != null) {
            i4 = ig1Var.e;
        } else {
            i4 = 0;
        }
        e01 e01Var5 = (e01) wn.h0(list6);
        if (e01Var5 != null) {
            f2 = 2.0f;
            ig1Var2 = e01Var5.x(vs.j(-i4, 0, 2, i19));
        } else {
            f2 = 2.0f;
            ig1Var2 = null;
        }
        if (ig1Var2 != null) {
            i5 = ig1Var2.e;
        } else {
            i5 = 0;
        }
        int i20 = i4 + i5;
        e01 e01Var6 = (e01) wn.h0(list2);
        if (e01Var6 != null) {
            ig1Var3 = e01Var6.x(vs.j(-i20, 0, 2, i19));
        } else {
            ig1Var3 = null;
        }
        if (ig1Var3 != null) {
            i6 = ig1Var3.f;
        } else {
            i6 = 0;
        }
        e01 e01Var7 = (e01) wn.h0(list4);
        if (e01Var7 != null) {
            ig1Var4 = e01Var7.x(vs.i(i19, -i20, -i6));
        } else {
            ig1Var4 = null;
        }
        if (ig1Var4 != null) {
            i7 = ig1Var4.f;
        } else {
            i7 = 0;
        }
        int i21 = i6 + i7;
        if (ig1Var4 != null && ig1Var4.a0(m3.a) != ig1Var4.a0(m3.b)) {
            z4 = true;
        } else {
            z4 = false;
        }
        e01 e01Var8 = (e01) wn.h0(list3);
        if (e01Var8 != null) {
            ig1Var5 = e01Var8.x(vs.i(i19, -i20, -i21));
        } else {
            ig1Var5 = null;
        }
        if (ig1Var5 != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (ig1Var4 != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if ((z5 && z6) || z4) {
            i8 = 3;
        } else if (!z5 && !z6) {
            i8 = 1;
        } else {
            i8 = 2;
        }
        if (i8 == 3) {
            f4 = 12.0f;
        }
        float f5 = f4 * f2;
        if (ig1Var != null) {
            i9 = ig1Var.e;
        } else {
            i9 = 0;
        }
        if (ig1Var2 != null) {
            i10 = ig1Var2.e;
        } else {
            i10 = 0;
        }
        if (ig1Var3 != null) {
            i11 = ig1Var3.e;
        } else {
            i11 = 0;
        }
        if (ig1Var5 != null) {
            i12 = ig1Var5.e;
        } else {
            i12 = 0;
        }
        if (ig1Var4 != null) {
            i13 = ig1Var4.e;
        } else {
            i13 = 0;
        }
        if (us.d(j)) {
            max = us.h(j);
        } else {
            max = j0 + i9 + Math.max(i11, Math.max(i12, i13)) + i10;
        }
        final int i22 = max;
        if (ig1Var != null) {
            i14 = ig1Var.f;
        } else {
            i14 = 0;
        }
        if (ig1Var2 != null) {
            i15 = ig1Var2.f;
        } else {
            i15 = 0;
        }
        if (ig1Var3 != null) {
            i16 = ig1Var3.f;
        } else {
            i16 = 0;
        }
        if (ig1Var5 != null) {
            i17 = ig1Var5.f;
        } else {
            i17 = 0;
        }
        if (ig1Var4 != null) {
            i18 = ig1Var4.f;
        } else {
            i18 = 0;
        }
        final ig1 ig1Var6 = ig1Var5;
        int i23 = i14;
        float f6 = f4;
        final int d = cw0.d(l01Var, i23, i15, i16, i17, i18, i8, l01Var.j0(f5), j);
        if (i8 == 3) {
            z7 = true;
        } else {
            z7 = false;
        }
        final int j02 = l01Var.j0(16.0f);
        final int j03 = l01Var.j0(16.0f);
        final int j04 = l01Var.j0(f6);
        final ig1 ig1Var7 = ig1Var2;
        final ig1 ig1Var8 = ig1Var3;
        final ig1 ig1Var9 = ig1Var4;
        final ig1 ig1Var10 = ig1Var;
        return l01Var.s0(i22, d, m60.e, new oe0() { // from class: bw0
            @Override // defpackage.oe0
            public final Object invoke(Object obj) {
                int i24;
                int i25;
                int i26;
                int i27;
                int round;
                int i28;
                int round2;
                hg1 hg1Var = (hg1) obj;
                ig1 ig1Var11 = ig1.this;
                int i29 = j02;
                boolean z8 = z7;
                int i30 = j04;
                int i31 = d;
                if (ig1Var11 != null) {
                    if (z8) {
                        round2 = i30;
                    } else {
                        round2 = Math.round(((i31 - ig1Var11.f) / 2.0f) * 1.0f);
                    }
                    hg1.k(hg1Var, ig1Var11, i29, round2);
                }
                int i32 = 0;
                if (ig1Var11 != null) {
                    i24 = ig1Var11.e;
                } else {
                    i24 = 0;
                }
                int i33 = i29 + i24;
                ig1 ig1Var12 = ig1Var8;
                ig1 ig1Var13 = ig1Var6;
                ig1 ig1Var14 = ig1Var9;
                if (z8) {
                    round = i30;
                } else {
                    if (ig1Var12 != null) {
                        i25 = ig1Var12.f;
                    } else {
                        i25 = 0;
                    }
                    if (ig1Var13 != null) {
                        i26 = ig1Var13.f;
                    } else {
                        i26 = 0;
                    }
                    int i34 = i25 + i26;
                    if (ig1Var14 != null) {
                        i27 = ig1Var14.f;
                    } else {
                        i27 = 0;
                    }
                    round = Math.round(((i31 - (i34 + i27)) / 2.0f) * 1.0f);
                }
                if (ig1Var13 != null) {
                    hg1.k(hg1Var, ig1Var13, i33, round);
                }
                if (ig1Var13 != null) {
                    i28 = ig1Var13.f;
                } else {
                    i28 = 0;
                }
                int i35 = round + i28;
                if (ig1Var12 != null) {
                    hg1.k(hg1Var, ig1Var12, i33, i35);
                }
                if (ig1Var12 != null) {
                    i32 = ig1Var12.f;
                }
                int i36 = i35 + i32;
                if (ig1Var14 != null) {
                    hg1.k(hg1Var, ig1Var14, i33, i36);
                }
                ig1 ig1Var15 = ig1Var7;
                if (ig1Var15 != null) {
                    int i37 = (i22 - j03) - ig1Var15.e;
                    if (!z8) {
                        i30 = Math.round(((i31 - ig1Var15.f) / 2.0f) * 1.0f);
                    }
                    hg1.k(hg1Var, ig1Var15, i37, i30);
                }
                return od2.a;
            }
        });
    }

    @Override // defpackage.e31
    public final int c(mn0 mn0Var, List list, int i) {
        return g(mn0Var, (ArrayList) list, i, gw0.e);
    }

    @Override // defpackage.e31
    public final int d(mn0 mn0Var, List list, int i) {
        return f(mn0Var, (ArrayList) list, i, dw0.e);
    }

    @Override // defpackage.e31
    public final int e(mn0 mn0Var, List list, int i) {
        return f(mn0Var, (ArrayList) list, i, fw0.e);
    }
}
