package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class pj1 {
    public static final vv a = v21.a;
    public static final vv b = v21.d;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.e21 r28, long r29, float r31, long r32, int r34, float r35, defpackage.ur r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pj1.a(e21, long, float, long, int, float, ur, int, int):void");
    }

    public static final void b(final de0 de0Var, final e21 e21Var, long j, long j2, int i, float f, oe0 oe0Var, ur urVar, final int i2) {
        int i3;
        boolean z;
        final long j3;
        final long j4;
        final int i4;
        final float f2;
        final oe0 oe0Var2;
        long e;
        long e2;
        oe0 oe0Var3;
        int i5;
        final float f3;
        final int i6;
        boolean z2;
        final oe0 oe0Var4;
        final long j5;
        final long j6;
        urVar.Y(-339970038);
        if (urVar.h(de0Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3 | 746624;
        if ((599187 & i7) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i7 & 1, z)) {
            urVar.T();
            int i8 = i2 & 1;
            Object obj = or.a;
            if (i8 != 0 && !urVar.y()) {
                urVar.R();
                i5 = i7 & (-3678081);
                e = j;
                e2 = j2;
                i6 = i;
                f3 = f;
                oe0Var3 = oe0Var;
            } else {
                e = oo.e(f2.m, urVar);
                e2 = oo.e(f2.n, urVar);
                boolean e3 = urVar.e(e);
                Object L = urVar.L();
                if (e3 || L == obj) {
                    L = new v6(3, e);
                    urVar.h0(L);
                }
                oe0Var3 = (oe0) L;
                i5 = i7 & (-3678081);
                f3 = 4.0f;
                i6 = 1;
            }
            urVar.q();
            if ((i5 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object L2 = urVar.L();
            if (z2 || L2 == obj) {
                L2 = new og0(de0Var, 5);
                urVar.h0(L2);
            }
            final de0 de0Var2 = (de0) L2;
            e21 d = e21Var.d(r1.b);
            boolean f4 = urVar.f(de0Var2);
            Object L3 = urVar.L();
            if (f4 || L3 == obj) {
                L3 = new fd(de0Var2, 4);
                urVar.h0(L3);
            }
            e21 g = hy1.g(ou1.a(d, true, (oe0) L3), 240.0f, 4.0f);
            boolean f5 = urVar.f(de0Var2) | urVar.e(e2) | urVar.e(e) | urVar.f(oe0Var3);
            Object L4 = urVar.L();
            if (!f5 && L4 != obj) {
                oe0Var4 = oe0Var3;
                j5 = e;
                j6 = e2;
            } else {
                oe0Var4 = oe0Var3;
                j5 = e;
                j6 = e2;
                Object obj2 = new oe0() { // from class: lj1
                    @Override // defpackage.oe0
                    public final Object invoke(Object obj3) {
                        c40 c40Var = (c40) obj3;
                        float intBitsToFloat = Float.intBitsToFloat((int) (c40Var.d() & 4294967295L));
                        int i9 = i6;
                        float f6 = f3;
                        if (i9 != 0 && Float.intBitsToFloat((int) (c40Var.d() & 4294967295L)) <= Float.intBitsToFloat((int) (c40Var.d() >> 32))) {
                            f6 += c40Var.M(intBitsToFloat);
                        }
                        float M = f6 / c40Var.M(Float.intBitsToFloat((int) (c40Var.d() >> 32)));
                        float floatValue = ((Number) de0Var2.invoke()).floatValue();
                        float min = Math.min(floatValue, M) + floatValue;
                        if (min <= 1.0f) {
                            pj1.d(c40Var, min, 1.0f, j6, intBitsToFloat, i9);
                        }
                        pj1.d(c40Var, 0.0f, floatValue, j5, intBitsToFloat, i9);
                        oe0Var4.invoke(c40Var);
                        return od2.a;
                    }
                };
                urVar.h0(obj2);
                L4 = obj2;
            }
            f2.c(g, (oe0) L4, urVar, 0);
            i4 = i6;
            f2 = f3;
            j4 = j6;
            j3 = j5;
            oe0Var2 = oe0Var4;
        } else {
            urVar.R();
            j3 = j;
            j4 = j2;
            i4 = i;
            f2 = f;
            oe0Var2 = oe0Var;
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new se0(e21Var, j3, j4, i4, f2, oe0Var2, i2) { // from class: mj1
                public final /* synthetic */ e21 f;
                public final /* synthetic */ long g;
                public final /* synthetic */ long h;
                public final /* synthetic */ int i;
                public final /* synthetic */ float j;
                public final /* synthetic */ oe0 k;

                @Override // defpackage.se0
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int b0 = lo.b0(49);
                    pj1.b(de0.this, this.f, this.g, this.h, this.i, this.j, this.k, (ur) obj3, b0);
                    return od2.a;
                }
            };
        }
    }

    public static final void c(c40 c40Var, float f, float f2, long j, q32 q32Var) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c40Var.d() >> 32)) - (2.0f * (q32Var.a / 2.0f));
        c40.B(c40Var, j, f, f2, (Float.floatToRawIntBits(r0) << 32) | (Float.floatToRawIntBits(r0) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), 0.0f, q32Var, 832);
    }

    public static final void d(c40 c40Var, float f, float f2, long j, float f3, int i) {
        boolean z;
        float f4;
        float f5;
        float intBitsToFloat = Float.intBitsToFloat((int) (c40Var.d() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (c40Var.d() & 4294967295L));
        float f6 = intBitsToFloat2 / 2.0f;
        if (c40Var.getLayoutDirection() == jq0.e) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f4 = f;
        } else {
            f4 = 1.0f - f2;
        }
        float f7 = f4 * intBitsToFloat;
        if (z) {
            f5 = f2;
        } else {
            f5 = 1.0f - f;
        }
        float f8 = f5 * intBitsToFloat;
        if (i == 0 || intBitsToFloat2 > intBitsToFloat) {
            c40.g0(c40Var, j, (Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L), (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L), f3, 0, 496);
            return;
        }
        float f9 = f3 / 2.0f;
        float f10 = intBitsToFloat - f9;
        if (f7 < f9) {
            f7 = f9;
        }
        if (f7 > f10) {
            f7 = f10;
        }
        if (f8 < f9) {
            f8 = f9;
        }
        if (f8 <= f10) {
            f10 = f8;
        }
        if (Math.abs(f2 - f) > 0.0f) {
            c40.g0(c40Var, j, (Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L), (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L), f3, i, 480);
        }
    }
}
