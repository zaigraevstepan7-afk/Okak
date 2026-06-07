package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lia2;", "Li21;", "Lja2;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class ia2 extends i21 {
    public final boolean a;
    public final r31 b;
    public final boolean c;
    public final ap1 d;
    public final oe0 e;

    public ia2(boolean z, r31 r31Var, boolean z2, ap1 ap1Var, oe0 oe0Var) {
        this.a = z;
        this.b = r31Var;
        this.c = z2;
        this.d = ap1Var;
        this.e = oe0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ia2.class == obj.getClass()) {
                ia2 ia2Var = (ia2) obj;
                if (this.a != ia2Var.a || !sn0.r(this.b, ia2Var.b) || this.c != ia2Var.c || !this.d.equals(ia2Var.d) || this.e != ia2Var.e) {
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
        return new ja2(this.a, this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        ja2 ja2Var = (ja2) d21Var;
        boolean z = ja2Var.Q;
        boolean z2 = this.a;
        if (z != z2) {
            ja2Var.Q = z2;
            xp1.m(ja2Var);
        }
        ja2Var.R = this.e;
        ja2Var.U0(this.b, null, false, this.c, null, this.d, ja2Var.S);
    }

    public final int hashCode() {
        int i;
        int hashCode = Boolean.hashCode(this.a) * 31;
        r31 r31Var = this.b;
        if (r31Var != null) {
            i = r31Var.hashCode();
        } else {
            i = 0;
        }
        return this.e.hashCode() + l90.b(this.d.a, mb2.a(mb2.a((hashCode + i) * 961, 31, false), 31, this.c), 31);
    }
}
