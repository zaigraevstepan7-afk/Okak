package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lnc1;", "Li21;", "Loc1;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class nc1 extends i21 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public nc1(float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2;
        boolean z3;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        boolean z4 = true;
        if (f < 0.0f && !Float.isNaN(f)) {
            z = false;
        } else {
            z = true;
        }
        if (f2 < 0.0f && !Float.isNaN(f2)) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z5 = z & z2;
        if (f3 < 0.0f && !Float.isNaN(f3)) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean z6 = z5 & z3;
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z4 = false;
        }
        if (!(z6 & z4)) {
            il0.a("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        nc1 nc1Var;
        if (obj instanceof nc1) {
            nc1Var = (nc1) obj;
        } else {
            nc1Var = null;
        }
        if (nc1Var != null && f20.b(this.a, nc1Var.a) && f20.b(this.b, nc1Var.b) && f20.b(this.c, nc1Var.c) && f20.b(this.d, nc1Var.d)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d21, oc1] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? d21Var = new d21();
        d21Var.s = this.a;
        d21Var.t = this.b;
        d21Var.u = this.c;
        d21Var.v = this.d;
        d21Var.w = true;
        return d21Var;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        oc1 oc1Var = (oc1) d21Var;
        oc1Var.s = this.a;
        oc1Var.t = this.b;
        oc1Var.u = this.c;
        oc1Var.v = this.d;
        oc1Var.w = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + l90.a(this.d, l90.a(this.c, l90.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
