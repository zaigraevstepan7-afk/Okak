package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lvc0;", "Li21;", "Lyc0;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class vc0 extends i21 {
    public final r31 a;

    public vc0(r31 r31Var) {
        this.a = r31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc0)) {
            return false;
        }
        if (sn0.r(this.a, ((vc0) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.i21
    public final d21 f() {
        return new yc0(this.a, 1, null);
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        ((yc0) d21Var).Q0(this.a);
    }

    public final int hashCode() {
        r31 r31Var = this.a;
        if (r31Var != null) {
            return r31Var.hashCode();
        }
        return 0;
    }
}
