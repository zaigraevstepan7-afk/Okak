package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lct0;", "Li21;", "Lft0;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class ct0 extends i21 {
    public final de0 a;
    public final zs0 b;
    public final sb1 c;
    public final boolean d;

    public ct0(de0 de0Var, zs0 zs0Var, sb1 sb1Var, boolean z) {
        this.a = de0Var;
        this.b = zs0Var;
        this.c = sb1Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ct0) {
            ct0 ct0Var = (ct0) obj;
            if (this.a == ct0Var.a && sn0.r(this.b, ct0Var.b) && this.c == ct0Var.c && this.d == ct0Var.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.i21
    public final d21 f() {
        return new ft0(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        ft0 ft0Var = (ft0) d21Var;
        ft0Var.s = this.a;
        ft0Var.t = this.b;
        sb1 sb1Var = ft0Var.u;
        sb1 sb1Var2 = this.c;
        if (sb1Var != sb1Var2) {
            ft0Var.u = sb1Var2;
            xp1.m(ft0Var);
        }
        boolean z = ft0Var.v;
        boolean z2 = this.d;
        if (z == z2) {
            return;
        }
        ft0Var.v = z2;
        ft0Var.L0();
        xp1.m(ft0Var);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + mb2.a((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }
}
