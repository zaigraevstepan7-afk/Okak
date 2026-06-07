package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class na1 extends nb1 {
    public static final na1 c = new nb1(0, 2, 1);

    @Override // defpackage.nb1
    public final void a(gf0 gf0Var, ge geVar, jz1 jz1Var, fm1 fm1Var, ob1 ob1Var) {
        int i;
        int i2;
        cn0 cn0Var = (cn0) gf0Var.d(0);
        int c2 = jz1Var.c((p3) gf0Var.d(1));
        if (jz1Var.t >= c2) {
            vr.a("Check failed");
        }
        hp.H(jz1Var, geVar, c2);
        int i3 = jz1Var.t;
        int i4 = jz1Var.v;
        while (i4 >= 0 && !jz1Var.y(i4)) {
            i4 = jz1Var.E(jz1Var.b, i4);
        }
        int i5 = i4 + 1;
        int i6 = 0;
        while (i5 < i3) {
            if (jz1Var.v(i3, i5)) {
                if (jz1Var.y(i5)) {
                    i6 = 0;
                }
                i5++;
            } else {
                if (jz1Var.y(i5)) {
                    i2 = 1;
                } else {
                    i2 = jz1Var.b[(jz1Var.r(i5) * 5) + 1] & 67108863;
                }
                i6 += i2;
                i5 += jz1Var.u(i5);
            }
        }
        while (true) {
            i = jz1Var.t;
            if (i >= c2) {
                break;
            }
            if (jz1Var.v(c2, i)) {
                int i7 = jz1Var.t;
                if (i7 < jz1Var.u && (jz1Var.b[(jz1Var.r(i7) * 5) + 1] & 1073741824) != 0) {
                    geVar.d(jz1Var.D(jz1Var.t));
                    i6 = 0;
                }
                jz1Var.P();
            } else {
                i6 += jz1Var.L();
            }
        }
        if (i != c2) {
            vr.a("Check failed");
        }
        cn0Var.a = i6;
    }
}
