package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lpu;", "Li21;", "Lsu;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final /* data */ class pu extends i21 {
    public final db2 a;
    public final i82 b;
    public final gu0 c;
    public final boolean d;
    public final boolean e;
    public final c91 f;
    public final b82 g;
    public final nj0 h;
    public final oc0 i;

    public pu(db2 db2Var, i82 i82Var, gu0 gu0Var, boolean z, boolean z2, c91 c91Var, b82 b82Var, nj0 nj0Var, oc0 oc0Var) {
        this.a = db2Var;
        this.b = i82Var;
        this.c = gu0Var;
        this.d = z;
        this.e = z2;
        this.f = c91Var;
        this.g = b82Var;
        this.h = nj0Var;
        this.i = oc0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pu) {
                pu puVar = (pu) obj;
                if (this.a.equals(puVar.a) && this.b.equals(puVar.b) && this.c == puVar.c && this.d == puVar.d && this.e == puVar.e && sn0.r(this.f, puVar.f) && this.g == puVar.g && sn0.r(this.h, puVar.h) && sn0.r(this.i, puVar.i)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [su, d21, rz] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? rzVar = new rz();
        rzVar.u = this.a;
        rzVar.v = this.b;
        rzVar.w = this.c;
        rzVar.x = this.d;
        rzVar.y = this.e;
        rzVar.z = this.f;
        b82 b82Var = this.g;
        rzVar.A = b82Var;
        rzVar.B = this.h;
        rzVar.C = this.i;
        b82Var.f = new qu(rzVar, 4);
        return rzVar;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        boolean z;
        su suVar = (su) d21Var;
        boolean z2 = suVar.y;
        int i = 0;
        boolean z3 = true;
        if (z2 && !suVar.x) {
            z = true;
        } else {
            z = false;
        }
        nj0 nj0Var = suVar.B;
        b82 b82Var = suVar.A;
        boolean z4 = this.d;
        boolean z5 = this.e;
        if (!z5 || z4) {
            z3 = false;
        }
        suVar.u = this.a;
        i82 i82Var = this.b;
        suVar.v = i82Var;
        suVar.w = this.c;
        suVar.x = z4;
        suVar.y = z5;
        suVar.z = this.f;
        b82 b82Var2 = this.g;
        suVar.A = b82Var2;
        nj0 nj0Var2 = this.h;
        suVar.B = nj0Var2;
        suVar.C = this.i;
        if (z5 != z2 || z3 != z || !sn0.r(nj0Var2, nj0Var) || !d92.c(i82Var.b)) {
            xp1.m(suVar);
        }
        if (b82Var2 != b82Var) {
            b82Var2.f = new qu(suVar, i);
        }
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + mb2.a(mb2.a(mb2.a((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, false)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.a + ", value=" + this.b + ", state=" + this.c + ", readOnly=" + this.d + ", enabled=" + this.e + ", isPassword=false, offsetMapping=" + this.f + ", manager=" + this.g + ", imeOptions=" + this.h + ", focusRequester=" + this.i + ')';
    }
}
