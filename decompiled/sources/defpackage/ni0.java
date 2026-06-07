package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lni0;", "Li21;", "Lri0;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class ni0 extends i21 {
    public final r31 a;

    public ni0(r31 r31Var) {
        this.a = r31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ni0) && sn0.r(((ni0) obj).a, this.a)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d21, ri0] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? d21Var = new d21();
        d21Var.s = this.a;
        return d21Var;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        ri0 ri0Var = (ri0) d21Var;
        r31 r31Var = ri0Var.s;
        r31 r31Var2 = this.a;
        if (!sn0.r(r31Var, r31Var2)) {
            ri0Var.N0();
            ri0Var.s = r31Var2;
        }
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
