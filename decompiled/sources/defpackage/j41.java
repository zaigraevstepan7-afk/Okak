package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class j41 {
    public long[] a;
    public Object[] b;
    public int c;
    public int d;
    public int e;

    public j41(int i) {
        this.a = sr1.a;
        this.b = f2.e;
        if (i >= 0) {
            f(sr1.d(i));
        } else {
            se.h("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i = this.d;
        this.b[d(obj)] = obj;
        if (this.d != i) {
            return true;
        }
        return false;
    }

    public final void b() {
        this.d = 0;
        long[] jArr = this.a;
        if (jArr != sr1.a) {
            bf.O(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        bf.M(this.b, 0, this.c);
        this.e = sr1.a(this.c) - this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r7 = r7[r8]
            int r13 = 64 - r9
            long r7 = r7 << r13
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L47:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L66
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.b
            r15 = r15[r11]
            boolean r15 = defpackage.sn0.r(r15, r1)
            if (r15 == 0) goto L60
            goto L70
        L60:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L47
        L66:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L74
            r11 = -1
        L70:
            if (r11 < 0) goto L73
            return r12
        L73:
            return r2
        L74:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j41.c(java.lang.Object):boolean");
    }

    public final int d(Object obj) {
        int i;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i2;
        int i3;
        int i4;
        Object[] objArr;
        int i5;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i6 = -862048943;
        int i7 = i * (-862048943);
        int i8 = i7 ^ (i7 << 16);
        int i9 = i8 >>> 7;
        int i10 = i8 & 127;
        int i11 = this.c;
        int i12 = i9 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j4 = ((jArr3[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr3[i14] >>> i15);
            long j5 = i10;
            int i16 = i10;
            int i17 = 0;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int numberOfTrailingZeros = (i12 + (Long.numberOfTrailingZeros(j7) >> 3)) & i11;
                int i18 = i6;
                if (sn0.r(this.b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i6 = i18;
            }
            int i19 = i6;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int e = e(i9);
                long j8 = 255;
                if (this.e != 0 || ((this.a[e >> 3] >> ((e & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i20 = this.c;
                    if (i20 > 8) {
                        int i21 = 8;
                        if (Long.compareUnsigned(this.d * 32, i20 * 25) <= 0) {
                            long[] jArr4 = this.a;
                            int i22 = this.c;
                            Object[] objArr2 = this.b;
                            int i23 = (i22 + 7) >> 3;
                            int i24 = 0;
                            j3 = 128;
                            while (i24 < i23) {
                                long j9 = j8;
                                long j10 = jArr4[i24] & (-9187201950435737472L);
                                jArr4[i24] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i24++;
                                i21 = i21;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i25 = i21;
                            int V = bf.V(jArr4);
                            int i26 = V - 1;
                            long j11 = 72057594037927935L;
                            jArr4[i26] = (jArr4[i26] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[V] = jArr4[0];
                            int i27 = 0;
                            while (i27 != i22) {
                                int i28 = i27 >> 3;
                                int i29 = (i27 & 7) << 3;
                                long j12 = (jArr4[i28] >> i29) & j;
                                if (j12 == 128 || j12 != 254) {
                                    i27++;
                                } else {
                                    Object obj2 = objArr2[i27];
                                    if (obj2 != null) {
                                        i3 = obj2.hashCode();
                                    } else {
                                        i3 = 0;
                                    }
                                    int i30 = i3 * i19;
                                    int i31 = (i30 ^ (i30 << 16)) >>> 7;
                                    int e2 = e(i31);
                                    int i32 = i31 & i22;
                                    if (((e2 - i32) & i22) / i25 == ((i27 - i32) & i22) / i25) {
                                        long j13 = j11;
                                        jArr4[i28] = ((r7 & 127) << i29) | ((~(j << i29)) & jArr4[i28]);
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i27++;
                                        j11 = j13;
                                    } else {
                                        long j14 = j11;
                                        int i33 = e2 >> 3;
                                        long j15 = jArr4[i33];
                                        int i34 = (e2 & 7) << 3;
                                        if (((j15 >> i34) & j) == 128) {
                                            i5 = i25;
                                            i4 = i22;
                                            objArr = objArr2;
                                            jArr4[i33] = ((~(j << i34)) & j15) | ((r7 & 127) << i34);
                                            jArr4[i28] = (jArr4[i28] & (~(j << i29))) | (128 << i29);
                                            objArr[e2] = objArr[i27];
                                            objArr[i27] = null;
                                        } else {
                                            i4 = i22;
                                            objArr = objArr2;
                                            i5 = i25;
                                            jArr4[i33] = ((r7 & 127) << i34) | ((~(j << i34)) & j15);
                                            Object obj3 = objArr[e2];
                                            objArr[e2] = objArr[i27];
                                            objArr[i27] = obj3;
                                            i27--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j14) | Long.MIN_VALUE;
                                        i27++;
                                        j11 = j14;
                                        i25 = i5;
                                        i22 = i4;
                                        objArr2 = objArr;
                                    }
                                }
                            }
                            this.e = sr1.a(this.c) - this.d;
                            e = e(i9);
                        }
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int b = sr1.b(this.c);
                    long[] jArr5 = this.a;
                    Object[] objArr3 = this.b;
                    int i35 = this.c;
                    f(b);
                    long[] jArr6 = this.a;
                    Object[] objArr4 = this.b;
                    int i36 = this.c;
                    int i37 = 0;
                    while (i37 < i35) {
                        if (((jArr5[i37 >> 3] >> ((i37 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i37];
                            if (obj4 != null) {
                                i2 = obj4.hashCode();
                            } else {
                                i2 = 0;
                            }
                            int i38 = i2 * i19;
                            int i39 = i38 ^ (i38 << 16);
                            int e3 = e(i39 >>> 7);
                            long j16 = i39 & 127;
                            int i40 = e3 >> 3;
                            int i41 = (e3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j17 = (jArr6[i40] & (~(255 << i41))) | (j16 << i41);
                            jArr[i40] = j17;
                            jArr[(((e3 - 7) & i36) + (i36 & 7)) >> 3] = j17;
                            objArr4[e3] = obj4;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i37++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e = e(i9);
                }
                this.d++;
                int i42 = this.e;
                long[] jArr7 = this.a;
                int i43 = e >> 3;
                long j18 = jArr7[i43];
                int i44 = (e & 7) << 3;
                if (((j18 >> i44) & j) == j3) {
                    i17 = 1;
                }
                this.e = i42 - i17;
                int i45 = this.c;
                long j19 = (j18 & (~(j << i44))) | (j2 << i44);
                jArr7[i43] = j19;
                jArr7[(((e - 7) & i45) + (i45 & 7)) >> 3] = j19;
                return e;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
            i10 = i16;
            i6 = i19;
        }
    }

    public final int e(int i) {
        int i2 = this.c;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j41)) {
            return false;
        }
        j41 j41Var = (j41) obj;
        if (j41Var.d != this.d) {
            return false;
        }
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !j41Var.c(objArr[(i << 3) + i3])) {
                            return false;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return true;
    }

    public final void f(int i) {
        int i2;
        long[] jArr;
        Object[] objArr;
        if (i > 0) {
            i2 = Math.max(7, sr1.c(i));
        } else {
            i2 = 0;
        }
        this.c = i2;
        if (i2 == 0) {
            jArr = sr1.a;
        } else {
            int i3 = ((i2 + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i3];
            Arrays.fill(jArr2, 0, i3, -9187201950435737472L);
            jArr = jArr2;
        }
        this.a = jArr;
        int i4 = i2 >> 3;
        long j = 255 << ((i2 & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j)) | j;
        this.e = sr1.a(this.c) - this.d;
        if (i2 == 0) {
            objArr = f2.e;
        } else {
            objArr = new Object[i2];
        }
        this.b = objArr;
    }

    public final boolean g() {
        if (this.d == 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if (this.d != 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = (this.c * 31) + this.d;
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i3 << 3) + i5];
                            if (!sn0.r(obj, this)) {
                                if (obj != null) {
                                    i = obj.hashCode();
                                } else {
                                    i = 0;
                                }
                                i2 += i;
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return i2;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.c
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.a
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r4 = r4[r5]
            int r9 = 64 - r6
            long r4 = r4 << r9
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L42:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L61
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.b
            r11 = r11[r10]
            boolean r11 = defpackage.sn0.r(r11, r14)
            if (r11 == 0) goto L5b
            goto L6b
        L5b:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L42
        L61:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L71
            r10 = -1
        L6b:
            if (r10 < 0) goto L70
            r13.m(r10)
        L70:
            return
        L71:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j41.i(java.lang.Object):void");
    }

    public final void j(j41 j41Var) {
        j41Var.getClass();
        Object[] objArr = j41Var.b;
        long[] jArr = j41Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            k(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void k(Object obj) {
        this.b[d(obj)] = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r7 = r7[r8]
            int r13 = 64 - r9
            long r7 = r7 << r13
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L47:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L66
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.b
            r15 = r15[r11]
            boolean r15 = defpackage.sn0.r(r15, r1)
            if (r15 == 0) goto L60
            goto L70
        L60:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L47
        L66:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L79
            r11 = -1
        L70:
            if (r11 < 0) goto L73
            r2 = r12
        L73:
            if (r2 == 0) goto L78
            r0.m(r11)
        L78:
            return r2
        L79:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j41.l(java.lang.Object):boolean");
    }

    public final void m(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = this.c;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
    }

    public final String toString() {
        n3 n3Var = new n3(this, 21);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append((CharSequence) n3Var.invoke(obj));
                            i2++;
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
            return sb.toString();
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ j41() {
        this(6);
    }
}
