package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class yn0 implements l01, mn0 {
    public final /* synthetic */ mn0 e;
    public final jq0 f;

    public yn0(mn0 mn0Var, jq0 jq0Var) {
        this.e = mn0Var;
        this.f = jq0Var;
    }

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
        return this.e.M(f);
    }

    @Override // defpackage.c00
    public final float P() {
        return this.e.P();
    }

    @Override // defpackage.mn0
    public final boolean S() {
        return this.e.S();
    }

    @Override // defpackage.c00
    public final float W(float f) {
        return this.e.W(f);
    }

    @Override // defpackage.c00
    public final float a() {
        return this.e.a();
    }

    @Override // defpackage.c00
    public final int d0(long j) {
        return this.e.d0(j);
    }

    @Override // defpackage.mn0
    public final jq0 getLayoutDirection() {
        return this.f;
    }

    @Override // defpackage.l01
    public final k01 i0(int i, int i2, Map map, oe0 oe0Var, oe0 oe0Var2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            kl0.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new xn0(i, i2, map, oe0Var);
    }

    @Override // defpackage.c00
    public final int j0(float f) {
        return this.e.j0(f);
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
}
