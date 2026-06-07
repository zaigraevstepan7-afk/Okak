package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class rl1 {
    public final u7 a;
    public final x92 b;
    public final b41 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public n2 g;
    public long h;
    public final s8 i;
    public final h41 j;

    /* JADX WARN: Type inference failed for: r0v0, types: [u7, java.lang.Object] */
    public rl1() {
        ?? obj = new Object();
        obj.b = new long[192];
        obj.c = new long[192];
        this.a = obj;
        this.b = new x92();
        this.c = new b41();
        this.h = -1L;
        this.i = new s8(this, 11);
        this.j = new h41();
    }

    public static boolean c(e81 e81Var) {
        ic1 ic1Var = e81Var.P;
        if (ic1Var != null && !qo.Q(((vf0) ic1Var).b())) {
            return true;
        }
        return false;
    }

    public static long g(ar0 ar0Var) {
        a81 a81Var = ar0Var.J;
        e81 e81Var = a81Var.d;
        long j = 0;
        for (e81 e81Var2 = a81Var.c; e81Var2 != null && e81Var2 != e81Var; e81Var2 = e81Var2.u) {
            if (c(e81Var2)) {
                return 9223372034707292159L;
            }
            j = xm0.c(j, e81Var2.D);
        }
        return j;
    }

    public static void i(ar0 ar0Var) {
        if (ar0Var.g && !c(ar0Var.J.d)) {
            ar0Var.g = false;
            if (ar0Var.k) {
                ar0Var.j = g(ar0Var);
                ar0Var.k = false;
            }
            if (!xm0.a(ar0Var.j, 9223372034707292159L)) {
                q41 z = ar0Var.z();
                Object[] objArr = z.e;
                int i = z.g;
                for (int i2 = 0; i2 < i; i2++) {
                    i((ar0) objArr[i2]);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rl1.a():void");
    }

    public final long b(ar0 ar0Var) {
        long j;
        int i = ar0Var.f & 33554431;
        u7 u7Var = this.a;
        long[] jArr = (long[]) u7Var.b;
        int i2 = u7Var.a;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            if ((((int) jArr[i3 + 2]) & 33554431) == i) {
                j = jArr[i3];
                break;
            }
        }
        j = Long.MAX_VALUE;
        if (j == Long.MAX_VALUE) {
            return 9223372034707292159L;
        }
        return (((int) j) & 4294967295L) | (((int) (j >> 32)) << 32);
    }

    public final void d(ar0 ar0Var) {
        char c;
        boolean z;
        int i;
        boolean z2 = true;
        ar0Var.g = true;
        ar0Var.h = 9223372034707292159L;
        a81 a81Var = ar0Var.J;
        e81 e81Var = a81Var.d;
        i01 i01Var = ar0Var.K.p;
        int f0 = i01Var.f0();
        float e0 = i01Var.e0();
        h41 h41Var = this.j;
        h41Var.a = 0.0f;
        h41Var.b = 0.0f;
        h41Var.c = f0;
        h41Var.d = e0;
        while (true) {
            c = ' ';
            if (e81Var == null) {
                break;
            }
            ar0 ar0Var2 = e81Var.s;
            if (e81Var == ar0Var2.J.d && !ar0Var2.g) {
                long b = b(ar0Var2);
                if (!xm0.a(b, 9223372034707292159L)) {
                    float f = (int) (b & 4294967295L);
                    h41Var.c((Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits((int) (b >> 32)) << 32));
                    break;
                }
            }
            ic1 ic1Var = e81Var.P;
            if (ic1Var != null) {
                float[] b2 = ((vf0) ic1Var).b();
                if (!qo.Q(b2)) {
                    d01.c(b2, h41Var);
                }
            }
            long j = e81Var.D;
            h41Var.c((4294967295L & Float.floatToRawIntBits((int) (j & 4294967295L))) | (Float.floatToRawIntBits((int) (j >> 32)) << 32));
            e81Var = e81Var.u;
        }
        int i2 = (int) h41Var.a;
        int i3 = (int) h41Var.b;
        int i4 = (int) h41Var.c;
        int i5 = (int) h41Var.d;
        int i6 = ar0Var.f;
        boolean z3 = ar0Var.l;
        ar0Var.l = true;
        u7 u7Var = this.a;
        if (z3) {
            int i7 = i6 & 33554431;
            long[] jArr = (long[]) u7Var.b;
            int i8 = u7Var.a;
            int i9 = 0;
            while (i9 < jArr.length - 2 && i9 < i8) {
                int i10 = i9 + 2;
                char c2 = c;
                u7 u7Var2 = u7Var;
                long j2 = jArr[i10];
                z = z2;
                if ((((int) j2) & 33554431) == i7) {
                    jArr[i9] = (i2 << c2) | (i3 & 4294967295L);
                    jArr[i9 + 1] = (i5 & 4294967295L) | (i4 << c2);
                    jArr[i10] = (((j2 >> 63) & 1) << 60) | j2;
                    break;
                }
                i9 += 3;
                c = c2;
                u7Var = u7Var2;
                z2 = z;
            }
        }
        z = z2;
        u7 u7Var3 = u7Var;
        ar0 v = ar0Var.v();
        if (v != null) {
            i = v.f;
        } else {
            i = -1;
        }
        u7.e(u7Var3, i6, i2, i3, i4, i5, i, a81Var.d(1024), a81Var.d(16), this.b.a.a(i6), 512);
        this.d = z;
        q41 z4 = ar0Var.z();
        Object[] objArr = z4.e;
        int i11 = z4.g;
        for (int i12 = 0; i12 < i11; i12++) {
            ar0 ar0Var3 = (ar0) objArr[i12];
            if (ar0Var3.I()) {
                d(ar0Var3);
            }
        }
    }

    public final void e(ar0 ar0Var) {
        if (ar0Var.l) {
            this.d = true;
            int i = ar0Var.f & 33554431;
            u7 u7Var = this.a;
            long[] jArr = (long[]) u7Var.b;
            int i2 = u7Var.a;
            int i3 = 0;
            while (true) {
                if (i3 >= jArr.length - 2 || i3 >= i2) {
                    break;
                }
                int i4 = i3 + 2;
                long j = jArr[i4];
                if ((((int) j) & 33554431) == i) {
                    jArr[i4] = (((j >> 63) & 1) << 60) | j;
                    break;
                }
                i3 += 3;
            }
        }
        j();
    }

    public final void f(ar0 ar0Var, boolean z) {
        long j;
        long j2;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        long[] jArr;
        int i3;
        int i4;
        boolean I = ar0Var.I();
        a81 a81Var = ar0Var.J;
        if (!I) {
            return;
        }
        ar0 v = ar0Var.v();
        if (v != null && !v.g) {
            if (v.k) {
                v.k = false;
                v.j = g(v);
            }
            j = v.j;
        } else if (v == null) {
            j = 0;
        } else {
            j = 9223372034707292159L;
        }
        e81 e81Var = a81Var.d;
        if (!xm0.a(j, 9223372034707292159L) && !c(e81Var)) {
            if (!ar0Var.g) {
                long c = xm0.c(j, e81Var.D);
                i01 i01Var = ar0Var.K.p;
                int f0 = i01Var.f0();
                int e0 = i01Var.e0();
                long j3 = (f0 << 32) | (e0 & 4294967295L);
                int i5 = ar0Var.f;
                boolean z4 = ar0Var.l;
                u7 u7Var = this.a;
                if (z4) {
                    if (!z && xm0.a(c, ar0Var.h) && en0.a(j3, ar0Var.i)) {
                        j2 = c;
                    } else {
                        if (v != null) {
                            int i6 = v.f;
                            int i7 = (int) (c >> 32);
                            j2 = c;
                            int i8 = (int) (j2 & 4294967295L);
                            int i9 = i5 & 33554431;
                            long[] jArr2 = (long[]) u7Var.b;
                            int i10 = u7Var.a;
                            int i11 = 0;
                            while (true) {
                                if (i11 >= jArr2.length - 2 || i11 >= i10) {
                                    break;
                                }
                                int i12 = i10;
                                if ((((int) jArr2[i11 + 2]) & 33554431) == i6) {
                                    long j4 = jArr2[i11];
                                    i = i6;
                                    i2 = i8;
                                    int i13 = ((int) (j4 >> 32)) + i7;
                                    int i14 = ((int) j4) + i2;
                                    int i15 = i13 + f0;
                                    int i16 = i14 + e0;
                                    i11 += 3;
                                    i3 = e0;
                                    while (true) {
                                        if (i11 < jArr2.length - 2) {
                                            int i17 = i12;
                                            if (i11 < i17) {
                                                int i18 = i11 + 2;
                                                int i19 = f0;
                                                long j5 = jArr2[i18];
                                                long[] jArr3 = jArr2;
                                                if ((((int) j5) & 33554431) == i9) {
                                                    long j6 = jArr3[i11];
                                                    int i20 = i13 - ((int) (j6 >> 32));
                                                    int i21 = i14 - ((int) j6);
                                                    jArr3[i11] = (i14 & 4294967295L) | (i13 << 32);
                                                    jArr3[i11 + 1] = (i15 << 32) | (i16 & 4294967295L);
                                                    jArr3[i18] = j5 | (((j5 >> 63) & 1) << 60);
                                                    if (i20 != 0 || i21 != 0) {
                                                        int i22 = ql1.b;
                                                        u7Var.g((j5 & (-1125899873288193L)) | (((i11 + 3) & 33554431) << 25), i20, i21);
                                                    }
                                                } else {
                                                    i11 += 3;
                                                    f0 = i19;
                                                    i12 = i17;
                                                    jArr2 = jArr3;
                                                }
                                            } else {
                                                i4 = i17;
                                                break;
                                            }
                                        } else {
                                            i4 = i12;
                                            break;
                                        }
                                    }
                                    jArr = jArr2;
                                } else {
                                    i = i6;
                                    i2 = i8;
                                    jArr = jArr2;
                                    i3 = e0;
                                    i4 = i12;
                                }
                                i11 += 3;
                                i6 = i;
                                f0 = f0;
                                i8 = i2;
                                e0 = i3;
                                i10 = i4;
                                jArr2 = jArr;
                            }
                        } else {
                            j2 = c;
                            int i23 = (int) (j2 >> 32);
                            int i24 = (int) (j2 & 4294967295L);
                            int i25 = i23 + f0;
                            int i26 = i24 + e0;
                            int i27 = i5 & 33554431;
                            long[] jArr4 = (long[]) u7Var.b;
                            int i28 = u7Var.a;
                            int i29 = 0;
                            while (true) {
                                if (i29 >= jArr4.length - 2 || i29 >= i28) {
                                    break;
                                }
                                int i30 = i29 + 2;
                                long j7 = jArr4[i30];
                                long[] jArr5 = jArr4;
                                if ((((int) j7) & 33554431) == i27) {
                                    long j8 = jArr5[i29];
                                    int i31 = i29;
                                    jArr5[i31] = (i23 << 32) | (i24 & 4294967295L);
                                    jArr5[i31 + 1] = (i25 << 32) | (i26 & 4294967295L);
                                    jArr5[i30] = (((j7 >> 63) & 1) << 60) | j7;
                                    int i32 = i23 - ((int) (j8 >> 32));
                                    int i33 = i24 - ((int) j8);
                                    if (i32 != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (i33 != 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z2 | z3) {
                                        int i34 = ql1.b;
                                        u7Var.g((j7 & (-1125899873288193L)) | (((i31 + 3) & 33554431) << 25), i32, i33);
                                    }
                                } else {
                                    i29 += 3;
                                    jArr4 = jArr5;
                                }
                            }
                        }
                        this.d = true;
                    }
                } else {
                    j2 = c;
                    ar0Var.l = true;
                    boolean d = a81Var.d(1024);
                    boolean d2 = a81Var.d(16);
                    boolean a = this.b.a.a(i5);
                    if (v != null) {
                        int i35 = v.f;
                        int i36 = (int) (j2 >> 32);
                        int i37 = (int) (j2 & 4294967295L);
                        int i38 = i5 & 33554431;
                        long[] jArr6 = (long[]) u7Var.b;
                        int i39 = u7Var.a;
                        int i40 = 0;
                        while (true) {
                            if (i40 >= jArr6.length - 2 || i40 >= i39) {
                                break;
                            }
                            if ((((int) jArr6[i40 + 2]) & 33554431) == i35) {
                                long j9 = jArr6[i40];
                                int i41 = ((int) (j9 >> 32)) + i36;
                                int i42 = ((int) j9) + i37;
                                u7Var.d(i38, i41, i42, i41 + f0, i42 + e0, i35, d, d2, a, i40);
                                break;
                            }
                            i40 += 3;
                        }
                    } else {
                        int i43 = (int) (j2 >> 32);
                        int i44 = (int) (j2 & 4294967295L);
                        u7.e(u7Var, i5, i43, i44, i43 + f0, i44 + e0, 0, d, d2, a, 544);
                    }
                    this.d = true;
                }
                ar0Var.i = j3;
                ar0Var.h = j2;
                return;
            }
            d(ar0Var);
            i(ar0Var);
            return;
        }
        d(ar0Var);
    }

    public final void h(ar0 ar0Var) {
        if (ar0Var.l) {
            int i = ar0Var.f & 33554431;
            u7 u7Var = this.a;
            long[] jArr = (long[]) u7Var.b;
            int i2 = u7Var.a;
            int i3 = 0;
            while (true) {
                if (i3 >= jArr.length - 2 || i3 >= i2) {
                    break;
                }
                int i4 = i3 + 2;
                if ((((int) jArr[i4]) & 33554431) == i) {
                    jArr[i3] = -1;
                    jArr[i3 + 1] = -1;
                    jArr[i4] = ql1.a;
                    break;
                }
                i3 += 3;
            }
            ar0Var.l = false;
            this.d = true;
            this.f = true;
        }
    }

    public final void j() {
        boolean z;
        n2 n2Var = this.g;
        if (n2Var != null) {
            z = true;
        } else {
            z = false;
        }
        long j = this.b.c;
        if (j >= 0 || !z) {
            if (this.h == j && z) {
                return;
            }
            if (n2Var != null) {
                Handler handler = o2.a;
                o2.a.removeCallbacks(n2Var);
            }
            Handler handler2 = o2.a;
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(j, 16 + currentTimeMillis);
            this.h = max;
            n2 n2Var2 = new n2(this.i, 0);
            o2.a.postDelayed(n2Var2, max - currentTimeMillis);
            this.g = n2Var2;
        }
    }
}
