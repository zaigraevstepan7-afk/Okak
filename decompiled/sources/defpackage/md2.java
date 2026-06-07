package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lmd2;", "Li21;", "Lnd2;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class md2 extends i21 {
    public final v90 a;

    public md2(v90 v90Var) {
        this.a = v90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md2)) {
            return false;
        }
        return ((md2) obj).a.equals(this.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d21, am0, nd2] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? am0Var = new am0();
        am0Var.u = this.a;
        return am0Var;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        nd2 nd2Var = (nd2) d21Var;
        v90 v90Var = nd2Var.u;
        v90 v90Var2 = this.a;
        if (!v90Var2.equals(v90Var)) {
            nd2Var.u = v90Var2;
            nd2Var.M0();
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
