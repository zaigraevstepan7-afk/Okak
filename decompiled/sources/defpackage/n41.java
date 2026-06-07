package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class n41 extends i02 {
    public static final int[] n = new int[0];
    public final oe0 e;
    public final oe0 f;
    public int g;
    public j41 h;
    public ArrayList i;
    public o02 j;
    public int[] k;
    public int l;
    public boolean m;

    public n41(long j, o02 o02Var, oe0 oe0Var, oe0 oe0Var2) {
        super(j, o02Var);
        this.e = oe0Var;
        this.f = oe0Var2;
        this.j = o02.i;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (q02.c) {
            this.j = this.j.e(j);
        }
    }

    public void B(j41 j41Var) {
        this.h = j41Var;
    }

    public n41 C(oe0 oe0Var, oe0 oe0Var2) {
        j71 j71Var;
        if (this.c) {
            ei1.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            ei1.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = q02.c;
        synchronized (obj) {
            long j = q02.e;
            q02.e = j + 1;
            q02.d = q02.d.e(j);
            o02 d = d();
            r(d.e(j));
            j71Var = new j71(j, q02.d(d, g() + 1, j), q02.k(oe0Var, e(), true), q02.l(oe0Var2, i()), this);
        }
        if (!this.m && !this.c) {
            long g = g();
            synchronized (obj) {
                long j2 = q02.e;
                q02.e = j2 + 1;
                s(j2);
                q02.d = q02.d.e(g());
            }
            r(q02.d(d(), g + 1, g()));
            return j71Var;
        }
        return j71Var;
    }

    @Override // defpackage.i02
    public final void b() {
        q02.d = q02.d.b(g()).a(this.j);
    }

    @Override // defpackage.i02
    public void c() {
        if (!this.c) {
            this.c = true;
            synchronized (q02.c) {
                o();
            }
            l();
        }
    }

    @Override // defpackage.i02
    public boolean f() {
        return false;
    }

    @Override // defpackage.i02
    public int h() {
        return this.g;
    }

    @Override // defpackage.i02
    public oe0 i() {
        return this.f;
    }

    @Override // defpackage.i02
    public void k() {
        this.l++;
    }

    @Override // defpackage.i02
    public void l() {
        if (this.l <= 0) {
            ei1.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i == 0 && !this.m) {
            j41 x = x();
            if (x != null) {
                if (this.m) {
                    ei1.b("Unsupported operation on a snapshot that has been applied");
                }
                B(null);
                long g = g();
                Object[] objArr = x.b;
                long[] jArr = x.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    for (w22 a = ((u22) objArr[(i2 << 3) + i4]).a(); a != null; a = a.b) {
                                        long j2 = a.a;
                                        if (j2 == g || wn.f0(this.j, Long.valueOf(j2))) {
                                            nv1 nv1Var = q02.a;
                                            a.a = 0L;
                                        }
                                    }
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
            a();
        }
    }

    @Override // defpackage.i02
    public void m() {
        if (!this.m && !this.c) {
            v();
        }
    }

    @Override // defpackage.i02
    public void n(u22 u22Var) {
        j41 x = x();
        if (x == null) {
            j41 j41Var = tr1.a;
            x = new j41();
            B(x);
        }
        x.a(u22Var);
    }

    @Override // defpackage.i02
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            q02.u(this.k[i]);
        }
        o();
    }

    @Override // defpackage.i02
    public void t(int i) {
        this.g = i;
    }

    @Override // defpackage.i02
    public i02 u(oe0 oe0Var) {
        k71 k71Var;
        if (this.c) {
            ei1.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            ei1.b("Unsupported operation on a disposed or applied snapshot");
        }
        long g = g();
        A(g());
        Object obj = q02.c;
        synchronized (obj) {
            long j = q02.e;
            q02.e = j + 1;
            q02.d = q02.d.e(j);
            k71Var = new k71(j, q02.d(d(), g + 1, j), q02.k(oe0Var, e(), true), this);
        }
        if (!this.m && !this.c) {
            long g2 = g();
            synchronized (obj) {
                long j2 = q02.e;
                q02.e = j2 + 1;
                s(j2);
                q02.d = q02.d.e(g());
            }
            r(q02.d(d(), g2 + 1, g()));
            return k71Var;
        }
        return k71Var;
    }

    public final void v() {
        A(g());
        if (!this.m && !this.c) {
            long g = g();
            synchronized (q02.c) {
                long j = q02.e;
                q02.e = j + 1;
                s(j);
                q02.d = q02.d.e(g());
            }
            r(q02.d(d(), g + 1, g()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab A[LOOP:1: B:31:0x00a9->B:32:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111 A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:37:0x00ba, B:39:0x00ca, B:42:0x00d6, B:44:0x00e2, B:46:0x00ec, B:48:0x00f2, B:50:0x0100, B:56:0x0111, B:59:0x011b, B:61:0x0125, B:63:0x012f, B:65:0x0135, B:67:0x013f, B:73:0x0147, B:75:0x014a, B:77:0x014e, B:79:0x0155, B:81:0x0161, B:87:0x0108), top: B:36:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014e A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:37:0x00ba, B:39:0x00ca, B:42:0x00d6, B:44:0x00e2, B:46:0x00ec, B:48:0x00f2, B:50:0x0100, B:56:0x0111, B:59:0x011b, B:61:0x0125, B:63:0x012f, B:65:0x0135, B:67:0x013f, B:73:0x0147, B:75:0x014a, B:77:0x014e, B:79:0x0155, B:81:0x0161, B:87:0x0108), top: B:36:0x00ba }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.xq1 w() {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n41.w():xq1");
    }

    public j41 x() {
        return this.h;
    }

    @Override // defpackage.i02
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public oe0 e() {
        return this.e;
    }

    public final xq1 z(long j, j41 j41Var, HashMap hashMap, o02 o02Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        o02 o02Var2;
        Object[] objArr;
        long[] jArr;
        o02 o02Var3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList4;
        w22 b;
        xd1 xd1Var;
        ArrayList arrayList5;
        o02 d = d().e(g()).d(this.j);
        Object[] objArr3 = j41Var.b;
        long[] jArr3 = j41Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            u22 u22Var = (u22) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            w22 a = u22Var.a();
                            i = i4;
                            ArrayList arrayList6 = arrayList3;
                            w22 s = q02.s(a, j, o02Var);
                            if (s == null) {
                                arrayList4 = arrayList2;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayList2;
                                j2 = j3;
                                w22 s2 = q02.s(a, g(), d);
                                if (s2 != null && s2.a != 1 && !s.equals(s2)) {
                                    o02Var3 = d;
                                    w22 s3 = q02.s(a, g(), d());
                                    if (s3 != null) {
                                        if (hashMap == null || (b = (w22) hashMap.get(s)) == null) {
                                            b = u22Var.b(s2, s, s3);
                                        }
                                        if (b == null) {
                                            return new k02(this);
                                        }
                                        if (!b.equals(s3)) {
                                            if (b.equals(s)) {
                                                if (arrayList6 == null) {
                                                    arrayList5 = new ArrayList();
                                                } else {
                                                    arrayList5 = arrayList6;
                                                }
                                                arrayList5.add(new xd1(u22Var, s.b(g())));
                                                if (arrayList4 == null) {
                                                    arrayList2 = new ArrayList();
                                                } else {
                                                    arrayList2 = arrayList4;
                                                }
                                                arrayList2.add(u22Var);
                                                arrayList3 = arrayList5;
                                            } else {
                                                if (arrayList6 == null) {
                                                    arrayList3 = new ArrayList();
                                                } else {
                                                    arrayList3 = arrayList6;
                                                }
                                                if (!b.equals(s2)) {
                                                    xd1Var = new xd1(u22Var, b);
                                                } else {
                                                    xd1Var = new xd1(u22Var, s2.b(g()));
                                                }
                                                arrayList3.add(xd1Var);
                                                arrayList2 = arrayList4;
                                            }
                                        }
                                        arrayList3 = arrayList6;
                                        arrayList2 = arrayList4;
                                    } else {
                                        q02.r();
                                        throw null;
                                    }
                                }
                            }
                            o02Var3 = d;
                            arrayList3 = arrayList6;
                            arrayList2 = arrayList4;
                        } else {
                            o02Var3 = d;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        d = o02Var3;
                    }
                    o02Var2 = d;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    o02Var2 = d;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 != length) {
                    i2++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    d = o02Var2;
                } else {
                    arrayList = arrayList3;
                    break;
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            v();
            int size = arrayList3.size();
            for (int i5 = 0; i5 < size; i5++) {
                xd1 xd1Var2 = (xd1) arrayList3.get(i5);
                u22 u22Var2 = (u22) xd1Var2.e;
                w22 w22Var = (w22) xd1Var2.f;
                w22Var.a = j;
                synchronized (q02.c) {
                    w22Var.b = u22Var2.a();
                    u22Var2.d(w22Var);
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                j41Var.l((u22) arrayList2.get(i6));
            }
            ArrayList arrayList7 = this.i;
            if (arrayList7 != null) {
                arrayList2 = wn.q0(arrayList2, arrayList7);
            }
            this.i = arrayList2;
        }
        return l02.a;
    }
}
