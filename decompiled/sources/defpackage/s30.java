package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls30;", "Li21;", "Lw30;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class s30 extends i21 {
    public static final p1 i = new p1(24);
    public final dz1 a;
    public final sb1 b;
    public final boolean c;
    public final r31 d;
    public final boolean e;
    public final te0 f;
    public final te0 g;
    public final boolean h;

    public s30(dz1 dz1Var, sb1 sb1Var, boolean z, r31 r31Var, boolean z2, t30 t30Var, te0 te0Var, boolean z3) {
        this.a = dz1Var;
        this.b = sb1Var;
        this.c = z;
        this.d = r31Var;
        this.e = z2;
        this.f = t30Var;
        this.g = te0Var;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && s30.class == obj.getClass()) {
                s30 s30Var = (s30) obj;
                if (this.a == s30Var.a && this.b == s30Var.b && this.c == s30Var.c && sn0.r(this.d, s30Var.d) && this.e == s30Var.e && sn0.r(this.f, s30Var.f) && sn0.r(this.g, s30Var.g) && this.h == s30Var.h) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d21, w30, m30] */
    @Override // defpackage.i21
    public final d21 f() {
        p1 p1Var = i;
        boolean z = this.c;
        r31 r31Var = this.d;
        sb1 sb1Var = this.b;
        ?? m30Var = new m30(p1Var, z, r31Var, sb1Var);
        m30Var.M = this.a;
        m30Var.N = sb1Var;
        m30Var.O = this.e;
        m30Var.P = this.f;
        m30Var.Q = this.g;
        m30Var.R = this.h;
        return m30Var;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        boolean z;
        boolean z2;
        w30 w30Var = (w30) d21Var;
        dz1 dz1Var = w30Var.M;
        dz1 dz1Var2 = this.a;
        if (!sn0.r(dz1Var, dz1Var2)) {
            w30Var.M = dz1Var2;
            z = true;
        } else {
            z = false;
        }
        sb1 sb1Var = w30Var.N;
        sb1 sb1Var2 = this.b;
        if (sb1Var != sb1Var2) {
            w30Var.N = sb1Var2;
            z = true;
        }
        boolean z3 = w30Var.R;
        boolean z4 = this.h;
        if (z3 != z4) {
            w30Var.R = z4;
            z2 = true;
        } else {
            z2 = z;
        }
        w30Var.P = this.f;
        w30Var.Q = this.g;
        w30Var.O = this.e;
        w30Var.f1(i, this.c, this.d, sb1Var2, z2);
    }

    public final int hashCode() {
        int i2;
        int a = mb2.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        r31 r31Var = this.d;
        if (r31Var != null) {
            i2 = r31Var.hashCode();
        } else {
            i2 = 0;
        }
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + mb2.a((a + i2) * 31, 31, this.e)) * 31)) * 31);
    }
}
