package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau0;", "Li21;", "Lbu0;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final /* data */ class au0 extends i21 {
    public final b8 a;
    public final gu0 b;
    public final b82 c;

    public au0(b8 b8Var, gu0 gu0Var, b82 b82Var) {
        this.a = b8Var;
        this.b = gu0Var;
        this.c = b82Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof au0) {
            au0 au0Var = (au0) obj;
            if (sn0.r(this.a, au0Var.a) && this.b == au0Var.b && this.c == au0Var.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.i21
    public final d21 f() {
        return new bu0(this.a, this.b, this.c);
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        bu0 bu0Var = (bu0) d21Var;
        if (bu0Var.r) {
            bu0Var.s.c();
            bu0Var.s.k(bu0Var);
        }
        b8 b8Var = this.a;
        bu0Var.s = b8Var;
        if (bu0Var.r) {
            if (b8Var.a != null) {
                nl0.c("Expected textInputModifierNode to be null");
            }
            b8Var.a = bu0Var;
        }
        bu0Var.t = this.b;
        bu0Var.u = this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.a + ", legacyTextFieldState=" + this.b + ", textFieldSelectionManager=" + this.c + ')';
    }
}
