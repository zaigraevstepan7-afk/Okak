package defpackage;

import com.topjohnwu.superuser.internal.HiddenAPIs;
import com.topjohnwu.superuser.nio.FileSystemManager;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hk1 {
    public static final hk1 a = new Object();
    public static final kp1 b = lp1.a;
    public static final float c = 80.0f;
    public static final float d = 80.0f;
    public static final float e = 3.0f;

    public final void a(final qk1 qk1Var, final boolean z, final e21 e21Var, long j, long j2, float f, ur urVar, final int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        final long j3;
        final long j4;
        final float f2;
        int i5;
        float f3;
        long j5;
        long j6;
        urVar.Y(-1076870256);
        if (urVar.f(qk1Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (urVar.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (urVar.f(e21Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4 | 74752;
        if ((599187 & i8) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i8 & 1, z2)) {
            urVar.T();
            if ((i & 1) != 0 && !urVar.y()) {
                urVar.R();
                i5 = i8 & (-523265);
                j6 = j;
                j5 = j2;
                f3 = f;
            } else {
                y22 y22Var = oo.a;
                long j7 = ((mo) urVar.j(y22Var)).G;
                long j8 = ((mo) urVar.j(y22Var)).s;
                i5 = i8 & (-523265);
                f3 = d;
                j5 = j8;
                j6 = j7;
            }
            urVar.q();
            b(qk1Var, z, e21Var, f3, null, j6, 0.0f, go.N(298232649, new yk0(z, j5, qk1Var), urVar), urVar, (i5 & 896) | (i5 & 14) | 12582912 | (i5 & 112) | 100663296);
            f2 = f3;
            j3 = j6;
            j4 = j5;
        } else {
            urVar.R();
            j3 = j;
            j4 = j2;
            f2 = f;
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new se0(qk1Var, z, e21Var, j3, j4, f2, i) { // from class: ak1
                public final /* synthetic */ qk1 f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ e21 h;
                public final /* synthetic */ long i;
                public final /* synthetic */ long j;
                public final /* synthetic */ float k;

                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int b0 = lo.b0(1572865);
                    hk1.this.a(this.f, this.g, this.h, this.i, this.j, this.k, (ur) obj, b0);
                    return od2.a;
                }
            };
        }
    }

    public final void b(final qk1 qk1Var, final boolean z, final e21 e21Var, final float f, kw1 kw1Var, final long j, float f2, final fq fqVar, ur urVar, final int i) {
        final qk1 qk1Var2;
        int i2;
        hk1 hk1Var;
        boolean z2;
        final kw1 kw1Var2;
        final float f3;
        int i3;
        kw1 kw1Var3;
        boolean z3;
        boolean z4;
        boolean z5;
        final kw1 kw1Var4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        urVar.Y(-1341144489);
        if ((i & 6) == 0) {
            qk1Var2 = qk1Var;
            if (urVar.f(qk1Var2)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            qk1Var2 = qk1Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.g(z)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i & 384) == 0) {
            if (urVar.f(e21Var)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i2 |= i8;
        }
        if ((i & 3072) == 0) {
            if (urVar.c(f)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            i2 |= SharedConstants.DefaultBufferSize;
        }
        if ((196608 & i) == 0) {
            if (urVar.e(j)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i2 |= i6;
        }
        if ((1572864 & i) == 0) {
            i2 |= 524288;
        }
        if ((12582912 & i) == 0) {
            if (urVar.h(fqVar)) {
                i5 = 8388608;
            } else {
                i5 = HiddenAPIs.FLAG_RECEIVER_FROM_SHELL;
            }
            i2 |= i5;
        }
        if ((100663296 & i) == 0) {
            hk1Var = this;
            if (urVar.f(hk1Var)) {
                i4 = FileSystemManager.MODE_TRUNCATE;
            } else {
                i4 = FileSystemManager.MODE_APPEND;
            }
            i2 |= i4;
        } else {
            hk1Var = this;
        }
        if ((38347923 & i2) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i2 & 1, z2)) {
            urVar.T();
            if ((i & 1) != 0 && !urVar.y()) {
                urVar.R();
                i3 = i2 & (-3727361);
                kw1Var3 = kw1Var;
                f3 = f2;
            } else {
                i3 = i2 & (-3727361);
                kw1Var3 = b;
                f3 = e;
            }
            int i11 = i3;
            urVar.q();
            int i12 = jk1.a;
            e21 f4 = hy1.f(e21Var, 40.0f);
            Object L = urVar.L();
            xl1 xl1Var = or.a;
            if (L == xl1Var) {
                L = new v51(11);
                urVar.h0(L);
            }
            e21 v = rx.v(f4, (oe0) L);
            if ((i11 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i11 & 112) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z6 = z4 | z3;
            if ((((i11 & 7168) ^ 3072) > 2048 && urVar.c(f)) || (i11 & 3072) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean c2 = z6 | z5 | urVar.c(f3) | urVar.f(kw1Var3);
            Object L2 = urVar.L();
            if (!c2 && L2 != xl1Var) {
                kw1Var4 = kw1Var3;
            } else {
                kw1Var4 = kw1Var3;
                te0 te0Var = new te0() { // from class: ck1
                    @Override // defpackage.te0
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        final ig1 x = ((e01) obj2).x(((us) obj3).a);
                        int i13 = x.e;
                        int i14 = x.f;
                        final qk1 qk1Var3 = qk1.this;
                        final boolean z7 = z;
                        final float f5 = f;
                        final float f6 = f3;
                        final kw1 kw1Var5 = kw1Var4;
                        return ((l01) obj).s0(i13, i14, m60.e, new oe0() { // from class: fk1
                            @Override // defpackage.oe0
                            public final Object invoke(Object obj4) {
                                final qk1 qk1Var4 = qk1Var3;
                                final boolean z8 = z7;
                                final float f7 = f5;
                                final float f8 = f6;
                                final kw1 kw1Var6 = kw1Var5;
                                hg1.m((hg1) obj4, ig1.this, 0, 0, new oe0() { // from class: gk1
                                    @Override // defpackage.oe0
                                    public final Object invoke(Object obj5) {
                                        boolean z9;
                                        io1 io1Var = (io1) obj5;
                                        qk1 qk1Var5 = qk1.this;
                                        float f9 = 0.0f;
                                        if (((Number) qk1Var5.a.d()).floatValue() <= 0.0f && !z8) {
                                            z9 = false;
                                        } else {
                                            z9 = true;
                                        }
                                        io1Var.r((((Number) qk1Var5.a.d()).floatValue() * io1Var.j0(f7)) - Float.intBitsToFloat((int) (io1Var.r & 4294967295L)));
                                        if (z9) {
                                            f9 = io1Var.s.a() * f8;
                                        }
                                        io1Var.l(f9);
                                        io1Var.m(kw1Var6);
                                        io1Var.h(true);
                                        return od2.a;
                                    }
                                }, 4);
                                return od2.a;
                            }
                        });
                    }
                };
                urVar.h0(te0Var);
                L2 = te0Var;
            }
            e21 k = f2.k(mp0.D(v, (te0) L2), j, kw1Var4);
            int i13 = ((i11 >> 12) & 7168) | 48;
            j01 d2 = hj.d(g3.j, false);
            int x = io.x(urVar);
            sf1 l = urVar.l();
            e21 Q = fp.Q(urVar, k);
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            op1.q(urVar, kr.f, d2);
            op1.q(urVar, kr.e, l);
            gb gbVar = kr.g;
            if (urVar.S || !sn0.r(urVar.L(), Integer.valueOf(x))) {
                l90.s(x, urVar, x, gbVar);
            }
            op1.q(urVar, kr.d, Q);
            fqVar.invoke(lj.a, urVar, Integer.valueOf(((i13 >> 6) & 112) | 6));
            urVar.p(true);
            kw1Var2 = kw1Var4;
        } else {
            urVar.R();
            kw1Var2 = kw1Var;
            f3 = f2;
        }
        dl1 r = urVar.r();
        if (r != null) {
            final hk1 hk1Var2 = hk1Var;
            r.d = new se0() { // from class: dk1
                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hk1.this.b(qk1Var, z, e21Var, f, kw1Var2, j, f3, fqVar, (ur) obj, lo.b0(i | 1));
                    return od2.a;
                }
            };
        }
    }
}
