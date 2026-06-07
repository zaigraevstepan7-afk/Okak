package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lci0;", "Li21;", "Ldi0;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class ci0 extends i21 {
    public final ii a;

    public ci0(ii iiVar) {
        this.a = iiVar;
    }

    public final boolean equals(Object obj) {
        ci0 ci0Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ci0) {
            ci0Var = (ci0) obj;
        } else {
            ci0Var = null;
        }
        if (ci0Var == null) {
            return false;
        }
        return this.a.equals(ci0Var.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d21, di0] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? d21Var = new d21();
        d21Var.s = this.a;
        return d21Var;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        ((di0) d21Var).s = this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a.a);
    }
}
