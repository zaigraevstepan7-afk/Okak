package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class oj2 extends d21 implements rq0 {
    public e10 s;
    public se0 t;

    @Override // defpackage.rq0
    public final k01 b(final l01 l01Var, e01 e01Var, long j) {
        int j2;
        int i = 0;
        if (this.s != e10.e) {
            j2 = 0;
        } else {
            j2 = us.j(j);
        }
        if (this.s == e10.f) {
            i = us.i(j);
        }
        final ig1 x = e01Var.x(vs.a(j2, us.h(j), i, us.g(j)));
        final int p = go.p(x.e, us.j(j), us.h(j));
        final int p2 = go.p(x.f, us.i(j), us.g(j));
        return l01Var.s0(p, p2, m60.e, new oe0() { // from class: nj2
            @Override // defpackage.oe0
            public final Object invoke(Object obj) {
                se0 se0Var = oj2.this.t;
                hg1.j((hg1) obj, x, ((xm0) se0Var.invoke(new en0(((p - r1.e) << 32) | ((p2 - r1.f) & 4294967295L)), l01Var.getLayoutDirection())).a);
                return od2.a;
            }
        });
    }
}
