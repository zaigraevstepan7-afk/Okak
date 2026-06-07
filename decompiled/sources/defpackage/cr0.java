package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class cr0 implements c40 {
    public final vl e = new vl();
    public b40 f;

    @Override // defpackage.c00
    public final long G(float f) {
        return this.e.G(f);
    }

    @Override // defpackage.c00
    public final float K(int i) {
        return this.e.K(i);
    }

    @Override // defpackage.c00
    public final float M(float f) {
        return f / this.e.a();
    }

    @Override // defpackage.c00
    public final float P() {
        return this.e.P();
    }

    @Override // defpackage.c40
    public final void R(float f, long j, long j2) {
        this.e.R(f, j, j2);
    }

    @Override // defpackage.c40
    public final void V(long j, long j2, long j3, long j4) {
        this.e.V(j, j2, j3, j4);
    }

    @Override // defpackage.c00
    public final float W(float f) {
        return this.e.a() * f;
    }

    @Override // defpackage.c40
    public final void Z(long j, float f, float f2, long j2, long j3, float f3, q32 q32Var) {
        this.e.Z(j, f, f2, j2, j3, f3, q32Var);
    }

    @Override // defpackage.c00
    public final float a() {
        return this.e.a();
    }

    public final void b() {
        vl vlVar = this.e;
        tl h = vlVar.f.h();
        qz qzVar = this.f;
        if (qzVar != null) {
            d21 d21Var = (d21) qzVar;
            d21 d21Var2 = d21Var.e.j;
            if (d21Var2 != null && (d21Var2.h & 4) != 0) {
                while (d21Var2 != null) {
                    int i = d21Var2.g;
                    if ((i & 2) != 0) {
                        break;
                    } else if ((i & 4) != 0) {
                        break;
                    } else {
                        d21Var2 = d21Var2.j;
                    }
                }
            }
            d21Var2 = null;
            if (d21Var2 != null) {
                q41 q41Var = null;
                while (d21Var2 != null) {
                    if (d21Var2 instanceof b40) {
                        b40 b40Var = (b40) d21Var2;
                        tf0 tf0Var = (tf0) vlVar.f.g;
                        e81 K = hp.K(b40Var, 4);
                        long O = vn.O(K.g);
                        ar0 ar0Var = K.s;
                        ar0Var.getClass();
                        ((q5) dr0.a(ar0Var)).getSharedDrawScope().c(h, O, K, b40Var, tf0Var);
                    } else if ((d21Var2.g & 4) != 0 && (d21Var2 instanceof rz)) {
                        int i2 = 0;
                        for (d21 d21Var3 = ((rz) d21Var2).t; d21Var3 != null; d21Var3 = d21Var3.j) {
                            if ((d21Var3.g & 4) != 0) {
                                i2++;
                                if (i2 == 1) {
                                    d21Var2 = d21Var3;
                                } else {
                                    if (q41Var == null) {
                                        q41Var = new q41(new d21[16]);
                                    }
                                    if (d21Var2 != null) {
                                        q41Var.b(d21Var2);
                                        d21Var2 = null;
                                    }
                                    q41Var.b(d21Var3);
                                }
                            }
                        }
                        if (i2 == 1) {
                        }
                    }
                    d21Var2 = hp.l(q41Var);
                }
                return;
            }
            e81 K2 = hp.K(qzVar, 4);
            if (K2.V0() == d21Var.e) {
                K2 = K2.t;
                K2.getClass();
            }
            K2.k1(h, (tf0) vlVar.f.g);
            return;
        }
        throw l90.f("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
    }

    @Override // defpackage.c40
    public final ld b0() {
        return this.e.f;
    }

    public final void c(tl tlVar, long j, e81 e81Var, b40 b40Var, tf0 tf0Var) {
        b40 b40Var2 = this.f;
        this.f = b40Var;
        jq0 jq0Var = e81Var.s.D;
        vl vlVar = this.e;
        ld ldVar = vlVar.f;
        ul ulVar = ((vl) ldVar.h).e;
        c00 c00Var = ulVar.a;
        jq0 jq0Var2 = ulVar.b;
        tl h = ldVar.h();
        ld ldVar2 = vlVar.f;
        long k = ldVar2.k();
        tf0 tf0Var2 = (tf0) ldVar2.g;
        ldVar2.s(e81Var);
        ldVar2.t(jq0Var);
        ldVar2.r(tlVar);
        ldVar2.u(j);
        ldVar2.g = tf0Var;
        tlVar.h();
        try {
            b40Var.f0(this);
            tlVar.p();
            ldVar2.s(c00Var);
            ldVar2.t(jq0Var2);
            ldVar2.r(h);
            ldVar2.u(k);
            ldVar2.g = tf0Var2;
            this.f = b40Var2;
        } catch (Throwable th) {
            tlVar.p();
            ldVar2.s(c00Var);
            ldVar2.t(jq0Var2);
            ldVar2.r(h);
            ldVar2.u(k);
            ldVar2.g = tf0Var2;
            throw th;
        }
    }

    @Override // defpackage.c40
    public final long d() {
        return this.e.d();
    }

    @Override // defpackage.c00
    public final int d0(long j) {
        return this.e.d0(j);
    }

    public final void e(ck ckVar, long j, long j2, float f, d40 d40Var) {
        vl vlVar = this.e;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        vlVar.e.c.k(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), vlVar.c(ckVar, d40Var, f, null, 3, 1));
    }

    @Override // defpackage.c40
    public final void f(n8 n8Var, ck ckVar, float f, d40 d40Var, int i) {
        this.e.f(n8Var, ckVar, f, d40Var, i);
    }

    @Override // defpackage.c40
    public final void g(n8 n8Var, long j, float f, d40 d40Var) {
        this.e.g(n8Var, j, f, d40Var);
    }

    @Override // defpackage.c40
    public final jq0 getLayoutDirection() {
        return this.e.e.b;
    }

    public final void h(ck ckVar, long j, long j2, long j3, float f, d40 d40Var) {
        vl vlVar = this.e;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        vlVar.e.c.g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), vlVar.c(ckVar, d40Var, f, null, 3, 1));
    }

    @Override // defpackage.c40
    public final void h0(t7 t7Var, long j, long j2, long j3, float f, ni niVar, int i) {
        this.e.h0(t7Var, j, j2, j3, f, niVar, i);
    }

    @Override // defpackage.c00
    public final int j0(float f) {
        return this.e.j0(f);
    }

    @Override // defpackage.c40
    public final long l0() {
        return this.e.l0();
    }

    @Override // defpackage.c00
    public final long n0(long j) {
        return this.e.n0(j);
    }

    @Override // defpackage.c00
    public final long p(float f) {
        return this.e.p(f);
    }

    @Override // defpackage.c00
    public final long q(long j) {
        return this.e.q(j);
    }

    @Override // defpackage.c00
    public final float r0(long j) {
        return this.e.r0(j);
    }

    @Override // defpackage.c00
    public final float v(long j) {
        return this.e.v(j);
    }

    @Override // defpackage.c40
    public final void v0(long j, long j2, long j3, float f, int i) {
        this.e.v0(j, j2, j3, f, i);
    }

    @Override // defpackage.c40
    public final void y(long j, long j2, long j3, float f, int i) {
        this.e.y(j, j2, j3, f, i);
    }
}
