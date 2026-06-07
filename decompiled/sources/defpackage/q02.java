package defpackage;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class q02 {
    public static final nv1 a = new nv1(5);
    public static final ld b = new ld(14);
    public static final Object c = new Object();
    public static o02 d;
    public static long e;
    public static final m02 f;
    public static final u7 g;
    public static List h;
    public static List i;
    public static final of0 j;
    public static final mf k;

    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.concurrent.atomic.AtomicInteger, mf] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, m02] */
    /* JADX WARN: Type inference failed for: r0v5, types: [u7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [of0, n41, i02] */
    static {
        o02 o02Var = o02.i;
        d = o02Var;
        e = 2L;
        ?? obj = new Object();
        obj.b = new long[16];
        obj.c = new int[16];
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        obj.d = iArr;
        f = obj;
        ?? obj2 = new Object();
        obj2.b = new int[16];
        obj2.c = new ih2[16];
        g = obj2;
        l60 l60Var = l60.e;
        h = l60Var;
        i = l60Var;
        long j2 = e;
        e = 1 + j2;
        ?? n41Var = new n41(j2, o02Var, null, new p1(27));
        d = d.e(n41Var.b);
        j = n41Var;
        k = new AtomicInteger(0);
    }

    public static final void a() {
        e(a);
    }

    public static final HashMap b(long j2, n41 n41Var, o02 o02Var) {
        long[] jArr;
        o02 o02Var2;
        long[] jArr2;
        o02 o02Var3;
        int i2;
        int i3;
        w22 s;
        j41 x = n41Var.x();
        if (x != null) {
            long g2 = n41Var.g();
            o02 d2 = n41Var.d().e(g2).d(n41Var.j);
            Object[] objArr = x.b;
            long[] jArr3 = x.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j3 = jArr3[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                u22 u22Var = (u22) objArr[(i4 << 3) + i7];
                                w22 a2 = u22Var.a();
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                                w22 s2 = s(a2, j2, o02Var);
                                if (s2 != null && (s = s(a2, g2, d2)) != null && !s2.equals(s)) {
                                    o02Var3 = d2;
                                    w22 s3 = s(a2, g2, n41Var.d());
                                    if (s3 != null) {
                                        w22 b2 = u22Var.b(s, s2, s3);
                                        if (b2 == null) {
                                            return null;
                                        }
                                        if (hashMap == null) {
                                            hashMap = new HashMap();
                                        }
                                        hashMap.put(s2, b2);
                                        hashMap = hashMap;
                                    } else {
                                        r();
                                        throw null;
                                    }
                                } else {
                                    o02Var3 = d2;
                                }
                            } else {
                                jArr2 = jArr3;
                                o02Var3 = d2;
                                i2 = i5;
                                i3 = i7;
                            }
                            j3 >>= i2;
                            i7 = i3 + 1;
                            i5 = i2;
                            jArr3 = jArr2;
                            d2 = o02Var3;
                        }
                        jArr = jArr3;
                        o02Var2 = d2;
                        if (i6 != i5) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        o02Var2 = d2;
                    }
                    if (i4 != length) {
                        i4++;
                        jArr3 = jArr;
                        d2 = o02Var2;
                    } else {
                        return hashMap;
                    }
                }
            }
        }
        return null;
    }

    public static final void c(i02 i02Var) {
        n41 n41Var;
        Object obj;
        long j2;
        if (!d.c(i02Var.g())) {
            StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
            sb.append(i02Var.g());
            sb.append(", disposed=");
            sb.append(i02Var.c);
            sb.append(", applied=");
            if (i02Var instanceof n41) {
                n41Var = (n41) i02Var;
            } else {
                n41Var = null;
            }
            if (n41Var != null) {
                obj = Boolean.valueOf(n41Var.m);
            } else {
                obj = "read-only";
            }
            sb.append(obj);
            sb.append(", lowestPin=");
            synchronized (c) {
                m02 m02Var = f;
                if (m02Var.a > 0) {
                    j2 = m02Var.b[0];
                } else {
                    j2 = -1;
                }
            }
            sb.append(j2);
            throw new IllegalStateException(sb.toString().toString());
        }
    }

    public static final o02 d(o02 o02Var, long j2, long j3) {
        while (sn0.C(j2, j3) < 0) {
            o02Var = o02Var.e(j2);
            j2++;
        }
        return o02Var;
    }

    public static final Object e(oe0 oe0Var) {
        j41 j41Var;
        Object v;
        of0 of0Var = j;
        synchronized (c) {
            try {
                j41Var = of0Var.h;
                if (j41Var != null) {
                    k.addAndGet(1);
                }
                v = v(of0Var, oe0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (j41Var != null) {
            try {
                List list = h;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((se0) list.get(i2)).invoke(new ur1(j41Var), of0Var);
                }
            } finally {
                k.addAndGet(-1);
            }
        }
        synchronized (c) {
            f();
            if (j41Var != null) {
                Object[] objArr = j41Var.b;
                long[] jArr = j41Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    q((u22) objArr[(i3 << 3) + i5]);
                                }
                                j2 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        return v;
    }

    public static final void f() {
        u7 u7Var = g;
        int i2 = u7Var.a;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            Object obj = null;
            if (i3 >= i2) {
                break;
            }
            ih2 ih2Var = ((ih2[]) u7Var.c)[i3];
            if (ih2Var != null) {
                obj = ih2Var.get();
            }
            if (obj != null && p((u22) obj)) {
                if (i4 != i3) {
                    ((ih2[]) u7Var.c)[i4] = ih2Var;
                    int[] iArr = (int[]) u7Var.b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((ih2[]) u7Var.c)[i5] = null;
            ((int[]) u7Var.b)[i5] = 0;
        }
        if (i4 != i2) {
            u7Var.a = i4;
        }
    }

    public static final i02 g(i02 i02Var, oe0 oe0Var, boolean z) {
        n41 n41Var;
        boolean z2 = i02Var instanceof n41;
        if (!z2 && i02Var != null) {
            return new sb2(i02Var, oe0Var, false, z);
        }
        if (z2) {
            n41Var = (n41) i02Var;
        } else {
            n41Var = null;
        }
        return new rb2(n41Var, oe0Var, null, false, z);
    }

    public static final w22 h(w22 w22Var) {
        w22 s;
        i02 j2 = j();
        w22 s2 = s(w22Var, j2.g(), j2.d());
        if (s2 == null) {
            synchronized (c) {
                i02 j3 = j();
                s = s(w22Var, j3.g(), j3.d());
            }
            if (s != null) {
                return s;
            }
            r();
            throw null;
        }
        return s2;
    }

    public static final w22 i(w22 w22Var, i02 i02Var) {
        w22 s;
        w22 s2 = s(w22Var, i02Var.g(), i02Var.d());
        if (s2 == null) {
            synchronized (c) {
                s = s(w22Var, i02Var.g(), i02Var.d());
            }
            if (s != null) {
                return s;
            }
            r();
            throw null;
        }
        return s2;
    }

    public static final i02 j() {
        i02 i02Var = (i02) b.g();
        if (i02Var == null) {
            return j;
        }
        return i02Var;
    }

    public static final oe0 k(oe0 oe0Var, oe0 oe0Var2, boolean z) {
        if (!z) {
            oe0Var2 = null;
        }
        if (oe0Var != null && oe0Var2 != null && oe0Var != oe0Var2) {
            return new p02(oe0Var, oe0Var2, 0);
        }
        if (oe0Var == null) {
            return oe0Var2;
        }
        return oe0Var;
    }

    public static final oe0 l(oe0 oe0Var, oe0 oe0Var2) {
        if (oe0Var != null && oe0Var2 != null && oe0Var != oe0Var2) {
            return new p02(oe0Var, oe0Var2, 1);
        }
        if (oe0Var == null) {
            return oe0Var2;
        }
        return oe0Var;
    }

    public static final w22 m(w22 w22Var, u22 u22Var) {
        w22 a2 = u22Var.a();
        long j2 = e;
        m02 m02Var = f;
        if (m02Var.a > 0) {
            j2 = m02Var.b[0];
        }
        long j3 = j2 - 1;
        w22 w22Var2 = null;
        w22 w22Var3 = null;
        while (true) {
            if (a2 == null) {
                break;
            }
            long j4 = a2.a;
            if (j4 == 0) {
                break;
            }
            if (j4 != 0 && sn0.C(j4, j3) <= 0 && !o02.i.c(j4)) {
                if (w22Var3 == null) {
                    w22Var3 = a2;
                } else if (sn0.C(a2.a, w22Var3.a) >= 0) {
                    w22Var2 = w22Var3;
                }
            }
            a2 = a2.b;
        }
        w22Var2 = a2;
        if (w22Var2 != null) {
            w22Var2.a = Long.MAX_VALUE;
            return w22Var2;
        }
        w22 b2 = w22Var.b(Long.MAX_VALUE);
        b2.b = u22Var.a();
        u22Var.d(b2);
        return b2;
    }

    public static final void n(i02 i02Var, u22 u22Var) {
        i02Var.t(i02Var.h() + 1);
        oe0 i2 = i02Var.i();
        if (i2 != null) {
            i2.invoke(u22Var);
        }
    }

    public static final w22 o(w22 w22Var, v22 v22Var, i02 i02Var, w22 w22Var2) {
        w22 m;
        if (i02Var.f()) {
            i02Var.n(v22Var);
        }
        long g2 = i02Var.g();
        if (w22Var2.a == g2) {
            return w22Var2;
        }
        synchronized (c) {
            m = m(w22Var, v22Var);
        }
        m.a = g2;
        if (w22Var2.a != 1) {
            i02Var.n(v22Var);
        }
        return m;
    }

    public static final boolean p(u22 u22Var) {
        w22 w22Var;
        long j2 = e;
        m02 m02Var = f;
        if (m02Var.a > 0) {
            j2 = m02Var.b[0];
        }
        w22 w22Var2 = null;
        w22 w22Var3 = null;
        int i2 = 0;
        for (w22 a2 = u22Var.a(); a2 != null; a2 = a2.b) {
            long j3 = a2.a;
            if (j3 != 0) {
                if (sn0.C(j3, j2) < 0) {
                    if (w22Var2 == null) {
                        i2++;
                        w22Var2 = a2;
                    } else {
                        if (sn0.C(a2.a, w22Var2.a) < 0) {
                            w22Var = w22Var2;
                            w22Var2 = a2;
                        } else {
                            w22Var = a2;
                        }
                        if (w22Var3 == null) {
                            w22Var3 = u22Var.a();
                            w22 w22Var4 = w22Var3;
                            while (true) {
                                if (w22Var3 != null) {
                                    if (sn0.C(w22Var3.a, j2) >= 0) {
                                        break;
                                    }
                                    if (sn0.C(w22Var4.a, w22Var3.a) < 0) {
                                        w22Var4 = w22Var3;
                                    }
                                    w22Var3 = w22Var3.b;
                                } else {
                                    w22Var3 = w22Var4;
                                    break;
                                }
                            }
                        }
                        w22Var2.a = 0L;
                        w22Var2.a(w22Var3);
                        w22Var2 = w22Var;
                    }
                } else {
                    i2++;
                }
            }
        }
        if (i2 <= 1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void q(u22 u22Var) {
        Object obj;
        Object obj2;
        Object obj3;
        if (p(u22Var)) {
            u7 u7Var = g;
            int i2 = u7Var.a;
            int identityHashCode = System.identityHashCode(u22Var);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = u7Var.a - 1;
                int i5 = 0;
                while (true) {
                    if (i5 <= i4) {
                        int i6 = (i5 + i4) >>> 1;
                        int i7 = ((int[]) u7Var.b)[i6];
                        if (i7 < identityHashCode) {
                            i5 = i6 + 1;
                        } else if (i7 > identityHashCode) {
                            i4 = i6 - 1;
                        } else {
                            ih2 ih2Var = ((ih2[]) u7Var.c)[i6];
                            if (ih2Var != null) {
                                obj = ih2Var.get();
                            } else {
                                obj = null;
                            }
                            if (u22Var != obj) {
                                for (int i8 = i6 - 1; -1 < i8 && ((int[]) u7Var.b)[i8] == identityHashCode; i8--) {
                                    ih2 ih2Var2 = ((ih2[]) u7Var.c)[i8];
                                    if (ih2Var2 != null) {
                                        obj3 = ih2Var2.get();
                                    } else {
                                        obj3 = null;
                                    }
                                    if (obj3 == u22Var) {
                                        i3 = i8;
                                        break;
                                    }
                                }
                                i6++;
                                int i9 = u7Var.a;
                                while (true) {
                                    if (i6 < i9) {
                                        if (((int[]) u7Var.b)[i6] != identityHashCode) {
                                            i3 = -(i6 + 1);
                                            break;
                                        }
                                        ih2 ih2Var3 = ((ih2[]) u7Var.c)[i6];
                                        if (ih2Var3 != null) {
                                            obj2 = ih2Var3.get();
                                        } else {
                                            obj2 = null;
                                        }
                                        if (obj2 == u22Var) {
                                            break;
                                        } else {
                                            i6++;
                                        }
                                    } else {
                                        i3 = -(u7Var.a + 1);
                                        break;
                                    }
                                }
                            }
                            i3 = i6;
                        }
                    } else {
                        i3 = -(i5 + 1);
                        break;
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            ih2[] ih2VarArr = (ih2[]) u7Var.c;
            int length = ih2VarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                ih2[] ih2VarArr2 = new ih2[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(ih2VarArr, i10, ih2VarArr2, i12, i2 - i10);
                System.arraycopy((ih2[]) u7Var.c, 0, ih2VarArr2, 0, i10);
                bf.B((int[]) u7Var.b, iArr, i12, i10, i2);
                bf.F((int[]) u7Var.b, iArr, 0, i10, 6);
                u7Var.c = ih2VarArr2;
                u7Var.b = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(ih2VarArr, i10, ih2VarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) u7Var.b;
                bf.B(iArr2, iArr2, i13, i10, i2);
            }
            ((ih2[]) u7Var.c)[i10] = new WeakReference(u22Var);
            ((int[]) u7Var.b)[i10] = identityHashCode;
            u7Var.a++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final w22 s(w22 w22Var, long j2, o02 o02Var) {
        w22 w22Var2 = null;
        while (w22Var != null) {
            long j3 = w22Var.a;
            if (j3 != 0 && sn0.C(j3, j2) <= 0 && !o02Var.c(j3) && (w22Var2 == null || sn0.C(w22Var2.a, w22Var.a) < 0)) {
                w22Var2 = w22Var;
            }
            w22Var = w22Var.b;
        }
        if (w22Var2 == null) {
            return null;
        }
        return w22Var2;
    }

    public static final w22 t(w22 w22Var, u22 u22Var) {
        w22 s;
        i02 j2 = j();
        oe0 e2 = j2.e();
        if (e2 != null) {
            e2.invoke(u22Var);
        }
        w22 s2 = s(w22Var, j2.g(), j2.d());
        if (s2 == null) {
            synchronized (c) {
                i02 j3 = j();
                w22 a2 = u22Var.a();
                a2.getClass();
                s = s(a2, j3.g(), j3.d());
                if (s == null) {
                    r();
                    throw null;
                }
            }
            return s;
        }
        return s2;
    }

    public static final void u(int i2) {
        m02 m02Var = f;
        int i3 = m02Var.d[i2];
        m02Var.b(i3, m02Var.a - 1);
        m02Var.a--;
        long[] jArr = m02Var.b;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (sn0.C(jArr[i5], j2) <= 0) {
                break;
            }
            m02Var.b(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = m02Var.b;
        int i6 = m02Var.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < m02Var.a && sn0.C(jArr2[i7], jArr2[i8]) < 0) {
                if (sn0.C(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                m02Var.b(i7, i3);
                i3 = i7;
            } else {
                if (sn0.C(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                m02Var.b(i8, i3);
                i3 = i8;
            }
        }
        m02Var.d[i2] = m02Var.e;
        m02Var.e = i2;
    }

    public static final Object v(of0 of0Var, oe0 oe0Var) {
        long j2 = of0Var.b;
        Object invoke = oe0Var.invoke(d.b(j2));
        long j3 = e;
        e = 1 + j3;
        o02 b2 = d.b(j2);
        d = b2;
        of0Var.b = j3;
        of0Var.a = b2;
        of0Var.g = 0;
        of0Var.h = null;
        of0Var.o();
        d = d.e(j3);
        return invoke;
    }

    public static final w22 w(w22 w22Var, u22 u22Var, i02 i02Var) {
        w22 s;
        if (i02Var.f()) {
            i02Var.n(u22Var);
        }
        long g2 = i02Var.g();
        w22 s2 = s(w22Var, g2, i02Var.d());
        if (s2 != null) {
            if (s2.a == i02Var.g()) {
                return s2;
            }
            synchronized (c) {
                s = s(u22Var.a(), g2, i02Var.d());
                if (s != null) {
                    if (s.a != g2) {
                        w22 m = m(s, u22Var);
                        m.a(s);
                        m.a = i02Var.g();
                        s = m;
                    }
                } else {
                    r();
                    throw null;
                }
            }
            if (s2.a != 1) {
                i02Var.n(u22Var);
            }
            return s;
        }
        r();
        throw null;
    }
}
