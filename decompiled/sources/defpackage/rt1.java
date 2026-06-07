package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lrt1;", "Li21;", "Ltt1;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class rt1 extends i21 {
    public final boolean a;
    public final r31 b;
    public final dk0 c;
    public final de0 d;

    public rt1(boolean z, r31 r31Var, dk0 dk0Var, de0 de0Var) {
        this.a = z;
        this.b = r31Var;
        this.c = dk0Var;
        this.d = de0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && rt1.class == obj.getClass()) {
                rt1 rt1Var = (rt1) obj;
                if (this.a != rt1Var.a || !sn0.r(this.b, rt1Var.b) || !sn0.r(this.c, rt1Var.c) || this.d != rt1Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [tt1, d21, kn] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? knVar = new kn(this.b, this.c, false, true, null, null, this.d);
        knVar.Q = this.a;
        return knVar;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        tt1 tt1Var = (tt1) d21Var;
        boolean z = tt1Var.Q;
        boolean z2 = this.a;
        if (z != z2) {
            tt1Var.Q = z2;
            xp1.m(tt1Var);
        }
        tt1Var.U0(this.b, this.c, false, true, null, null, this.d);
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = Boolean.hashCode(this.a) * 31;
        r31 r31Var = this.b;
        if (r31Var != null) {
            i = r31Var.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        dk0 dk0Var = this.c;
        if (dk0Var != null) {
            i2 = dk0Var.hashCode();
        } else {
            i2 = 0;
        }
        return this.d.hashCode() + mb2.a(mb2.a((i3 + i2) * 31, 31, false), 961, true);
    }
}
