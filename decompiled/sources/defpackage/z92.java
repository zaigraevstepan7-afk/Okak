package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lz92;", "Li21;", "Lba2;", "material3"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final /* data */ class z92 extends i21 {
    public final r31 a;
    public final boolean b;
    public final u90 c;

    public z92(r31 r31Var, boolean z, u90 u90Var) {
        this.a = r31Var;
        this.b = z;
        this.c = u90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z92)) {
            return false;
        }
        z92 z92Var = (z92) obj;
        if (sn0.r(this.a, z92Var.a) && this.b == z92Var.b && sn0.r(this.c, z92Var.c)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d21, ba2] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? d21Var = new d21();
        d21Var.s = this.a;
        d21Var.t = this.b;
        d21Var.u = this.c;
        d21Var.y = Float.NaN;
        d21Var.z = Float.NaN;
        return d21Var;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        ba2 ba2Var = (ba2) d21Var;
        ba2Var.s = this.a;
        boolean z = ba2Var.t;
        boolean z2 = this.b;
        if (z != z2) {
            hp.A(ba2Var);
        }
        ba2Var.t = z2;
        ba2Var.u = this.c;
        if (ba2Var.x == null && !Float.isNaN(ba2Var.z)) {
            ba2Var.x = fc2.a(ba2Var.z);
        }
        if (ba2Var.w == null && !Float.isNaN(ba2Var.y)) {
            ba2Var.w = fc2.a(ba2Var.y);
        }
    }

    public final int hashCode() {
        return this.c.hashCode() + mb2.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.a + ", checked=" + this.b + ", animationSpec=" + this.c + ')';
    }
}
