package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class jk1 {
    public static final /* synthetic */ int a = 0;

    static {
        float f = qw0.a;
    }

    public static final void a(ia0 ia0Var, long j, ur urVar, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        urVar.Y(-1353562852);
        if (urVar.f(ia0Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (urVar.e(j)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i5 & 1, z)) {
            Object L = urVar.L();
            Object obj = or.a;
            Object obj2 = L;
            if (L == obj) {
                n8 a2 = p8.a();
                a2.i(1);
                urVar.h0(a2);
                obj2 = a2;
            }
            Object obj3 = (n8) obj2;
            Object L2 = urVar.L();
            if (L2 == obj) {
                L2 = fr1.h(new v3(ia0Var, 26));
                urVar.h0(L2);
            }
            Object a3 = ab.a(((Number) ((o22) L2).getValue()).floatValue(), fp.a0(u21.g, urVar), urVar, 0, 28);
            int i6 = i5 & 14;
            if (i6 != 4) {
                z2 = false;
            } else {
                z2 = true;
            }
            Object L3 = urVar.L();
            if (z2 || L3 == obj) {
                L3 = new hh1(ia0Var, 2);
                urVar.h0(L3);
            }
            AtomicInteger atomicInteger = ou1.a;
            e21 f = hy1.f(new gn((oe0) L3), 16.0f);
            if (i6 != 4) {
                z3 = false;
            } else {
                z3 = true;
            }
            boolean f2 = z3 | urVar.f(a3);
            if ((i5 & 112) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean h = f2 | z4 | urVar.h(obj3);
            Object L4 = urVar.L();
            if (h || L4 == obj) {
                Object wiVar = new wi(ia0Var, a3, j, obj3, 2);
                urVar.h0(wiVar);
                L4 = wiVar;
            }
            f2.c(f, (oe0) L4, urVar, 0);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new s6(ia0Var, j, i);
        }
    }

    public static final void b(boolean z, de0 de0Var, e21 e21Var, qk1 qk1Var, i3 i3Var, te0 te0Var, fq fqVar, ur urVar, int i) {
        int i2;
        int i3;
        boolean z2;
        e21 e21Var2;
        fq fqVar2;
        qk1 qk1Var2;
        i3 i3Var2;
        te0 te0Var2;
        qk1 qk1Var3;
        i3 i3Var3;
        te0 N;
        urVar.Y(-532332839);
        if (urVar.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (urVar.h(de0Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3 | 222208;
        int i6 = 1;
        if ((599187 & i5) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i5 & 1, z2)) {
            urVar.T();
            if ((i & 1) != 0 && !urVar.y()) {
                urVar.R();
                qk1Var3 = qk1Var;
                i3Var3 = i3Var;
                N = te0Var;
            } else {
                Object[] objArr = new Object[0];
                Object L = urVar.L();
                if (L == or.a) {
                    L = new ax0(15);
                    urVar.h0(L);
                }
                qk1Var3 = (qk1) go.Q(objArr, qk1.b, (de0) L, urVar, 384);
                i3Var3 = g3.f;
                N = go.N(1028036671, new p9(i6, qk1Var3, z), urVar);
            }
            urVar.q();
            e21Var2 = e21Var;
            e21 d = e21Var2.d(new ik1(z, de0Var, qk1Var3, hk1.c));
            j01 d2 = hj.d(i3Var3, false);
            int x = io.x(urVar);
            sf1 l = urVar.l();
            e21 Q = fp.Q(urVar, d);
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
            lj ljVar = lj.a;
            fqVar2 = fqVar;
            fqVar2.invoke(ljVar, urVar, 54);
            N.invoke(ljVar, urVar, 54);
            urVar.p(true);
            te0Var2 = N;
            i3Var2 = i3Var3;
            qk1Var2 = qk1Var3;
        } else {
            e21Var2 = e21Var;
            fqVar2 = fqVar;
            urVar.R();
            qk1Var2 = qk1Var;
            i3Var2 = i3Var;
            te0Var2 = te0Var;
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new q61(z, de0Var, e21Var2, qk1Var2, i3Var2, te0Var2, fqVar2, i);
        }
    }

    public static final void c(c40 c40Var, n8 n8Var, pl1 pl1Var, long j, float f, ua uaVar) {
        n8Var.g();
        n8Var.e(0.0f, 0.0f);
        float W = c40Var.W(10.0f);
        float f2 = uaVar.f;
        n8Var.d((W * f2) / 2.0f, c40Var.W(5.0f) * f2);
        n8Var.d(c40Var.W(10.0f) * f2, 0.0f);
        float intBitsToFloat = (Float.intBitsToFloat((int) (pl1Var.b() >> 32)) + (Math.min(pl1Var.c - pl1Var.a, pl1Var.d - pl1Var.b) / 2.0f)) - ((c40Var.W(10.0f) * f2) / 2.0f);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (pl1Var.b() & 4294967295L)) - c40Var.W(2.5f);
        n8Var.k((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
        float W2 = uaVar.e - c40Var.W(2.5f);
        long l0 = c40Var.l0();
        ld b0 = c40Var.b0();
        long k = b0.k();
        b0.h().h();
        try {
            ((rg2) b0.f).y(l0, W2);
            c40.y0(c40Var, n8Var, j, f, new q32(c40Var.W(2.5f), 0.0f, 0, 0, 30), 48);
        } finally {
            l90.v(b0, k);
        }
    }
}
