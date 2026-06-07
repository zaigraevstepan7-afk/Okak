package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ia1 extends nb1 {
    public static final ia1 c = new nb1(0, 2, 1);

    @Override // defpackage.nb1
    public final void a(gf0 gf0Var, ge geVar, jz1 jz1Var, fm1 fm1Var, ob1 ob1Var) {
        p3 p3Var = (p3) gf0Var.d(0);
        Object d = gf0Var.d(1);
        if (d instanceof hm1) {
            hm1 hm1Var = (hm1) d;
            fm1Var.e.b(hm1Var);
            fm1Var.d.a(hm1Var);
        }
        if (jz1Var.n != 0) {
            vr.a("Can only append a slot if not current inserting");
        }
        int i = jz1Var.i;
        int i2 = jz1Var.j;
        int c2 = jz1Var.c(p3Var);
        int g = jz1Var.g(jz1Var.b, jz1Var.r(c2 + 1));
        jz1Var.i = g;
        jz1Var.j = g;
        jz1Var.x(1, c2);
        if (i >= g) {
            i++;
            i2++;
        }
        jz1Var.c[g] = d;
        jz1Var.i = i;
        jz1Var.j = i2;
    }
}
