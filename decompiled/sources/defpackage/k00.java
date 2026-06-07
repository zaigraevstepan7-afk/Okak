package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lk00;", "Lfh;", "Lm00;", "material3"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class k00 extends fh<m00> {
    public final de0 a;
    public final oe0 b;
    public final long c;
    public final long d;
    public final q32 e;
    public final q32 f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;

    public k00(float f, float f2, float f3, float f4, long j, long j2, de0 de0Var, oe0 oe0Var, q32 q32Var, q32 q32Var2) {
        this.a = de0Var;
        this.b = oe0Var;
        this.c = j;
        this.d = j2;
        this.e = q32Var;
        this.f = q32Var2;
        this.g = f;
        this.h = f2;
        this.i = f3;
        this.j = f4;
    }

    @Override // defpackage.fh
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof k00)) {
            k00 k00Var = (k00) obj;
            if (f20.b(this.h, k00Var.h) && this.a == k00Var.a && this.b == k00Var.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.i21
    public final d21 f() {
        return new m00(this.h, this.g, this.i, this.j, this.c, this.d, this.a, this.b, this.e, this.f);
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        m00 m00Var = (m00) d21Var;
        o(m00Var);
        float f = m00Var.I;
        cl clVar = m00Var.K;
        float f2 = this.h;
        if (!f20.b(f, f2)) {
            m00Var.I = f2;
            fp.I(clVar);
        }
        de0 de0Var = m00Var.G;
        oe0 oe0Var = this.b;
        de0 de0Var2 = this.a;
        if (de0Var == de0Var2 && m00Var.H == oe0Var) {
            return;
        }
        m00Var.G = de0Var2;
        m00Var.H = oe0Var;
        clVar.L0();
    }

    @Override // defpackage.fh
    /* renamed from: h, reason: from getter */
    public final long getE() {
        return this.c;
    }

    @Override // defpackage.fh
    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + l90.a(this.h, super.hashCode() * 31, 31)) * 31);
    }

    @Override // defpackage.fh
    /* renamed from: i, reason: from getter */
    public final float getI() {
        return this.g;
    }

    @Override // defpackage.fh
    /* renamed from: j, reason: from getter */
    public final q32 getG() {
        return this.e;
    }

    @Override // defpackage.fh
    /* renamed from: k, reason: from getter */
    public final long getF() {
        return this.d;
    }

    @Override // defpackage.fh
    /* renamed from: l, reason: from getter */
    public final q32 getH() {
        return this.f;
    }

    @Override // defpackage.fh
    /* renamed from: m, reason: from getter */
    public final float getK() {
        return this.j;
    }

    @Override // defpackage.fh
    /* renamed from: n, reason: from getter */
    public final float getJ() {
        return this.i;
    }
}
