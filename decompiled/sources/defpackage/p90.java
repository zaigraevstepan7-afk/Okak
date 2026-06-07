package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp90;", "Li21;", "Lq90;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class p90 extends i21 {
    public final e10 a;
    public final float b;

    public p90(e10 e10Var, float f) {
        this.a = e10Var;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p90) {
                p90 p90Var = (p90) obj;
                if (this.a == p90Var.a && this.b == p90Var.b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d21, q90] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? d21Var = new d21();
        d21Var.s = this.a;
        d21Var.t = this.b;
        return d21Var;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        q90 q90Var = (q90) d21Var;
        q90Var.s = this.a;
        q90Var.t = this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
