package defpackage;

import com.topjohnwu.superuser.internal.HiddenAPIs;
import com.topjohnwu.superuser.nio.FileSystemManager;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class f3 {
    public static final rc1 a = new rc1(24.0f, 24.0f, 24.0f, 24.0f);
    public static final rc1 b = sn0.m(7, 16.0f);
    public static final rc1 c = sn0.m(7, 16.0f);
    public static final rc1 d = sn0.m(7, 24.0f);
    public static final js e = new js(new h2(2));

    public static final void a(final fq fqVar, e21 e21Var, final se0 se0Var, final se0 se0Var2, final se0 se0Var3, final kw1 kw1Var, final long j, final long j2, final long j3, final long j4, final long j5, ur urVar, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        char c2;
        char c3;
        boolean z;
        final e21 e21Var2;
        urVar.Y(1378716401);
        int i10 = i | 48;
        if (urVar.h(se0Var)) {
            i2 = 256;
        } else {
            i2 = 128;
        }
        int i11 = i10 | i2;
        if (urVar.h(se0Var2)) {
            i3 = 2048;
        } else {
            i3 = 1024;
        }
        int i12 = i11 | i3;
        if (urVar.h(se0Var3)) {
            i4 = 16384;
        } else {
            i4 = SharedConstants.DefaultBufferSize;
        }
        int i13 = i12 | i4;
        if (urVar.f(kw1Var)) {
            i5 = 131072;
        } else {
            i5 = 65536;
        }
        int i14 = i13 | i5;
        if (urVar.e(j)) {
            i6 = 1048576;
        } else {
            i6 = 524288;
        }
        int i15 = i14 | i6;
        if (urVar.c(0.0f)) {
            i7 = 8388608;
        } else {
            i7 = HiddenAPIs.FLAG_RECEIVER_FROM_SHELL;
        }
        int i16 = i15 | i7;
        if (urVar.e(j2)) {
            i8 = FileSystemManager.MODE_TRUNCATE;
        } else {
            i8 = FileSystemManager.MODE_APPEND;
        }
        int i17 = i16 | i8;
        if (urVar.e(j3)) {
            i9 = FileSystemManager.MODE_WRITE_ONLY;
        } else {
            i9 = FileSystemManager.MODE_READ_ONLY;
        }
        int i18 = i17 | i9;
        if (urVar.e(j4)) {
            c2 = 4;
        } else {
            c2 = 2;
        }
        if (urVar.e(j5)) {
            c3 = ' ';
        } else {
            c3 = 16;
        }
        int i19 = c3 | c2;
        if ((306783379 & i18) == 306783378 && (i19 & 19) == 18) {
            z = false;
        } else {
            z = true;
        }
        if (urVar.O(i18 & 1, z)) {
            fq N = go.N(-652798794, new se0() { // from class: d3
                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    boolean z2;
                    ur urVar2 = (ur) obj;
                    int intValue = ((Integer) obj2).intValue();
                    int i20 = 1;
                    int i21 = 0;
                    if ((intValue & 3) != 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (urVar2.O(intValue & 1, z2)) {
                        e21 J = sn0.J(b21.a, f3.a);
                        yo a2 = wo.a(c01.g, g3.r, urVar2, 0);
                        int x = io.x(urVar2);
                        sf1 l = urVar2.l();
                        e21 Q = fp.Q(urVar2, J);
                        lr.b.getClass();
                        hs hsVar = kr.b;
                        urVar2.a0();
                        if (urVar2.S) {
                            urVar2.k(hsVar);
                        } else {
                            urVar2.k0();
                        }
                        gb gbVar = kr.f;
                        op1.q(urVar2, gbVar, a2);
                        gb gbVar2 = kr.e;
                        op1.q(urVar2, gbVar2, l);
                        gb gbVar3 = kr.g;
                        if (urVar2.S || !sn0.r(urVar2.L(), Integer.valueOf(x))) {
                            l90.s(x, urVar2, x, gbVar3);
                        }
                        gb gbVar4 = kr.d;
                        op1.q(urVar2, gbVar4, Q);
                        se0 se0Var4 = se0.this;
                        if (se0Var4 == null) {
                            urVar2.X(346092326);
                        } else {
                            urVar2.X(346092327);
                            vn.b(et.a.a(new co(j3)), go.N(-1128150638, new v2(i20, se0Var4), urVar2), urVar2, 56);
                        }
                        urVar2.p(false);
                        se0 se0Var5 = se0Var2;
                        if (se0Var5 == null) {
                            urVar2.X(346396529);
                        } else {
                            urVar2.X(346396530);
                            xn.i(j4, rc2.a(sn0.o, urVar2), go.N(71284337, new u2(0, se0Var4, se0Var5), urVar2), urVar2, 384);
                        }
                        urVar2.p(false);
                        se0 se0Var6 = se0Var3;
                        if (se0Var6 == null) {
                            urVar2.X(347174009);
                        } else {
                            urVar2.X(347174010);
                            xn.i(j5, rc2.a(sn0.q, urVar2), go.N(705583346, new v2(i21, se0Var6), urVar2), urVar2, 384);
                        }
                        urVar2.p(false);
                        ci0 ci0Var = new ci0(g3.t);
                        j01 d2 = hj.d(g3.f, false);
                        int x2 = io.x(urVar2);
                        sf1 l2 = urVar2.l();
                        e21 Q2 = fp.Q(urVar2, ci0Var);
                        urVar2.a0();
                        if (urVar2.S) {
                            urVar2.k(hsVar);
                        } else {
                            urVar2.k0();
                        }
                        op1.q(urVar2, gbVar, d2);
                        op1.q(urVar2, gbVar2, l2);
                        if (urVar2.S || !sn0.r(urVar2.L(), Integer.valueOf(x2))) {
                            l90.s(x2, urVar2, x2, gbVar3);
                        }
                        op1.q(urVar2, gbVar4, Q2);
                        xn.i(j2, rc2.a(sn0.k, urVar2), fqVar, urVar2, 0);
                        urVar2.p(true);
                        urVar2.p(true);
                    } else {
                        urVar2.R();
                    }
                    return od2.a;
                }
            }, urVar);
            int i20 = i18 >> 12;
            int i21 = (i20 & 896) | (i20 & 112) | 12582918 | ((i18 >> 9) & 57344);
            b21 b21Var = b21.a;
            l42.a(b21Var, kw1Var, j, 0L, 0.0f, 0.0f, N, urVar, i21, 104);
            e21Var2 = b21Var;
        } else {
            urVar.R();
            e21Var2 = e21Var;
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new se0(e21Var2, se0Var, se0Var2, se0Var3, kw1Var, j, j2, j3, j4, j5, i) { // from class: e3
                public final /* synthetic */ e21 f;
                public final /* synthetic */ se0 g;
                public final /* synthetic */ se0 h;
                public final /* synthetic */ se0 i;
                public final /* synthetic */ kw1 j;
                public final /* synthetic */ long k;
                public final /* synthetic */ long l;
                public final /* synthetic */ long m;
                public final /* synthetic */ long n;
                public final /* synthetic */ long o;

                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int b0 = lo.b0(7);
                    f3.a(fq.this, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (ur) obj, b0);
                    return od2.a;
                }
            };
        }
    }

    public static final void b(final float f, final fq fqVar, ur urVar, int i) {
        int i2;
        boolean z;
        jq0 jq0Var;
        urVar.Y(-917637668);
        if (urVar.c(f)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i3 = i2 | i;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i3 & 1, z)) {
            y22 y22Var = is.n;
            final jq0 jq0Var2 = (jq0) urVar.j(y22Var);
            int ordinal = jq0Var2.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    jq0Var = jq0.e;
                } else {
                    se.m();
                    return;
                }
            } else {
                jq0Var = jq0.f;
            }
            vn.b(y22Var.a(jq0Var), go.N(-1986402020, new se0() { // from class: w2
                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    boolean z2;
                    ur urVar2 = (ur) obj;
                    int intValue = ((Integer) obj2).intValue();
                    int i4 = 0;
                    if ((intValue & 3) != 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (urVar2.O(intValue & 1, z2)) {
                        xn.d(null, new pe(8.0f, true, new le(0)), new pe(f, true, new le(0)), null, 0, 0, go.N(879927511, new y2(i4, jq0Var2, fqVar), urVar2), urVar2, 1572864);
                    } else {
                        urVar2.R();
                    }
                    return od2.a;
                }
            }, urVar), urVar, 56);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new x2(f, fqVar, i);
        }
    }

    public static final void c(de0 de0Var, fq fqVar, e21 e21Var, se0 se0Var, final se0 se0Var2, final se0 se0Var3, final se0 se0Var4, final kw1 kw1Var, final long j, final long j2, final long j3, final long j4, z00 z00Var, ur urVar, int i, int i2) {
        int i3;
        fq fqVar2;
        se0 se0Var5;
        int i4;
        urVar.Y(-867616355);
        if ((i & 6) == 0) {
            i3 = (urVar.h(de0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            fqVar2 = fqVar;
            i3 |= urVar.h(fqVar2) ? 32 : 16;
        } else {
            fqVar2 = fqVar;
        }
        if ((i & 384) == 0) {
            i3 |= urVar.f(e21Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            se0Var5 = se0Var;
            i3 |= urVar.h(se0Var5) ? 2048 : 1024;
        } else {
            se0Var5 = se0Var;
        }
        if ((i & 24576) == 0) {
            i3 |= urVar.h(se0Var2) ? 16384 : SharedConstants.DefaultBufferSize;
        }
        if ((i & 196608) == 0) {
            i3 |= urVar.h(se0Var3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= urVar.h(se0Var4) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= urVar.f(kw1Var) ? 8388608 : HiddenAPIs.FLAG_RECEIVER_FROM_SHELL;
        }
        if ((i & 100663296) == 0) {
            i3 |= urVar.e(j) ? FileSystemManager.MODE_TRUNCATE : FileSystemManager.MODE_APPEND;
        }
        if ((i & FileSystemManager.MODE_READ_WRITE) == 0) {
            i3 |= urVar.e(j2) ? FileSystemManager.MODE_WRITE_ONLY : FileSystemManager.MODE_READ_ONLY;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (urVar.e(j3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= urVar.e(j4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= urVar.c(0.0f) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= urVar.f(z00Var) ? 2048 : 1024;
        }
        int i5 = i4;
        if (urVar.O(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            final fq fqVar3 = fqVar2;
            final se0 se0Var6 = se0Var5;
            d(de0Var, e21Var, z00Var, go.N(527420759, new se0() { // from class: z2
                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    boolean z;
                    ur urVar2 = (ur) obj;
                    int intValue = ((Integer) obj2).intValue();
                    int i6 = 0;
                    if ((intValue & 3) != 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (urVar2.O(intValue & 1, z)) {
                        f3.a(go.N(1367541877, new b3(fqVar3, se0Var6, i6), urVar2), null, se0.this, se0Var3, se0Var4, kw1Var, j, oo.e(sn0.j, urVar2), j2, j3, j4, urVar2, 6);
                    } else {
                        urVar2.R();
                    }
                    return od2.a;
                }
            }, urVar), urVar, (i3 & 14) | 3072 | ((i3 >> 3) & 112) | ((i5 >> 3) & 896));
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new a3(de0Var, fqVar, e21Var, se0Var, se0Var2, se0Var3, se0Var4, kw1Var, j, j2, j3, j4, z00Var, i, i2, 0);
        }
    }

    public static final void d(de0 de0Var, e21 e21Var, z00 z00Var, fq fqVar, ur urVar, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        urVar.Y(24925658);
        if ((i & 6) == 0) {
            if (urVar.h(de0Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.f(e21Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (urVar.f(z00Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (urVar.h(fqVar)) {
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
            ((xx) urVar.j(e)).a(new q4(de0Var, e21Var, z00Var, fqVar), urVar, 0);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new c3(de0Var, e21Var, z00Var, fqVar, i, 0);
        }
    }
}
