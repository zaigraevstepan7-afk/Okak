package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lws;", "Li21;", "Lxs;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class ws extends i21 {
    public final oe0 a;

    public ws(oe0 oe0Var) {
        this.a = oe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ws) && ((ws) obj).a == this.a) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d21, am0, xs] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? am0Var = new am0();
        am0Var.u = this.a;
        return am0Var;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        xs xsVar = (xs) d21Var;
        oe0 oe0Var = xsVar.u;
        oe0 oe0Var2 = this.a;
        if (oe0Var2 != oe0Var) {
            xsVar.u = oe0Var2;
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
