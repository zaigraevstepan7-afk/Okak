package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lqc1;", "Li21;", "Lsc1;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class qc1 extends i21 {
    public final pc1 a;

    public qc1(pc1 pc1Var) {
        this.a = pc1Var;
    }

    public final boolean equals(Object obj) {
        qc1 qc1Var;
        if (obj instanceof qc1) {
            qc1Var = (qc1) obj;
        } else {
            qc1Var = null;
        }
        if (qc1Var == null) {
            return false;
        }
        return sn0.r(this.a, qc1Var.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [sc1, d21] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? d21Var = new d21();
        d21Var.s = this.a;
        return d21Var;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        ((sc1) d21Var).s = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
