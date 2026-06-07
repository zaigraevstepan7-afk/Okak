package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lu3;", "T", "Li21;", "Lh4;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class u3<T> extends i21 {
    public final n4 a;
    public final sb1 b;
    public final boolean c;
    public final Boolean d;
    public final v11 e;

    public u3(n4 n4Var, sb1 sb1Var, boolean z, Boolean bool, v11 v11Var) {
        this.a = n4Var;
        this.b = sb1Var;
        this.c = z;
        this.d = bool;
        this.e = v11Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u3) {
                u3 u3Var = (u3) obj;
                if (!sn0.r(this.a, u3Var.a) || this.b != u3Var.b || this.c != u3Var.c || !sn0.r(this.d, u3Var.d) || !sn0.r(this.e, u3Var.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d21, m30, h4] */
    @Override // defpackage.i21
    public final d21 f() {
        p1 p1Var = mp0.a;
        boolean z = this.c;
        sb1 sb1Var = this.b;
        ?? m30Var = new m30(p1Var, z, null, sb1Var);
        m30Var.M = this.a;
        m30Var.N = sb1Var;
        m30Var.O = this.d;
        m30Var.P = this.e;
        return m30Var;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        boolean z;
        boolean z2;
        h4 h4Var = (h4) d21Var;
        v11 v11Var = this.e;
        h4Var.P = v11Var;
        n4 n4Var = h4Var.M;
        n4 n4Var2 = this.a;
        if (!sn0.r(n4Var, n4Var2)) {
            h4Var.M = n4Var2;
            h4Var.i1(v11Var);
            z = true;
        } else {
            z = false;
        }
        sb1 sb1Var = h4Var.N;
        sb1 sb1Var2 = this.b;
        if (sb1Var != sb1Var2) {
            h4Var.N = sb1Var2;
            z = true;
        }
        Boolean bool = h4Var.O;
        Boolean bool2 = this.d;
        if (!sn0.r(bool, bool2)) {
            h4Var.O = bool2;
            z2 = true;
        } else {
            z2 = z;
        }
        h4Var.f1(h4Var.v, this.c, null, sb1Var2, z2);
    }

    public final int hashCode() {
        int i;
        int a = mb2.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        int i2 = 0;
        Boolean bool = this.d;
        if (bool != null) {
            i = bool.hashCode();
        } else {
            i = 0;
        }
        int i3 = (a + i) * 923521;
        v11 v11Var = this.e;
        if (v11Var != null) {
            i2 = v11Var.hashCode();
        }
        return i3 + i2;
    }
}
