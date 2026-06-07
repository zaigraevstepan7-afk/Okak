package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lpr0;", "Li21;", "Lqr0;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class pr0 extends i21 {
    public final float a;
    public final boolean b;

    public pr0(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        pr0 pr0Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof pr0) {
            pr0Var = (pr0) obj;
        } else {
            pr0Var = null;
        }
        if (pr0Var != null && this.a == pr0Var.a && this.b == pr0Var.b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d21, qr0] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? d21Var = new d21();
        d21Var.s = this.a;
        d21Var.t = this.b;
        return d21Var;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        qr0 qr0Var = (qr0) d21Var;
        qr0Var.s = this.a;
        qr0Var.t = this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
