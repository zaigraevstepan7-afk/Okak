package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldm0;", "Li21;", "Lfm0;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class dm0 extends i21 {
    public final th2 a;

    public dm0(th2 th2Var) {
        this.a = th2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm0)) {
            return false;
        }
        return sn0.r(((dm0) obj).a, this.a);
    }

    @Override // defpackage.i21
    public final d21 f() {
        return new fm0(this.a);
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        fm0 fm0Var = (fm0) d21Var;
        th2 th2Var = fm0Var.u;
        th2 th2Var2 = this.a;
        if (!sn0.r(th2Var2, th2Var)) {
            fm0Var.u = th2Var2;
            fm0Var.M0();
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
