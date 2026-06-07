package defpackage;

import android.content.Context;
import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import com.elixir.loader.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class nq1 {
    public static ij0 a;
    public static ij0 b;
    public static ij0 c;

    public static final ru1 a(ar0 ar0Var, boolean z) {
        d21 d21Var = ar0Var.J.f;
        qz qzVar = null;
        if ((d21Var.h & 8) != 0) {
            loop0: while (true) {
                if (d21Var == null) {
                    break;
                }
                if ((d21Var.g & 8) != 0) {
                    d21 d21Var2 = d21Var;
                    q41 q41Var = null;
                    while (d21Var2 != null) {
                        if (d21Var2 instanceof pu1) {
                            qzVar = d21Var2;
                            break loop0;
                        }
                        if ((d21Var2.g & 8) != 0 && (d21Var2 instanceof rz)) {
                            int i = 0;
                            for (d21 d21Var3 = ((rz) d21Var2).t; d21Var3 != null; d21Var3 = d21Var3.j) {
                                if ((d21Var3.g & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        d21Var2 = d21Var3;
                                    } else {
                                        if (q41Var == null) {
                                            q41Var = new q41(new d21[16]);
                                        }
                                        if (d21Var2 != null) {
                                            q41Var.b(d21Var2);
                                            d21Var2 = null;
                                        }
                                        q41Var.b(d21Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        d21Var2 = hp.l(q41Var);
                    }
                }
                if ((d21Var.h & 8) == 0) {
                    break;
                }
                d21Var = d21Var.j;
            }
        }
        qzVar.getClass();
        d21 d21Var4 = ((d21) ((pu1) qzVar)).e;
        mu1 x = ar0Var.x();
        if (x == null) {
            x = new mu1();
        }
        return new ru1(d21Var4, z, ar0Var, x);
    }

    public static final h62 b(qz qzVar) {
        s62 s62Var;
        f62 f62Var = new f62();
        fr1.t(qzVar, j62.a, new hh1(new hh1(f62Var, 18), new k(1, f62Var, f62.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 6)));
        b41 b41Var = new b41();
        b41 b41Var2 = f62Var.a;
        Object[] objArr = b41Var2.a;
        int i = b41Var2.b;
        int i2 = 0;
        Object obj = null;
        int i3 = 0;
        boolean z = true;
        g62 g62Var = null;
        while (true) {
            s62Var = s62.b;
            if (i3 >= i) {
                break;
            }
            g62 g62Var2 = (g62) objArr[i3];
            if (!z || g62Var2 != s62Var) {
                if (g62Var2 != s62Var || g62Var != s62Var) {
                    if (g62Var2 != s62Var) {
                        b41 b41Var3 = f62Var.b;
                        Object[] objArr2 = b41Var3.a;
                        int i4 = b41Var3.b;
                        for (int i5 = 0; i5 < i4; i5++) {
                            if (((Boolean) ((oe0) objArr2[i5]).invoke(g62Var2)).booleanValue()) {
                            }
                        }
                    }
                    b41Var.a(g62Var2);
                    z = false;
                    g62Var = g62Var2;
                }
                z = false;
                break;
            }
            i3++;
        }
        if (!b41Var.h()) {
            obj = b41Var.a[b41Var.b - 1];
        }
        if (((g62) obj) == s62Var) {
            b41Var.k(b41Var.b - 1);
        }
        z31 z31Var = b41Var.c;
        if (z31Var == null) {
            z31Var = new z31(b41Var, i2);
            b41Var.c = z31Var;
        }
        return new h62(z31Var);
    }

    public static final void c(yf0 yf0Var, le2 le2Var) {
        List list = le2Var.n;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ne2 ne2Var = (ne2) list.get(i);
            if (ne2Var instanceof pe2) {
                pe1 pe1Var = new pe1();
                pe2 pe2Var = (pe2) ne2Var;
                pe1Var.d = pe2Var.f;
                pe1Var.n = true;
                pe1Var.c();
                pe1Var.s.i(pe2Var.g);
                pe1Var.c();
                pe1Var.c();
                pe1Var.b = pe2Var.h;
                pe1Var.c();
                pe1Var.c = pe2Var.i;
                pe1Var.c();
                pe1Var.g = pe2Var.j;
                pe1Var.c();
                pe1Var.e = pe2Var.k;
                pe1Var.c();
                pe1Var.f = pe2Var.l;
                pe1Var.o = true;
                pe1Var.c();
                pe1Var.h = pe2Var.m;
                pe1Var.o = true;
                pe1Var.c();
                pe1Var.i = pe2Var.n;
                pe1Var.o = true;
                pe1Var.c();
                pe1Var.j = pe2Var.o;
                pe1Var.o = true;
                pe1Var.c();
                pe1Var.k = pe2Var.p;
                pe1Var.p = true;
                pe1Var.c();
                pe1Var.l = pe2Var.q;
                pe1Var.p = true;
                pe1Var.c();
                pe1Var.m = pe2Var.r;
                pe1Var.p = true;
                pe1Var.c();
                yf0Var.e(i, pe1Var);
            } else if (ne2Var instanceof le2) {
                yf0 yf0Var2 = new yf0();
                le2 le2Var2 = (le2) ne2Var;
                yf0Var2.k = le2Var2.e;
                yf0Var2.c();
                yf0Var2.l = le2Var2.f;
                yf0Var2.s = true;
                yf0Var2.c();
                yf0Var2.o = le2Var2.i;
                yf0Var2.s = true;
                yf0Var2.c();
                yf0Var2.p = le2Var2.j;
                yf0Var2.s = true;
                yf0Var2.c();
                yf0Var2.q = le2Var2.k;
                yf0Var2.s = true;
                yf0Var2.c();
                yf0Var2.r = le2Var2.l;
                yf0Var2.s = true;
                yf0Var2.c();
                yf0Var2.m = le2Var2.g;
                yf0Var2.s = true;
                yf0Var2.c();
                yf0Var2.n = le2Var2.h;
                yf0Var2.s = true;
                yf0Var2.c();
                yf0Var2.f = le2Var2.m;
                yf0Var2.g = true;
                yf0Var2.c();
                c(yf0Var2, le2Var2);
                yf0Var.e(i, yf0Var2);
            }
        }
    }

    public static final uu0 d(View view) {
        uu0 uu0Var;
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            if (tag instanceof uu0) {
                uu0Var = (uu0) tag;
            } else {
                uu0Var = null;
            }
            if (uu0Var != null) {
                return uu0Var;
            }
            Object k = xp1.k(view);
            if (k instanceof View) {
                view = (View) k;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static i02 e() {
        return (i02) q02.b.g();
    }

    public static final nt1 f(Object obj) {
        if (obj != fc2.k) {
            return (nt1) obj;
        }
        se.p("Does not contain segment");
        return null;
    }

    public static final String g(int i, ur urVar) {
        urVar.j(l6.a);
        return ((Context) urVar.j(l6.b)).getResources().getString(i);
    }

    public static final boolean h(Object obj) {
        if (obj == fc2.k) {
            return true;
        }
        return false;
    }

    public static final boolean i(b82 b82Var, boolean z) {
        iq0 c2;
        gu0 gu0Var = b82Var.d;
        if (gu0Var != null && (c2 = gu0Var.c()) != null) {
            pl1 L = pp1.L(c2);
            long l = b82Var.l(z);
            float f = L.a;
            float f2 = L.c;
            float intBitsToFloat = Float.intBitsToFloat((int) (l >> 32));
            if (f <= intBitsToFloat && intBitsToFloat <= f2) {
                float f3 = L.b;
                float f4 = L.d;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (l & 4294967295L));
                if (f3 <= intBitsToFloat2 && intBitsToFloat2 <= f4) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static i02 j(i02 i02Var) {
        if (i02Var instanceof rb2) {
            rb2 rb2Var = (rb2) i02Var;
            if (rb2Var.t == rp1.g()) {
                rb2Var.r = null;
                return i02Var;
            }
        }
        if (i02Var instanceof sb2) {
            sb2 sb2Var = (sb2) i02Var;
            if (sb2Var.i == rp1.g()) {
                sb2Var.h = null;
                return i02Var;
            }
        }
        i02 g = q02.g(i02Var, null, false);
        g.j();
        return g;
    }

    public static Object k(h00 h00Var, de0 de0Var) {
        n41 n41Var;
        i02 rb2Var;
        i02 i02Var = (i02) q02.b.g();
        if (i02Var instanceof rb2) {
            rb2 rb2Var2 = (rb2) i02Var;
            if (rb2Var2.t == rp1.g()) {
                oe0 oe0Var = rb2Var2.r;
                oe0 oe0Var2 = rb2Var2.s;
                try {
                    ((rb2) i02Var).r = q02.k(h00Var, oe0Var, true);
                    ((rb2) i02Var).s = oe0Var2;
                    return de0Var.invoke();
                } finally {
                    rb2Var2.r = oe0Var;
                    rb2Var2.s = oe0Var2;
                }
            }
        }
        if (i02Var != null && !(i02Var instanceof n41)) {
            rb2Var = i02Var.u(h00Var);
        } else {
            if (i02Var instanceof n41) {
                n41Var = (n41) i02Var;
            } else {
                n41Var = null;
            }
            rb2Var = new rb2(n41Var, h00Var, null, true, false);
        }
        try {
            i02 j = rb2Var.j();
            try {
                Object invoke = de0Var.invoke();
                i02.q(j);
                rb2Var.c();
                return invoke;
            } catch (Throwable th) {
                i02.q(j);
                throw th;
            }
        } catch (Throwable th2) {
            rb2Var.c();
            throw th2;
        }
    }

    public static final mq1 l(ur urVar) {
        urVar.X(1967007413);
        Object[] objArr = new Object[0];
        Object L = urVar.L();
        if (L == or.a) {
            L = new ax0(17);
            urVar.h0(L);
        }
        mq1 mq1Var = (mq1) go.Q(objArr, mq1.i, (de0) L, urVar, 384);
        mq1Var.g = (oq1) urVar.j(qq1.a);
        urVar.p(false);
        return mq1Var;
    }

    public static final oe2 m(ij0 ij0Var, ur urVar) {
        ni niVar;
        c00 c00Var = (c00) urVar.j(is.h);
        float f = ij0Var.j;
        float a2 = c00Var.a();
        boolean e = urVar.e((Float.floatToRawIntBits(a2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        Object L = urVar.L();
        if (e || L == or.a) {
            yf0 yf0Var = new yf0();
            c(yf0Var, ij0Var.f);
            float f2 = ij0Var.b;
            float f3 = ij0Var.c;
            float W = c00Var.W(f2);
            float W2 = c00Var.W(f3);
            long floatToRawIntBits = (Float.floatToRawIntBits(W) << 32) | (Float.floatToRawIntBits(W2) & 4294967295L);
            float f4 = ij0Var.d;
            float f5 = ij0Var.e;
            if (Float.isNaN(f4)) {
                f4 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            }
            if (Float.isNaN(f5)) {
                f5 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            }
            long floatToRawIntBits2 = (Float.floatToRawIntBits(f4) << 32) | (4294967295L & Float.floatToRawIntBits(f5));
            oe2 oe2Var = new oe2(yf0Var);
            String str = ij0Var.a;
            long j = ij0Var.g;
            int i = ij0Var.h;
            if (j != 16) {
                niVar = new ni(i, j);
            } else {
                niVar = null;
            }
            boolean z = ij0Var.i;
            oe2Var.e.setValue(new fy1(floatToRawIntBits));
            oe2Var.f.setValue(Boolean.valueOf(z));
            je2 je2Var = oe2Var.g;
            je2Var.g.setValue(niVar);
            je2Var.i.setValue(new fy1(floatToRawIntBits2));
            je2Var.c = str;
            urVar.h0(oe2Var);
            L = oe2Var;
        }
        return (oe2) L;
    }

    public static final float n(long j, float f, c00 c00Var) {
        float c2;
        long b2 = n92.b(j);
        if (o92.a(b2, 4294967296L)) {
            if (c00Var.P() > 1.05d) {
                c2 = n92.c(j) / n92.c(c00Var.G(f));
            } else {
                return c00Var.r0(j);
            }
        } else if (o92.a(b2, 8589934592L)) {
            c2 = n92.c(j);
        } else {
            return Float.NaN;
        }
        return c2 * f;
    }

    public static void o(i02 i02Var, i02 i02Var2, oe0 oe0Var) {
        if (i02Var == i02Var2) {
            if (i02Var instanceof rb2) {
                ((rb2) i02Var).r = oe0Var;
                return;
            } else if (i02Var instanceof sb2) {
                ((sb2) i02Var).h = oe0Var;
                return;
            } else {
                se.t(i02Var, "Non-transparent snapshot was reused: ");
                return;
            }
        }
        i02Var2.getClass();
        i02.q(i02Var);
        i02Var2.c();
    }

    public static final void p(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(go.U(j)), i, i2, 33);
        }
    }

    public static final void q(Spannable spannable, long j, c00 c00Var, int i, int i2) {
        long b2 = n92.b(j);
        if (o92.a(b2, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(c01.R(c00Var.r0(j)), false), i, i2, 33);
        } else if (o92.a(b2, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(n92.c(j)), i, i2, 33);
        }
    }

    public static final void r(Spannable spannable, ix0 ix0Var, int i, int i2) {
        if (ix0Var != null) {
            ArrayList arrayList = new ArrayList(yn.a0(ix0Var, 10));
            Iterator it = ix0Var.e.iterator();
            while (it.hasNext()) {
                arrayList.add(((hx0) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static final yc2 s(String str) {
        int i;
        mp0.m(10);
        int length = str.length();
        if (length != 0) {
            int i2 = 0;
            char charAt = str.charAt(0);
            if (sn0.B(charAt, 48) < 0) {
                i = 1;
                if (length == 1 || charAt != '+') {
                    return null;
                }
            } else {
                i = 0;
            }
            int i3 = 119304647;
            while (i < length) {
                int digit = Character.digit((int) str.charAt(i), 10);
                if (digit >= 0) {
                    if (Integer.compareUnsigned(i2, i3) > 0) {
                        if (i3 == 119304647) {
                            i3 = Integer.divideUnsigned(-1, 10);
                            if (Integer.compareUnsigned(i2, i3) > 0) {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    }
                    int i4 = i2 * 10;
                    int i5 = digit + i4;
                    if (Integer.compareUnsigned(i5, i4) < 0) {
                        return null;
                    }
                    i++;
                    i2 = i5;
                } else {
                    return null;
                }
            }
            return new yc2(i2);
        }
        return null;
    }

    public static final bd2 t(String str) {
        str.getClass();
        mp0.m(10);
        int length = str.length();
        if (length != 0) {
            int i = 0;
            char charAt = str.charAt(0);
            if (sn0.B(charAt, 48) < 0) {
                i = 1;
                if (length == 1 || charAt != '+') {
                    return null;
                }
            }
            long j = 0;
            long j2 = 512409557603043100L;
            while (i < length) {
                int digit = Character.digit((int) str.charAt(i), 10);
                if (digit >= 0) {
                    if (Long.compareUnsigned(j, j2) > 0) {
                        if (j2 == 512409557603043100L) {
                            j2 = Long.divideUnsigned(-1L, 10L);
                            if (Long.compareUnsigned(j, j2) > 0) {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    }
                    long j3 = j * 10;
                    long j4 = (digit & 4294967295L) + j3;
                    if (Long.compareUnsigned(j4, j3) < 0) {
                        return null;
                    }
                    i++;
                    j = j4;
                } else {
                    return null;
                }
            }
            return new bd2(j);
        }
        return null;
    }
}
