package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Le91;", "Li21;", "Lf91;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class e91 extends i21 {
    public final oe0 a;

    public e91(oe0 oe0Var) {
        this.a = oe0Var;
    }

    public final boolean equals(Object obj) {
        e91 e91Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof e91) {
            e91Var = (e91) obj;
        } else {
            e91Var = null;
        }
        if (e91Var != null && this.a == e91Var.a) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d21, f91] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? d21Var = new d21();
        d21Var.s = this.a;
        d21Var.t = true;
        return d21Var;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        f91 f91Var = (f91) d21Var;
        oe0 oe0Var = f91Var.s;
        oe0 oe0Var2 = this.a;
        if (oe0Var != oe0Var2 || !f91Var.t) {
            hp.M(f91Var).W(false);
        }
        f91Var.s = oe0Var2;
        f91Var.t = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.a + ", rtlAware=true)";
    }
}
