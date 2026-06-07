package defpackage;

import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class tt {
    public static final pt a;

    static {
        js jsVar = c9.a;
        long j = co.c;
        long j2 = co.b;
        a = new pt(j, j2, j2, co.b(j2, 0.38f), co.b(j2, 0.38f));
    }

    public static final void a(pt ptVar, e21 e21Var, fq fqVar, ur urVar, int i) {
        int i2;
        boolean z;
        boolean z2;
        e21 d;
        int i3;
        int i4;
        int i5;
        urVar.Y(-527864079);
        if ((i & 6) == 0) {
            if (urVar.f(ptVar)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.f(e21Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (urVar.h(fqVar)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i2 & 1, z)) {
            ji jiVar = rt.a;
            kp1 a2 = lp1.a(4.0f);
            if (f20.a(3.0f, 0.0f) > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            long j = wf0.a;
            if (f20.a(3.0f, 0.0f) <= 0 && !z2) {
                d = e21Var;
            } else {
                d = e21Var.d(new iw1(a2, z2, j, j));
            }
            e21 R = rx.R(sn0.M(f2.F(f2.k(d, ptVar.a, d6.w)), 0.0f, rt.d, 1), rx.K(urVar));
            int i6 = (i2 << 3) & 7168;
            yo a3 = wo.a(c01.g, g3.r, urVar, 0);
            int hashCode = Long.hashCode(urVar.T);
            sf1 l = urVar.l();
            e21 Q = fp.Q(urVar, R);
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            op1.q(urVar, kr.f, a3);
            op1.q(urVar, kr.e, l);
            op1.l(urVar, Integer.valueOf(hashCode), kr.g);
            op1.o(urVar, kr.h);
            op1.q(urVar, kr.d, Q);
            fqVar.invoke(zo.a, urVar, Integer.valueOf(((i6 >> 6) & 112) | 6));
            urVar.p(true);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new h9(ptVar, e21Var, fqVar, i, 4);
        }
    }

    public static final void b(e21 e21Var, pt ptVar, oe0 oe0Var, ur urVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        urVar.Y(-625529233);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i4 = i | 6;
        } else {
            if (urVar.f(e21Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i4 = i3 | i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i6 = i4 | 48;
        } else {
            if (urVar.f(ptVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i6 = i4 | i5;
        }
        if (urVar.h(oe0Var)) {
            i7 = 256;
        } else {
            i7 = 128;
        }
        int i10 = i6 | i7;
        int i11 = 1;
        if ((i10 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i10 & 1, z)) {
            if (i8 != 0) {
                e21Var = b21.a;
            }
            if (i9 != 0) {
                ptVar = a;
            }
            a(ptVar, e21Var, go.N(-250345048, new y2(i11, oe0Var, ptVar), urVar), urVar, ((i10 << 3) & 112) | ((i10 >> 3) & 14) | 384);
        } else {
            urVar.R();
        }
        e21 e21Var2 = e21Var;
        pt ptVar2 = ptVar;
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new h9(e21Var2, ptVar2, oe0Var, i, i2);
        }
    }

    public static final void c(String str, boolean z, pt ptVar, e21 e21Var, te0 te0Var, de0 de0Var, ur urVar, int i) {
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        long j;
        long j2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        urVar.Y(-2001167027);
        if ((i & 6) == 0) {
            if (urVar.f(str)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.g(z)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            if (urVar.f(ptVar)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            if (urVar.f(e21Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            if (urVar.h(te0Var)) {
                i5 = 16384;
            } else {
                i5 = SharedConstants.DefaultBufferSize;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (urVar.h(de0Var)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        if ((74899 & i2) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i2 & 1, z2)) {
            ji jiVar = rt.a;
            float f = rt.c;
            pe peVar = new pe(f, true, new le(0));
            if ((i2 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((458752 & i2) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z5 = z3 | z4;
            Object L = urVar.L();
            if (z5 || L == or.a) {
                L = new st(0, de0Var, z);
                urVar.h0(L);
            }
            e21 M = sn0.M(hy1.h(hy1.b(f2.s(e21Var, z, str, (de0) L, 12), 1.0f), 112.0f, 48.0f, 280.0f, 48.0f), f, 0.0f, 2);
            up1 a2 = tp1.a(peVar, jiVar, urVar, 54);
            int hashCode = Long.hashCode(urVar.T);
            sf1 l = urVar.l();
            e21 Q = fp.Q(urVar, M);
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            gb gbVar = kr.f;
            op1.q(urVar, gbVar, a2);
            gb gbVar2 = kr.e;
            op1.q(urVar, gbVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            gb gbVar3 = kr.g;
            op1.l(urVar, valueOf, gbVar3);
            i5 i5Var = kr.h;
            op1.o(urVar, i5Var);
            gb gbVar4 = kr.d;
            op1.q(urVar, gbVar4, Q);
            if (te0Var == null) {
                urVar.X(-1597947094);
                urVar.p(false);
                i3 = i2;
            } else {
                urVar.X(-1597947093);
                float f2 = rt.e;
                e21 e = hy1.e(b21.a, f2, 0.0f, f2, f2, 2);
                i3 = i2;
                j01 d = hj.d(g3.f, false);
                int hashCode2 = Long.hashCode(urVar.T);
                sf1 l2 = urVar.l();
                e21 Q2 = fp.Q(urVar, e);
                urVar.a0();
                if (urVar.S) {
                    urVar.k(hsVar);
                } else {
                    urVar.k0();
                }
                op1.q(urVar, gbVar, d);
                op1.q(urVar, gbVar2, l2);
                l90.t(hashCode2, urVar, gbVar3, urVar, i5Var);
                op1.q(urVar, gbVar4, Q2);
                if (z) {
                    j = ptVar.c;
                } else {
                    j = ptVar.e;
                }
                te0Var.invoke(new co(j), urVar, 0);
                urVar.p(true);
                urVar.p(false);
            }
            if (z) {
                j2 = ptVar.b;
            } else {
                j2 = ptVar.d;
            }
            long j3 = j2;
            d6.f(str, new pr0(1.0f, true), new k92(j3, rt.h, rt.i, rt.k, rt.b, rt.j, 16613240), 0, false, 1, 0, urVar, (i3 & 14) | 1572864, 952);
            urVar.p(true);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new vh(str, z, ptVar, e21Var, te0Var, de0Var, i);
        }
    }
}
