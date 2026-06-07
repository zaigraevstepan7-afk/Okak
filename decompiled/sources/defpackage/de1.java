package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class de1 implements nc {
    public final int a;
    public final int b;
    public final long c;
    public final m82 d;
    public final rg1 e;
    public final jv0 f;
    public final int g;
    public final int h;
    public final b92 i;

    public de1(int i, int i2, long j, m82 m82Var, rg1 rg1Var, jv0 jv0Var, int i3, int i4, b92 b92Var) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = m82Var;
        this.e = rg1Var;
        this.f = jv0Var;
        this.g = i3;
        this.h = i4;
        this.i = b92Var;
        if (!n92.a(j, n92.c) && n92.c(j) < 0.0f) {
            ll0.b("lineHeight can't be negative (" + n92.c(j) + ')');
        }
    }

    public final de1 a(de1 de1Var) {
        if (de1Var == null) {
            return this;
        }
        return ee1.a(this, de1Var.a, de1Var.b, de1Var.c, de1Var.d, de1Var.e, de1Var.f, de1Var.g, de1Var.h, de1Var.i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof de1) {
                de1 de1Var = (de1) obj;
                if (this.a == de1Var.a && this.b == de1Var.b && n92.a(this.c, de1Var.c) && sn0.r(this.d, de1Var.d) && sn0.r(this.e, de1Var.e) && sn0.r(this.f, de1Var.f) && this.g == de1Var.g && this.h == de1Var.h && sn0.r(this.i, de1Var.i)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int b = l90.b(this.b, Integer.hashCode(this.a) * 31, 31);
        o92[] o92VarArr = n92.b;
        int e = l90.e(this.c, b, 31);
        int i4 = 0;
        m82 m82Var = this.d;
        if (m82Var != null) {
            i = m82Var.hashCode();
        } else {
            i = 0;
        }
        int i5 = (e + i) * 31;
        rg1 rg1Var = this.e;
        if (rg1Var != null) {
            i2 = rg1Var.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        jv0 jv0Var = this.f;
        if (jv0Var != null) {
            i3 = jv0Var.hashCode();
        } else {
            i3 = 0;
        }
        int b2 = l90.b(this.h, l90.b(this.g, (i6 + i3) * 31, 31), 31);
        b92 b92Var = this.i;
        if (b92Var != null) {
            i4 = b92Var.hashCode();
        }
        return b2 + i4;
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) b62.a(this.a)) + ", textDirection=" + ((Object) a72.a(this.b)) + ", lineHeight=" + ((Object) n92.d(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) ev0.a(this.g)) + ", hyphens=" + ((Object) xi0.a(this.h)) + ", textMotion=" + this.i + ')';
    }
}
