package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lda1;", "Li21;", "Lea1;", "ui"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class da1 extends i21 {
    public final oe0 a;

    public da1(oe0 oe0Var) {
        this.a = oe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da1)) {
            return false;
        }
        if (this.a == ((da1) obj).a) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d21, ea1] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? d21Var = new d21();
        d21Var.s = this.a;
        d21Var.t = -9223372034707292160L;
        return d21Var;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        ea1 ea1Var = (ea1) d21Var;
        ea1Var.s = this.a;
        ea1Var.t = -9223372034707292160L;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
