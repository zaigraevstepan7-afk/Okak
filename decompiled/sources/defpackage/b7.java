package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class b7 implements j01 {
    public static final b7 b = new b7(0);
    public static final b7 c = new b7(1);
    public static final b7 d = new b7(2);
    public static final b7 e = new b7(3);
    public static final p1 f = new p1(29);
    public static final b7 g = new b7(4);
    public static final b7 h = new b7(5);
    public static final b7 i = new b7(6);
    public final /* synthetic */ int a;

    public /* synthetic */ b7(int i2) {
        this.a = i2;
    }

    @Override // defpackage.j01
    public final k01 b(l01 l01Var, List list, long j) {
        int i2;
        int i3;
        Object obj;
        final ig1 ig1Var;
        Object obj2;
        ig1 ig1Var2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        boolean z2;
        int j0;
        int max;
        int i9;
        final int i10;
        int a0;
        int i11 = this.a;
        m60 m60Var = m60.e;
        switch (i11) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < size; i14++) {
                    ig1 x = ((e01) list.get(i14)).x(j);
                    i12 = Math.max(i12, x.e);
                    i13 = Math.max(i13, x.f);
                    arrayList.add(x);
                }
                if (list.isEmpty()) {
                    i12 = us.j(j);
                    i13 = us.i(j);
                }
                return l01Var.s0(i12, i13, m60Var, new a7(arrayList, 0));
            case 1:
                int size2 = list.size();
                if (size2 != 0) {
                    if (size2 != 1) {
                        ArrayList arrayList2 = new ArrayList(list.size());
                        int size3 = list.size();
                        int i15 = 0;
                        int i16 = 0;
                        for (int i17 = 0; i17 < size3; i17++) {
                            ig1 x2 = ((e01) list.get(i17)).x(j);
                            i15 = Math.max(i15, x2.e);
                            i16 = Math.max(i16, x2.f);
                            arrayList2.add(x2);
                        }
                        return l01Var.s0(i15, i16, m60Var, new a7(arrayList2, 1));
                    }
                    ig1 x3 = ((e01) list.get(0)).x(j);
                    return l01Var.s0(x3.e, x3.f, m60Var, new b5(x3, 1));
                }
                return l01Var.s0(0, 0, m60Var, i5.n);
            case 2:
                return l01Var.s0(us.j(j), us.i(j), m60Var, new p1(29));
            case 3:
                return l01Var.s0(us.h(j), us.g(j), m60Var, f);
            case 4:
                return l01Var.s0(us.j(j), us.i(j), m60Var, new p1(29));
            case 5:
                ArrayList arrayList3 = new ArrayList(list.size());
                int size4 = list.size();
                int i18 = 0;
                int i19 = 0;
                for (int i20 = 0; i20 < size4; i20++) {
                    ig1 x4 = ((e01) list.get(i20)).x(j);
                    i18 = Math.max(i18, x4.e);
                    i19 = Math.max(i19, x4.f);
                    arrayList3.add(x4);
                }
                return l01Var.s0(i18, i19, m60Var, new dd1(arrayList3, 1));
            case 6:
                if (us.f(j)) {
                    i2 = us.h(j);
                } else {
                    i2 = 0;
                }
                if (us.e(j)) {
                    i3 = us.g(j);
                } else {
                    i3 = 0;
                }
                return l01Var.s0(i2, i3, m60Var, new p1(29));
            default:
                int min = Math.min(us.h(j), l01Var.j0(600.0f));
                int size5 = list.size();
                int i21 = 0;
                while (true) {
                    if (i21 < size5) {
                        obj = list.get(i21);
                        if (!sn0.r(sn0.E((e01) obj), "action")) {
                            i21++;
                        }
                    } else {
                        obj = null;
                    }
                }
                e01 e01Var = (e01) obj;
                if (e01Var != null) {
                    ig1Var = e01Var.x(j);
                } else {
                    ig1Var = null;
                }
                int size6 = list.size();
                int i22 = 0;
                while (true) {
                    if (i22 < size6) {
                        obj2 = list.get(i22);
                        if (!sn0.r(sn0.E((e01) obj2), "dismissAction")) {
                            i22++;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                e01 e01Var2 = (e01) obj2;
                if (e01Var2 != null) {
                    ig1Var2 = e01Var2.x(j);
                } else {
                    ig1Var2 = null;
                }
                if (ig1Var != null) {
                    i4 = ig1Var.e;
                } else {
                    i4 = 0;
                }
                if (ig1Var != null) {
                    i5 = ig1Var.f;
                } else {
                    i5 = 0;
                }
                if (ig1Var2 != null) {
                    i6 = ig1Var2.e;
                } else {
                    i6 = 0;
                }
                if (ig1Var2 != null) {
                    i7 = ig1Var2.f;
                } else {
                    i7 = 0;
                }
                if (i6 == 0) {
                    i8 = l01Var.j0(8.0f);
                } else {
                    i8 = 0;
                }
                int i23 = ((min - i4) - i6) - i8;
                int j2 = us.j(j);
                if (i23 < j2) {
                    i23 = j2;
                }
                int size7 = list.size();
                int i24 = 0;
                while (i24 < size7) {
                    e01 e01Var3 = (e01) list.get(i24);
                    int i25 = i7;
                    if (sn0.r(sn0.E(e01Var3), "text")) {
                        final ig1 x5 = e01Var3.x(us.a(j, 0, i23, 0, 0, 9));
                        ei0 ei0Var = m3.a;
                        int a02 = x5.a0(ei0Var);
                        int a03 = x5.a0(m3.b);
                        if (a02 != Integer.MIN_VALUE && a03 != Integer.MIN_VALUE) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (a02 != a03 && z) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        final int i26 = min - i6;
                        final int i27 = i26 - i4;
                        if (z2) {
                            max = Math.max(l01Var.j0(mp0.U), Math.max(i5, i25));
                            j0 = (max - x5.f) / 2;
                            if (ig1Var != null && (a0 = ig1Var.a0(ei0Var)) != Integer.MIN_VALUE) {
                                i9 = (a02 + j0) - a0;
                            }
                            i9 = 0;
                        } else {
                            j0 = l01Var.j0(30.0f) - a02;
                            max = Math.max(l01Var.j0(mp0.V), x5.f + j0);
                            if (ig1Var != null) {
                                i9 = (max - ig1Var.f) / 2;
                            }
                            i9 = 0;
                        }
                        final int i28 = i9;
                        final int i29 = j0;
                        if (ig1Var2 != null) {
                            i10 = (max - ig1Var2.f) / 2;
                        } else {
                            i10 = 0;
                        }
                        final ig1 ig1Var3 = ig1Var2;
                        return l01Var.s0(min, max, m60Var, new oe0() { // from class: wz1
                            @Override // defpackage.oe0
                            public final Object invoke(Object obj3) {
                                hg1 hg1Var = (hg1) obj3;
                                hg1.k(hg1Var, ig1.this, 0, i29);
                                ig1 ig1Var4 = ig1Var;
                                if (ig1Var4 != null) {
                                    hg1.k(hg1Var, ig1Var4, i27, i28);
                                }
                                ig1 ig1Var5 = ig1Var3;
                                if (ig1Var5 != null) {
                                    hg1.k(hg1Var, ig1Var5, i26, i10);
                                }
                                return od2.a;
                            }
                        });
                    }
                    i24++;
                    i7 = i25;
                }
                iw0.b("Collection contains no element matching the predicate.");
                se.c();
                return null;
        }
    }
}
