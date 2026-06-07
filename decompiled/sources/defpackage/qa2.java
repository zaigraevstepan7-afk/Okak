package defpackage;

import com.topjohnwu.superuser.nio.FileSystemManager;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class qa2 {
    public static final rc1 a = new rc1(8.0f, 4.0f, 8.0f, 4.0f);

    public static final void a(final sa2 sa2Var, e21 e21Var, float f, kw1 kw1Var, long j, long j2, final fq fqVar, ur urVar, final int i) {
        int i2;
        boolean z;
        e21 e21Var2;
        final float f2;
        final kw1 kw1Var2;
        final long j3;
        final long j4;
        float f3;
        long e;
        int i3;
        kw1 kw1Var3;
        long j5;
        int i4;
        boolean h;
        int i5;
        urVar.Y(-343758958);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = urVar.f(sa2Var);
            } else {
                h = urVar.h(sa2Var);
            }
            if (h) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        int i6 = i2 | 3504;
        if ((i & 24576) == 0) {
            i6 = i2 | 11696;
        }
        if ((196608 & i) == 0) {
            i6 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i6 |= 524288;
        }
        int i7 = 113246208 | i6;
        if ((805306368 & i) == 0) {
            if (urVar.h(fqVar)) {
                i4 = FileSystemManager.MODE_WRITE_ONLY;
            } else {
                i4 = FileSystemManager.MODE_READ_ONLY;
            }
            i7 |= i4;
        }
        if ((306783379 & i7) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i7 & 1, z)) {
            urVar.T();
            if ((i & 1) != 0 && !urVar.y()) {
                urVar.R();
                i3 = i7 & (-4186113);
                e21Var2 = e21Var;
                f3 = f;
                kw1Var3 = kw1Var;
                j5 = j;
                e = j2;
            } else {
                f3 = na2.a;
                kw1 b = pw1.b(c01.r, urVar);
                long e2 = oo.e(c01.s, urVar);
                e = oo.e(c01.q, urVar);
                i3 = i7 & (-4186113);
                kw1Var3 = b;
                j5 = e2;
                e21Var2 = b21.a;
            }
            urVar.q();
            urVar.X(-1719869687);
            urVar.p(false);
            int i8 = i3 >> 9;
            l42.a(e21Var2, kw1Var3, e, 0L, 0.0f, 0.0f, go.N(-1573998995, new z10(f3, j5, fqVar), urVar), urVar, (57344 & i8) | 12582912 | (i8 & 458752), 72);
            f2 = f3;
            j3 = j5;
            kw1Var2 = kw1Var3;
            j4 = e;
        } else {
            urVar.R();
            e21Var2 = e21Var;
            f2 = f;
            kw1Var2 = kw1Var;
            j3 = j;
            j4 = j2;
        }
        dl1 r = urVar.r();
        if (r != null) {
            final e21 e21Var3 = e21Var2;
            r.d = new se0() { // from class: pa2
                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qa2.a(sa2.this, e21Var3, f2, kw1Var2, j3, j4, fqVar, (ur) obj, lo.b0(i | 1));
                    return od2.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.bi1 r27, final defpackage.fq r28, final defpackage.ta2 r29, defpackage.e21 r30, boolean r31, final defpackage.se0 r32, defpackage.ur r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qa2.b(bi1, fq, ta2, e21, boolean, se0, ur, int, int):void");
    }

    public static final ta2 c(ur urVar) {
        y41 y41Var = th.a;
        boolean g = urVar.g(false) | urVar.f(y41Var);
        Object L = urVar.L();
        if (g || L == or.a) {
            L = new ta2(y41Var);
            urVar.h0(L);
        }
        return (ta2) L;
    }
}
