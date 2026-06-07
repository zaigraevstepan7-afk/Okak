package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcs0;", "Li21;", "Lds0;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final /* data */ class cs0 extends i21 {
    public final fs0 a;

    public cs0(fs0 fs0Var) {
        this.a = fs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof cs0) && this.a == ((cs0) obj).a) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ds0, d21] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? d21Var = new d21();
        d21Var.s = this.a;
        return d21Var;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        ds0 ds0Var = (ds0) d21Var;
        fs0 fs0Var = ds0Var.s;
        fs0 fs0Var2 = this.a;
        if (!sn0.r(fs0Var, fs0Var2) && ds0Var.e.r) {
            fs0 fs0Var3 = ds0Var.s;
            fs0Var3.c();
            fs0Var3.b = null;
            ds0Var.s = fs0Var2;
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.a + ')';
    }
}
