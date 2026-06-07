package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class u72 {
    public static final sl0 g = fp.O(new ir1(26), new nv1(16));
    public final fe1 a;
    public final fe1 b = new fe1(0.0f);
    public final ge1 c = new ge1(0);
    public pl1 d = pl1.e;
    public long e = d92.b;
    public final je1 f;

    public u72(sb1 sb1Var, float f) {
        this.a = new fe1(f);
        this.f = new je1(sb1Var, xl1.o);
    }

    public final void a(sb1 sb1Var, pl1 pl1Var, int i, int i2) {
        boolean z;
        float f;
        float f2;
        float f3 = i2 - i;
        this.b.h(f3);
        float f4 = pl1Var.a;
        float f5 = pl1Var.b;
        pl1 pl1Var2 = this.d;
        float f6 = pl1Var2.a;
        fe1 fe1Var = this.a;
        if (f4 != f6 || f5 != pl1Var2.b) {
            if (sb1Var == sb1.e) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                f4 = f5;
            }
            if (z) {
                f = pl1Var.d;
            } else {
                f = pl1Var.c;
            }
            float g2 = fe1Var.g();
            float f7 = i;
            float f8 = g2 + f7;
            if (f > f8 || (f4 < g2 && f - f4 > f7)) {
                f2 = f - f8;
            } else if (f4 < g2 && f - f4 <= f7) {
                f2 = f4 - g2;
            } else {
                f2 = 0.0f;
            }
            fe1Var.h(fe1Var.g() + f2);
            this.d = pl1Var;
        }
        fe1Var.h(go.o(fe1Var.g(), 0.0f, f3));
        this.c.h(i);
    }
}
