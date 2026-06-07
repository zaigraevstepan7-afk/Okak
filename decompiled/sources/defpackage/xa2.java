package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class xa2 implements j01 {
    public final ia0 a;
    public final float b;
    public final pc1 c;

    public xa2(ia0 ia0Var, float f, pc1 pc1Var) {
        this.a = ia0Var;
        this.b = f;
        this.c = pc1Var;
    }

    @Override // defpackage.j01
    public final int a(mn0 mn0Var, List list, int i) {
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((e01) list.get(i3)).s(i);
        }
        return i2;
    }

    @Override // defpackage.j01
    public final k01 b(final l01 l01Var, List list, final long j) {
        int i;
        final int i2;
        int R;
        int i3;
        final xa2 xa2Var = this;
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            e01 e01Var = (e01) list.get(i5);
            if (sn0.r(sn0.E(e01Var), "navigationIcon")) {
                final ig1 x = e01Var.x(us.a(j, 0, 0, 0, 0, 14));
                int size2 = list.size();
                int i6 = 0;
                while (i6 < size2) {
                    e01 e01Var2 = (e01) list.get(i6);
                    if (sn0.r(sn0.E(e01Var2), "actionIcons")) {
                        final ig1 x2 = e01Var2.x(us.a(j, 0, 0, 0, 0, 14));
                        jq0 layoutDirection = l01Var.getLayoutDirection();
                        pc1 pc1Var = xa2Var.c;
                        float u = sn0.u(pc1Var, layoutDirection);
                        float t = sn0.t(pc1Var, l01Var.getLayoutDirection());
                        if (us.h(j) == Integer.MAX_VALUE) {
                            i = us.h(j);
                        } else {
                            int h = (((us.h(j) - x.e) - x2.e) - l01Var.j0(u)) - l01Var.j0(t);
                            if (h < 0) {
                                i = 0;
                            } else {
                                i = h;
                            }
                        }
                        int i7 = i;
                        int size3 = list.size();
                        int i8 = 0;
                        while (i8 < size3) {
                            e01 e01Var3 = (e01) list.get(i8);
                            if (sn0.r(sn0.E(e01Var3), "title")) {
                                final ig1 x3 = e01Var3.x(us.a(j, 0, i7, 0, 0, 12));
                                ei0 ei0Var = m3.b;
                                if (x3.a0(ei0Var) != Integer.MIN_VALUE) {
                                    i2 = x3.a0(ei0Var);
                                } else {
                                    i2 = 0;
                                }
                                float invoke = xa2Var.a.invoke();
                                if (Float.isNaN(invoke)) {
                                    R = 0;
                                } else {
                                    R = c01.R(invoke);
                                }
                                final int max = Math.max(l01Var.j0(xa2Var.b), x3.f) + l01Var.j0(pc1Var.d()) + l01Var.j0(pc1Var.a());
                                if (us.g(j) == Integer.MAX_VALUE) {
                                    i3 = max;
                                } else {
                                    int i9 = R + max;
                                    if (i9 >= 0) {
                                        i4 = i9;
                                    }
                                    i3 = i4;
                                }
                                int j0 = l01Var.j0(pc1Var.d());
                                int j02 = l01Var.j0(pc1Var.a());
                                final int j03 = l01Var.j0(sn0.u(pc1Var, l01Var.getLayoutDirection()));
                                final int j04 = l01Var.j0(sn0.t(pc1Var, l01Var.getLayoutDirection()));
                                final int i10 = (j0 + i3) - j02;
                                return l01Var.s0(us.h(j), i3, m60.e, new oe0(j03, i10, x3, x2, j, j04, l01Var, xa2Var, i2, max) { // from class: wa2
                                    public final /* synthetic */ int f;
                                    public final /* synthetic */ int g;
                                    public final /* synthetic */ ig1 h;
                                    public final /* synthetic */ ig1 i;
                                    public final /* synthetic */ long j;
                                    public final /* synthetic */ int k;
                                    public final /* synthetic */ l01 l;

                                    @Override // defpackage.oe0
                                    public final Object invoke(Object obj) {
                                        int h2;
                                        hg1 hg1Var = (hg1) obj;
                                        ig1 ig1Var = ig1.this;
                                        int i11 = ig1Var.f;
                                        int i12 = this.g;
                                        int i13 = this.f;
                                        hg1.k(hg1Var, ig1Var, i13, (i12 - i11) / 2);
                                        int max2 = Math.max(this.l.j0(hd.c), ig1Var.e);
                                        ig1 ig1Var2 = this.i;
                                        int i14 = ig1Var2.e;
                                        ig1 ig1Var3 = this.h;
                                        int i15 = ig1Var3.e;
                                        long j2 = this.j;
                                        int round = Math.round((1.0f + 0.0f) * ((us.h(j2) - i15) / 2.0f));
                                        if (round < max2) {
                                            h2 = max2 - round;
                                        } else {
                                            if (ig1Var3.e + round > us.h(j2) - i14) {
                                                h2 = (us.h(j2) - i14) - (ig1Var3.e + round);
                                            }
                                            hg1.k(hg1Var, ig1Var3, round, (i12 - ig1Var3.f) / 2);
                                            hg1.k(hg1Var, ig1Var2, (us.h(j2) - ig1Var2.e) - this.k, (i12 - ig1Var2.f) / 2);
                                            return od2.a;
                                        }
                                        round += h2 + i13;
                                        hg1.k(hg1Var, ig1Var3, round, (i12 - ig1Var3.f) / 2);
                                        hg1.k(hg1Var, ig1Var2, (us.h(j2) - ig1Var2.e) - this.k, (i12 - ig1Var2.f) / 2);
                                        return od2.a;
                                    }
                                });
                            }
                            i8++;
                            xa2Var = this;
                        }
                        iw0.b("Collection contains no element matching the predicate.");
                        se.c();
                        return null;
                    }
                    i6++;
                    xa2Var = this;
                }
                iw0.b("Collection contains no element matching the predicate.");
                se.c();
                return null;
            }
            i5++;
            xa2Var = this;
        }
        iw0.b("Collection contains no element matching the predicate.");
        se.c();
        return null;
    }

    @Override // defpackage.j01
    public final int c(mn0 mn0Var, List list, int i) {
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((e01) list.get(i3)).n(i);
        }
        return i2;
    }

    @Override // defpackage.j01
    public final int d(mn0 mn0Var, List list, int i) {
        Integer valueOf;
        int j0 = mn0Var.j0(this.b);
        int i2 = 0;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((e01) list.get(0)).c(i));
            int i3 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((e01) list.get(i3)).c(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i3 == size) {
                        break;
                    }
                    i3++;
                }
            }
        }
        if (valueOf != null) {
            i2 = valueOf.intValue();
        }
        return Math.max(j0, i2);
    }

    @Override // defpackage.j01
    public final int e(mn0 mn0Var, List list, int i) {
        Integer valueOf;
        int j0 = mn0Var.j0(this.b);
        int i2 = 0;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((e01) list.get(0)).Y(i));
            int i3 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((e01) list.get(i3)).Y(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i3 == size) {
                        break;
                    }
                    i3++;
                }
            }
        }
        if (valueOf != null) {
            i2 = valueOf.intValue();
        }
        return Math.max(j0, i2);
    }
}
