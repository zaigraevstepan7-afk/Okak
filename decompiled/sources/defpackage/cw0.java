package defpackage;

import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class cw0 {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;

    static {
        float f = bf.D;
        a = bf.T;
        b = bf.i0;
        c = bf.f0;
        d = bf.D;
        float f2 = bf.D;
        float f3 = bf.D;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.fq r23, defpackage.e21 r24, defpackage.se0 r25, final defpackage.se0 r26, final defpackage.xv0 r27, defpackage.ur r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cw0.a(fq, e21, se0, se0, xv0, ur, int, int):void");
    }

    public static final void b(se0 se0Var, se0 se0Var2, fq fqVar, se0 se0Var3, se0 se0Var4, ur urVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        se0 se0Var5;
        se0 se0Var6;
        se0 se0Var7;
        se0 se0Var8;
        urVar.Y(-61277522);
        if (urVar.h(se0Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (urVar.h(se0Var2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (urVar.h(se0Var3)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if (urVar.h(se0Var4)) {
            i5 = 16384;
        } else {
            i5 = SharedConstants.DefaultBufferSize;
        }
        int i9 = i8 | i5;
        if ((i9 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i9 & 1, z)) {
            Object L = urVar.L();
            xl1 xl1Var = or.a;
            if (L == xl1Var) {
                L = new Object();
                urVar.h0(L);
            }
            hw0 hw0Var = (hw0) L;
            if (se0Var3 == null) {
                se0Var5 = mp0.j;
            } else {
                se0Var5 = se0Var3;
            }
            if (se0Var4 == null) {
                se0Var6 = mp0.k;
            } else {
                se0Var6 = se0Var4;
            }
            if (se0Var == null) {
                se0Var7 = mp0.l;
            } else {
                se0Var7 = se0Var;
            }
            if (se0Var2 == null) {
                se0Var8 = mp0.m;
            } else {
                se0Var8 = se0Var2;
            }
            fq fqVar2 = new fq(1271844412, true, new t(xn.F(fqVar, se0Var5, se0Var6, se0Var7, se0Var8), 7));
            Object L2 = urVar.L();
            if (L2 == xl1Var) {
                L2 = new f31(hw0Var);
                urVar.h0(L2);
            }
            j01 j01Var = (j01) L2;
            int x = io.x(urVar);
            sf1 l = urVar.l();
            e21 Q = fp.Q(urVar, b21.a);
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            op1.q(urVar, kr.f, j01Var);
            op1.q(urVar, kr.e, l);
            gb gbVar = kr.g;
            if (urVar.S || !sn0.r(urVar.L(), Integer.valueOf(x))) {
                l90.s(x, urVar, x, gbVar);
            }
            op1.q(urVar, kr.d, Q);
            fqVar2.invoke(urVar, 0);
            urVar.p(true);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new aw0(se0Var, se0Var2, fqVar, se0Var3, se0Var4, i);
        }
    }

    public static final void c(long j, qc2 qc2Var, se0 se0Var, ur urVar, int i) {
        int i2;
        int i3;
        boolean z;
        long j2;
        ur urVar2;
        se0 se0Var2;
        urVar.Y(-285397024);
        if (urVar.e(j)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (urVar.h(se0Var)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i5 = i4 | i3;
        if ((i5 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i5 & 1, z)) {
            j2 = j;
            urVar2 = urVar;
            xn.i(j2, rc2.a(qc2Var, urVar), se0Var, urVar2, i5 & 910);
            se0Var2 = se0Var;
        } else {
            j2 = j;
            urVar2 = urVar;
            se0Var2 = se0Var;
            urVar2.R();
        }
        dl1 r = urVar2.r();
        if (r != null) {
            r.d = new t6(j2, qc2Var, se0Var2, i);
        }
    }

    public static final int d(mn0 mn0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        float f;
        if (i6 == 1) {
            f = bf.U;
        } else if (i6 == 2) {
            f = bf.k0;
        } else {
            f = bf.e0;
        }
        int max = Math.max(Math.max(us.i(j), mn0Var.j0(f)), Math.max(i, Math.max(i3 + i4 + i5, i2)) + i7);
        int g = us.g(j);
        if (max > g) {
            return g;
        }
        return max;
    }
}
