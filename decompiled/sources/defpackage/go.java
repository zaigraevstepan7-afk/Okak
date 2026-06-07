package defpackage;

import android.R;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class go {
    public static ij0 a;
    public static ij0 b;
    public static ij0 c;
    public static ij0 d;

    public static long A(int i, int i2, int i3, int i4) {
        int min;
        int i5;
        int i6 = 262142;
        int min2 = Math.min(i3, 262142);
        int i7 = Integer.MAX_VALUE;
        if (i4 == Integer.MAX_VALUE) {
            min = Integer.MAX_VALUE;
        } else {
            min = Math.min(i4, 262142);
        }
        if (min == Integer.MAX_VALUE) {
            i5 = min2;
        } else {
            i5 = min;
        }
        if (i5 >= 8191) {
            if (i5 < 32767) {
                i6 = 65534;
            } else if (i5 < 65535) {
                i6 = 32766;
            } else if (i5 < 262143) {
                i6 = 8190;
            } else {
                vs.l(i5);
                se.c();
                return 0L;
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            i7 = Math.min(i6, i2);
        }
        return vs.a(Math.min(i6, i), i7, min2, min);
    }

    public static long B(int i, int i2, int i3, int i4) {
        int min;
        int i5;
        int i6 = 262142;
        int min2 = Math.min(i, 262142);
        int i7 = Integer.MAX_VALUE;
        if (i2 == Integer.MAX_VALUE) {
            min = Integer.MAX_VALUE;
        } else {
            min = Math.min(i2, 262142);
        }
        if (min == Integer.MAX_VALUE) {
            i5 = min2;
        } else {
            i5 = min;
        }
        if (i5 >= 8191) {
            if (i5 < 32767) {
                i6 = 65534;
            } else if (i5 < 65535) {
                i6 = 32766;
            } else if (i5 < 262143) {
                i6 = 8190;
            } else {
                vs.l(i5);
                se.c();
                return 0L;
            }
        }
        if (i4 != Integer.MAX_VALUE) {
            i7 = Math.min(i6, i4);
        }
        return vs.a(min2, min, Math.min(i6, i3), i7);
    }

    public static final String C(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static vu D(vu vuVar, wu wuVar) {
        wuVar.getClass();
        if (sn0.r(vuVar.getKey(), wuVar)) {
            return vuVar;
        }
        return null;
    }

    public static final m01 E(ls0 ls0Var, int i, long j, cd1 cd1Var, long j2, h3 h3Var, jq0 jq0Var, int i2, p31 p31Var) {
        List list;
        Object c2 = cd1Var.c(i);
        List list2 = (List) p31Var.b(i);
        if (list2 != null) {
            list = list2;
        } else {
            List b2 = ls0Var.b(i);
            int size = b2.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(((e01) b2.get(i3)).x(j));
            }
            p31Var.i(i, arrayList);
            list = arrayList;
        }
        return new m01(i, i2, list, j2, c2, h3Var, jq0Var);
    }

    public static vt F(vt vtVar) {
        wt wtVar;
        vt<Object> intercepted;
        vtVar.getClass();
        if (vtVar instanceof wt) {
            wtVar = (wt) vtVar;
        } else {
            wtVar = null;
        }
        if (wtVar != null && (intercepted = wtVar.intercepted()) != null) {
            return intercepted;
        }
        return vtVar;
    }

    public static final long G(float f, long j, long j2) {
        p91 p91Var = so.x;
        long a2 = co.a(j, p91Var);
        long a3 = co.a(j2, p91Var);
        float d2 = co.d(a2);
        float h = co.h(a2);
        float g = co.g(a2);
        float e = co.e(a2);
        float d3 = co.d(a3);
        float h2 = co.h(a3);
        float g2 = co.g(a3);
        float e2 = co.e(a3);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return co.a(i(lo.Q(h, h2, f), lo.Q(g, g2, f), lo.Q(e, e2, f), lo.Q(d2, d3, f), p91Var), co.f(j2));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float H(defpackage.m31 r8, defpackage.m31 r9, float r10) {
        /*
            r8.getClass()
            r9.getClass()
            r0 = 0
            int r1 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r1 > 0) goto L8e
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r2 > 0) goto L8e
            r2 = 0
            int r3 = r8.b
            an0 r2 = X(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L1c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L88
            r3 = r2
            tm0 r3 = (defpackage.tm0) r3
            int r3 = r3.nextInt()
            float r4 = r8.b(r3)
            int r5 = r3 + 1
            int r6 = r8.b
            int r6 = r5 % r6
            float r6 = r8.b(r6)
            int r7 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r7 < 0) goto L44
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 > 0) goto L1c
            int r4 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r4 > 0) goto L1c
            goto L4c
        L44:
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r4 >= 0) goto L4c
            int r4 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r4 > 0) goto L1c
        L4c:
            int r0 = r8.b
            int r5 = r5 % r0
            float r0 = r8.b(r5)
            float r2 = r8.b(r3)
            float r0 = r0 - r2
            float r0 = defpackage.be2.d(r0, r1)
            float r2 = r9.b(r5)
            float r4 = r9.b(r3)
            float r2 = r2 - r4
            float r2 = defpackage.be2.d(r2, r1)
            r4 = 981668463(0x3a83126f, float:0.001)
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L73
            r8 = 1056964608(0x3f000000, float:0.5)
            goto L7d
        L73:
            float r8 = r8.b(r3)
            float r10 = r10 - r8
            float r8 = defpackage.be2.d(r10, r1)
            float r8 = r8 / r0
        L7d:
            float r9 = r9.b(r3)
            float r2 = r2 * r8
            float r2 = r2 + r9
            float r8 = defpackage.be2.d(r2, r1)
            return r8
        L88:
            java.lang.String r8 = "Collection contains no element matching the predicate."
            defpackage.y61.j(r8)
            return r0
        L8e:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Invalid progress: "
            r8.<init>(r9)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go.H(m31, m31, float):float");
    }

    public static xu I(vu vuVar, wu wuVar) {
        wuVar.getClass();
        if (sn0.r(vuVar.getKey(), wuVar)) {
            return j60.e;
        }
        return vuVar;
    }

    public static final ArrayList J(Map map, oe0 oe0Var) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            Set keySet = linkedHashMap.keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : keySet) {
                if (((Boolean) oe0Var.invoke((String) obj)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        ((Map.Entry) it.next()).getValue().getClass();
        se.s();
        return null;
    }

    public static final l61 K(oe0 oe0Var) {
        m61 m61Var = new m61();
        oe0Var.invoke(m61Var);
        String str = m61Var.c;
        k61 k61Var = m61Var.a;
        if (str != null) {
            boolean z = m61Var.d;
            boolean z2 = m61Var.e;
            k61Var.b = str;
            k61Var.a = -1;
            k61Var.c = z;
            k61Var.d = z2;
        } else {
            int i = m61Var.b;
            boolean z3 = m61Var.d;
            boolean z4 = m61Var.e;
            k61Var.a = i;
            k61Var.b = null;
            k61Var.c = z3;
            k61Var.d = z4;
        }
        String str2 = k61Var.b;
        if (str2 != null) {
            boolean z5 = k61Var.c;
            boolean z6 = k61Var.d;
            int i2 = k61Var.e;
            int i3 = k61Var.f;
            int i4 = r51.i;
            l61 l61Var = new l61(false, false, "android-app://androidx.navigation/".concat(str2).hashCode(), z5, z6, i2, i3);
            l61Var.h = str2;
            return l61Var;
        }
        return new l61(false, false, k61Var.a, k61Var.c, k61Var.d, k61Var.e, k61Var.f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bb, code lost:
    
        continue;
     */
    /* JADX WARN: Type inference failed for: r5v0, types: [hk, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.qb1 L(defpackage.bl... r11) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go.L(bl[]):qb1");
    }

    public static xu M(vu vuVar, xu xuVar) {
        xuVar.getClass();
        if (xuVar == j60.e) {
            return vuVar;
        }
        return (xu) xuVar.p(new le(17), vuVar);
    }

    public static final fq N(int i, af0 af0Var, ur urVar) {
        Object L = urVar.L();
        if (L == or.a) {
            L = new fq(i, true, af0Var);
            urVar.h0(L);
        }
        fq fqVar = (fq) L;
        if (!fqVar.g.equals(af0Var)) {
            fqVar.g = af0Var;
            if (fqVar.f) {
                dl1 dl1Var = fqVar.h;
                if (dl1Var != null) {
                    ds dsVar = dl1Var.a;
                    if (dsVar != null) {
                        dsVar.s(dl1Var, null);
                    }
                    fqVar.h = null;
                }
                ArrayList arrayList = fqVar.i;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        dl1 dl1Var2 = (dl1) arrayList.get(i2);
                        ds dsVar2 = dl1Var2.a;
                        if (dsVar2 != null) {
                            dsVar2.s(dl1Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return fqVar;
    }

    public static final uk0 O(String str, ur urVar, int i) {
        Object L = urVar.L();
        if (L == or.a) {
            L = new uk0();
            urVar.h0(L);
        }
        uk0 uk0Var = (uk0) L;
        uk0Var.a(0, urVar);
        return uk0Var;
    }

    public static final Object P(Object[] objArr, de0 de0Var, ur urVar) {
        return R(Arrays.copyOf(objArr, objArr.length), fc2.B, de0Var, urVar, 3456, 0);
    }

    public static final Object Q(Object[] objArr, gr1 gr1Var, de0 de0Var, ur urVar, int i) {
        return R(Arrays.copyOf(objArr, objArr.length), gr1Var, de0Var, urVar, 384 | ((i << 3) & 7168), 0);
    }

    public static final Object R(Object[] objArr, gr1 gr1Var, de0 de0Var, ur urVar, int i, int i2) {
        Object[] objArr2;
        gr1 gr1Var2;
        boolean z;
        final Object obj;
        Object obj2;
        Object e;
        long j = urVar.T;
        mp0.m(36);
        final String l = Long.toString(j, 36);
        l.getClass();
        gr1Var.getClass();
        final oq1 oq1Var = (oq1) urVar.j(qq1.a);
        Object L = urVar.L();
        Object obj3 = null;
        Object obj4 = or.a;
        if (L == obj4) {
            if (oq1Var != null && (e = oq1Var.e(l)) != null) {
                obj2 = gr1Var.a(e);
            } else {
                obj2 = null;
            }
            if (obj2 == null) {
                obj2 = de0Var.invoke();
            }
            objArr2 = objArr;
            gr1Var2 = gr1Var;
            Object kq1Var = new kq1(gr1Var2, oq1Var, l, obj2, objArr2);
            urVar.h0(kq1Var);
            L = kq1Var;
        } else {
            objArr2 = objArr;
            gr1Var2 = gr1Var;
        }
        final kq1 kq1Var2 = (kq1) L;
        if (Arrays.equals(objArr2, kq1Var2.i)) {
            obj3 = kq1Var2.h;
        }
        if (obj3 == null) {
            obj3 = de0Var.invoke();
        }
        boolean h = urVar.h(kq1Var2);
        if ((((i & 112) ^ 48) > 32 && urVar.h(gr1Var2)) || (i & 48) == 32) {
            z = true;
        } else {
            z = false;
        }
        boolean h2 = h | z | urVar.h(oq1Var) | urVar.f(l) | urVar.h(obj3) | urVar.h(objArr2);
        Object L2 = urVar.L();
        if (!h2 && L2 != obj4) {
            obj = obj3;
        } else {
            final Object[] objArr3 = objArr2;
            obj = obj3;
            final gr1 gr1Var3 = gr1Var2;
            Object obj5 = new de0() { // from class: im1
                @Override // defpackage.de0
                public final Object invoke() {
                    boolean z2;
                    kq1 kq1Var3 = kq1.this;
                    oq1 oq1Var2 = kq1Var3.f;
                    oq1 oq1Var3 = oq1Var;
                    boolean z3 = true;
                    if (oq1Var2 != oq1Var3) {
                        kq1Var3.f = oq1Var3;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    String str = kq1Var3.g;
                    String str2 = l;
                    if (!sn0.r(str, str2)) {
                        kq1Var3.g = str2;
                    } else {
                        z3 = z2;
                    }
                    kq1Var3.e = gr1Var3;
                    kq1Var3.h = obj;
                    kq1Var3.i = objArr3;
                    ld ldVar = kq1Var3.j;
                    if (ldVar != null && z3) {
                        ldVar.v();
                        kq1Var3.j = null;
                        kq1Var3.b();
                    }
                    return od2.a;
                }
            };
            urVar.h0(obj5);
            L2 = obj5;
        }
        bf.p((de0) L2, urVar);
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long S(long r47, float r49) {
        /*
            Method dump skipped, instructions count: 1420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go.S(long, float):long");
    }

    public static ym0 T(an0 an0Var, int i) {
        boolean z;
        an0Var.getClass();
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Integer valueOf = Integer.valueOf(i);
        if (z) {
            int i2 = an0Var.e;
            int i3 = an0Var.f;
            if (an0Var.g <= 0) {
                i = -i;
            }
            return new ym0(i2, i3, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static final int U(long j) {
        float[] fArr = so.a;
        return (int) (co.a(j, so.e) >>> 32);
    }

    public static final zz0 V(np1 np1Var, ur urVar) {
        boolean f = urVar.f(np1Var) | urVar.d(0);
        Object L = urVar.L();
        if (f || L == or.a) {
            L = new zz0(np1Var);
            urVar.h0(L);
        }
        return (zz0) L;
    }

    public static final String W(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            if (f < 0.0f) {
                return "-Infinity";
            }
            return "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0d, max);
        float f2 = f * pow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / pow;
        if (max > 0) {
            return String.valueOf(f3);
        }
        return String.valueOf((int) f3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [an0, ym0] */
    public static an0 X(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            an0 an0Var = an0.h;
            return an0.h;
        }
        return new ym0(i, i2 - 1, 1);
    }

    public static final void Y(m31 m31Var) {
        int i;
        m31Var.getClass();
        Boolean bool = Boolean.TRUE;
        float[] fArr = m31Var.a;
        int i2 = m31Var.b;
        boolean z = false;
        int i3 = 0;
        while (true) {
            boolean z2 = true;
            if (i3 >= i2) {
                break;
            }
            float f = fArr[i3];
            if (!bool.booleanValue() || 0.0f > f || f > 1.0f) {
                z2 = false;
            }
            bool = Boolean.valueOf(z2);
            i3++;
        }
        if (bool.booleanValue()) {
            Iterable X = X(1, m31Var.b);
            if ((X instanceof Collection) && ((Collection) X).isEmpty()) {
                i = 0;
            } else {
                Iterator it = X.iterator();
                i = 0;
                while (((zm0) it).g) {
                    int nextInt = ((tm0) it).nextInt();
                    if (m31Var.b(nextInt) < m31Var.b(nextInt - 1) && (i = i + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
            if (i <= 1) {
                z = true;
            }
            if (z) {
                return;
            }
            se.e("FloatMapping - Progress wraps more than once: ".concat(m31.c(m31Var, 31)));
            return;
        }
        se.e("FloatMapping - Progress outside of range: ".concat(m31.c(m31Var, 31)));
    }

    public static Object Z(se0 se0Var, Object obj, vt vtVar) {
        Object wtVar;
        se0Var.getClass();
        xu context = vtVar.getContext();
        if (context == j60.e) {
            wtVar = new do1(vtVar);
        } else {
            wtVar = new wt(vtVar, context);
        }
        fc2.t(2, se0Var);
        return se0Var.invoke(obj, wtVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long a(float r21, float r22, float r23, float r24, defpackage.po r25) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go.a(float, float, float, float, po):long");
    }

    public static final long b(int i) {
        long j = i << 32;
        int i2 = co.h;
        return j;
    }

    public static final long c(long j) {
        long j2 = j << 32;
        int i = co.h;
        return j2;
    }

    public static long d(int i, int i2, int i3) {
        return b(((i & 255) << 16) | (-16777216) | ((i2 & 255) << 8) | (i3 & 255));
    }

    public static final long e(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final void f(Boolean bool, Object obj, uu0 uu0Var, oe0 oe0Var, ur urVar, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        urVar.Y(696924721);
        if ((i & 6) == 0) {
            if (urVar.h(bool)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.h(obj)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            if (urVar.h(oe0Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i2 & 1, z)) {
            urVar.T();
            if ((i & 1) != 0 && !urVar.y()) {
                urVar.R();
            } else {
                uu0Var = (uu0) urVar.j(bx0.a);
            }
            int i6 = i2 & (-897);
            urVar.q();
            boolean f = urVar.f(bool) | urVar.f(obj) | urVar.f(uu0Var);
            Object L = urVar.L();
            if (f || L == or.a) {
                L = new av0(uu0Var.g());
                urVar.h0(L);
            }
            g(uu0Var, (av0) L, oe0Var, urVar, (i6 >> 3) & 896);
        } else {
            urVar.R();
        }
        uu0 uu0Var2 = uu0Var;
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new c3(bool, obj, uu0Var2, oe0Var, i, 4);
        }
    }

    public static final void g(uu0 uu0Var, av0 av0Var, oe0 oe0Var, ur urVar, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        urVar.Y(228371534);
        if ((i & 6) == 0) {
            if (urVar.h(uu0Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.h(av0Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (urVar.h(oe0Var)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        boolean z2 = false;
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i2 & 1, z)) {
            boolean h = urVar.h(av0Var);
            if ((i2 & 896) == 256) {
                z2 = true;
            }
            boolean h2 = h | z2 | urVar.h(uu0Var);
            Object L = urVar.L();
            if (h2 || L == or.a) {
                L = new k1(uu0Var, av0Var, oe0Var);
                urVar.h0(L);
            }
            bf.e(uu0Var, av0Var, (oe0) L, urVar);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new h9(uu0Var, av0Var, oe0Var, i, 9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x0335, code lost:
    
        if (r51.d(0) == false) goto L237;
     */
    /* JADX WARN: Removed duplicated region for block: B:206:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x039e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(defpackage.e21 r40, final defpackage.uy r41, final defpackage.pc1 r42, final defpackage.c02 r43, final boolean r44, final defpackage.j7 r45, final defpackage.g3 r46, defpackage.l71 r47, final defpackage.h3 r48, final defpackage.xl1 r49, final defpackage.fq r50, defpackage.ur r51, final int r52, final int r53) {
        /*
            Method dump skipped, instructions count: 1221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go.h(e21, uy, pc1, c02, boolean, j7, g3, l71, h3, xl1, fq, ur, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long i(float r17, float r18, float r19, float r20, defpackage.po r21) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go.i(float, float, float, float, po):long");
    }

    public static final sk0 j(uk0 uk0Var, float f, float f2, rk0 rk0Var, String str, ur urVar, int i, int i2) {
        Float valueOf = Float.valueOf(f);
        Float valueOf2 = Float.valueOf(f2);
        Object L = urVar.L();
        xl1 xl1Var = or.a;
        if (L == xl1Var) {
            L = new sk0(uk0Var, valueOf, valueOf2, rk0Var);
            urVar.h0(L);
        }
        sk0 sk0Var = (sk0) L;
        boolean h = urVar.h(rk0Var);
        Object L2 = urVar.L();
        if (h || L2 == xl1Var) {
            L2 = new vk0(valueOf, sk0Var, valueOf2, rk0Var);
            urVar.h0(L2);
        }
        bf.p((de0) L2, urVar);
        boolean h2 = urVar.h(uk0Var);
        Object L3 = urVar.L();
        if (h2 || L3 == xl1Var) {
            L3 = new i(15, uk0Var, sk0Var);
            urVar.h0(L3);
        }
        bf.d(sk0Var, (oe0) L3, urVar);
        return sk0Var;
    }

    public static final int k(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [hk, java.lang.Object, k12] */
    /* JADX WARN: Type inference failed for: r4v9, types: [hk, java.lang.Object, k12] */
    public static void l(long j, hk hkVar, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 < i3) {
            for (int i8 = i2; i8 < i3; i8++) {
                if (((bl) arrayList4.get(i8)).d() < i7) {
                    se.h("Failed requirement.");
                    return;
                }
            }
            bl blVar = (bl) arrayList.get(i2);
            bl blVar2 = (bl) arrayList4.get(i3 - 1);
            if (i7 == blVar.d()) {
                int intValue = ((Number) arrayList5.get(i2)).intValue();
                int i9 = i2 + 1;
                bl blVar3 = (bl) arrayList4.get(i9);
                i4 = i9;
                i5 = intValue;
                blVar = blVar3;
            } else {
                i4 = i2;
                i5 = -1;
            }
            if (blVar.i(i7) != blVar2.i(i7)) {
                int i10 = 1;
                for (int i11 = i4 + 1; i11 < i3; i11++) {
                    if (((bl) arrayList4.get(i11 - 1)).i(i7) != ((bl) arrayList4.get(i11)).i(i7)) {
                        i10++;
                    }
                }
                long j3 = (hkVar.f / 4) + j + 2 + (i10 * 2);
                hkVar.T(i10);
                hkVar.T(i5);
                for (int i12 = i4; i12 < i3; i12++) {
                    byte i13 = ((bl) arrayList4.get(i12)).i(i7);
                    if (i12 == i4 || i13 != ((bl) arrayList4.get(i12 - 1)).i(i7)) {
                        hkVar.T(i13 & 255);
                    }
                }
                ?? obj = new Object();
                int i14 = i4;
                while (i14 < i3) {
                    byte i15 = ((bl) arrayList4.get(i14)).i(i7);
                    int i16 = i14 + 1;
                    int i17 = i16;
                    while (true) {
                        if (i17 < i3) {
                            if (i15 != ((bl) arrayList4.get(i17)).i(i7)) {
                                break;
                            } else {
                                i17++;
                            }
                        } else {
                            i17 = i3;
                            break;
                        }
                    }
                    if (i16 == i17 && i7 + 1 == ((bl) arrayList4.get(i14)).d()) {
                        hkVar.T(((Number) arrayList5.get(i14)).intValue());
                        arrayList3 = arrayList5;
                        j2 = j3;
                        i6 = i17;
                    } else {
                        hkVar.T(((int) ((obj.f / 4) + j3)) * (-1));
                        arrayList3 = arrayList5;
                        j2 = j3;
                        i6 = i17;
                        l(j2, obj, i7 + 1, arrayList, i14, i6, arrayList3);
                        arrayList4 = arrayList;
                    }
                    j3 = j2;
                    i14 = i6;
                    arrayList5 = arrayList3;
                }
                hkVar.l(obj);
                return;
            }
            int min = Math.min(blVar.d(), blVar2.d());
            int i18 = 0;
            for (int i19 = i7; i19 < min && blVar.i(i19) == blVar2.i(i19); i19++) {
                i18++;
            }
            long j4 = (hkVar.f / 4) + j + 2 + i18 + 1;
            hkVar.T(-i18);
            hkVar.T(i5);
            int i20 = i7 + i18;
            while (i7 < i20) {
                hkVar.T(blVar.i(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i20 == ((bl) arrayList4.get(i4)).d()) {
                    hkVar.T(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    se.p("Check failed.");
                    return;
                }
            }
            ?? obj2 = new Object();
            hkVar.T(((int) ((obj2.f / 4) + j4)) * (-1));
            l(j4, obj2, i20, arrayList4, i4, i3, arrayList5);
            hkVar.l(obj2);
            return;
        }
        se.h("Failed requirement.");
    }

    public static void m(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static double n(double d2, double d3, double d4) {
        if (d3 <= d4) {
            if (d2 < d3) {
                return d3;
            }
            if (d2 > d4) {
                return d4;
            }
            return d2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d4 + " is less than minimum " + d3 + '.');
    }

    public static float o(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            if (f > f3) {
                return f3;
            }
            return f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int p(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            if (i > i3) {
                return i3;
            }
            return i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static long q(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            if (j > j3) {
                return j3;
            }
            return j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    public static Comparable r(Float f, rn rnVar) {
        rnVar.getClass();
        float f2 = rnVar.b;
        float f3 = rnVar.a;
        if (f3 <= f2) {
            if (rn.a(f, Float.valueOf(f3)) && !rn.a(Float.valueOf(f3), f)) {
                return Float.valueOf(f3);
            }
            if (rn.a(Float.valueOf(f2), f) && !rn.a(f, Float.valueOf(f2))) {
                return Float.valueOf(f2);
            }
            return f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + rnVar + '.');
    }

    public static final o41 s(r31 r31Var, ur urVar, int i) {
        boolean z;
        Object L = urVar.L();
        xl1 xl1Var = or.a;
        if (L == xl1Var) {
            L = fr1.k(Boolean.FALSE);
            urVar.h0(L);
        }
        o41 o41Var = (o41) L;
        int i2 = 0;
        if ((((i & 14) ^ 6) > 4 && urVar.f(r31Var)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        Object L2 = urVar.L();
        if (z || L2 == xl1Var) {
            L2 = new fc0(r31Var, o41Var, null, i2);
            urVar.h0(L2);
        }
        bf.i(urVar, (se0) L2, r31Var);
        return o41Var;
    }

    public static final long t(long j, long j2) {
        float f;
        float f2;
        long a2 = co.a(j, co.f(j2));
        float d2 = co.d(j2);
        float d3 = co.d(a2);
        float f3 = 1.0f - d3;
        float f4 = (d2 * f3) + d3;
        float h = co.h(a2);
        float h2 = co.h(j2);
        float f5 = 0.0f;
        if (f4 == 0.0f) {
            f = 0.0f;
        } else {
            f = (((h2 * d2) * f3) + (h * d3)) / f4;
        }
        float g = co.g(a2);
        float g2 = co.g(j2);
        if (f4 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((g2 * d2) * f3) + (g * d3)) / f4;
        }
        float e = co.e(a2);
        float e2 = co.e(j2);
        if (f4 != 0.0f) {
            f5 = (((e2 * d2) * f3) + (e * d3)) / f4;
        }
        return i(f, f2, f5, f4, co.f(j2));
    }

    public static o41 u() {
        return new je1(od2.a, g3.S);
    }

    public static final boolean v(pl1 pl1Var, float f, float f2) {
        float f3 = pl1Var.a;
        if (f <= pl1Var.c && f3 <= f) {
            float f4 = pl1Var.b;
            if (f2 <= pl1Var.d && f4 <= f2) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static vt w(vt vtVar, vt vtVar2, se0 se0Var) {
        se0Var.getClass();
        if (se0Var instanceof eh) {
            return ((eh) se0Var).create(vtVar, vtVar2);
        }
        xu context = vtVar2.getContext();
        if (context == j60.e) {
            return new tn0(vtVar2, vtVar, se0Var);
        }
        return new un0(vtVar2, context, se0Var, vtVar);
    }

    public static final la2 x(Context context) {
        lo.B(context, R.color.Blue_700);
        lo.B(context, R.color.Blue_800);
        S(lo.B(context, R.color.Purple_800), 98.0f);
        S(lo.B(context, R.color.Purple_800), 96.0f);
        lo.B(context, R.color.GM2_grey_800);
        S(lo.B(context, R.color.Purple_800), 94.0f);
        S(lo.B(context, R.color.Purple_800), 92.0f);
        lo.B(context, R.color.Indigo_700);
        S(lo.B(context, R.color.Purple_800), 87.0f);
        lo.B(context, R.color.Indigo_800);
        lo.B(context, R.color.Pink_700);
        lo.B(context, R.color.Pink_800);
        lo.B(context, R.color.Purple_700);
        lo.B(context, R.color.Purple_800);
        lo.B(context, R.color.Red_700);
        S(lo.B(context, R.color.Purple_800), 24.0f);
        S(lo.B(context, R.color.Purple_800), 22.0f);
        lo.B(context, R.color.Red_800);
        S(lo.B(context, R.color.Purple_800), 17.0f);
        S(lo.B(context, R.color.Purple_800), 12.0f);
        lo.B(context, R.color.Teal_700);
        S(lo.B(context, R.color.Purple_800), 6.0f);
        S(lo.B(context, R.color.Purple_800), 4.0f);
        lo.B(context, R.color.Teal_800);
        long B = lo.B(context, R.color.accent_device_default);
        lo.B(context, R.color.accent_device_default_50);
        long S = S(lo.B(context, R.color.accessibility_focus_highlight), 98.0f);
        long S2 = S(lo.B(context, R.color.accessibility_focus_highlight), 96.0f);
        long B2 = lo.B(context, R.color.accent_device_default_700);
        long S3 = S(lo.B(context, R.color.accessibility_focus_highlight), 94.0f);
        long S4 = S(lo.B(context, R.color.accessibility_focus_highlight), 92.0f);
        long B3 = lo.B(context, R.color.accent_device_default_dark);
        long S5 = S(lo.B(context, R.color.accessibility_focus_highlight), 87.0f);
        long B4 = lo.B(context, R.color.accent_device_default_dark_60_percent_opacity);
        lo.B(context, R.color.accent_device_default_light);
        long B5 = lo.B(context, R.color.accent_material_dark);
        long B6 = lo.B(context, R.color.accent_material_light);
        lo.B(context, R.color.accessibility_focus_highlight);
        long B7 = lo.B(context, R.color.autofill_background_material_dark);
        long S6 = S(lo.B(context, R.color.accessibility_focus_highlight), 24.0f);
        long S7 = S(lo.B(context, R.color.accessibility_focus_highlight), 22.0f);
        long B8 = lo.B(context, R.color.autofill_background_material_light);
        long S8 = S(lo.B(context, R.color.accessibility_focus_highlight), 17.0f);
        long S9 = S(lo.B(context, R.color.accessibility_focus_highlight), 12.0f);
        long B9 = lo.B(context, R.color.autofilled_highlight);
        long S10 = S(lo.B(context, R.color.accessibility_focus_highlight), 6.0f);
        long S11 = S(lo.B(context, R.color.accessibility_focus_highlight), 4.0f);
        long B10 = lo.B(context, R.color.background_cache_hint_selector_device_default);
        long B11 = lo.B(context, R.color.background_cache_hint_selector_holo_dark);
        lo.B(context, R.color.background_cache_hint_selector_holo_light);
        lo.B(context, R.color.background_cache_hint_selector_material_dark);
        long B12 = lo.B(context, R.color.background_cache_hint_selector_material_light);
        long B13 = lo.B(context, R.color.background_device_default_dark);
        lo.B(context, R.color.background_device_default_light);
        lo.B(context, R.color.background_floating_device_default_dark);
        lo.B(context, R.color.background_floating_device_default_light);
        long B14 = lo.B(context, R.color.background_floating_material_dark);
        long B15 = lo.B(context, R.color.background_floating_material_light);
        long B16 = lo.B(context, R.color.background_holo_dark);
        long B17 = lo.B(context, R.color.background_holo_light);
        lo.B(context, R.color.background_leanback_dark);
        long B18 = lo.B(context, R.color.background_leanback_light);
        lo.B(context, R.color.background_material_dark);
        lo.B(context, R.color.background_material_light);
        long B19 = lo.B(context, R.color.bright_foreground_dark);
        long B20 = lo.B(context, R.color.bright_foreground_dark_disabled);
        lo.B(context, R.color.bright_foreground_dark_inverse);
        lo.B(context, R.color.bright_foreground_disabled_holo_dark);
        lo.B(context, R.color.bright_foreground_disabled_holo_light);
        long B21 = lo.B(context, R.color.bright_foreground_holo_dark);
        long B22 = lo.B(context, R.color.bright_foreground_holo_light);
        long B23 = lo.B(context, R.color.bright_foreground_inverse_holo_dark);
        long B24 = lo.B(context, R.color.bright_foreground_inverse_holo_light);
        lo.B(context, R.color.bright_foreground_light);
        long B25 = lo.B(context, R.color.bright_foreground_light_disabled);
        lo.B(context, R.color.bright_foreground_light_inverse);
        lo.B(context, R.color.btn_colored_background_material);
        long B26 = lo.B(context, R.color.btn_colored_borderless_text_material);
        long B27 = lo.B(context, R.color.btn_colored_text_material);
        lo.B(context, R.color.btn_default_material_dark);
        lo.B(context, R.color.btn_default_material_light);
        lo.B(context, R.color.btn_watch_default_dark);
        long B28 = lo.B(context, R.color.button_material_dark);
        long B29 = lo.B(context, R.color.button_material_light);
        long B30 = lo.B(context, R.color.button_normal_device_default_dark);
        long B31 = lo.B(context, R.color.car_accent);
        lo.B(context, R.color.car_accent_dark);
        return new la2(B, S, S2, B2, S3, S4, B3, S5, B4, B5, B6, B7, S6, S7, B8, S8, S9, B9, S10, S11, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20, B21, B22, B23, B24, B25, B26, B27, B28, B29, B30, B31);
    }

    public static final i70 y(Enum[] enumArr) {
        enumArr.getClass();
        return new i70(enumArr);
    }

    public static final long z(long j, boolean z, int i, float f) {
        int h;
        if ((z || i == 2 || i == 4 || i == 5) && us.d(j)) {
            h = us.h(j);
        } else {
            h = Integer.MAX_VALUE;
        }
        if (us.j(j) != h) {
            h = p(xq1.h(f), us.j(j), h);
        }
        return B(0, h, 0, us.g(j));
    }
}
