package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class pl0 extends vy0 {
    @Override // defpackage.vy0
    public final void L0() {
        zy0 zy0Var = this.s.s.K.q;
        zy0Var.getClass();
        zy0Var.A0();
    }

    @Override // defpackage.e01
    public final int Y(int i) {
        sl0 u = this.s.s.u();
        j01 u2 = u.u();
        ar0 ar0Var = (ar0) u.e;
        return u2.e(ar0Var.J.d, ar0Var.l(), i);
    }

    @Override // defpackage.e01
    public final int c(int i) {
        sl0 u = this.s.s.u();
        j01 u2 = u.u();
        ar0 ar0Var = (ar0) u.e;
        return u2.d(ar0Var.J.d, ar0Var.l(), i);
    }

    @Override // defpackage.e01
    public final int n(int i) {
        sl0 u = this.s.s.u();
        j01 u2 = u.u();
        ar0 ar0Var = (ar0) u.e;
        return u2.c(ar0Var.J.d, ar0Var.l(), i);
    }

    @Override // defpackage.e01
    public final int s(int i) {
        sl0 u = this.s.s.u();
        j01 u2 = u.u();
        ar0 ar0Var = (ar0) u.e;
        return u2.a(ar0Var.J.d, ar0Var.l(), i);
    }

    @Override // defpackage.ty0
    public final int u0(j3 j3Var) {
        int i;
        zy0 zy0Var = this.s.s.K.q;
        zy0Var.getClass();
        br0 br0Var = zy0Var.v;
        if (!zy0Var.o) {
            er0 er0Var = zy0Var.j;
            if (er0Var.d == wq0.f) {
                br0Var.f = true;
                if (br0Var.b) {
                    er0Var.f = true;
                    er0Var.g = true;
                }
            } else {
                br0Var.g = true;
            }
        }
        pl0 pl0Var = zy0Var.h().W;
        if (pl0Var != null) {
            pl0Var.o = true;
        }
        zy0Var.H();
        pl0 pl0Var2 = zy0Var.h().W;
        if (pl0Var2 != null) {
            pl0Var2.o = false;
        }
        Integer num = (Integer) br0Var.i.get(j3Var);
        if (num != null) {
            i = num.intValue();
        } else {
            i = Integer.MIN_VALUE;
        }
        this.x.g(i, j3Var);
        return i;
    }

    @Override // defpackage.e01
    public final ig1 x(long j) {
        p0(j);
        e81 e81Var = this.s;
        q41 z = e81Var.s.z();
        Object[] objArr = z.e;
        int i = z.g;
        for (int i2 = 0; i2 < i; i2++) {
            zy0 zy0Var = ((ar0) objArr[i2]).K.q;
            zy0Var.getClass();
            zy0Var.n = yq0.g;
        }
        ar0 ar0Var = e81Var.s;
        vy0.K0(this, ar0Var.A.b(this, ar0Var.l(), j));
        return this;
    }
}
