package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Loi;", "Li21;", "Lpi;", "ui"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class oi extends i21 {
    public final oe0 a;

    public oi(oe0 oe0Var) {
        this.a = oe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi)) {
            return false;
        }
        if (this.a == ((oi) obj).a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.i21
    public final d21 f() {
        return new pi(this.a);
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        e81 e81Var;
        pi piVar = (pi) d21Var;
        oe0 oe0Var = this.a;
        piVar.s = oe0Var;
        if (piVar.e.r && (e81Var = hp.K(piVar, 2).t) != null) {
            e81Var.t1(true, oe0Var);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
