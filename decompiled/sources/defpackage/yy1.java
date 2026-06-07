package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class yy1 implements j01 {
    public final /* synthetic */ dz1 a;

    public yy1(dz1 dz1Var) {
        this.a = dz1Var;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, ul1] */
    @Override // defpackage.j01
    public final k01 b(l01 l01Var, List list, long j) {
        ig1 x;
        int i;
        int max;
        int i2;
        int i3;
        int R;
        dz1 dz1Var = this.a;
        float[] fArr = dz1Var.e;
        sb1 sb1Var = dz1Var.k;
        int size = list.size();
        int i4 = 0;
        while (true) {
            Float f = null;
            if (i4 < size) {
                e01 e01Var = (e01) list.get(i4);
                if (sn0.E(e01Var) == ny1.e) {
                    final ig1 x2 = e01Var.x(j);
                    int size2 = list.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        e01 e01Var2 = (e01) list.get(i5);
                        if (sn0.E(e01Var2) == ny1.f) {
                            sb1 sb1Var2 = sb1.e;
                            if (sb1Var == sb1Var2) {
                                x = e01Var2.x(us.a(vs.j(0, -x2.f, 1, j), 0, 0, 0, 0, 14));
                            } else {
                                x = e01Var2.x(us.a(vs.j(-x2.e, 0, 2, j), 0, 0, 0, 0, 11));
                            }
                            final ig1 ig1Var = x;
                            final ?? obj = new Object();
                            float b = dz1Var.b();
                            fArr.getClass();
                            if (fArr.length != 0) {
                                f = Float.valueOf(fArr[0]);
                            }
                            if (!sn0.q(b, f)) {
                                sn0.q(b, bf.Y(fArr));
                            }
                            ig1Var.a0(bz1.f);
                            if (sb1Var == sb1Var2) {
                                i = Math.max(ig1Var.e, x2.e);
                                int i6 = x2.f;
                                int i7 = ig1Var.f;
                                max = i6 + i7;
                                i2 = (i - ig1Var.e) / 2;
                                i3 = i6 / 2;
                                R = (i - x2.e) / 2;
                                obj.e = c01.R(i7 * b);
                            } else {
                                i = x2.e + ig1Var.e;
                                max = Math.max(ig1Var.f, x2.f);
                                i2 = x2.e / 2;
                                i3 = (max - ig1Var.f) / 2;
                                R = c01.R(ig1Var.e * b);
                                obj.e = (max - x2.f) / 2;
                            }
                            final int i8 = i3;
                            final int i9 = i2;
                            final int i10 = R;
                            dz1Var.f.h(i);
                            dz1Var.g.h(max);
                            return l01Var.s0(i, max, m60.e, new oe0() { // from class: xy1
                                @Override // defpackage.oe0
                                public final Object invoke(Object obj2) {
                                    hg1 hg1Var = (hg1) obj2;
                                    hg1.k(hg1Var, ig1.this, i9, i8);
                                    hg1.k(hg1Var, x2, i10, obj.e);
                                    return od2.a;
                                }
                            });
                        }
                    }
                    iw0.b("Collection contains no element matching the predicate.");
                    se.c();
                    return null;
                }
                i4++;
            } else {
                iw0.b("Collection contains no element matching the predicate.");
                se.c();
                return null;
            }
        }
    }
}
