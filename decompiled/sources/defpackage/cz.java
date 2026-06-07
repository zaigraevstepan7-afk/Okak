package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class cz {
    public static final cz a = new Object();

    public final void a(by1 by1Var, ur urVar, int i) {
        int i2;
        boolean z;
        ur urVar2 = urVar;
        float f = by1Var.g;
        urVar2.Y(2137486921);
        if (urVar2.f(by1Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2;
        boolean z2 = false;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (urVar2.O(i3 & 1, z)) {
            ua2 ua2Var = by1Var.j;
            if (!Float.isNaN(f) && (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040) {
                boolean f2 = urVar2.f(ua2Var) | urVar2.f(null);
                Object L = urVar2.L();
                xl1 xl1Var = or.a;
                if (f2 || L == xl1Var) {
                    L = fr1.h(new bz(by1Var, 0));
                    urVar2.h0(L);
                }
                o22 a2 = dy1.a(((co) ((o22) L).getValue()).a, fp.a0(u21.g, urVar2), null, urVar2, 0, 12);
                fq N = go.N(-1658896622, new h8(by1Var, 6), urVar2);
                urVar2.X(690083313);
                urVar2.p(false);
                e21 e21Var = by1Var.a;
                b21 b21Var = b21.a;
                e21 d = e21Var.d(b21Var);
                boolean f3 = urVar2.f(a2);
                Object L2 = urVar2.L();
                if (f3 || L2 == xl1Var) {
                    L2 = new yy(a2, 0);
                    urVar2.h0(L2);
                }
                e21 t = rx.t(d, (oe0) L2);
                Object L3 = urVar2.L();
                if (L3 == xl1Var) {
                    L3 = new p1(23);
                    urVar2.h0(L3);
                }
                e21 a3 = ou1.a(t, false, (oe0) L3);
                Object L4 = urVar2.L();
                if (L4 == xl1Var) {
                    L4 = az.b;
                    urVar2.h0(L4);
                }
                e21 a4 = s42.a(a3, od2.a, (PointerInputEventHandler) L4);
                j01 d2 = hj.d(g3.f, false);
                int x = io.x(urVar2);
                sf1 l = urVar2.l();
                e21 Q = fp.Q(urVar2, a4);
                lr.b.getClass();
                hs hsVar = kr.b;
                urVar2.a0();
                if (urVar2.S) {
                    urVar2.k(hsVar);
                } else {
                    urVar2.k0();
                }
                op1.q(urVar2, kr.f, d2);
                op1.q(urVar2, kr.e, l);
                gb gbVar = kr.g;
                if (urVar2.S || !sn0.r(urVar2.L(), Integer.valueOf(x))) {
                    l90.s(x, urVar2, x, gbVar);
                }
                op1.q(urVar2, kr.d, Q);
                e21 A = sn0.A(sn0.X(b21Var, by1Var.i));
                js jsVar = hd.a;
                if ((i3 & 14) == 4) {
                    z2 = true;
                }
                Object L5 = urVar2.L();
                if (z2 || L5 == xl1Var) {
                    L5 = new zy(by1Var);
                    urVar2.h0(L5);
                }
                ia0 ia0Var = (ia0) L5;
                long j = ua2Var.c;
                long j2 = ua2Var.d;
                long j3 = ua2Var.e;
                long j4 = ua2Var.f;
                fq fqVar = by1Var.b;
                k92 k92Var = by1Var.c;
                k92 k92Var2 = by1Var.d;
                fq fqVar2 = by1Var.e;
                float f4 = by1Var.g;
                pc1 pc1Var = by1Var.h;
                Object L6 = urVar2.L();
                if (L6 == xl1Var) {
                    L6 = new h2(17);
                    urVar2.h0(L6);
                }
                hd.c(A, ia0Var, j, j2, j4, j3, fqVar, k92Var, k92Var2, (de0) L6, fqVar2, N, f4, pc1Var, urVar2, 0);
                urVar2 = urVar2;
                urVar2.p(true);
            } else {
                se.h("The expandedHeight is expected to be specified and finite");
                return;
            }
        } else {
            urVar2.R();
        }
        dl1 r = urVar2.r();
        if (r != null) {
            r.d = new u2(this, i, 9, by1Var);
        }
    }
}
