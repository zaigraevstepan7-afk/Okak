package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lvd1;", "Li21;", "Lwd1;", "ui"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final /* data */ class vd1 extends i21 {
    public final ud1 a;
    public final i3 b;
    public final xl1 c;
    public final float d;
    public final ni e;

    public vd1(ud1 ud1Var, i3 i3Var, xl1 xl1Var, float f, ni niVar) {
        this.a = ud1Var;
        this.b = i3Var;
        this.c = xl1Var;
        this.d = f;
        this.e = niVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vd1) {
                vd1 vd1Var = (vd1) obj;
                if (!sn0.r(this.a, vd1Var.a) || !sn0.r(this.b, vd1Var.b) || !sn0.r(this.c, vd1Var.c) || Float.compare(this.d, vd1Var.d) != 0 || !sn0.r(this.e, vd1Var.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d21, wd1] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? d21Var = new d21();
        d21Var.s = this.a;
        d21Var.t = true;
        d21Var.u = this.b;
        d21Var.v = this.c;
        d21Var.w = this.d;
        d21Var.x = this.e;
        return d21Var;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        boolean z;
        wd1 wd1Var = (wd1) d21Var;
        boolean z2 = wd1Var.t;
        ud1 ud1Var = this.a;
        if (z2 && fy1.a(wd1Var.s.d(), ud1Var.d())) {
            z = false;
        } else {
            z = true;
        }
        wd1Var.s = ud1Var;
        wd1Var.t = true;
        wd1Var.u = this.b;
        wd1Var.v = this.c;
        wd1Var.w = this.d;
        wd1Var.x = this.e;
        if (z) {
            hp.A(wd1Var);
        }
        fp.I(wd1Var);
    }

    public final int hashCode() {
        int hashCode;
        int a = l90.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + mb2.a(this.a.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        ni niVar = this.e;
        if (niVar == null) {
            hashCode = 0;
        } else {
            hashCode = niVar.hashCode();
        }
        return a + hashCode;
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=true, alignment=" + this.b + ", contentScale=" + this.c + ", alpha=" + this.d + ", colorFilter=" + this.e + ')';
    }
}
