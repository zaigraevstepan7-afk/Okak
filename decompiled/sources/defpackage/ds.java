package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ds implements wr {
    public int A;
    public final xr e;
    public final gd2 f;
    public final AtomicReference g = new AtomicReference(null);
    public final Object h = new Object();
    public final l41 i;
    public final gz1 j;
    public final i41 k;
    public final j41 l;
    public final j41 m;
    public final i41 n;
    public final am o;
    public final am p;
    public final i41 q;
    public i41 r;
    public boolean s;
    public se t;
    public lf1 u;
    public ds v;
    public int w;
    public final rg2 x;
    public final fm1 y;
    public final ur z;

    public ds(xr xrVar, gd2 gd2Var) {
        this.e = xrVar;
        this.f = gd2Var;
        l41 l41Var = new l41(new j41());
        this.i = l41Var;
        gz1 gz1Var = new gz1();
        if (xrVar.d()) {
            gz1Var.o = new p31();
        }
        if (xrVar.f()) {
            gz1Var.b();
        }
        this.j = gz1Var;
        this.k = rp1.f();
        this.l = new j41();
        this.m = new j41();
        this.n = rp1.f();
        am amVar = new am();
        this.o = amVar;
        am amVar2 = new am();
        this.p = amVar2;
        this.q = rp1.f();
        this.r = rp1.f();
        rg2 rg2Var = new rg2(xrVar, 7);
        this.x = rg2Var;
        this.y = new fm1();
        ur urVar = new ur(gd2Var, xrVar, gz1Var, l41Var, amVar, amVar2, rg2Var, this);
        xrVar.p(urVar);
        this.z = urVar;
    }

    public final void A(Object obj) {
        synchronized (this.h) {
            try {
                v(obj);
                Object g = this.n.g(obj);
                if (g != null) {
                    if (g instanceof j41) {
                        j41 j41Var = (j41) g;
                        Object[] objArr = j41Var.b;
                        long[] jArr = j41Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            v((j00) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    }
                                }
                                if (i == length) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    } else {
                        v((j00) g);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B(se0 se0Var) {
        boolean i = i();
        q();
        xr xrVar = this.e;
        if (i) {
            ur urVar = this.z;
            urVar.z = 0;
            urVar.y = true;
            xrVar.a(this, se0Var);
            urVar.s();
            return;
        }
        xrVar.a(this, se0Var);
    }

    public final void a() {
        this.g.set(null);
        this.o.d.a0();
        this.p.d.a0();
        l41 l41Var = this.i;
        if (!l41Var.e.g()) {
            fm1 fm1Var = this.y;
            try {
                fm1Var.g(l41Var, this.z.z());
                fm1Var.b();
            } finally {
                fm1Var.a();
            }
        }
    }

    public final void b(Object obj, boolean z) {
        Object g = this.k.g(obj);
        if (g != null) {
            boolean z2 = g instanceof j41;
            bo0 bo0Var = bo0.e;
            j41 j41Var = this.l;
            j41 j41Var2 = this.m;
            i41 i41Var = this.q;
            if (z2) {
                j41 j41Var3 = (j41) g;
                Object[] objArr = j41Var3.b;
                long[] jArr = j41Var3.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    dl1 dl1Var = (dl1) objArr[(i << 3) + i3];
                                    if (!rp1.r(i41Var, obj, dl1Var) && dl1Var.b(obj) != bo0Var) {
                                        if (dl1Var.g != null && !z) {
                                            j41Var2.a(dl1Var);
                                        } else {
                                            j41Var.a(dl1Var);
                                        }
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                return;
                            }
                        }
                        if (i != length) {
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                dl1 dl1Var2 = (dl1) g;
                if (!rp1.r(i41Var, obj, dl1Var2) && dl1Var2.b(obj) != bo0Var) {
                    if (dl1Var2.g != null && !z) {
                        j41Var2.a(dl1Var2);
                    } else {
                        j41Var.a(dl1Var2);
                    }
                }
            }
        }
    }

    public final void c(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        boolean z2;
        long[] jArr2;
        long j4;
        boolean c2;
        boolean z3;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        int i;
        long j6;
        boolean z4;
        int i2;
        long j7;
        long[] jArr6;
        long[] jArr7;
        char c3;
        long j8;
        int i3;
        int i4;
        long[] jArr8;
        boolean z5 = set instanceof ur1;
        i41 i41Var = this.n;
        Object obj = null;
        int i5 = 8;
        if (z5) {
            j41 j41Var = ((ur1) set).e;
            Object[] objArr = j41Var.b;
            long[] jArr9 = j41Var.a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr9[i6];
                    char c4 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i6 << 3) + i8];
                                c3 = c4;
                                if (obj2 instanceof dl1) {
                                    ((dl1) obj2).b(obj);
                                } else {
                                    b(obj2, z);
                                    Object g = i41Var.g(obj2);
                                    if (g != null) {
                                        if (g instanceof j41) {
                                            j41 j41Var2 = (j41) g;
                                            Object[] objArr2 = j41Var2.b;
                                            long[] jArr10 = j41Var2.a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i9 = i5;
                                                i3 = length;
                                                int i10 = 0;
                                                while (true) {
                                                    long j10 = jArr10[i10];
                                                    j8 = j9;
                                                    long[] jArr11 = jArr10;
                                                    if ((((~j10) << c3) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                        int i12 = 0;
                                                        while (i12 < i11) {
                                                            if ((j10 & 255) < 128) {
                                                                jArr8 = jArr9;
                                                                b((j00) objArr2[(i10 << 3) + i12], z);
                                                            } else {
                                                                jArr8 = jArr9;
                                                            }
                                                            j10 >>= i9;
                                                            i12++;
                                                            jArr9 = jArr8;
                                                        }
                                                        jArr7 = jArr9;
                                                        if (i11 != i9) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr7 = jArr9;
                                                    }
                                                    if (i10 == length2) {
                                                        break;
                                                    }
                                                    i10++;
                                                    jArr10 = jArr11;
                                                    j9 = j8;
                                                    jArr9 = jArr7;
                                                    i9 = 8;
                                                }
                                            }
                                        } else {
                                            jArr7 = jArr9;
                                            j8 = j9;
                                            i3 = length;
                                            b((j00) g, z);
                                        }
                                        i4 = 8;
                                    }
                                }
                                jArr7 = jArr9;
                                j8 = j9;
                                i3 = length;
                                i4 = 8;
                            } else {
                                jArr7 = jArr9;
                                c3 = c4;
                                j8 = j9;
                                i3 = length;
                                i4 = i5;
                            }
                            j9 = j8 >> i4;
                            i8++;
                            length = i3;
                            i5 = i4;
                            c4 = c3;
                            jArr9 = jArr7;
                            obj = null;
                        }
                        jArr6 = jArr9;
                        c = c4;
                        int i13 = length;
                        if (i7 != i5) {
                            break;
                        } else {
                            length = i13;
                        }
                    } else {
                        jArr6 = jArr9;
                        c = 7;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    jArr9 = jArr6;
                    obj = null;
                    i5 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof dl1) {
                    ((dl1) obj3).b(null);
                } else {
                    b(obj3, z);
                    Object g2 = i41Var.g(obj3);
                    if (g2 != null) {
                        if (g2 instanceof j41) {
                            j41 j41Var3 = (j41) g2;
                            Object[] objArr3 = j41Var3.b;
                            long[] jArr12 = j41Var3.a;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                int i14 = 0;
                                while (true) {
                                    long j11 = jArr12[i14];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i15 = 8 - ((~(i14 - length3)) >>> 31);
                                        for (int i16 = 0; i16 < i15; i16++) {
                                            if ((j11 & 255) < 128) {
                                                b((j00) objArr3[(i14 << 3) + i16], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i15 != 8) {
                                            break;
                                        }
                                    }
                                    if (i14 != length3) {
                                        i14++;
                                    }
                                }
                            }
                        } else {
                            b((j00) g2, z);
                        }
                    }
                }
            }
        }
        i41 i41Var2 = this.k;
        j41 j41Var4 = this.l;
        if (z) {
            j41 j41Var5 = this.m;
            if (j41Var5.h()) {
                long[] jArr13 = i41Var2.a;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j12 = jArr13[i17];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i18 = 8 - ((~(i17 - length4)) >>> 31);
                            int i19 = 0;
                            while (i19 < i18) {
                                if ((j12 & j2) < j) {
                                    int i20 = (i17 << 3) + i19;
                                    Object obj4 = i41Var2.b[i20];
                                    Object obj5 = i41Var2.c[i20];
                                    if (obj5 instanceof j41) {
                                        j41 j41Var6 = (j41) obj5;
                                        Object[] objArr4 = j41Var6.b;
                                        long[] jArr14 = j41Var6.a;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i21 = 0;
                                            while (true) {
                                                long j13 = jArr14[i21];
                                                jArr5 = jArr13;
                                                i = length4;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i22 = 8 - ((~(i21 - length5)) >>> 31);
                                                    for (int i23 = 0; i23 < i22; i23 = i2 + 1) {
                                                        if ((j13 & j2) < j) {
                                                            i2 = i23;
                                                            int i24 = (i21 << 3) + i2;
                                                            j7 = j13;
                                                            dl1 dl1Var = (dl1) objArr4[i24];
                                                            if (j41Var5.c(dl1Var) || j41Var4.c(dl1Var)) {
                                                                j41Var6.m(i24);
                                                            }
                                                        } else {
                                                            i2 = i23;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                    }
                                                    if (i22 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i21 == length5) {
                                                    break;
                                                }
                                                i21++;
                                                length4 = i;
                                                jArr13 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            i = length4;
                                            j6 = j12;
                                        }
                                        z4 = j41Var6.g();
                                    } else {
                                        jArr5 = jArr13;
                                        i = length4;
                                        j6 = j12;
                                        obj5.getClass();
                                        dl1 dl1Var2 = (dl1) obj5;
                                        if (!j41Var5.c(dl1Var2) && !j41Var4.c(dl1Var2)) {
                                            z4 = false;
                                        } else {
                                            z4 = true;
                                        }
                                    }
                                    if (z4) {
                                        i41Var2.l(i20);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    i = length4;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i19++;
                                length4 = i;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            int i25 = length4;
                            if (i18 != 8) {
                                break;
                            } else {
                                length4 = i25;
                            }
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i17 == length4) {
                            break;
                        }
                        i17++;
                        jArr13 = jArr4;
                    }
                }
                j41Var5.b();
                h();
                return;
            }
        }
        if (j41Var4.h()) {
            long[] jArr15 = i41Var2.a;
            int length6 = jArr15.length - 2;
            if (length6 >= 0) {
                int i26 = 0;
                while (true) {
                    long j14 = jArr15[i26];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i27 = 8 - ((~(i26 - length6)) >>> 31);
                        int i28 = 0;
                        while (i28 < i27) {
                            if ((j14 & j2) < j) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                int i29 = (i26 << 3) + i28;
                                Object obj6 = i41Var2.b[i29];
                                Object obj7 = i41Var2.c[i29];
                                if (obj7 instanceof j41) {
                                    j41 j41Var7 = (j41) obj7;
                                    Object[] objArr5 = j41Var7.b;
                                    long[] jArr16 = j41Var7.a;
                                    int length7 = jArr16.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i30 = 0;
                                        while (true) {
                                            long j15 = jArr16[i30];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr17 = jArr16;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i31 = 8 - ((~(i30 - length7)) >>> 31);
                                                int i32 = 0;
                                                while (i32 < i31) {
                                                    if ((j15 & j2) < j) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    if (z3) {
                                                        jArr3 = jArr15;
                                                        int i33 = (i30 << 3) + i32;
                                                        j5 = j15;
                                                        if (j41Var4.c((dl1) objArr6[i33])) {
                                                            j41Var7.m(i33);
                                                        }
                                                    } else {
                                                        jArr3 = jArr15;
                                                        j5 = j15;
                                                    }
                                                    i32++;
                                                    jArr15 = jArr3;
                                                    j15 = j5 >> 8;
                                                }
                                                jArr2 = jArr15;
                                                if (i31 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr15;
                                            }
                                            if (i30 == length7) {
                                                break;
                                            }
                                            i30++;
                                            objArr5 = objArr6;
                                            jArr16 = jArr17;
                                            jArr15 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr15;
                                        j4 = j14;
                                    }
                                    c2 = j41Var7.g();
                                } else {
                                    jArr2 = jArr15;
                                    j4 = j14;
                                    obj7.getClass();
                                    c2 = j41Var4.c((dl1) obj7);
                                }
                                if (c2) {
                                    i41Var2.l(i29);
                                }
                            } else {
                                jArr2 = jArr15;
                                j4 = j14;
                            }
                            i28++;
                            j14 = j4 >> 8;
                            jArr15 = jArr2;
                        }
                        jArr = jArr15;
                        if (i27 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr15;
                    }
                    if (i26 == length6) {
                        break;
                    }
                    i26++;
                    jArr15 = jArr;
                }
            }
            h();
            j41Var4.b();
        }
    }

    public final void d() {
        synchronized (this.h) {
            try {
                e(this.o);
                o();
            } catch (Throwable th) {
                try {
                    if (!this.i.e.g()) {
                        fm1 fm1Var = this.y;
                        try {
                            fm1Var.g(this.i, this.z.z());
                            fm1Var.b();
                            fm1Var.a();
                        } catch (Throwable th2) {
                            fm1Var.a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #9 {all -> 0x003e, blocks: (B:3:0x0013, B:5:0x0035, B:7:0x0039, B:11:0x0047, B:12:0x004b, B:16:0x0056, B:29:0x007d, B:31:0x008a, B:148:0x0043), top: B:2:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.am r34) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds.e(am):void");
    }

    public final void f() {
        synchronized (this.h) {
            try {
                if (this.p.d.d0()) {
                    e(this.p);
                }
            } catch (Throwable th) {
                try {
                    if (!this.i.e.g()) {
                        fm1 fm1Var = this.y;
                        try {
                            fm1Var.g(this.i, this.z.z());
                            fm1Var.b();
                            fm1Var.a();
                        } catch (Throwable th2) {
                            fm1Var.a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    public final void g() {
        fm1 fm1Var;
        synchronized (this.h) {
            try {
                this.z.v = null;
                if (!this.i.e.g()) {
                    fm1Var = this.y;
                    try {
                        fm1Var.g(this.i, this.z.z());
                        fm1Var.b();
                        fm1Var.a();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.i.e.g()) {
                        fm1Var = this.y;
                        try {
                            fm1Var.g(this.i, this.z.z());
                            fm1Var.b();
                            fm1Var.a();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    public final void h() {
        char c;
        long j;
        long j2;
        long j3;
        boolean z;
        boolean z2;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        char c2;
        long j5;
        long j6;
        int i2;
        boolean z3;
        int i3;
        long j7;
        i41 i41Var = this.n;
        long[] jArr3 = i41Var.a;
        int length = jArr3.length - 2;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            long j9 = 128;
            while (true) {
                long j10 = jArr3[i5];
                j2 = 255;
                if ((((~j10) << c3) & j10 & j8) != j8) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j10 & 255) < j9) {
                            c2 = c3;
                            int i8 = (i5 << 3) + i7;
                            j5 = j8;
                            Object obj = i41Var.b[i8];
                            Object obj2 = i41Var.c[i8];
                            boolean z4 = obj2 instanceof j41;
                            i41 i41Var2 = this.k;
                            if (z4) {
                                j41 j41Var = (j41) obj2;
                                Object[] objArr = j41Var.b;
                                long[] jArr4 = j41Var.a;
                                j6 = j9;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j4 = j10;
                                    int i9 = i4;
                                    int i10 = 0;
                                    while (true) {
                                        long j11 = jArr4[i10];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j11) << c2) & j11 & j5) != j5) {
                                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                            int i12 = 0;
                                            while (i12 < i11) {
                                                if ((j11 & 255) < j6) {
                                                    i3 = i12;
                                                    int i13 = (i10 << 3) + i3;
                                                    j7 = j11;
                                                    if (!i41Var2.c((j00) objArr[i13])) {
                                                        j41Var.m(i13);
                                                    }
                                                } else {
                                                    i3 = i12;
                                                    j7 = j11;
                                                }
                                                j11 = j7 >> i9;
                                                i12 = i3 + 1;
                                            }
                                            if (i11 != i9) {
                                                break;
                                            }
                                        }
                                        if (i10 == length2) {
                                            break;
                                        }
                                        i10++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    j4 = j10;
                                }
                                z3 = j41Var.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                j4 = j10;
                                j6 = j9;
                                obj2.getClass();
                                if (!i41Var2.c((j00) obj2)) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            }
                            if (z3) {
                                i41Var.l(i8);
                            }
                            i2 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            j4 = j10;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i2 = i4;
                        }
                        j10 = j4 >> i2;
                        i7++;
                        i4 = i2;
                        c3 = c2;
                        j8 = j5;
                        j9 = j6;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i14 = length;
                    c = c3;
                    j = j8;
                    j3 = j9;
                    if (i6 != i4) {
                        break;
                    } else {
                        length = i14;
                    }
                } else {
                    jArr = jArr3;
                    c = c3;
                    j = j8;
                    j3 = j9;
                }
                if (i5 == length) {
                    break;
                }
                i5++;
                c3 = c;
                j8 = j;
                j9 = j3;
                jArr3 = jArr;
                i4 = 8;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        j41 j41Var2 = this.m;
        if (j41Var2.h()) {
            Object[] objArr2 = j41Var2.b;
            long[] jArr5 = j41Var2.a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i15 = 0;
                while (true) {
                    long j12 = jArr5[i15];
                    if ((((~j12) << c) & j12 & j) != j) {
                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j12 & j2) < j3) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                int i18 = (i15 << 3) + i17;
                                if (((dl1) objArr2[i18]).g != null) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!z2) {
                                    j41Var2.m(i18);
                                }
                            }
                            j12 >>= 8;
                        }
                        if (i16 != 8) {
                            return;
                        }
                    }
                    if (i15 != length3) {
                        i15++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final boolean i() {
        boolean z;
        synchronized (this.h) {
            z = true;
            if (this.A != 1) {
                z = false;
            }
            if (z) {
                this.A = 0;
            }
        }
        return z;
    }

    public final void j(se0 se0Var) {
        try {
            synchronized (this.h) {
                n();
                i41 i41Var = this.r;
                this.r = rp1.f();
                try {
                    ur urVar = this.z;
                    se seVar = this.t;
                    if (!urVar.e.d.c0()) {
                        vr.a("Expected applyChanges() to have been called");
                    }
                    urVar.P = seVar;
                    try {
                        urVar.n(i41Var, se0Var);
                    } finally {
                        urVar.P = null;
                    }
                } catch (Throwable th) {
                    this.r = i41Var;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.i.e.g()) {
                    fm1 fm1Var = this.y;
                    try {
                        fm1Var.g(this.i, this.z.z());
                        fm1Var.b();
                        fm1Var.a();
                    } catch (Throwable th3) {
                        fm1Var.a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final lf1 k(boolean z, se0 se0Var) {
        if (this.u != null) {
            ei1.b("A pausable composition is in progress");
        }
        lf1 lf1Var = new lf1(this, this.e, this.z, this.i, se0Var, z, this.f, this.h);
        this.u = lf1Var;
        return lf1Var;
    }

    public final void l() {
        boolean z;
        fm1 fm1Var;
        synchronized (this.h) {
            try {
                if (this.u != null) {
                    ei1.b("Deactivate is not supported while pausable composition is in progress");
                }
                if (this.j.f > 0) {
                    z = true;
                } else {
                    z = false;
                }
                try {
                    try {
                        if (!z) {
                            if (!this.i.e.g()) {
                            }
                            this.k.a();
                            this.n.a();
                            this.r.a();
                            this.o.d.a0();
                            this.p.d.a0();
                            ur urVar = this.z;
                            urVar.E.clear();
                            urVar.s.clear();
                            urVar.e.d.a0();
                            urVar.v = null;
                            this.A = 1;
                        }
                        fm1Var.g(this.i, this.z.z());
                        if (z) {
                            jz1 d = this.j.d();
                            try {
                                d.n(d.t, new u2(6, this.y, d));
                                d.e(true);
                                this.f.k();
                                fm1Var.c();
                            } catch (Throwable th) {
                                d.e(false);
                                throw th;
                            }
                        }
                        fm1Var.b();
                        fm1Var.a();
                        this.k.a();
                        this.n.a();
                        this.r.a();
                        this.o.d.a0();
                        this.p.d.a0();
                        ur urVar2 = this.z;
                        urVar2.E.clear();
                        urVar2.s.clear();
                        urVar2.e.d.a0();
                        urVar2.v = null;
                        this.A = 1;
                    } catch (Throwable th2) {
                        fm1Var.a();
                        throw th2;
                    }
                    fm1Var = this.y;
                } finally {
                    Trace.endSection();
                }
                Trace.beginSection("Compose:deactivate");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void m() {
        boolean z;
        synchronized (this.h) {
            try {
                if (this.z.F) {
                    ei1.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                int i = 3;
                if (this.A != 3) {
                    this.A = 3;
                    am amVar = this.z.L;
                    if (amVar != null) {
                        e(amVar);
                    }
                    if (this.j.f > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z || !this.i.e.g()) {
                        fm1 fm1Var = this.y;
                        try {
                            fm1Var.g(this.i, this.z.z());
                            if (z) {
                                jz1 d = this.j.d();
                                try {
                                    d.n(d.t, new h8(this.y, i));
                                    d.H();
                                    d.e(true);
                                    this.f.a();
                                    this.f.k();
                                    fm1Var.c();
                                } catch (Throwable th) {
                                    d.e(false);
                                    throw th;
                                }
                            }
                            fm1Var.b();
                            fm1Var.a();
                        } catch (Throwable th2) {
                            fm1Var.a();
                            throw th2;
                        }
                    }
                    ur urVar = this.z;
                    urVar.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        urVar.b.u(urVar);
                        urVar.E.clear();
                        urVar.s.clear();
                        urVar.e.d.a0();
                        urVar.v = null;
                        urVar.a.a();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.e.v(this);
    }

    public final void n() {
        Object obj = c01.m;
        AtomicReference atomicReference = this.g;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (!andSet.equals(obj)) {
                if (andSet instanceof Set) {
                    c((Set) andSet, true);
                    return;
                }
                if (andSet instanceof Object[]) {
                    for (Set set : (Set[]) andSet) {
                        c(set, true);
                    }
                    return;
                }
                vr.b("corrupt pendingModifications drain: " + atomicReference);
                se.c();
                return;
            }
            vr.b("pending composition has not been applied");
            se.c();
        }
    }

    public final void o() {
        AtomicReference atomicReference = this.g;
        Object andSet = atomicReference.getAndSet(null);
        if (!sn0.r(andSet, c01.m)) {
            if (andSet instanceof Set) {
                c((Set) andSet, false);
                return;
            }
            if (andSet instanceof Object[]) {
                for (Set set : (Set[]) andSet) {
                    c(set, false);
                }
                return;
            }
            if (andSet == null) {
                if (this.u == null) {
                    vr.a("calling recordModificationsOf and applyChanges concurrently is not supported");
                }
            } else {
                vr.b("corrupt pendingModifications drain: " + atomicReference);
                se.c();
            }
        }
    }

    public final void p() {
        p60 p60Var = p60.e;
        AtomicReference atomicReference = this.g;
        Object andSet = atomicReference.getAndSet(p60Var);
        if (!sn0.r(andSet, c01.m) && andSet != null) {
            if (andSet instanceof Set) {
                c((Set) andSet, false);
                return;
            }
            if (andSet instanceof Object[]) {
                for (Set set : (Set[]) andSet) {
                    c(set, false);
                }
                return;
            }
            vr.b("corrupt pendingModifications drain: " + atomicReference);
            se.c();
        }
    }

    public final void q() {
        String str;
        int i = this.A;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        str = "";
                    } else {
                        str = "The composition is disposed";
                    }
                } else {
                    str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
                }
            } else {
                str = "The composition should be activated before setting content.";
            }
            ei1.b(str);
        }
        if (this.u == null) {
            return;
        }
        ei1.b("A pausable composition is in progress");
    }

    public final void r(ArrayList arrayList) {
        l41 l41Var = this.i;
        ur urVar = this.z;
        if (arrayList.size() > 0) {
            ((d31) ((xd1) arrayList.get(0)).e).getClass();
            vr.a("Check failed");
        }
        try {
            urVar.getClass();
            try {
                urVar.B(arrayList);
                urVar.i();
            } catch (Throwable th) {
                urVar.a();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                if (!l41Var.e.g()) {
                    fm1 fm1Var = this.y;
                    try {
                        fm1Var.g(l41Var, urVar.z());
                        fm1Var.b();
                        fm1Var.a();
                    } catch (Throwable th3) {
                        fm1Var.a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final bo0 s(dl1 dl1Var, Object obj) {
        ds dsVar;
        int i = dl1Var.b;
        if ((i & 2) != 0) {
            dl1Var.b = i | 4;
        }
        p3 p3Var = dl1Var.c;
        if (p3Var != null && p3Var.a()) {
            if (!this.j.e(p3Var)) {
                synchronized (this.h) {
                    dsVar = this.v;
                }
                if (dsVar != null) {
                    ur urVar = dsVar.z;
                    if (urVar.F && urVar.c0(dl1Var, obj)) {
                        return bo0.h;
                    }
                }
                return bo0.e;
            }
            if (dl1Var.d != null) {
                bo0 u = u(dl1Var, p3Var, obj);
                if (u != bo0.e) {
                    this.x.g();
                }
                return u;
            }
            return bo0.e;
        }
        return bo0.e;
    }

    public final void t() {
        dl1 dl1Var;
        ds dsVar;
        synchronized (this.h) {
            try {
                for (Object obj : this.j.g) {
                    if (obj instanceof dl1) {
                        dl1Var = (dl1) obj;
                    } else {
                        dl1Var = null;
                    }
                    if (dl1Var != null && (dsVar = dl1Var.a) != null) {
                        dsVar.s(dl1Var, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final bo0 u(dl1 dl1Var, p3 p3Var, Object obj) {
        boolean z;
        int i;
        synchronized (this.h) {
            try {
                ds dsVar = this.v;
                ds dsVar2 = null;
                if (dsVar != null) {
                    gz1 gz1Var = this.j;
                    int i2 = this.w;
                    if (gz1Var.k) {
                        vr.a("Writer is active");
                    }
                    if (i2 < 0 || i2 >= gz1Var.f) {
                        vr.a("Invalid group index");
                    }
                    if (gz1Var.e(p3Var)) {
                        int i3 = gz1Var.e[(i2 * 5) + 3] + i2;
                        int i4 = p3Var.a;
                        if (i2 <= i4 && i4 < i3) {
                            dsVar2 = dsVar;
                        }
                    }
                    dsVar = null;
                    dsVar2 = dsVar;
                }
                if (dsVar2 == null) {
                    ur urVar = this.z;
                    if (urVar.F && urVar.c0(dl1Var, obj)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return bo0.h;
                    }
                    if (obj == null) {
                        this.r.m(dl1Var, xl1.g);
                    } else {
                        boolean z2 = obj instanceof j00;
                        i41 i41Var = this.r;
                        if (!z2) {
                            i41Var.m(dl1Var, xl1.g);
                        } else {
                            Object g = i41Var.g(dl1Var);
                            if (g != null) {
                                if (g instanceof j41) {
                                    j41 j41Var = (j41) g;
                                    Object[] objArr = j41Var.b;
                                    long[] jArr = j41Var.a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i5 = 0;
                                        loop0: while (true) {
                                            long j = jArr[i5];
                                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i6 = 8;
                                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                                int i8 = 0;
                                                while (i8 < i7) {
                                                    if ((j & 255) < 128) {
                                                        i = i6;
                                                        if (objArr[(i5 << 3) + i8] == xl1.g) {
                                                            break loop0;
                                                        }
                                                    } else {
                                                        i = i6;
                                                    }
                                                    j >>= i;
                                                    i8++;
                                                    i6 = i;
                                                }
                                                if (i7 != i6) {
                                                    break;
                                                }
                                            }
                                            if (i5 == length) {
                                                break;
                                            }
                                            i5++;
                                        }
                                    }
                                } else if (g == xl1.g) {
                                }
                            }
                            rp1.e(this.r, dl1Var, obj);
                        }
                    }
                }
                if (dsVar2 != null) {
                    return dsVar2.u(dl1Var, p3Var, obj);
                }
                this.e.l(this);
                if (this.z.F) {
                    return bo0.g;
                }
                return bo0.f;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v(Object obj) {
        Object g = this.k.g(obj);
        if (g != null) {
            boolean z = g instanceof j41;
            bo0 bo0Var = bo0.h;
            i41 i41Var = this.q;
            if (z) {
                j41 j41Var = (j41) g;
                Object[] objArr = j41Var.b;
                long[] jArr = j41Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    dl1 dl1Var = (dl1) objArr[(i << 3) + i3];
                                    if (dl1Var.b(obj) == bo0Var) {
                                        rp1.e(i41Var, obj, dl1Var);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                return;
                            }
                        }
                        if (i != length) {
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                dl1 dl1Var2 = (dl1) g;
                if (dl1Var2.b(obj) == bo0Var) {
                    rp1.e(i41Var, obj, dl1Var2);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w(java.util.Set r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof defpackage.ur1
            i41 r3 = r0.n
            i41 r0 = r0.k
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L5e
            ur1 r1 = (defpackage.ur1) r1
            j41 r1 = r1.e
            java.lang.Object[] r2 = r1.b
            long[] r1 = r1.a
            int r6 = r1.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L7b
            r7 = r4
        L1c:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L36:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r2[r13]
            boolean r14 = r0.c(r13)
            if (r14 != 0) goto L52
            boolean r13 = r3.c(r13)
            if (r13 == 0) goto L53
        L52:
            return r5
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L36
        L57:
            if (r10 != r11) goto L7b
        L59:
            if (r7 == r6) goto L7b
            int r7 = r7 + 1
            goto L1c
        L5e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            boolean r6 = r0.c(r2)
            if (r6 != 0) goto L7a
            boolean r2 = r3.c(r2)
            if (r2 == 0) goto L64
        L7a:
            return r5
        L7b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds.w(java.util.Set):boolean");
    }

    public final boolean x() {
        synchronized (this.h) {
            lf1 lf1Var = this.u;
            boolean z = false;
            if (lf1Var != null && (lf1Var.h.get() != nf1.i || lf1Var.i != rp1.g())) {
                AtomicReference atomicReference = lf1Var.h;
                nf1 nf1Var = nf1.j;
                nf1 nf1Var2 = nf1.h;
                while (!atomicReference.compareAndSet(nf1Var, nf1Var2) && atomicReference.get() == nf1Var) {
                }
                lf1Var.l.e.a(9);
                return false;
            }
            n();
            try {
                i41 i41Var = this.r;
                this.r = rp1.f();
                try {
                    ur urVar = this.z;
                    se seVar = this.t;
                    pb1 pb1Var = urVar.e.d;
                    if (!pb1Var.c0()) {
                        vr.a("Expected applyChanges() to have been called");
                    }
                    if (i41Var.e > 0 || !urVar.s.isEmpty()) {
                        urVar.P = seVar;
                        try {
                            urVar.n(i41Var, null);
                            urVar.P = null;
                            z = pb1Var.d0();
                        } catch (Throwable th) {
                            urVar.P = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        o();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.r = i41Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.i.e.g()) {
                        fm1 fm1Var = this.y;
                        try {
                            fm1Var.g(this.i, this.z.z());
                            fm1Var.b();
                            fm1Var.a();
                        } catch (Throwable th4) {
                            fm1Var.a();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    a();
                    throw th5;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object[]] */
    public final void y(ur1 ur1Var) {
        ur1 ur1Var2;
        while (true) {
            Object obj = this.g.get();
            if (obj != null && !obj.equals(c01.m)) {
                if (obj instanceof Set) {
                    ur1Var2 = new Set[]{obj, ur1Var};
                } else if (obj instanceof Object[]) {
                    Set[] setArr = (Set[]) obj;
                    int length = setArr.length;
                    ?? copyOf = Arrays.copyOf(setArr, length + 1);
                    copyOf[length] = ur1Var;
                    ur1Var2 = copyOf;
                } else {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.g).toString());
                }
            } else {
                ur1Var2 = ur1Var;
            }
            AtomicReference atomicReference = this.g;
            while (!atomicReference.compareAndSet(obj, ur1Var2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.h) {
                    o();
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds.z(java.lang.Object):void");
    }
}
