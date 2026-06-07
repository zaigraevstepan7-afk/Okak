package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lvs1;", "Li21;", "Lbs1;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class vs1 extends i21 {
    public final fs1 a;

    public vs1(fs1 fs1Var) {
        this.a = fs1Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vs1) {
            if (sn0.r(this.a, ((vs1) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bs1, d21] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? d21Var = new d21();
        d21Var.s = this.a;
        d21Var.t = true;
        return d21Var;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        bs1 bs1Var = (bs1) d21Var;
        bs1Var.s = this.a;
        bs1Var.t = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + mb2.a(this.a.hashCode() * 31, 31, false);
    }
}
