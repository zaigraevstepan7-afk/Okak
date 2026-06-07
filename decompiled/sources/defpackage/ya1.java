package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ya1 extends nb1 {
    public static final ya1 c = new nb1(1, 0, 2);

    @Override // defpackage.nb1
    public final void a(gf0 gf0Var, ge geVar, jz1 jz1Var, fm1 fm1Var, ob1 ob1Var) {
        int[] iArr;
        p3 p3Var;
        int c2;
        int i;
        int c3 = gf0Var.c(0);
        if (jz1Var.n != 0) {
            vr.a("Cannot move a group while inserting");
        }
        if (c3 < 0) {
            vr.a("Parameter offset is out of bounds");
        }
        if (c3 != 0) {
            int i2 = jz1Var.t;
            int i3 = jz1Var.v;
            int i4 = jz1Var.u;
            int i5 = i2;
            while (true) {
                iArr = jz1Var.b;
                if (c3 <= 0) {
                    break;
                }
                i5 += iArr[(jz1Var.r(i5) * 5) + 3];
                if (i5 > i4) {
                    vr.a("Parameter offset is out of bounds");
                }
                c3--;
            }
            int i6 = iArr[(jz1Var.r(i5) * 5) + 3];
            int g = jz1Var.g(jz1Var.b, jz1Var.r(jz1Var.t));
            int g2 = jz1Var.g(jz1Var.b, jz1Var.r(i5));
            int i7 = i5 + i6;
            int g3 = jz1Var.g(jz1Var.b, jz1Var.r(i7));
            int i8 = g3 - g2;
            jz1Var.x(i8, Math.max(jz1Var.t - 1, 0));
            jz1Var.w(i6);
            int[] iArr2 = jz1Var.b;
            int r = jz1Var.r(i7) * 5;
            bf.B(iArr2, iArr2, jz1Var.r(i2) * 5, r, (i6 * 5) + r);
            if (i8 > 0) {
                Object[] objArr = jz1Var.c;
                int h = jz1Var.h(g2 + i8);
                System.arraycopy(objArr, h, objArr, g, jz1Var.h(g3 + i8) - h);
            }
            int i9 = g2 + i8;
            int i10 = i9 - g;
            int i11 = jz1Var.k;
            int i12 = jz1Var.l;
            int length = jz1Var.c.length;
            int i13 = jz1Var.m;
            int i14 = i2 + i6;
            int i15 = i2;
            while (i15 < i14) {
                int r2 = jz1Var.r(i15);
                int i16 = i10;
                int g4 = jz1Var.g(iArr2, r2) - i16;
                if (i13 < r2) {
                    i = 0;
                } else {
                    i = i11;
                }
                int[] iArr3 = iArr2;
                iArr3[(r2 * 5) + 4] = jz1.i(jz1.i(g4, i, i12, length), jz1Var.k, jz1Var.l, jz1Var.c.length);
                i15++;
                i10 = i16;
                iArr2 = iArr3;
                i11 = i11;
            }
            int i17 = i7 + i6;
            int p = jz1Var.p();
            int a = iz1.a(jz1Var.d, i7, p);
            ArrayList arrayList = new ArrayList();
            if (a >= 0) {
                while (a < jz1Var.d.size() && (c2 = jz1Var.c((p3Var = (p3) jz1Var.d.get(a)))) >= i7 && c2 < i17) {
                    arrayList.add(p3Var);
                }
            }
            int i18 = i2 - i7;
            int size = arrayList.size();
            for (int i19 = 0; i19 < size; i19++) {
                p3 p3Var2 = (p3) arrayList.get(i19);
                int c4 = jz1Var.c(p3Var2) + i18;
                if (c4 >= jz1Var.g) {
                    p3Var2.a = -(p - c4);
                } else {
                    p3Var2.a = c4;
                }
                jz1Var.d.add(iz1.a(jz1Var.d, c4, p), p3Var2);
            }
            if (jz1Var.I(i7, i6)) {
                vr.a("Unexpectedly removed anchors");
            }
            jz1Var.m(i3, jz1Var.u, i2);
            if (i8 > 0) {
                jz1Var.J(i9, i8, i7 - 1);
            }
        }
    }
}
