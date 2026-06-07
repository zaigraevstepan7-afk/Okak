package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lbk0;", "Li21;", "Lck0;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class bk0 extends i21 {
    public final r31 a;
    public final dk0 b;

    public bk0(r31 r31Var, dk0 dk0Var) {
        this.a = r31Var;
        this.b = dk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk0)) {
            return false;
        }
        bk0 bk0Var = (bk0) obj;
        if (sn0.r(this.a, bk0Var.a) && sn0.r(this.b, bk0Var.b)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d21, rz, ck0] */
    @Override // defpackage.i21
    public final d21 f() {
        qz a = this.b.a(this.a);
        ?? rzVar = new rz();
        rzVar.u = a;
        rzVar.L0(a);
        return rzVar;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        ck0 ck0Var = (ck0) d21Var;
        qz a = this.b.a(this.a);
        ck0Var.M0(ck0Var.u);
        ck0Var.u = a;
        ck0Var.L0(a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
