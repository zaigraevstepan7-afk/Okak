package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class l42 {
    public static final js a = new js(new ax0(22));

    public static final void a(e21 e21Var, kw1 kw1Var, final long j, long j2, float f, float f2, final fq fqVar, ur urVar, int i, int i2) {
        long j3;
        float f3;
        final float f4;
        if ((i2 & 1) != 0) {
            e21Var = b21.a;
        }
        final e21 e21Var2 = e21Var;
        if ((i2 & 2) != 0) {
            kw1Var = d6.w;
        }
        final kw1 kw1Var2 = kw1Var;
        if ((i2 & 8) != 0) {
            j3 = oo.b(j, urVar);
        } else {
            j3 = j2;
        }
        if ((i2 & 16) != 0) {
            f3 = 0.0f;
        } else {
            f3 = f;
        }
        if ((i2 & 32) != 0) {
            f4 = 0.0f;
        } else {
            f4 = f2;
        }
        js jsVar = a;
        final float f5 = ((f20) urVar.j(jsVar)).e + f3;
        final zi ziVar = null;
        vn.c(new zj1[]{et.a.a(new co(j3)), jsVar.a(new f20(f5))}, go.N(421772006, new se0() { // from class: k42
            @Override // defpackage.se0
            public final Object invoke(Object obj, Object obj2) {
                boolean z;
                ur urVar2 = (ur) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                boolean O = urVar2.O(intValue & 1, z);
                od2 od2Var = od2.a;
                if (O) {
                    e21 c = l42.c(e21.this, kw1Var2, l42.d(j, f5, urVar2), ziVar, ((c00) urVar2.j(is.h)).W(f4));
                    Object L = urVar2.L();
                    xl1 xl1Var = or.a;
                    if (L == xl1Var) {
                        L = new nv1(6);
                        urVar2.h0(L);
                    }
                    e21 a2 = ou1.a(c, false, (oe0) L);
                    Object L2 = urVar2.L();
                    if (L2 == xl1Var) {
                        L2 = az.c;
                        urVar2.h0(L2);
                    }
                    e21 a3 = s42.a(a2, od2Var, (PointerInputEventHandler) L2);
                    j01 d = hj.d(g3.f, true);
                    int x = io.x(urVar2);
                    sf1 l = urVar2.l();
                    e21 Q = fp.Q(urVar2, a3);
                    lr.b.getClass();
                    hs hsVar = kr.b;
                    urVar2.a0();
                    if (urVar2.S) {
                        urVar2.k(hsVar);
                    } else {
                        urVar2.k0();
                    }
                    op1.q(urVar2, kr.f, d);
                    op1.q(urVar2, kr.e, l);
                    gb gbVar = kr.g;
                    if (urVar2.S || !sn0.r(urVar2.L(), Integer.valueOf(x))) {
                        l90.s(x, urVar2, x, gbVar);
                    }
                    op1.q(urVar2, kr.d, Q);
                    fqVar.invoke(urVar2, 0);
                    urVar2.p(true);
                    return od2Var;
                }
                urVar2.R();
                return od2Var;
            }
        }, urVar), urVar, 56);
    }

    public static final void b(final de0 de0Var, final e21 e21Var, boolean z, final kw1 kw1Var, final long j, long j2, float f, float f2, zi ziVar, r31 r31Var, final fq fqVar, ur urVar, int i, int i2) {
        final boolean z2;
        float f3;
        final float f4;
        final zi ziVar2;
        final r31 r31Var2;
        if ((i2 & 4) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i2 & 64) != 0) {
            f3 = 0.0f;
        } else {
            f3 = f;
        }
        if ((i2 & 128) != 0) {
            f4 = 0.0f;
        } else {
            f4 = f2;
        }
        if ((i2 & 256) != 0) {
            ziVar2 = null;
        } else {
            ziVar2 = ziVar;
        }
        if (r31Var == null) {
            urVar.X(-1701074900);
            Object L = urVar.L();
            if (L == or.a) {
                L = new r31();
                urVar.h0(L);
            }
            urVar.p(false);
            r31Var2 = (r31) L;
        } else {
            urVar.X(2023335947);
            urVar.p(false);
            r31Var2 = r31Var;
        }
        js jsVar = a;
        final float f5 = ((f20) urVar.j(jsVar)).e + f3;
        vn.c(new zj1[]{et.a.a(new co(j2)), jsVar.a(new f20(f5))}, go.N(849208527, new se0() { // from class: i42
            @Override // defpackage.se0
            public final Object invoke(Object obj, Object obj2) {
                boolean z3;
                ur urVar2 = (ur) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (urVar2.O(intValue & 1, z3)) {
                    ei0 ei0Var = kn0.a;
                    e21 r = rx.r(f2.r(l42.c(e21.this.d(f11.a), kw1Var, l42.d(j, f5, urVar2), ziVar2, ((c00) urVar2.j(is.h)).W(f4)), r31Var2, xo1.a(0.0f, 7, false), z2, null, de0Var, 24));
                    j01 d = hj.d(g3.f, true);
                    int x = io.x(urVar2);
                    sf1 l = urVar2.l();
                    e21 Q = fp.Q(urVar2, r);
                    lr.b.getClass();
                    hs hsVar = kr.b;
                    urVar2.a0();
                    if (urVar2.S) {
                        urVar2.k(hsVar);
                    } else {
                        urVar2.k0();
                    }
                    op1.q(urVar2, kr.f, d);
                    op1.q(urVar2, kr.e, l);
                    gb gbVar = kr.g;
                    if (urVar2.S || !sn0.r(urVar2.L(), Integer.valueOf(x))) {
                        l90.s(x, urVar2, x, gbVar);
                    }
                    op1.q(urVar2, kr.d, Q);
                    fqVar.invoke(urVar2, 0);
                    urVar2.p(true);
                } else {
                    urVar2.R();
                }
                return od2.a;
            }
        }, urVar), urVar, 56);
    }

    public static final e21 c(e21 e21Var, kw1 kw1Var, long j, zi ziVar, float f) {
        kw1 kw1Var2;
        e21 e21Var2;
        e21 e21Var3 = b21.a;
        if (f > 0.0f) {
            kw1Var2 = kw1Var;
            e21Var2 = d6.y(0.0f, 0.0f, 0.0f, f, kw1Var2, 124895);
        } else {
            kw1Var2 = kw1Var;
            e21Var2 = e21Var3;
        }
        e21 d = e21Var.d(e21Var2);
        if (ziVar != null) {
            e21Var3 = new yi(ziVar.a, ziVar.b, kw1Var2);
        }
        return sn0.z(f2.k(d.d(e21Var3), j, kw1Var2), kw1Var2);
    }

    public static final long d(long j, float f, ur urVar) {
        mo moVar = (mo) urVar.j(oo.a);
        boolean booleanValue = ((Boolean) urVar.j(oo.b)).booleanValue();
        if (co.c(j, moVar.p) && booleanValue) {
            return oo.g(moVar, f);
        }
        return j;
    }
}
