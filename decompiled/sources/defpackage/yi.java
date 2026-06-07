package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lyi;", "Li21;", "Lxi;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final /* data */ class yi extends i21 {
    public final float a;
    public final i12 b;
    public final kw1 c;

    public yi(float f, i12 i12Var, kw1 kw1Var) {
        this.a = f;
        this.b = i12Var;
        this.c = kw1Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yi) {
                yi yiVar = (yi) obj;
                if (!f20.b(this.a, yiVar.a) || !this.b.equals(yiVar.b) || !sn0.r(this.c, yiVar.c)) {
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
        return new xi(this.a, this.b, this.c);
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        xi xiVar = (xi) d21Var;
        float f = xiVar.v;
        cl clVar = xiVar.y;
        float f2 = this.a;
        if (!f20.b(f, f2)) {
            xiVar.v = f2;
            clVar.L0();
        }
        i12 i12Var = xiVar.w;
        i12 i12Var2 = this.b;
        if (!sn0.r(i12Var, i12Var2)) {
            xiVar.w = i12Var2;
            clVar.L0();
        }
        kw1 kw1Var = xiVar.x;
        kw1 kw1Var2 = this.c;
        if (!sn0.r(kw1Var, kw1Var2)) {
            xiVar.x = kw1Var2;
            clVar.L0();
            xp1.m(xiVar);
        }
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) f20.c(this.a)) + ", brush=" + this.b + ", shape=" + this.c + ')';
    }
}
