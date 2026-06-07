package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lik1;", "Li21;", "Lpk1;", "material3"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class ik1 extends i21 {
    public final boolean a;
    public final de0 b;
    public final qk1 c;
    public final float d;

    public ik1(boolean z, de0 de0Var, qk1 qk1Var, float f) {
        this.a = z;
        this.b = de0Var;
        this.c = qk1Var;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ik1) {
                ik1 ik1Var = (ik1) obj;
                if (this.a != ik1Var.a || this.b != ik1Var.b || !sn0.r(this.c, ik1Var.c) || !f20.b(this.d, ik1Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.i21
    public final d21 f() {
        return new pk1(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        pk1 pk1Var = (pk1) d21Var;
        pk1Var.v = this.b;
        pk1Var.w = true;
        pk1Var.x = this.c;
        pk1Var.y = this.d;
        boolean z = pk1Var.u;
        boolean z2 = this.a;
        if (z != z2) {
            pk1Var.u = z2;
            rx.C(pk1Var.z0(), null, new mk1(pk1Var, null, 2), 3);
        }
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + mb2.a(Boolean.hashCode(this.a) * 31, 31, true)) * 31)) * 31);
    }
}
