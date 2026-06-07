package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls60;", "Li21;", "Lb70;", "animation"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class s60 extends i21 {
    public final lb2 a;
    public final hb2 b;
    public final hb2 c;
    public final hb2 d;
    public final c70 e;
    public final u70 f;
    public final de0 g;
    public final t60 h;

    public s60(lb2 lb2Var, hb2 hb2Var, hb2 hb2Var2, hb2 hb2Var3, c70 c70Var, u70 u70Var, de0 de0Var, t60 t60Var) {
        this.a = lb2Var;
        this.b = hb2Var;
        this.c = hb2Var2;
        this.d = hb2Var3;
        this.e = c70Var;
        this.f = u70Var;
        this.g = de0Var;
        this.h = t60Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s60) {
            s60 s60Var = (s60) obj;
            if (s60Var.a == this.a && sn0.r(s60Var.b, this.b) && sn0.r(s60Var.c, this.c) && sn0.r(s60Var.d, this.d) && s60Var.e.equals(this.e) && sn0.r(s60Var.f, this.f) && s60Var.g == this.g && sn0.r(s60Var.h, this.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.i21
    public final d21 f() {
        return new b70(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        b70 b70Var = (b70) d21Var;
        b70Var.s = this.a;
        b70Var.t = this.b;
        b70Var.u = this.c;
        b70Var.v = this.d;
        b70Var.w = this.e;
        b70Var.x = this.f;
        b70Var.y = this.g;
        b70Var.z = this.h;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = this.a.hashCode() * 31;
        int i3 = 0;
        hb2 hb2Var = this.b;
        if (hb2Var != null) {
            i = hb2Var.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        hb2 hb2Var2 = this.c;
        if (hb2Var2 != null) {
            i2 = hb2Var2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        hb2 hb2Var3 = this.d;
        if (hb2Var3 != null) {
            i3 = hb2Var3.hashCode();
        }
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.a.hashCode() + ((this.e.a.hashCode() + ((i5 + i3) * 31)) * 31)) * 31)) * 31);
    }
}
