package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo71;", "Li21;", "Lr71;", "ui"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class o71 extends i21 {
    public final l71 a;

    public o71(l71 l71Var) {
        this.a = l71Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o71) || !sn0.r(((o71) obj).a, this.a)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.i21
    public final d21 f() {
        return new r71(this.a, null);
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        r71 r71Var = (r71) d21Var;
        r71Var.s = this.a;
        q4 q4Var = r71Var.t;
        if (((r71) q4Var.f) == r71Var) {
            q4Var.f = null;
        }
        q4 q4Var2 = new q4();
        r71Var.t = q4Var2;
        if (r71Var.r) {
            q4Var2.f = r71Var;
            q4Var2.g = null;
            r71Var.u = null;
            q4Var2.h = new s8(r71Var, 9);
            q4Var2.i = r71Var.z0();
        }
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
