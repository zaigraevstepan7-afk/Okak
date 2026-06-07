package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ud2 extends d21 implements rq0 {
    public float s;
    public float t;

    @Override // defpackage.rq0
    public final int Q(ty0 ty0Var, e01 e01Var, int i) {
        int i2;
        int c = e01Var.c(i);
        if (!Float.isNaN(this.t)) {
            i2 = ty0Var.j0(this.t);
        } else {
            i2 = 0;
        }
        if (c < i2) {
            return i2;
        }
        return c;
    }

    @Override // defpackage.rq0
    public final int a0(ty0 ty0Var, e01 e01Var, int i) {
        int i2;
        int Y = e01Var.Y(i);
        if (!Float.isNaN(this.t)) {
            i2 = ty0Var.j0(this.t);
        } else {
            i2 = 0;
        }
        if (Y < i2) {
            return i2;
        }
        return Y;
    }

    @Override // defpackage.rq0
    public final k01 b(l01 l01Var, e01 e01Var, long j) {
        int j2;
        int i;
        int i2 = 0;
        if (!Float.isNaN(this.s) && us.j(j) == 0) {
            int j0 = l01Var.j0(this.s);
            j2 = us.h(j);
            if (j0 < 0) {
                j0 = 0;
            }
            if (j0 <= j2) {
                j2 = j0;
            }
        } else {
            j2 = us.j(j);
        }
        int h = us.h(j);
        if (!Float.isNaN(this.t) && us.i(j) == 0) {
            int j02 = l01Var.j0(this.t);
            i = us.g(j);
            if (j02 >= 0) {
                i2 = j02;
            }
            if (i2 <= i) {
                i = i2;
            }
        } else {
            i = us.i(j);
        }
        ig1 x = e01Var.x(vs.a(j2, h, i, us.g(j)));
        return l01Var.s0(x.e, x.f, m60.e, new df(x, 10));
    }

    @Override // defpackage.rq0
    public final int e(ty0 ty0Var, e01 e01Var, int i) {
        int i2;
        int s = e01Var.s(i);
        if (!Float.isNaN(this.s)) {
            i2 = ty0Var.j0(this.s);
        } else {
            i2 = 0;
        }
        if (s < i2) {
            return i2;
        }
        return s;
    }

    @Override // defpackage.rq0
    public final int k0(ty0 ty0Var, e01 e01Var, int i) {
        int i2;
        int n = e01Var.n(i);
        if (!Float.isNaN(this.s)) {
            i2 = ty0Var.j0(this.s);
        } else {
            i2 = 0;
        }
        if (n < i2) {
            return i2;
        }
        return n;
    }
}
