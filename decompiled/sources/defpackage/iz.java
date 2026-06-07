package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class iz {
    public static final ci1 a = new ci1(true, 14);

    public static final void a(t62 t62Var, h62 h62Var, ur urVar, int i) {
        int i2;
        int i3;
        boolean z;
        ur urVar2;
        urVar.Y(1904307118);
        if (urVar.f(t62Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (urVar.h(h62Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        boolean z2 = false;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i5 & 1, z)) {
            urVar.X(-1009482584);
            Context context = (Context) urVar.j(l6.b);
            urVar.p(false);
            boolean h = urVar.h(h62Var);
            if ((i5 & 14) == 4) {
                z2 = true;
            }
            boolean h2 = h | z2 | urVar.h(context);
            Object L = urVar.L();
            if (h2 || L == or.a) {
                L = new k1(h62Var, context, t62Var, 7);
                urVar.h0(L);
            }
            urVar2 = urVar;
            tt.b(null, null, (oe0) L, urVar2, 0, 3);
        } else {
            urVar2 = urVar;
            urVar2.R();
        }
        dl1 r = urVar2.r();
        if (r != null) {
            r.d = new u2(t62Var, i, 11, h62Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0502 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0525 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0604 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final int r59, long r60, defpackage.ur r62, final int r63) {
        /*
            Method dump skipped, instructions count: 1872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iz.b(int, long, ur, int):void");
    }

    public static final void c(t62 t62Var, i62 i62Var, de0 de0Var, ur urVar, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        boolean h;
        int i4;
        boolean h2;
        int i5;
        urVar.Y(-2040393164);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h2 = urVar.f(t62Var);
            } else {
                h2 = urVar.h(t62Var);
            }
            if (h2) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                h = urVar.f(i62Var);
            } else {
                h = urVar.h(i62Var);
            }
            if (h) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (urVar.h(de0Var)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        boolean z3 = false;
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i2 & 1, z)) {
            if ((i2 & 112) != 32 && ((i2 & 64) == 0 || !urVar.f(i62Var))) {
                z2 = false;
            } else {
                z2 = true;
            }
            Object L = urVar.L();
            xl1 xl1Var = or.a;
            int i6 = 8;
            if (z2 || L == xl1Var) {
                L = new hz0(new rg2(new j1(11, i62Var, de0Var), 8));
                urVar.h0(L);
            }
            hz0 hz0Var = (hz0) L;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && urVar.h(t62Var))) {
                z3 = true;
            }
            Object L2 = urVar.L();
            if (z3 || L2 == xl1Var) {
                L2 = new v3(t62Var, i6);
                urVar.h0(L2);
            }
            c9.a(hz0Var, (de0) L2, a, go.N(1315155414, new u2(10, i62Var, t62Var), urVar), urVar, 3456, 0);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new h9(t62Var, i62Var, de0Var, i, 5);
        }
    }

    public static final void d(e21 e21Var, fq fqVar, ur urVar, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        urVar.Y(1392105195);
        int i5 = 2;
        if ((i & 6) == 0) {
            if (urVar.f(e21Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.h(fqVar)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i2 & 1, z)) {
            f2.e(e21Var, r62.a, fqVar, urVar, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new y9(e21Var, fqVar, i, i5);
        }
    }
}
