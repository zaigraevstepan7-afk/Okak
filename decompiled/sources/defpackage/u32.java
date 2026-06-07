package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lu32;", "Li21;", "Lv32;", "ui"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final /* data */ class u32 extends i21 {
    public final k20 a;

    public u32(k20 k20Var) {
        this.a = k20Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u32) {
                u32 u32Var = (u32) obj;
                u8 u8Var = sn0.P;
                if (!u8Var.equals(u8Var) || !sn0.r(this.a, u32Var.a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.i21
    public final d21 f() {
        return new ki0(sn0.P, this.a);
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        v32 v32Var = (v32) d21Var;
        u8 u8Var = sn0.P;
        if (!sn0.r(v32Var.t, u8Var)) {
            v32Var.t = u8Var;
            if (v32Var.u) {
                v32Var.N0();
            }
        }
        v32Var.s = this.a;
    }

    public final int hashCode() {
        int i = 0;
        int a = mb2.a(1022 * 31, 31, false);
        k20 k20Var = this.a;
        if (k20Var != null) {
            i = k20Var.hashCode();
        }
        return a + i;
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + sn0.P + ", overrideDescendants=false, touchBoundsExpansion=" + this.a + ')';
    }
}
