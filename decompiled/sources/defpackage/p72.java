package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class p72 {
    public final rc a;
    public final long b;
    public final w82 c;
    public final c91 d;
    public final c92 e;
    public long f;
    public final rc g;
    public final i82 h;
    public final x82 i;

    public p72(i82 i82Var, c91 c91Var, x82 x82Var, c92 c92Var) {
        w82 w82Var;
        rc rcVar = i82Var.a;
        long j = i82Var.b;
        if (x82Var != null) {
            w82Var = x82Var.a;
        } else {
            w82Var = null;
        }
        this.a = rcVar;
        this.b = j;
        this.c = w82Var;
        this.d = c91Var;
        this.e = c92Var;
        this.f = j;
        this.g = rcVar;
        this.h = i82Var;
        this.i = x82Var;
    }

    public final List a(oe0 oe0Var) {
        if (d92.c(this.f)) {
            h50 h50Var = (h50) oe0Var.invoke(this);
            if (h50Var != null) {
                return xn.E(h50Var);
            }
            return null;
        }
        return xn.F(new dp("", 0), new sv1(d92.f(this.f), d92.f(this.f)));
    }

    public final Integer b() {
        w82 w82Var = this.c;
        if (w82Var != null) {
            g31 g31Var = w82Var.b;
            int e = d92.e(this.f);
            c91 c91Var = this.d;
            return Integer.valueOf(c91Var.c(g31Var.c(g31Var.d(c91Var.d(e)), true)));
        }
        return null;
    }

    public final Integer c() {
        w82 w82Var = this.c;
        if (w82Var != null) {
            int f = d92.f(this.f);
            c91 c91Var = this.d;
            return Integer.valueOf(c91Var.c(w82Var.f(w82Var.b.d(c91Var.d(f)))));
        }
        return null;
    }

    public final Integer d() {
        int length;
        w82 w82Var = this.c;
        if (w82Var != null) {
            int r = r();
            while (true) {
                rc rcVar = this.a;
                if (r >= rcVar.f.length()) {
                    length = rcVar.f.length();
                    break;
                }
                int length2 = this.g.f.length() - 1;
                if (r <= length2) {
                    length2 = r;
                }
                long i = w82Var.i(length2);
                int i2 = d92.c;
                int i3 = (int) (i & 4294967295L);
                if (i3 <= r) {
                    r++;
                } else {
                    length = this.d.c(i3);
                    break;
                }
            }
            return Integer.valueOf(length);
        }
        return null;
    }

    public final Integer e() {
        int i;
        w82 w82Var = this.c;
        if (w82Var != null) {
            int r = r();
            while (true) {
                if (r <= 0) {
                    i = 0;
                    break;
                }
                int length = this.g.f.length() - 1;
                if (r <= length) {
                    length = r;
                }
                long i2 = w82Var.i(length);
                int i3 = d92.c;
                int i4 = (int) (i2 >> 32);
                if (i4 >= r) {
                    r--;
                } else {
                    i = this.d.c(i4);
                    break;
                }
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    public final boolean f() {
        um1 um1Var;
        w82 w82Var = this.c;
        if (w82Var != null) {
            um1Var = w82Var.g(r());
        } else {
            um1Var = null;
        }
        if (um1Var != um1.f) {
            return true;
        }
        return false;
    }

    public final int g(w82 w82Var, int i) {
        int r = r();
        c92 c92Var = this.e;
        if (c92Var.a == null) {
            c92Var.a = Float.valueOf(w82Var.c(r).a);
        }
        g31 g31Var = w82Var.b;
        int d = g31Var.d(r) + i;
        if (d < 0) {
            return 0;
        }
        if (d >= g31Var.f) {
            return this.g.f.length();
        }
        float b = g31Var.b(d) - 1.0f;
        Float f = c92Var.a;
        f.getClass();
        float floatValue = f.floatValue();
        if ((f() && floatValue >= w82Var.e(d)) || (!f() && floatValue <= w82Var.d(d))) {
            return g31Var.c(d, true);
        }
        return this.d.c(g31Var.g((Float.floatToRawIntBits(b) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r9 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(defpackage.x82 r9, int r10) {
        /*
            r8 = this;
            iq0 r0 = r9.b
            w82 r1 = r9.a
            if (r0 == 0) goto L13
            iq0 r9 = r9.c
            if (r9 == 0) goto L10
            r2 = 1
            pl1 r9 = r9.O(r0, r2)
            goto L11
        L10:
            r9 = 0
        L11:
            if (r9 != 0) goto L15
        L13:
            pl1 r9 = defpackage.pl1.e
        L15:
            i82 r0 = r8.h
            long r2 = r0.b
            int r0 = defpackage.d92.c
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r0 = (int) r2
            c91 r8 = r8.d
            int r0 = r8.d(r0)
            pl1 r0 = r1.c(r0)
            float r2 = r0.a
            float r0 = r0.b
            long r6 = r9.c()
            long r6 = r6 & r4
            int r9 = (int) r6
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r10 = (float) r10
            float r9 = r9 * r10
            float r9 = r9 + r0
            int r10 = java.lang.Float.floatToRawIntBits(r2)
            long r2 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            r0 = 32
            long r2 = r2 << r0
            long r9 = r9 & r4
            long r9 = r9 | r2
            g31 r0 = r1.b
            int r9 = r0.g(r9)
            int r8 = r8.c(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p72.h(x82, int):int");
    }

    public final void i() {
        c92 c92Var = this.e;
        c92Var.a = null;
        rc rcVar = this.g;
        if (rcVar.f.length() > 0) {
            if (f()) {
                k();
                return;
            }
            c92Var.a = null;
            if (rcVar.f.length() > 0) {
                String str = rcVar.f;
                long j = this.f;
                int i = d92.c;
                int h = rp1.h((int) (j & 4294967295L), str);
                if (h != -1) {
                    q(h, h);
                }
            }
        }
    }

    public final void j() {
        this.e.a = null;
        rc rcVar = this.g;
        String str = rcVar.f;
        String str2 = rcVar.f;
        if (str.length() > 0) {
            int l = pp1.l(str2, d92.e(this.f));
            if (l == d92.e(this.f) && l != str2.length()) {
                l = pp1.l(str2, l + 1);
            }
            q(l, l);
        }
    }

    public final void k() {
        this.e.a = null;
        rc rcVar = this.g;
        if (rcVar.f.length() > 0) {
            String str = rcVar.f;
            long j = this.f;
            int i = d92.c;
            int i2 = rp1.i((int) (j & 4294967295L), str);
            if (i2 != -1) {
                q(i2, i2);
            }
        }
    }

    public final void l() {
        this.e.a = null;
        rc rcVar = this.g;
        String str = rcVar.f;
        String str2 = rcVar.f;
        if (str.length() > 0) {
            int m = pp1.m(str2, d92.f(this.f));
            if (m == d92.f(this.f) && m != 0) {
                m = pp1.m(str2, m - 1);
            }
            q(m, m);
        }
    }

    public final void m() {
        c92 c92Var = this.e;
        c92Var.a = null;
        rc rcVar = this.g;
        if (rcVar.f.length() > 0) {
            if (f()) {
                c92Var.a = null;
                if (rcVar.f.length() > 0) {
                    String str = rcVar.f;
                    long j = this.f;
                    int i = d92.c;
                    int h = rp1.h((int) (j & 4294967295L), str);
                    if (h != -1) {
                        q(h, h);
                        return;
                    }
                    return;
                }
                return;
            }
            k();
        }
    }

    public final void n() {
        Integer b;
        this.e.a = null;
        if (this.g.f.length() > 0 && (b = b()) != null) {
            int intValue = b.intValue();
            q(intValue, intValue);
        }
    }

    public final void o() {
        Integer c;
        this.e.a = null;
        if (this.g.f.length() > 0 && (c = c()) != null) {
            int intValue = c.intValue();
            q(intValue, intValue);
        }
    }

    public final void p() {
        if (this.g.f.length() > 0) {
            int i = d92.c;
            this.f = fr1.a((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void q(int i, int i2) {
        this.f = fr1.a(i, i2);
    }

    public final int r() {
        long j = this.f;
        int i = d92.c;
        return this.d.d((int) (j & 4294967295L));
    }
}
