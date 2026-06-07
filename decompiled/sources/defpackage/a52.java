package defpackage;

import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class a52 {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final h02 f;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, h02] */
    static {
        float f2 = mp0.l0;
        a = f2;
        b = mp0.v0;
        c = mp0.s0;
        float f3 = mp0.p0;
        d = f3;
        e = (f3 - f2) / 2.0f;
        f = new Object();
    }

    public static final void a(final boolean z, final oe0 oe0Var, e21 e21Var, final se0 se0Var, boolean z2, x42 x42Var, ur urVar, final int i, final int i2) {
        int i3;
        x42 x42Var2;
        boolean z3;
        final e21 e21Var2;
        final boolean z4;
        final x42 x42Var3;
        x42 x42Var4;
        int i4;
        e21 e21Var3;
        boolean z5;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        urVar.Y(-263339167);
        if ((i & 6) == 0) {
            if (urVar.g(z)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.h(oe0Var)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        int i10 = i3 | 384;
        if ((i & 3072) == 0) {
            if (urVar.h(se0Var)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i10 |= i7;
        }
        int i11 = i10 | 24576;
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                x42Var2 = x42Var;
                if (urVar.f(x42Var2)) {
                    i6 = 131072;
                    i11 |= i6;
                }
            } else {
                x42Var2 = x42Var;
            }
            i6 = 65536;
            i11 |= i6;
        } else {
            x42Var2 = x42Var;
        }
        int i12 = i11 | 1572864;
        if ((599187 & i12) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (urVar.O(i12 & 1, z3)) {
            urVar.T();
            int i13 = i & 1;
            e21 e21Var4 = b21.a;
            if (i13 != 0 && !urVar.y()) {
                urVar.R();
                if ((i2 & 32) != 0) {
                    i12 &= -458753;
                }
                e21Var3 = e21Var;
                i4 = i12;
                x42Var4 = x42Var2;
                z5 = z2;
            } else {
                if ((i2 & 32) != 0) {
                    mo moVar = (mo) urVar.j(oo.a);
                    x42 x42Var5 = moVar.g0;
                    long j = moVar.p;
                    if (x42Var5 == null) {
                        long d2 = oo.d(moVar, mp0.k0);
                        long d3 = oo.d(moVar, mp0.n0);
                        long j2 = co.f;
                        long d4 = oo.d(moVar, mp0.m0);
                        long d5 = oo.d(moVar, mp0.u0);
                        long d6 = oo.d(moVar, mp0.x0);
                        long d7 = oo.d(moVar, mp0.t0);
                        long d8 = oo.d(moVar, mp0.w0);
                        i5 = -458753;
                        long t = go.t(co.b(oo.d(moVar, mp0.W), mp0.X), j);
                        long d9 = oo.d(moVar, mp0.a0);
                        float f2 = mp0.b0;
                        x42Var4 = new x42(d2, d3, j2, d4, d5, d6, d7, d8, t, go.t(co.b(d9, f2), j), j2, go.t(co.b(oo.d(moVar, mp0.Y), mp0.Z), j), go.t(co.b(oo.d(moVar, mp0.c0), mp0.d0), j), go.t(co.b(oo.d(moVar, mp0.g0), f2), j), go.t(co.b(oo.d(moVar, mp0.h0), f2), j), go.t(co.b(oo.d(moVar, mp0.e0), mp0.f0), j));
                        moVar.g0 = x42Var4;
                    } else {
                        i5 = -458753;
                        x42Var4 = x42Var5;
                    }
                    i12 &= i5;
                } else {
                    x42Var4 = x42Var2;
                }
                i4 = i12;
                e21Var3 = e21Var4;
                z5 = true;
            }
            urVar.q();
            urVar.X(1768510810);
            Object L = urVar.L();
            if (L == or.a) {
                L = new r31();
                urVar.h0(L);
            }
            r31 r31Var = (r31) L;
            urVar.p(false);
            if (oe0Var != null) {
                ei0 ei0Var = kn0.a;
                e21Var4 = c01.V(f11.a, z, r31Var, z5, new ap1(2), oe0Var);
                r31Var = r31Var;
            }
            boolean z6 = z5;
            e21 m = hy1.m(e21Var3.d(e21Var4));
            float f3 = c;
            float f4 = d;
            int i14 = i4 << 3;
            int i15 = i4 >> 6;
            int i16 = (i14 & 112) | (i15 & 896) | (i15 & 7168) | (i14 & 57344);
            x42 x42Var6 = x42Var4;
            b(m.d(new gy1(f3, f4, f3, f4, false)), z, z6, x42Var6, se0Var, r31Var, pw1.b(mp0.i0, urVar), urVar, i16);
            z4 = z6;
            x42Var3 = x42Var6;
            e21Var2 = e21Var3;
        } else {
            urVar.R();
            e21Var2 = e21Var;
            z4 = z2;
            x42Var3 = x42Var2;
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new se0() { // from class: y42
                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a52.a(z, oe0Var, e21Var2, se0Var, z4, x42Var3, (ur) obj, lo.b0(i | 1), i2);
                    return od2.a;
                }
            };
        }
    }

    public static final void b(final e21 e21Var, final boolean z, final boolean z2, final x42 x42Var, final se0 se0Var, final r31 r31Var, final kw1 kw1Var, ur urVar, final int i) {
        int i2;
        boolean z3;
        long j;
        long j2;
        int i3;
        long j3;
        boolean z4;
        long j4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        urVar.Y(-670917213);
        if ((i & 6) == 0) {
            if (urVar.f(e21Var)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
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
            if (urVar.g(z2)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i2 |= i8;
        }
        if ((i & 3072) == 0) {
            if (urVar.f(x42Var)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            if (urVar.h(se0Var)) {
                i6 = 16384;
            } else {
                i6 = SharedConstants.DefaultBufferSize;
            }
            i2 |= i6;
        }
        if ((196608 & i) == 0) {
            if (urVar.f(r31Var)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i2 |= i5;
        }
        if ((1572864 & i) == 0) {
            if (urVar.f(kw1Var)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        }
        if ((599187 & i2) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (urVar.O(i2 & 1, z3)) {
            if (z2) {
                if (z) {
                    j = x42Var.b;
                } else {
                    j = x42Var.f;
                }
            } else if (z) {
                j = x42Var.j;
            } else {
                j = x42Var.n;
            }
            if (z2) {
                if (z) {
                    j2 = x42Var.a;
                } else {
                    j2 = x42Var.e;
                }
            } else if (z) {
                j2 = x42Var.i;
            } else {
                j2 = x42Var.m;
            }
            kw1 b2 = pw1.b(mp0.r0, urVar);
            float f2 = mp0.q0;
            if (z2) {
                i3 = i2;
                if (z) {
                    j3 = x42Var.c;
                } else {
                    j3 = x42Var.g;
                }
            } else {
                i3 = i2;
                if (z) {
                    j3 = x42Var.k;
                } else {
                    j3 = x42Var.o;
                }
            }
            e21 k = f2.k(e21Var.d(new yi(f2, new i12(j3), b2)), j, b2);
            j01 d2 = hj.d(g3.f, false);
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
            gb gbVar = kr.f;
            op1.q(urVar, gbVar, d2);
            gb gbVar2 = kr.e;
            op1.q(urVar, gbVar2, l);
            gb gbVar3 = kr.g;
            if (urVar.S || !sn0.r(urVar.L(), Integer.valueOf(x))) {
                l90.s(x, urVar, x, gbVar3);
            }
            gb gbVar4 = kr.d;
            op1.q(urVar, gbVar4, Q);
            e21 k2 = f2.k(ak0.a(lj.a(b21.a, g3.i).d(new z92(r31Var, z, fp.a0(u21.f, urVar))), r31Var, xo1.a(mp0.o0 / 2.0f, 4, false)), j2, kw1Var);
            j01 d3 = hj.d(g3.j, false);
            int x2 = io.x(urVar);
            sf1 l2 = urVar.l();
            e21 Q2 = fp.Q(urVar, k2);
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            op1.q(urVar, gbVar, d3);
            op1.q(urVar, gbVar2, l2);
            if (urVar.S || !sn0.r(urVar.L(), Integer.valueOf(x2))) {
                l90.s(x2, urVar, x2, gbVar3);
            }
            op1.q(urVar, gbVar4, Q2);
            if (se0Var != null) {
                urVar.X(1235836927);
                if (z2) {
                    if (z) {
                        j4 = x42Var.d;
                    } else {
                        j4 = x42Var.h;
                    }
                } else if (z) {
                    j4 = x42Var.l;
                } else {
                    j4 = x42Var.p;
                }
                vn.b(et.a.a(new co(j4)), se0Var, urVar, ((i3 >> 9) & 112) | 8);
                z4 = false;
            } else {
                z4 = false;
                urVar.X(1228606611);
            }
            urVar.p(z4);
            urVar.p(true);
            urVar.p(true);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new se0() { // from class: z42
                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a52.b(e21.this, z, z2, x42Var, se0Var, r31Var, kw1Var, (ur) obj, lo.b0(i | 1));
                    return od2.a;
                }
            };
        }
    }
}
