package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class x6 {
    public static final float a = (25.0f * 2.0f) / 2.4142137f;

    public static final void a(d91 d91Var, e21 e21Var, long j, ur urVar, int i) {
        int i2;
        int i3;
        boolean z;
        int i4;
        urVar.Y(1776202187);
        if (urVar.f(d91Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (urVar.f(e21Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3 | 128;
        boolean z2 = true;
        if ((i6 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i6 & 1, z)) {
            urVar.T();
            if ((i & 1) != 0 && !urVar.y()) {
                urVar.R();
                i4 = i6 & (-897);
            } else {
                i4 = i6 & (-897);
                j = 9205357640488583168L;
            }
            urVar.q();
            int i7 = i4 & 14;
            if (i7 != 4) {
                z2 = false;
            }
            Object L = urVar.L();
            if (z2 || L == or.a) {
                L = new r(d91Var, 3);
                urVar.h0(L);
            }
            d6.h(d91Var, g3.g, go.N(-1653527038, new s6(j, ou1.a(e21Var, false, (oe0) L)), urVar), urVar, i7 | 432);
        } else {
            urVar.R();
        }
        long j2 = j;
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new t6(d91Var, e21Var, j2, i, 0);
        }
    }

    public static final void b(e21 e21Var, ur urVar, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        urVar.Y(694251107);
        int i5 = i2 & 1;
        int i6 = 2;
        if (i5 != 0) {
            i4 = i | 6;
        } else {
            if (urVar.f(e21Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i4 = i3 | i;
        }
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i4 & 1, z)) {
            if (i5 != 0) {
                e21Var = b21.a;
            }
            xp1.a(urVar, fp.t(hy1.g(e21Var, a, 25.0f), new o1(i6)));
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new u6(e21Var, i, i2);
        }
    }
}
