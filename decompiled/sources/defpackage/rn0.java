package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class rn0 extends d21 implements rq0 {
    public on0 s;
    public boolean t;

    @Override // defpackage.rq0
    public final int Q(ty0 ty0Var, e01 e01Var, int i) {
        return e01Var.c(i);
    }

    @Override // defpackage.rq0
    public final int a0(ty0 ty0Var, e01 e01Var, int i) {
        return e01Var.Y(i);
    }

    @Override // defpackage.rq0
    public final k01 b(l01 l01Var, e01 e01Var, long j) {
        int s;
        if (this.s == on0.e) {
            s = e01Var.n(us.g(j));
        } else {
            s = e01Var.s(us.g(j));
        }
        if (s < 0) {
            s = 0;
        }
        if (s < 0) {
            ml0.a("width must be >= 0");
        }
        long h = vs.h(s, s, 0, Integer.MAX_VALUE);
        if (this.t) {
            h = vs.e(j, h);
        }
        ig1 x = e01Var.x(h);
        return l01Var.s0(x.e, x.f, m60.e, new df(x, 3));
    }

    @Override // defpackage.rq0
    public final int e(ty0 ty0Var, e01 e01Var, int i) {
        if (this.s == on0.e) {
            return e01Var.n(i);
        }
        return e01Var.s(i);
    }

    @Override // defpackage.rq0
    public final int k0(ty0 ty0Var, e01 e01Var, int i) {
        if (this.s == on0.e) {
            return e01Var.n(i);
        }
        return e01Var.s(i);
    }
}
