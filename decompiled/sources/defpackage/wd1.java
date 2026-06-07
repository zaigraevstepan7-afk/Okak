package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class wd1 extends d21 implements rq0, b40 {
    public ud1 s;
    public boolean t;
    public i3 u;
    public xl1 v;
    public float w;
    public ni x;

    public static boolean M0(long j) {
        if (!fy1.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040) {
            return true;
        }
        return false;
    }

    public static boolean N0(long j) {
        if (!fy1.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040) {
            return true;
        }
        return false;
    }

    @Override // defpackage.d21
    public final boolean A0() {
        return false;
    }

    public final boolean L0() {
        if (this.t && this.s.d() != 9205357640488583168L) {
            return true;
        }
        return false;
    }

    public final long O0(long j) {
        boolean z;
        int j2;
        int i;
        float intBitsToFloat;
        float intBitsToFloat2;
        boolean z2 = false;
        if (us.d(j) && us.c(j)) {
            z = true;
        } else {
            z = false;
        }
        if (us.f(j) && us.e(j)) {
            z2 = true;
        }
        if ((!L0() && z) || z2) {
            return us.a(j, us.h(j), 0, us.g(j), 0, 10);
        }
        long d = this.s.d();
        if (N0(d)) {
            j2 = Math.round(Float.intBitsToFloat((int) (d >> 32)));
        } else {
            j2 = us.j(j);
        }
        if (M0(d)) {
            i = Math.round(Float.intBitsToFloat((int) (d & 4294967295L)));
        } else {
            i = us.i(j);
        }
        int g = vs.g(j2, j);
        float f = vs.f(i, j);
        long floatToRawIntBits = (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(g) << 32);
        if (L0()) {
            if (!N0(this.s.d())) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            } else {
                intBitsToFloat = Float.intBitsToFloat((int) (this.s.d() >> 32));
            }
            if (!M0(this.s.d())) {
                intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            } else {
                intBitsToFloat2 = Float.intBitsToFloat((int) (this.s.d() & 4294967295L));
            }
            long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
            if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) == 0.0f) {
                floatToRawIntBits = 0;
            } else {
                floatToRawIntBits = pp1.J(floatToRawIntBits2, this.v.m(floatToRawIntBits2, floatToRawIntBits));
            }
        }
        return us.a(j, vs.g(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32))), j), 0, vs.f(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))), j), 0, 10);
    }

    @Override // defpackage.rq0
    public final int Q(ty0 ty0Var, e01 e01Var, int i) {
        if (L0()) {
            long O0 = O0(vs.b(i, 0, 13));
            return Math.max(us.i(O0), e01Var.c(i));
        }
        return e01Var.c(i);
    }

    @Override // defpackage.rq0
    public final int a0(ty0 ty0Var, e01 e01Var, int i) {
        if (L0()) {
            long O0 = O0(vs.b(i, 0, 13));
            return Math.max(us.i(O0), e01Var.Y(i));
        }
        return e01Var.Y(i);
    }

    @Override // defpackage.rq0
    public final k01 b(l01 l01Var, e01 e01Var, long j) {
        ig1 x = e01Var.x(O0(j));
        return l01Var.s0(x.e, x.f, m60.e, new b5(x, 5));
    }

    @Override // defpackage.rq0
    public final int e(ty0 ty0Var, e01 e01Var, int i) {
        if (L0()) {
            long O0 = O0(vs.b(0, i, 7));
            return Math.max(us.j(O0), e01Var.s(i));
        }
        return e01Var.s(i);
    }

    @Override // defpackage.b40
    public final void f0(cr0 cr0Var) {
        float intBitsToFloat;
        float intBitsToFloat2;
        long j;
        vl vlVar = cr0Var.e;
        long d = this.s.d();
        if (N0(d)) {
            intBitsToFloat = Float.intBitsToFloat((int) (d >> 32));
        } else {
            intBitsToFloat = Float.intBitsToFloat((int) (vlVar.d() >> 32));
        }
        if (M0(d)) {
            intBitsToFloat2 = Float.intBitsToFloat((int) (d & 4294967295L));
        } else {
            intBitsToFloat2 = Float.intBitsToFloat((int) (vlVar.d() & 4294967295L));
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        if (Float.intBitsToFloat((int) (vlVar.d() >> 32)) == 0.0f || Float.intBitsToFloat((int) (vlVar.d() & 4294967295L)) == 0.0f) {
            j = 0;
        } else {
            j = pp1.J(floatToRawIntBits, this.v.m(floatToRawIntBits, vlVar.d()));
        }
        long a = this.u.a((Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (vlVar.d() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (vlVar.d() & 4294967295L))) & 4294967295L), cr0Var.getLayoutDirection());
        float f = (int) (a >> 32);
        float f2 = (int) (a & 4294967295L);
        ((rg2) vlVar.f.f).B(f, f2);
        try {
            this.s.c(cr0Var, j, this.w, this.x);
            ((rg2) vlVar.f.f).B(-f, -f2);
            cr0Var.b();
        } catch (Throwable th) {
            ((rg2) vlVar.f.f).B(-f, -f2);
            throw th;
        }
    }

    @Override // defpackage.rq0
    public final int k0(ty0 ty0Var, e01 e01Var, int i) {
        if (L0()) {
            long O0 = O0(vs.b(0, i, 7));
            return Math.max(us.j(O0), e01Var.n(i));
        }
        return e01Var.n(i);
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.s + ", sizeToIntrinsics=" + this.t + ", alignment=" + this.u + ", alpha=" + this.w + ", colorFilter=" + this.x + ')';
    }
}
