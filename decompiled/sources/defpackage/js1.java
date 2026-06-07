package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ljs1;", "Li21;", "Lts1;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class js1 extends i21 {
    public final us1 a;
    public final sb1 b;
    public final boolean c;
    public final boolean d;
    public final r31 e;

    public js1(us1 us1Var, sb1 sb1Var, boolean z, boolean z2, r31 r31Var) {
        this.a = us1Var;
        this.b = sb1Var;
        this.c = z;
        this.d = z2;
        this.e = r31Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof js1) {
                js1 js1Var = (js1) obj;
                if (!sn0.r(this.a, js1Var.a) || this.b != js1Var.b || this.c != js1Var.c || this.d != js1Var.d || !sn0.r(this.e, js1Var.e)) {
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
        return new ts1(null, null, null, this.e, this.b, this.a, this.c, this.d);
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        ((ts1) d21Var).g1(null, null, null, this.e, this.b, this.a, this.c, this.d);
    }

    public final int hashCode() {
        int i;
        int a = mb2.a(mb2.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 961, 31, this.c), 961, this.d);
        r31 r31Var = this.e;
        if (r31Var != null) {
            i = r31Var.hashCode();
        } else {
            i = 0;
        }
        return (a + i) * 31;
    }
}
