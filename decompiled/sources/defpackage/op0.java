package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lop0;", "Li21;", "Lqp0;", "ui"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class op0 extends i21 {
    public final oe0 a;
    public final oe0 b;

    public op0(oe0 oe0Var, oe0 oe0Var2) {
        this.a = oe0Var;
        this.b = oe0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op0)) {
            return false;
        }
        op0 op0Var = (op0) obj;
        if (this.a == op0Var.a && this.b == op0Var.b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [qp0, d21] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? d21Var = new d21();
        d21Var.s = this.a;
        d21Var.t = this.b;
        return d21Var;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        qp0 qp0Var = (qp0) d21Var;
        qp0Var.s = this.a;
        qp0Var.t = this.b;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        oe0 oe0Var = this.a;
        if (oe0Var != null) {
            i = oe0Var.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        oe0 oe0Var2 = this.b;
        if (oe0Var2 != null) {
            i2 = oe0Var2.hashCode();
        }
        return i3 + i2;
    }
}
