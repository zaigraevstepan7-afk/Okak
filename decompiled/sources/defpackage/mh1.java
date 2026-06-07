package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lmh1;", "Li21;", "Lnh1;", "ui"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final /* data */ class mh1 extends i21 {
    public final u8 a;

    public mh1(u8 u8Var) {
        this.a = u8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof mh1) && this.a.equals(((mh1) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.i21
    public final d21 f() {
        return new ki0(this.a, null);
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        nh1 nh1Var = (nh1) d21Var;
        u8 u8Var = nh1Var.t;
        u8 u8Var2 = this.a;
        if (!sn0.r(u8Var, u8Var2)) {
            nh1Var.t = u8Var2;
            if (nh1Var.u) {
                nh1Var.N0();
            }
        }
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.b * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.a + ", overrideDescendants=false)";
    }
}
