package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class sc1 extends d21 implements rq0 {
    public pc1 s;

    @Override // defpackage.rq0
    public final k01 b(l01 l01Var, e01 e01Var, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        float b = this.s.b(l01Var.getLayoutDirection());
        float d = this.s.d();
        float c = this.s.c(l01Var.getLayoutDirection());
        float a = this.s.a();
        boolean z4 = false;
        if (f20.a(b, 0.0f) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (f20.a(d, 0.0f) >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z & z2;
        if (f20.a(c, 0.0f) >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 & z3;
        if (f20.a(a, 0.0f) >= 0) {
            z4 = true;
        }
        if (!(z6 & z4)) {
            il0.a("Padding must be non-negative");
        }
        int j0 = l01Var.j0(b);
        int j02 = l01Var.j0(c) + j0;
        int j03 = l01Var.j0(d);
        int j04 = l01Var.j0(a) + j03;
        ig1 x = e01Var.x(vs.i(j, -j02, -j04));
        return l01Var.s0(vs.g(x.e + j02, j), vs.f(x.f + j04, j), m60.e, new em0(x, j0, j03, 2));
    }
}
