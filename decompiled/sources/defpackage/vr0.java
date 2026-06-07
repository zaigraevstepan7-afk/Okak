package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lvr0;", "Li21;", "Lyr0;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class vr0 extends i21 {
    public final zr0 a;
    public final nj b;
    public final sb1 c;

    public vr0(zr0 zr0Var, nj njVar, sb1 sb1Var) {
        this.a = zr0Var;
        this.b = njVar;
        this.c = sb1Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vr0) {
                vr0 vr0Var = (vr0) obj;
                if (!sn0.r(this.a, vr0Var.a) || !sn0.r(this.b, vr0Var.b) || this.c != vr0Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d21, yr0] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? d21Var = new d21();
        d21Var.s = this.a;
        d21Var.t = this.b;
        d21Var.u = this.c;
        return d21Var;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        yr0 yr0Var = (yr0) d21Var;
        yr0Var.s = this.a;
        yr0Var.t = this.b;
        yr0Var.u = this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + mb2.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, false);
    }
}
