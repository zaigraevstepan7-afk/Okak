package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class vy0 extends ty0 implements e01 {
    public final e81 s;
    public LinkedHashMap u;
    public k01 w;
    public final x31 x;
    public long t = 0;
    public final wy0 v = new wy0(this);

    public vy0(e81 e81Var) {
        this.s = e81Var;
        x31 x31Var = t81.a;
        this.x = new x31();
    }

    public static final void K0(vy0 vy0Var, k01 k01Var) {
        LinkedHashMap linkedHashMap;
        if (k01Var != null) {
            vy0Var.o0((k01Var.c() & 4294967295L) | (k01Var.d() << 32));
        } else {
            vy0Var.o0(0L);
        }
        if (!sn0.r(vy0Var.w, k01Var) && k01Var != null && ((((linkedHashMap = vy0Var.u) != null && !linkedHashMap.isEmpty()) || !k01Var.b().isEmpty()) && !sn0.r(k01Var.b(), vy0Var.u))) {
            zy0 zy0Var = vy0Var.s.s.K.q;
            zy0Var.getClass();
            zy0Var.v.f();
            LinkedHashMap linkedHashMap2 = vy0Var.u;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                vy0Var.u = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(k01Var.b());
        }
        vy0Var.w = k01Var;
    }

    @Override // defpackage.ty0
    public final iq0 A0() {
        return this.v;
    }

    @Override // defpackage.ty0
    public final boolean B0() {
        if (this.w != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ig1, defpackage.e01
    public final Object C() {
        return this.s.C();
    }

    @Override // defpackage.ty0
    public final ar0 C0() {
        return this.s.s;
    }

    @Override // defpackage.ty0
    public final k01 D0() {
        k01 k01Var = this.w;
        if (k01Var != null) {
            return k01Var;
        }
        throw l90.f("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.ty0
    public final ty0 E0() {
        e81 e81Var = this.s.u;
        if (e81Var != null) {
            return e81Var.T0();
        }
        return null;
    }

    @Override // defpackage.ty0
    public final long F0() {
        return this.t;
    }

    @Override // defpackage.ty0
    public final void J0() {
        m0(this.t, 0.0f, null);
    }

    public void L0() {
        D0().a();
    }

    public final void M0(long j) {
        if (!xm0.a(this.t, j)) {
            this.t = j;
            e81 e81Var = this.s;
            zy0 zy0Var = e81Var.s.K.q;
            if (zy0Var != null) {
                zy0Var.x0();
            }
            ty0.H0(e81Var);
        }
        if (!this.o) {
            x0(D0());
        }
    }

    public final long N0(vy0 vy0Var, boolean z) {
        long j = 0;
        while (!this.equals(vy0Var)) {
            if (!this.m || !z) {
                j = xm0.c(j, this.t);
            }
            e81 e81Var = this.s.u;
            e81Var.getClass();
            this = e81Var.T0();
            this.getClass();
        }
        return j;
    }

    @Override // defpackage.c00
    public final float P() {
        return this.s.P();
    }

    @Override // defpackage.ty0, defpackage.mn0
    public final boolean S() {
        return true;
    }

    @Override // defpackage.c00
    public final float a() {
        return this.s.a();
    }

    @Override // defpackage.mn0
    public final jq0 getLayoutDirection() {
        return this.s.s.D;
    }

    @Override // defpackage.ig1
    public final void m0(long j, float f, oe0 oe0Var) {
        M0(j);
        if (this.n) {
            return;
        }
        L0();
    }

    @Override // defpackage.ty0
    public final ty0 z0() {
        e81 e81Var = this.s.t;
        if (e81Var != null) {
            return e81Var.T0();
        }
        return null;
    }
}
