package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ib1 extends nb1 {
    public static final ib1 c = new nb1(1, 0, 2);

    @Override // defpackage.nb1
    public final void a(gf0 gf0Var, ge geVar, jz1 jz1Var, fm1 fm1Var, ob1 ob1Var) {
        int c2 = gf0Var.c(0);
        int i = jz1Var.v;
        int N = jz1Var.N(jz1Var.b, jz1Var.r(i));
        int g = jz1Var.g(jz1Var.b, jz1Var.r(i + 1));
        for (int max = Math.max(N, g - c2); max < g; max++) {
            Object obj = jz1Var.c[jz1Var.h(max)];
            if (obj instanceof hm1) {
                fm1Var.e((hm1) obj);
            } else if (obj instanceof dl1) {
                ((dl1) obj).c();
            }
        }
        if (c2 <= 0) {
            vr.a("Check failed");
        }
        int i2 = jz1Var.v;
        int N2 = jz1Var.N(jz1Var.b, jz1Var.r(i2));
        int g2 = jz1Var.g(jz1Var.b, jz1Var.r(i2 + 1)) - c2;
        if (g2 < N2) {
            vr.a("Check failed");
        }
        jz1Var.J(g2, c2, i2);
        int i3 = jz1Var.i;
        if (i3 >= N2) {
            jz1Var.i = i3 - c2;
        }
    }
}
