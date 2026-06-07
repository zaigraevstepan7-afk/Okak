package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lhn;", "Li21;", "Lkn;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class hn extends i21 {
    public final r31 a;
    public final dk0 b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final ap1 f;
    public final de0 g;

    public hn(r31 r31Var, dk0 dk0Var, boolean z, boolean z2, String str, ap1 ap1Var, de0 de0Var) {
        this.a = r31Var;
        this.b = dk0Var;
        this.c = z;
        this.d = z2;
        this.e = str;
        this.f = ap1Var;
        this.g = de0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && hn.class == obj.getClass()) {
                hn hnVar = (hn) obj;
                if (!sn0.r(this.a, hnVar.a) || !sn0.r(this.b, hnVar.b) || this.c != hnVar.c || this.d != hnVar.d || !sn0.r(this.e, hnVar.e) || !sn0.r(this.f, hnVar.f) || this.g != hnVar.g) {
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
        return new kn(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        ((kn) d21Var).U0(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        r31 r31Var = this.a;
        if (r31Var != null) {
            i = r31Var.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        dk0 dk0Var = this.b;
        if (dk0Var != null) {
            i2 = dk0Var.hashCode();
        } else {
            i2 = 0;
        }
        int a = mb2.a(mb2.a((i5 + i2) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (a + i3) * 31;
        ap1 ap1Var = this.f;
        if (ap1Var != null) {
            i4 = Integer.hashCode(ap1Var.a);
        }
        return this.g.hashCode() + ((i6 + i4) * 31);
    }
}
