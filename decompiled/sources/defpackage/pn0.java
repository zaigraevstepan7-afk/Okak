package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lpn0;", "Li21;", "Lrn0;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class pn0 extends i21 {
    public final boolean equals(Object obj) {
        pn0 pn0Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof pn0) {
            pn0Var = (pn0) obj;
        } else {
            pn0Var = null;
        }
        if (pn0Var != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [d21, rn0] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? d21Var = new d21();
        d21Var.s = on0.f;
        d21Var.t = true;
        return d21Var;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        rn0 rn0Var = (rn0) d21Var;
        rn0Var.s = on0.f;
        rn0Var.t = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (on0.f.hashCode() * 31);
    }
}
