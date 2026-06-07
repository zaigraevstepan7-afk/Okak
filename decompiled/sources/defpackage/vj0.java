package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lvj0;", "Lfh;", "Lxj0;", "material3"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class vj0 extends fh<xj0> {
    public final de0 a;
    public final de0 b;
    public final de0 c;
    public final de0 d;
    public final long e;
    public final long f;
    public final q32 g;
    public final q32 h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;

    public vj0(float f, float f2, float f3, float f4, long j, long j2, de0 de0Var, de0 de0Var2, de0 de0Var3, de0 de0Var4, q32 q32Var, q32 q32Var2) {
        this.a = de0Var;
        this.b = de0Var2;
        this.c = de0Var3;
        this.d = de0Var4;
        this.e = j;
        this.f = j2;
        this.g = q32Var;
        this.h = q32Var2;
        this.i = f;
        this.j = f2;
        this.k = f3;
        this.l = f4;
    }

    @Override // defpackage.fh
    public final boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof vj0)) {
            return false;
        }
        if (this.l != ((vj0) obj).l) {
            return false;
        }
        return true;
    }

    @Override // defpackage.i21
    public final d21 f() {
        return new xj0(this.l, this.i, this.j, this.k, this.e, this.f, this.a, this.b, this.c, this.d, this.g, this.h);
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        xj0 xj0Var = (xj0) d21Var;
        o(xj0Var);
        xj0Var.G = this.a;
        xj0Var.H = this.b;
        xj0Var.I = this.c;
        xj0Var.J = this.d;
        float f = this.l;
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (xj0Var.K == f) {
            return;
        }
        xj0Var.K = f;
        xj0Var.P0();
    }

    @Override // defpackage.fh
    /* renamed from: h, reason: from getter */
    public final long getE() {
        return this.e;
    }

    @Override // defpackage.fh
    public final int hashCode() {
        return Float.hashCode(this.l) + (super.hashCode() * 31);
    }

    @Override // defpackage.fh
    /* renamed from: i, reason: from getter */
    public final float getI() {
        return this.i;
    }

    @Override // defpackage.fh
    /* renamed from: j, reason: from getter */
    public final q32 getG() {
        return this.g;
    }

    @Override // defpackage.fh
    /* renamed from: k, reason: from getter */
    public final long getF() {
        return this.f;
    }

    @Override // defpackage.fh
    /* renamed from: l, reason: from getter */
    public final q32 getH() {
        return this.h;
    }

    @Override // defpackage.fh
    /* renamed from: m, reason: from getter */
    public final float getK() {
        return this.k;
    }

    @Override // defpackage.fh
    /* renamed from: n, reason: from getter */
    public final float getJ() {
        return this.j;
    }
}
