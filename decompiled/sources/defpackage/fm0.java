package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class fm0 extends am0 implements rq0 {
    public th2 u;

    public fm0(th2 th2Var) {
        this.u = th2Var;
    }

    @Override // defpackage.am0
    public final th2 L0(th2 th2Var) {
        return new ld2(th2Var, this.u);
    }

    @Override // defpackage.am0
    public final void M0() {
        super.M0();
        hp.A(this);
    }

    @Override // defpackage.rq0
    public final k01 b(l01 l01Var, e01 e01Var, long j) {
        int d = this.t.d(l01Var, l01Var.getLayoutDirection()) - this.s.d(l01Var, l01Var.getLayoutDirection());
        int a = this.t.a(l01Var) - this.s.a(l01Var);
        int b = (this.t.b(l01Var, l01Var.getLayoutDirection()) - this.s.b(l01Var, l01Var.getLayoutDirection())) + d;
        int c = (this.t.c(l01Var) - this.s.c(l01Var)) + a;
        ig1 x = e01Var.x(vs.i(j, -b, -c));
        return l01Var.s0(vs.g(x.e + b, j), vs.f(x.f + c, j), m60.e, new em0(x, d, a, 0));
    }
}
