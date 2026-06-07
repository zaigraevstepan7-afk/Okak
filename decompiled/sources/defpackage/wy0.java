package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class wy0 implements iq0 {
    public final vy0 e;

    public wy0(vy0 vy0Var) {
        this.e = vy0Var;
    }

    @Override // defpackage.iq0
    public final long A(long j) {
        return z81.e(this.e.s.A(j), a());
    }

    @Override // defpackage.iq0
    public final iq0 D() {
        vy0 T0;
        if (!j()) {
            kl0.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        e81 e81Var = this.e.s.s.J.d.u;
        if (e81Var != null && (T0 = e81Var.T0()) != null) {
            return T0.v;
        }
        return null;
    }

    @Override // defpackage.iq0
    public final long I(iq0 iq0Var, long j) {
        return L(iq0Var, j);
    }

    @Override // defpackage.iq0
    public final long J(long j) {
        return z81.e(this.e.s.J(j), a());
    }

    @Override // defpackage.iq0
    public final long L(iq0 iq0Var, long j) {
        boolean z = iq0Var instanceof wy0;
        vy0 vy0Var = this.e;
        if (z) {
            vy0 vy0Var2 = ((wy0) iq0Var).e;
            e81 e81Var = vy0Var2.s;
            e81Var.e1();
            vy0 T0 = vy0Var.s.R0(e81Var).T0();
            if (T0 != null) {
                long b = xm0.b(xm0.c(vy0Var2.N0(T0, false), fp.V(j)), vy0Var.N0(T0, false));
                return (Float.floatToRawIntBits((int) (b >> 32)) << 32) | (Float.floatToRawIntBits((int) (b & 4294967295L)) & 4294967295L);
            }
            vy0 E = vn.E(vy0Var2);
            long c = xm0.c(xm0.c(vy0Var2.N0(E, false), E.t), fp.V(j));
            vy0 E2 = vn.E(vy0Var);
            long b2 = xm0.b(c, xm0.c(vy0Var.N0(E2, false), E2.t));
            long floatToRawIntBits = Float.floatToRawIntBits((int) (b2 >> 32));
            long floatToRawIntBits2 = Float.floatToRawIntBits((int) (b2 & 4294967295L)) & 4294967295L;
            e81 e81Var2 = E2.s.u;
            e81Var2.getClass();
            e81 e81Var3 = E.s.u;
            e81Var3.getClass();
            return e81Var2.L(e81Var3, floatToRawIntBits2 | (floatToRawIntBits << 32));
        }
        vy0 E3 = vn.E(vy0Var);
        e81 e81Var4 = E3.s;
        long L = L(E3.v, j);
        float f = (int) (E3.t & 4294967295L);
        long d = z81.d(L, (4294967295L & Float.floatToRawIntBits(f)) | (Float.floatToRawIntBits((int) (r5 >> 32)) << 32));
        if (!e81Var4.V0().r) {
            kl0.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        e81Var4.e1();
        e81 e81Var5 = e81Var4.u;
        if (e81Var5 != null) {
            e81Var4 = e81Var5;
        }
        return z81.e(d, e81Var4.L(iq0Var, 0L));
    }

    @Override // defpackage.iq0
    public final pl1 O(iq0 iq0Var, boolean z) {
        return this.e.s.O(iq0Var, z);
    }

    @Override // defpackage.iq0
    public final long Q(long j) {
        return this.e.s.Q(z81.e(j, a()));
    }

    public final long a() {
        vy0 vy0Var = this.e;
        vy0 E = vn.E(vy0Var);
        return z81.d(L(E.v, 0L), vy0Var.s.L(E.s, 0L));
    }

    @Override // defpackage.iq0
    public final long e(long j) {
        return this.e.s.e(z81.e(j, a()));
    }

    @Override // defpackage.iq0
    public final boolean j() {
        return this.e.s.V0().r;
    }

    @Override // defpackage.iq0
    public final void k(float[] fArr) {
        this.e.s.k(fArr);
    }

    @Override // defpackage.iq0
    public final void l(iq0 iq0Var, float[] fArr) {
        this.e.s.l(iq0Var, fArr);
    }

    @Override // defpackage.iq0
    public final long m() {
        vy0 vy0Var = this.e;
        return (vy0Var.e << 32) | (vy0Var.f & 4294967295L);
    }

    @Override // defpackage.iq0
    public final long u(long j) {
        return this.e.s.u(z81.e(0L, a()));
    }
}
