package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class dz1 {
    public final rn a;
    public final fe1 b;
    public oe0 c;
    public boolean h;
    public final fe1 n;
    public final fe1 o;
    public final cz1 p;
    public final y41 q;
    public final boolean d = true;
    public final float[] e = new float[0];
    public final ge1 f = new ge1(0);
    public final ge1 g = new ge1(0);
    public final ge1 i = new ge1(0);
    public final ge1 j = new ge1(0);
    public final sb1 k = sb1.f;
    public final je1 l = fr1.k(Boolean.FALSE);
    public final vm1 m = new vm1(this, 11);

    public dz1(float f, rn rnVar) {
        float f2;
        this.a = rnVar;
        this.b = new fe1(f);
        float f3 = rnVar.a;
        float f4 = rnVar.b - f3;
        if (f4 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (f - f3) / f4;
        }
        this.n = new fe1(lo.Q(0.0f, 0.0f, go.o(f2, 0.0f, 1.0f)));
        this.o = new fe1(0.0f);
        this.p = new cz1(this);
        this.q = new y41();
    }

    public final void a(float f) {
        float max;
        float min;
        float f2;
        if (this.k == sb1.e) {
            float g = this.g.g();
            ge1 ge1Var = this.j;
            max = Math.max(g - (ge1Var.g() / 2.0f), 0.0f);
            min = Math.min(ge1Var.g() / 2.0f, max);
        } else {
            float g2 = this.f.g();
            ge1 ge1Var2 = this.i;
            max = Math.max(g2 - (ge1Var2.g() / 2.0f), 0.0f);
            min = Math.min(ge1Var2.g() / 2.0f, max);
        }
        fe1 fe1Var = this.n;
        float g3 = fe1Var.g() + f;
        fe1 fe1Var2 = this.o;
        fe1Var.h(fe1Var2.g() + g3);
        fe1Var2.h(0.0f);
        float f3 = bz1.f(fe1Var.g(), this.e, min, max);
        rn rnVar = this.a;
        float f4 = rnVar.a;
        float f5 = rnVar.b;
        float f6 = max - min;
        if (f6 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (f3 - min) / f6;
        }
        float Q = lo.Q(f4, f5, go.o(f2, 0.0f, 1.0f));
        if (Q == this.b.g()) {
            return;
        }
        oe0 oe0Var = this.c;
        if (oe0Var != null) {
            oe0Var.invoke(Float.valueOf(Q));
        } else {
            c(Q);
        }
    }

    public final float b() {
        float f;
        rn rnVar = this.a;
        float f2 = rnVar.a;
        float f3 = rnVar.b;
        float o = go.o(this.b.g(), rnVar.a, f3);
        float f4 = f3 - f2;
        if (f4 == 0.0f) {
            f = 0.0f;
        } else {
            f = (o - f2) / f4;
        }
        return go.o(f, 0.0f, 1.0f);
    }

    public final void c(float f) {
        if (this.d) {
            rn rnVar = this.a;
            float f2 = rnVar.a;
            float f3 = rnVar.b;
            f = bz1.f(go.o(f, f2, f3), this.e, rnVar.a, f3);
        }
        this.b.h(f);
    }
}
