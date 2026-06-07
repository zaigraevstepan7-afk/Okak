package defpackage;

import com.topjohnwu.superuser.internal.HiddenAPIs;
import com.topjohnwu.superuser.nio.FileSystemManager;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class hd {
    public static final js a = new js(new h2(3));
    public static final float b;
    public static final float c;

    static {
        new yt0(new h2(4));
        new vv(0.8f, 0.0f, 0.8f, 0.15f);
        b = 4.0f;
        c = 12.0f;
    }

    public static final void a(final fq fqVar, e21 e21Var, final fq fqVar2, te0 te0Var, float f, th2 th2Var, ua2 ua2Var, pc1 pc1Var, ur urVar, final int i) {
        boolean z;
        final e21 e21Var2;
        final te0 te0Var2;
        final float f2;
        final th2 th2Var2;
        final ua2 ua2Var2;
        final pc1 pc1Var2;
        ua2 ua2Var3;
        te0 te0Var3;
        float f3;
        pc1 pc1Var3;
        e21 e21Var3;
        th2 th2Var3;
        ua2 ua2Var4;
        float f4;
        urVar.Y(-1109867978);
        int i2 = i | 113863728;
        if ((38347923 & i2) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i2 & 1, z)) {
            urVar.T();
            if ((i & 1) != 0 && !urVar.y()) {
                urVar.R();
                e21Var3 = e21Var;
                te0Var3 = te0Var;
                f3 = f;
                th2Var3 = th2Var;
                ua2Var4 = ua2Var;
                pc1Var3 = pc1Var;
            } else {
                fq fqVar3 = rx.d;
                float f5 = va2.b;
                cv0 cv0Var = new cv0(op1.i(urVar), 15 | 16);
                mo moVar = (mo) urVar.j(oo.a);
                ua2 ua2Var5 = moVar.a0;
                if (ua2Var5 == null) {
                    ua2Var3 = new ua2(oo.d(moVar, bf.e), oo.d(moVar, bf.g), oo.d(moVar, bf.f), oo.d(moVar, bf.i), oo.d(moVar, bf.j), oo.d(moVar, bf.h));
                    moVar.a0 = ua2Var3;
                } else {
                    ua2Var3 = ua2Var5;
                }
                te0Var3 = fqVar3;
                f3 = f5;
                pc1Var3 = va2.a;
                e21Var3 = b21.a;
                th2Var3 = cv0Var;
                ua2Var4 = ua2Var3;
            }
            urVar.q();
            k92 a2 = rc2.a(rx.b, urVar);
            k92 k92Var = k92.d;
            if (!f20.b(f3, Float.NaN) && !f20.b(f3, Float.POSITIVE_INFINITY)) {
                f4 = f3;
            } else {
                f4 = va2.b;
            }
            b(e21Var3, fqVar, a2, k92Var, fqVar2, te0Var3, f4, pc1Var3, th2Var3, ua2Var4, urVar, 819686454, 384);
            e21Var2 = e21Var3;
            te0Var2 = te0Var3;
            pc1Var2 = pc1Var3;
            th2Var2 = th2Var3;
            ua2Var2 = ua2Var4;
            f2 = f3;
        } else {
            urVar.R();
            e21Var2 = e21Var;
            te0Var2 = te0Var;
            f2 = f;
            th2Var2 = th2Var;
            ua2Var2 = ua2Var;
            pc1Var2 = pc1Var;
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new se0(e21Var2, fqVar2, te0Var2, f2, th2Var2, ua2Var2, pc1Var2, i) { // from class: dd
                public final /* synthetic */ e21 f;
                public final /* synthetic */ fq g;
                public final /* synthetic */ te0 h;
                public final /* synthetic */ float i;
                public final /* synthetic */ th2 j;
                public final /* synthetic */ ua2 k;
                public final /* synthetic */ pc1 l;

                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int b0 = lo.b0(391);
                    hd.a(fq.this, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (ur) obj, b0);
                    return od2.a;
                }
            };
        }
    }

    public static final void b(final e21 e21Var, final fq fqVar, final k92 k92Var, final k92 k92Var2, final fq fqVar2, final te0 te0Var, final float f, final pc1 pc1Var, final th2 th2Var, final ua2 ua2Var, ur urVar, final int i, final int i2) {
        int i3;
        k92 k92Var3;
        k92 k92Var4;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        ii iiVar = g3.s;
        urVar.Y(703932376);
        if ((i & 6) == 0) {
            if (urVar.f(e21Var)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i3 = i17 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.h(fqVar)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i3 |= i16;
        }
        if ((i & 384) == 0) {
            k92Var3 = k92Var;
            if (urVar.f(k92Var3)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i3 |= i15;
        } else {
            k92Var3 = k92Var;
        }
        if ((i & 3072) == 0) {
            if (urVar.h(null)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i3 |= i14;
        }
        if ((i & 24576) == 0) {
            k92Var4 = k92Var2;
            if (urVar.f(k92Var4)) {
                i13 = 16384;
            } else {
                i13 = SharedConstants.DefaultBufferSize;
            }
            i3 |= i13;
        } else {
            k92Var4 = k92Var2;
        }
        if ((i & 196608) == 0) {
            if (urVar.f(iiVar)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i3 |= i12;
        }
        if ((1572864 & i) == 0) {
            if (urVar.h(fqVar2)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i3 |= i11;
        }
        if ((i & 12582912) == 0) {
            if (urVar.h(te0Var)) {
                i10 = 8388608;
            } else {
                i10 = HiddenAPIs.FLAG_RECEIVER_FROM_SHELL;
            }
            i3 |= i10;
        }
        if ((i & 100663296) == 0) {
            if (urVar.c(f)) {
                i9 = FileSystemManager.MODE_TRUNCATE;
            } else {
                i9 = FileSystemManager.MODE_APPEND;
            }
            i3 |= i9;
        }
        if ((i & FileSystemManager.MODE_READ_WRITE) == 0) {
            if (urVar.f(pc1Var)) {
                i8 = FileSystemManager.MODE_WRITE_ONLY;
            } else {
                i8 = FileSystemManager.MODE_READ_ONLY;
            }
            i3 |= i8;
        }
        if ((i2 & 6) == 0) {
            if (urVar.f(th2Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i4 = i2 | i7;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (urVar.f(ua2Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        if ((i2 & 384) == 0) {
            if (urVar.f(null)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i4 |= i5;
        }
        int i18 = i4;
        int i19 = i3;
        if ((306783379 & i3) == 306783378 && (i18 & 147) == 146) {
            z = false;
        } else {
            z = true;
        }
        if (urVar.O(i19 & 1, z)) {
            ((cz) urVar.j(a)).a(new by1(e21Var, fqVar, k92Var3, k92Var4, fqVar2, te0Var, f, pc1Var, th2Var, ua2Var), urVar, 0);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new se0() { // from class: ed
                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hd.b(e21.this, fqVar, k92Var, k92Var2, fqVar2, te0Var, f, pc1Var, th2Var, ua2Var, (ur) obj, lo.b0(i | 1), lo.b0(i2));
                    return od2.a;
                }
            };
        }
    }

    public static final void c(final e21 e21Var, final ia0 ia0Var, final long j, final long j2, final long j3, long j4, final fq fqVar, final k92 k92Var, final k92 k92Var2, de0 de0Var, final fq fqVar2, fq fqVar3, final float f, final pc1 pc1Var, ur urVar, final int i) {
        final de0 de0Var2;
        fq fqVar4;
        final long j5 = j4;
        ii iiVar = g3.s;
        urVar.Y(239553141);
        int i2 = i | (urVar.f(e21Var) ? 4 : 2) | (urVar.f(ia0Var) ? 32 : 16) | (urVar.e(j) ? 256 : 128) | (urVar.e(j2) ? 2048 : 1024) | (urVar.e(j3) ? 16384 : SharedConstants.DefaultBufferSize) | (urVar.e(j5) ? 131072 : 65536) | (urVar.h(fqVar) ? 1048576 : 524288);
        boolean f2 = urVar.f(k92Var);
        int i3 = HiddenAPIs.FLAG_RECEIVER_FROM_SHELL;
        int i4 = i2 | (f2 ? 8388608 : 4194304);
        boolean h = urVar.h(null);
        int i5 = FileSystemManager.MODE_APPEND;
        int i6 = i4 | (h ? 67108864 : 33554432) | (urVar.f(k92Var2) ? FileSystemManager.MODE_WRITE_ONLY : FileSystemManager.MODE_READ_ONLY);
        int i7 = 1600566 | (urVar.f(iiVar) ? 256 : 128) | (urVar.h(fqVar2) ? 131072 : 65536);
        if (urVar.c(f)) {
            i3 = 8388608;
        }
        int i8 = i7 | i3;
        if (urVar.f(pc1Var)) {
            i5 = 67108864;
        }
        int i9 = i8 | i5;
        if (urVar.O(i6 & 1, ((i6 & 306783379) == 306783378 && (38347923 & i9) == 38347922) ? false : true)) {
            boolean z = ((i6 & 112) == 32) | ((i9 & 896) == 256) | ((29360128 & i9) == 8388608);
            Object L = urVar.L();
            xl1 xl1Var = or.a;
            if (z || L == xl1Var) {
                L = new xa2(ia0Var, f, pc1Var);
                urVar.h0(L);
            }
            xa2 xa2Var = (xa2) L;
            int x = io.x(urVar);
            sf1 l = urVar.l();
            e21 Q = fp.Q(urVar, e21Var);
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            gb gbVar = kr.f;
            op1.q(urVar, gbVar, xa2Var);
            gb gbVar2 = kr.e;
            op1.q(urVar, gbVar2, l);
            gb gbVar3 = kr.g;
            if (urVar.S || !sn0.r(urVar.L(), Integer.valueOf(x))) {
                l90.s(x, urVar, x, gbVar3);
            }
            gb gbVar4 = kr.d;
            op1.q(urVar, gbVar4, Q);
            b21 b21Var = b21.a;
            e21 G = sn0.G(b21Var, "navigationIcon");
            float f3 = b;
            e21 O = sn0.O(G, f3, 0.0f, 0.0f, 0.0f, 14);
            ki kiVar = g3.f;
            j01 d = hj.d(kiVar, false);
            int x2 = io.x(urVar);
            sf1 l2 = urVar.l();
            e21 Q2 = fp.Q(urVar, O);
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            op1.q(urVar, gbVar, d);
            op1.q(urVar, gbVar2, l2);
            if (urVar.S || !sn0.r(urVar.L(), Integer.valueOf(x2))) {
                l90.s(x2, urVar, x2, gbVar3);
            }
            op1.q(urVar, gbVar4, Q2);
            js jsVar = et.a;
            vn.b(jsVar.a(new co(j)), fqVar2, urVar, ((i9 >> 12) & 112) | 8);
            urVar.p(true);
            urVar.X(408520308);
            e21 M = sn0.M(sn0.G(b21Var, "title"), f3, 0.0f, 2);
            urVar.X(-402451802);
            urVar.p(false);
            e21 d2 = M.d(b21Var);
            Object L2 = urVar.L();
            if (L2 == xl1Var) {
                de0Var2 = de0Var;
                L2 = new fd(de0Var2, 0);
                urVar.h0(L2);
            } else {
                de0Var2 = de0Var;
            }
            e21 x3 = d6.x(d2, (oe0) L2);
            j01 d3 = hj.d(kiVar, false);
            int x4 = io.x(urVar);
            sf1 l3 = urVar.l();
            e21 Q3 = fp.Q(urVar, x3);
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            op1.q(urVar, gbVar, d3);
            op1.q(urVar, gbVar2, l3);
            if (urVar.S || !sn0.r(urVar.L(), Integer.valueOf(x4))) {
                l90.s(x4, urVar, x4, gbVar3);
            }
            op1.q(urVar, gbVar4, Q3);
            xn.i(j2, k92Var, fqVar, urVar, ((i6 >> 9) & 14) | ((i6 >> 18) & 112) | ((i6 >> 12) & 896));
            urVar.p(true);
            urVar.p(false);
            e21 O2 = sn0.O(sn0.G(b21Var, "actionIcons"), 0.0f, 0.0f, f3, 0.0f, 11);
            j01 d4 = hj.d(kiVar, false);
            int x5 = io.x(urVar);
            sf1 l4 = urVar.l();
            e21 Q4 = fp.Q(urVar, O2);
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            op1.q(urVar, gbVar, d4);
            op1.q(urVar, gbVar2, l4);
            if (urVar.S || !sn0.r(urVar.L(), Integer.valueOf(x5))) {
                l90.s(x5, urVar, x5, gbVar3);
            }
            op1.q(urVar, gbVar4, Q4);
            j5 = j4;
            zj1 a2 = jsVar.a(new co(j5));
            fqVar4 = fqVar3;
            vn.b(a2, fqVar4, urVar, 56);
            urVar.p(true);
            urVar.p(true);
        } else {
            de0Var2 = de0Var;
            fqVar4 = fqVar3;
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            final fq fqVar5 = fqVar4;
            r.d = new se0(ia0Var, j, j2, j3, j5, fqVar, k92Var, k92Var2, de0Var2, fqVar2, fqVar5, f, pc1Var, i) { // from class: gd
                public final /* synthetic */ ia0 f;
                public final /* synthetic */ long g;
                public final /* synthetic */ long h;
                public final /* synthetic */ long i;
                public final /* synthetic */ long j;
                public final /* synthetic */ fq k;
                public final /* synthetic */ k92 l;
                public final /* synthetic */ k92 m;
                public final /* synthetic */ de0 n;
                public final /* synthetic */ fq o;
                public final /* synthetic */ fq p;
                public final /* synthetic */ float q;
                public final /* synthetic */ pc1 r;

                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int b0 = lo.b0(1);
                    hd.c(e21.this, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, (ur) obj, b0);
                    return od2.a;
                }
            };
        }
    }
}
