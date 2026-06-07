package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class q90 extends d21 implements rq0 {
    public e10 s;
    public float t;

    @Override // defpackage.rq0
    public final k01 b(l01 l01Var, e01 e01Var, long j) {
        int j2;
        int h;
        int i;
        int i2;
        if (us.d(j) && this.s != e10.e) {
            int round = Math.round(us.h(j) * this.t);
            int j3 = us.j(j);
            j2 = us.h(j);
            if (round < j3) {
                round = j3;
            }
            if (round <= j2) {
                j2 = round;
            }
            h = j2;
        } else {
            j2 = us.j(j);
            h = us.h(j);
        }
        if (us.c(j) && this.s != e10.f) {
            int round2 = Math.round(us.g(j) * this.t);
            int i3 = us.i(j);
            i = us.g(j);
            if (round2 < i3) {
                round2 = i3;
            }
            if (round2 <= i) {
                i = round2;
            }
            i2 = i;
        } else {
            int i4 = us.i(j);
            int g = us.g(j);
            i = i4;
            i2 = g;
        }
        ig1 x = e01Var.x(vs.a(j2, h, i, i2));
        return l01Var.s0(x.e, x.f, m60.e, new df(x, 2));
    }
}
