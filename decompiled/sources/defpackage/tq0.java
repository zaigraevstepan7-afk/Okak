package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class tq0 extends e81 {
    public static final f8 X;
    public rq0 V;
    public sq0 W;

    static {
        f8 j = fc2.j();
        int i = co.h;
        j.e(co.e);
        j.k(1.0f);
        j.l(1);
        X = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tq0(ar0 ar0Var, rq0 rq0Var) {
        super(ar0Var);
        sq0 sq0Var;
        this.V = rq0Var;
        if (ar0Var.m != null) {
            sq0Var = new sq0(this);
        } else {
            sq0Var = null;
        }
        this.W = sq0Var;
        if ((((d21) rq0Var).e.g & 512) == 0) {
            return;
        }
        se.s();
        throw null;
    }

    @Override // defpackage.e81
    public final void Q0() {
        if (this.W == null) {
            this.W = new sq0(this);
        }
    }

    @Override // defpackage.e81
    public final vy0 T0() {
        return this.W;
    }

    @Override // defpackage.e81
    public final d21 V0() {
        return ((d21) this.V).e;
    }

    @Override // defpackage.e01
    public final int Y(int i) {
        rq0 rq0Var = this.V;
        e81 e81Var = this.t;
        e81Var.getClass();
        return rq0Var.a0(this, e81Var, i);
    }

    @Override // defpackage.e01
    public final int c(int i) {
        rq0 rq0Var = this.V;
        e81 e81Var = this.t;
        e81Var.getClass();
        return rq0Var.Q(this, e81Var, i);
    }

    @Override // defpackage.e81
    public final void k1(tl tlVar, tf0 tf0Var) {
        e81 e81Var;
        e81 e81Var2 = this.t;
        e81Var2.getClass();
        e81Var2.O0(tlVar, tf0Var);
        if (((q5) dr0.a(this.s)).getShowLayoutBounds() && (e81Var = this.t) != null) {
            if (!en0.a(this.g, e81Var.g) || !xm0.a(e81Var.D, 0L)) {
                long j = this.g;
                tlVar.k(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, X);
            }
        }
    }

    @Override // defpackage.ig1
    public final void m0(long j, float f, oe0 oe0Var) {
        l1(j, f, oe0Var);
        if (!this.n) {
            g1();
            e81 e81Var = this.t;
            e81Var.getClass();
            e81Var.o = this.o;
            D0().a();
            e81Var.o = false;
        }
    }

    @Override // defpackage.e01
    public final int n(int i) {
        rq0 rq0Var = this.V;
        e81 e81Var = this.t;
        e81Var.getClass();
        return rq0Var.k0(this, e81Var, i);
    }

    @Override // defpackage.e01
    public final int s(int i) {
        rq0 rq0Var = this.V;
        e81 e81Var = this.t;
        e81Var.getClass();
        return rq0Var.e(this, e81Var, i);
    }

    @Override // defpackage.ty0
    public final int u0(j3 j3Var) {
        sq0 sq0Var = this.W;
        if (sq0Var != null) {
            x31 x31Var = sq0Var.x;
            int d = x31Var.d(j3Var);
            if (d >= 0) {
                return x31Var.c[d];
            }
            return Integer.MIN_VALUE;
        }
        return fp.k(this, j3Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w1(rq0 rq0Var) {
        if (!rq0Var.equals(this.V) && (((d21) rq0Var).e.g & 512) != 0) {
            se.s();
        } else {
            this.V = rq0Var;
        }
    }

    @Override // defpackage.e01
    public final ig1 x(long j) {
        p0(j);
        rq0 rq0Var = this.V;
        e81 e81Var = this.t;
        e81Var.getClass();
        o1(rq0Var.b(this, e81Var, j));
        f1();
        return this;
    }
}
