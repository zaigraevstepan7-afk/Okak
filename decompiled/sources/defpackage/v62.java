package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lv62;", "Li21;", "Lw62;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class v62 extends i21 {
    public final h12 a;
    public final dx b;
    public final w72 c;
    public final zt d;

    public v62(h12 h12Var, dx dxVar, w72 w72Var, zt ztVar) {
        this.a = h12Var;
        this.b = dxVar;
        this.c = w72Var;
        this.d = ztVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof v62) {
                v62 v62Var = (v62) obj;
                if (this.a != v62Var.a || this.b != v62Var.b || this.c != v62Var.c || this.d != v62Var.d) {
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
        return new w62(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        ma2 ma2Var;
        w62 w62Var = (w62) d21Var;
        w62Var.u.f = null;
        h12 h12Var = this.a;
        w62Var.u = h12Var;
        h12Var.f = w62Var;
        if (w62Var.r) {
            ma2Var = ma2.g;
        } else {
            ma2Var = ma2.f;
        }
        h12Var.g = ma2Var;
        w62Var.v = this.b;
        w62Var.w = this.c;
        w62Var.x = this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
