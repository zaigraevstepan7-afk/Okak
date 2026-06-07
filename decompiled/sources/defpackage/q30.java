package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lq30;", "T", "Li21;", "Lr30;", "material3"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class q30<T> extends i21 {
    public final n4 a;
    public final se0 b;

    public q30(n4 n4Var, se0 se0Var) {
        this.a = n4Var;
        this.b = se0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q30) {
            q30 q30Var = (q30) obj;
            if (sn0.r(this.a, q30Var.a) && this.b == q30Var.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d21, r30] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? d21Var = new d21();
        d21Var.s = this.a;
        d21Var.t = this.b;
        d21Var.u = sb1.e;
        return d21Var;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        r30 r30Var = (r30) d21Var;
        r30Var.s = this.a;
        r30Var.t = this.b;
        r30Var.u = sb1.e;
    }

    public final int hashCode() {
        return sb1.e.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
