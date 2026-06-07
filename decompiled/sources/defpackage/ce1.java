package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ce1 {
    public String a;
    public k92 b;
    public cd0 c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public c00 i;
    public i8 j;
    public boolean k;
    public d11 m;
    public be1 n;
    public jq0 o;
    public long s;
    public long h = ol0.a;
    public long l = 0;
    public long p = vs.h(0, 0, 0, 0);
    public int q = -1;
    public int r = -1;

    public ce1(String str, k92 k92Var, cd0 cd0Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = k92Var;
        this.c = cd0Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public static long f(ce1 ce1Var, long j, jq0 jq0Var) {
        k92 k92Var = ce1Var.b;
        d11 d11Var = ce1Var.m;
        c00 c00Var = ce1Var.i;
        c00Var.getClass();
        cd0 cd0Var = ce1Var.c;
        if ((d11Var == null || jq0Var != d11Var.a || !op1.p(k92Var, jq0Var).equals(d11Var.b) || c00Var.a() != d11Var.c.e || cd0Var != d11Var.d) && ((d11Var = d11.h) == null || jq0Var != d11Var.a || !op1.p(k92Var, jq0Var).equals(d11Var.b) || c00Var.a() != d11Var.c.e || cd0Var != d11Var.d)) {
            d11Var = new d11(jq0Var, op1.p(k92Var, jq0Var), new d00(c00Var.a(), c00Var.P()), cd0Var);
            d11.h = d11Var;
        }
        ce1Var.m = d11Var;
        int i = ce1Var.g;
        d00 d00Var = d11Var.c;
        float f = d11Var.g;
        float f2 = d11Var.f;
        int i2 = 0;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            float b = fp.j(e11.a, d11Var.e, vs.b(0, 0, 15), d00Var, d11Var.d, 1, 96).b();
            float b2 = fp.j(e11.b, d11Var.e, vs.b(0, 0, 15), d00Var, d11Var.d, 2, 96).b() - b;
            d11Var.g = b;
            d11Var.f = b2;
            f2 = b2;
            f = b;
        }
        if (i != 1) {
            int round = Math.round((f2 * (i - 1)) + f);
            if (round >= 0) {
                i2 = round;
            }
            int g = us.g(j);
            if (i2 > g) {
                i2 = g;
            }
        } else {
            i2 = us.i(j);
        }
        return vs.a(us.j(j), us.h(j), i2, us.g(j));
    }

    public final int a(int i, jq0 jq0Var) {
        int i2;
        int i3 = this.q;
        int i4 = this.r;
        if (i == i3 && i3 != -1) {
            return i4;
        }
        long a = vs.a(0, i, 0, Integer.MAX_VALUE);
        if (this.g > 1) {
            a = f(this, a, jq0Var);
        }
        be1 e = e(jq0Var);
        long z = go.z(a, this.e, this.d, e.c());
        boolean z2 = this.e;
        int i5 = this.d;
        int i6 = this.f;
        if ((!z2 && (i5 == 2 || i5 == 4 || i5 == 5)) || i6 < 1) {
            i2 = 1;
        } else {
            i2 = i6;
        }
        int h = xq1.h(new i8((m8) e, i2, i5, z).b());
        int i7 = us.i(a);
        if (h < i7) {
            h = i7;
        }
        this.q = i;
        this.r = h;
        return h;
    }

    public final boolean b(long j, jq0 jq0Var) {
        long j2;
        int i;
        be1 be1Var;
        this.s = (this.s << 2) | 3;
        boolean z = true;
        if (this.g > 1) {
            j2 = f(this, j, jq0Var);
        } else {
            j2 = j;
        }
        i8 i8Var = this.j;
        boolean z2 = false;
        if (i8Var != null && (be1Var = this.n) != null && !be1Var.a() && jq0Var == this.o && (us.b(j2, this.p) || (us.h(j2) == us.h(this.p) && us.j(j2) == us.j(this.p) && us.g(j2) >= i8Var.b() && !i8Var.d.d))) {
            if (!us.b(j2, this.p)) {
                i8 i8Var2 = this.j;
                i8Var2.getClass();
                this.l = vs.d(j2, (xq1.h(Math.min(i8Var2.a.i.c(), i8Var2.d())) << 32) | (xq1.h(i8Var2.b()) & 4294967295L));
                if (this.d == 3 || (((int) (r12 >> 32)) >= i8Var2.d() && ((int) (4294967295L & r12)) >= i8Var2.b())) {
                    z = false;
                }
                this.k = z;
                this.p = j2;
            }
            return false;
        }
        be1 e = e(jq0Var);
        long z3 = go.z(j2, this.e, this.d, e.c());
        boolean z4 = this.e;
        int i2 = this.d;
        int i3 = this.f;
        if ((!z4 && (i2 == 2 || i2 == 4 || i2 == 5)) || i3 < 1) {
            i = 1;
        } else {
            i = i3;
        }
        i8 i8Var3 = new i8((m8) e, i, i2, z3);
        this.p = j2;
        this.l = vs.d(j2, (xq1.h(i8Var3.b()) & 4294967295L) | (xq1.h(i8Var3.d()) << 32));
        if (this.d != 3 && (((int) (r1 >> 32)) < i8Var3.d() || ((int) (r1 & 4294967295L)) < i8Var3.b())) {
            z2 = true;
        }
        this.k = z2;
        this.j = i8Var3;
        return true;
    }

    public final void c() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = vs.h(0, 0, 0, 0);
        this.l = 0L;
        this.k = false;
    }

    public final void d(c00 c00Var) {
        long j;
        c00 c00Var2 = this.i;
        if (c00Var != null) {
            int i = ol0.b;
            j = ol0.a(c00Var.a(), c00Var.P());
        } else {
            j = ol0.a;
        }
        if (c00Var2 == null) {
            this.i = c00Var;
            this.h = j;
        } else {
            if (c00Var != null && this.h == j) {
                return;
            }
            this.i = c00Var;
            this.h = j;
            this.s = (this.s << 2) | 1;
            c();
        }
    }

    public final be1 e(jq0 jq0Var) {
        be1 be1Var = this.n;
        if (be1Var == null || jq0Var != this.o || be1Var.a()) {
            this.o = jq0Var;
            String str = this.a;
            k92 p = op1.p(this.b, jq0Var);
            c00 c00Var = this.i;
            c00Var.getClass();
            cd0 cd0Var = this.c;
            l60 l60Var = l60.e;
            be1Var = new m8(str, p, l60Var, l60Var, cd0Var, c00Var);
        }
        this.n = be1Var;
        return be1Var;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        if (this.j != null) {
            str = "<paragraph>";
        } else {
            str = AbstractJsonLexerKt.NULL;
        }
        sb.append(str);
        sb.append(", lastDensity=");
        sb.append((Object) ol0.b(this.h));
        sb.append(", history=");
        sb.append(this.s);
        sb.append(", constraints=$)");
        return sb.toString();
    }
}
