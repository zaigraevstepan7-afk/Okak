package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class i50 {
    public final ne1 a;
    public int b;
    public int c;
    public int d;
    public int e;

    public i50(rc rcVar, long j) {
        String str = rcVar.f;
        ne1 ne1Var = new ne1();
        ne1Var.d = str;
        ne1Var.b = -1;
        ne1Var.c = -1;
        this.a = ne1Var;
        this.b = d92.f(j);
        this.c = d92.e(j);
        this.d = -1;
        this.e = -1;
        int f = d92.f(j);
        int e = d92.e(j);
        if (f >= 0 && f <= str.length()) {
            if (e >= 0 && e <= str.length()) {
                if (f <= e) {
                    return;
                }
                se.h(l90.j("Do not set reversed range: ", f, " > ", e));
                throw null;
            }
            se.r(l90.q("end (", e, ") offset is outside of text region "), str.length());
            throw null;
        }
        se.r(l90.q("start (", f, ") offset is outside of text region "), str.length());
        throw null;
    }

    public final void a(int i, int i2) {
        long a = fr1.a(i, i2);
        this.a.k(i, i2, "");
        long c0 = lo.c0(fr1.a(this.b, this.c), a);
        h(d92.f(c0));
        g(d92.e(c0));
        int i3 = this.d;
        if (i3 != -1) {
            long c02 = lo.c0(fr1.a(i3, this.e), a);
            if (d92.c(c02)) {
                this.d = -1;
                this.e = -1;
            } else {
                this.d = d92.f(c02);
                this.e = d92.e(c02);
            }
        }
    }

    public final char b(int i) {
        ne1 ne1Var = this.a;
        gf0 gf0Var = (gf0) ne1Var.e;
        if (gf0Var == null) {
            return ((String) ne1Var.d).charAt(i);
        }
        if (i < ne1Var.b) {
            return ((String) ne1Var.d).charAt(i);
        }
        int b = gf0Var.b - gf0Var.b();
        int i2 = ne1Var.b;
        if (i < b + i2) {
            int i3 = i - i2;
            int i4 = gf0Var.c;
            char[] cArr = (char[]) gf0Var.e;
            if (i3 < i4) {
                return cArr[i3];
            }
            return cArr[(i3 - i4) + gf0Var.d];
        }
        return ((String) ne1Var.d).charAt(i - ((b - ne1Var.c) + i2));
    }

    public final d92 c() {
        int i = this.d;
        if (i != -1) {
            return new d92(fr1.a(i, this.e));
        }
        return null;
    }

    public final void d(int i, int i2, String str) {
        ne1 ne1Var = this.a;
        if (i >= 0 && i <= ne1Var.b()) {
            if (i2 >= 0 && i2 <= ne1Var.b()) {
                if (i <= i2) {
                    ne1Var.k(i, i2, str);
                    h(str.length() + i);
                    g(str.length() + i);
                    this.d = -1;
                    this.e = -1;
                    return;
                }
                se.h(l90.j("Do not set reversed range: ", i, " > ", i2));
                return;
            }
            se.r(l90.q("end (", i2, ") offset is outside of text region "), ne1Var.b());
            return;
        }
        se.r(l90.q("start (", i, ") offset is outside of text region "), ne1Var.b());
    }

    public final void e(int i, int i2) {
        ne1 ne1Var = this.a;
        if (i >= 0 && i <= ne1Var.b()) {
            if (i2 >= 0 && i2 <= ne1Var.b()) {
                if (i < i2) {
                    this.d = i;
                    this.e = i2;
                    return;
                } else {
                    se.h(l90.j("Do not set reversed or empty range: ", i, " > ", i2));
                    return;
                }
            }
            se.r(l90.q("end (", i2, ") offset is outside of text region "), ne1Var.b());
            return;
        }
        se.r(l90.q("start (", i, ") offset is outside of text region "), ne1Var.b());
    }

    public final void f(int i, int i2) {
        ne1 ne1Var = this.a;
        if (i >= 0 && i <= ne1Var.b()) {
            if (i2 >= 0 && i2 <= ne1Var.b()) {
                if (i <= i2) {
                    h(i);
                    g(i2);
                    return;
                } else {
                    se.h(l90.j("Do not set reversed range: ", i, " > ", i2));
                    return;
                }
            }
            se.r(l90.q("end (", i2, ") offset is outside of text region "), ne1Var.b());
            return;
        }
        se.r(l90.q("start (", i, ") offset is outside of text region "), ne1Var.b());
    }

    public final void g(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ll0.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    public final void h(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ll0.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    public final String toString() {
        return this.a.toString();
    }
}
