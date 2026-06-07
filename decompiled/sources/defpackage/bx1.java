package defpackage;

import com.elixir.loader.R;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class bx1 {
    public static final dc2 a = mp0.P(300, 2, y40.a);

    public static final void a(e21 e21Var, se0 se0Var, ur urVar, int i) {
        int i2;
        int i3;
        boolean z;
        urVar.Y(1361920385);
        int i4 = 2;
        if (urVar.f(e21Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (urVar.h(se0Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i6 & 1, z)) {
            String g = nq1.g(R.string.m3c_bottom_sheet_drag_handle_description, urVar);
            e21 b = hy1.b(b21.a, 1.0f);
            j01 d = hj.d(g3.j, false);
            int x = io.x(urVar);
            sf1 l = urVar.l();
            e21 Q = fp.Q(urVar, b);
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            op1.q(urVar, kr.f, d);
            op1.q(urVar, kr.e, l);
            gb gbVar = kr.g;
            if (urVar.S || !sn0.r(urVar.L(), Integer.valueOf(x))) {
                l90.s(x, urVar, x, gbVar);
            }
            op1.q(urVar, kr.d, Q);
            qa2.b(na2.a(urVar), go.N(1497042086, new zx0(g, i4), urVar), qa2.c(urVar), e21Var, false, se0Var, urVar, ((i6 << 9) & 7168) | 48 | ((i6 << 21) & 234881024), 240);
            urVar.p(true);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new u2(e21Var, se0Var, i);
        }
    }
}
