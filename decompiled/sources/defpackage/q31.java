package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class q31 {
    public long[] a;
    public int[] b;
    public int c;
    public int d;
    public int e;

    public q31(int i) {
        boolean z;
        this.a = sr1.a;
        this.b = dn0.a;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            d(sr1.d(i));
        } else {
            se.h("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
    
        r22 = r4;
        r8 = (r8 & ((~r8) << 6)) & (-9187201950435737472L);
        r8 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        if (r8 == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        r3 = c(r5);
        r12 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        if (r37.e != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
    
        if (((r37.a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a9, code lost:
    
        r3 = r37.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ab, code lost:
    
        if (r3 <= 8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bf, code lost:
    
        if (java.lang.Long.compareUnsigned(r37.d * 32, r3 * 25) > 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c1, code lost:
    
        r3 = r37.a;
        r4 = r37.c;
        r6 = r37.b;
        r7 = (r4 + 7) >> 3;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cd, code lost:
    
        if (r14 >= r7) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cf, code lost:
    
        r27 = r8;
        r8 = r3[r14] & (-9187201950435737472L);
        r3[r14] = (-72340172838076674L) & ((~r8) + (r8 >>> 7));
        r14 = r14 + 1;
        r12 = r12;
        r8 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ec, code lost:
    
        r25 = r12;
        r7 = defpackage.bf.V(r3);
        r8 = r7 - 1;
        r3[r8] = (r3[r8] & 72057594037927935L) | (-72057594037927936L);
        r3[r7] = r3[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010d, code lost:
    
        if (r7 == r4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010f, code lost:
    
        r8 = r7 >> 3;
        r9 = (r7 & 7) << 3;
        r12 = (r3[r8] >> r9) & r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x011c, code lost:
    
        if (r12 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0123, code lost:
    
        if (r12 == 254) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0126, code lost:
    
        r12 = java.lang.Integer.hashCode(r6[r7]) * r22;
        r13 = (r12 ^ (r12 << 16)) >>> 7;
        r14 = c(r13);
        r13 = r13 & r4;
        r29 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0147, code lost:
    
        if ((((r14 - r13) & r4) / 8) != (((r7 - r13) & r4) / 8)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0149, code lost:
    
        r28 = r6;
        r3[r8] = ((~(r25 << r9)) & r3[r8]) | ((r12 & 127) << r9);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0167, code lost:
    
        r6 = r28;
        r15 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x016c, code lost:
    
        r28 = r6;
        r32 = r7;
        r6 = r14 >> 3;
        r33 = r3[r6];
        r7 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x017e, code lost:
    
        if (((r33 >> r7) & r25) != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0180, code lost:
    
        r3[r6] = (r33 & (~(r25 << r7))) | ((r12 & 127) << r7);
        r3[r8] = (r3[r8] & (~(r25 << r9))) | (128 << r9);
        r28[r14] = r28[r32];
        r28[r32] = 0;
        r7 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01be, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01a4, code lost:
    
        r3[r6] = ((r12 & 127) << r7) | (r33 & (~(r25 << r7)));
        r6 = r28[r14];
        r28[r14] = r28[r32];
        r28[r32] = r6;
        r7 = r32 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x011e, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01cc, code lost:
    
        r29 = r15;
        r37.e = defpackage.sr1.a(r37.c) - r37.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0253, code lost:
    
        r3 = c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0257, code lost:
    
        r14 = r3;
        r37.d++;
        r3 = r37.e;
        r4 = r37.a;
        r5 = r14 >> 3;
        r6 = r4[r5];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0270, code lost:
    
        if (((r6 >> r8) & r25) != r20) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0272, code lost:
    
        r9 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0277, code lost:
    
        r37.e = r3 - r9;
        r3 = r37.c;
        r6 = (r6 & (~(r25 << r8))) | (r10 << r8);
        r4[r5] = r6;
        r4[(((r14 - 7) & r3) + (r3 & 7)) >> 3] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0275, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01db, code lost:
    
        r25 = 255;
        r29 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e5, code lost:
    
        r3 = defpackage.sr1.b(r37.c);
        r4 = r37.a;
        r6 = r37.b;
        r7 = r37.c;
        d(r3);
        r3 = r37.a;
        r8 = r37.b;
        r9 = r37.c;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01fc, code lost:
    
        if (r12 >= r7) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x020b, code lost:
    
        if (((r4[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= r20) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x020d, code lost:
    
        r13 = r6[r12];
        r14 = java.lang.Integer.hashCode(r13) * r22;
        r14 = r14 ^ (r14 << 16);
        r15 = c(r14 >>> 7);
        r19 = r3;
        r18 = r4;
        r3 = r14 & 127;
        r14 = r15 >> 3;
        r23 = (r15 & 7) << 3;
        r3 = (r19[r14] & (~(255 << r23))) | (r3 << r23);
        r19[r14] = r3;
        r19[(((r15 - 7) & r9) + (r9 & 7)) >> 3] = r3;
        r8[r15] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x024c, code lost:
    
        r12 = r12 + 1;
        r4 = r18;
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0248, code lost:
    
        r19 = r3;
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e2, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x009f, code lost:
    
        r25 = 255;
        r29 = true;
        r20 = 128;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(int r38) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q31.a(int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = java.lang.Integer.hashCode(r19)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.c
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.a
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r6 = r6[r7]
            int r12 = 64 - r8
            long r6 = r6 << r12
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L41:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L5f
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            int[] r14 = r0.b
            r14 = r14[r10]
            r15 = r19
            if (r14 != r15) goto L58
            goto L69
        L58:
            r16 = 1
            long r16 = r8 - r16
            long r8 = r8 & r16
            goto L41
        L5f:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L6d
            r10 = -1
        L69:
            if (r10 < 0) goto L6c
            return r11
        L6c:
            return r4
        L6d:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q31.b(int):boolean");
    }

    public final int c(int i) {
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

    public final void d(int i) {
        int i2;
        long[] jArr;
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
        this.b = new int[i2];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(int r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = java.lang.Integer.hashCode(r19)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.c
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.a
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r6 = r6[r7]
            int r12 = 64 - r8
            long r6 = r6 << r12
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L41:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L5f
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            int[] r14 = r0.b
            r14 = r14[r10]
            r15 = r19
            if (r14 != r15) goto L58
            goto L69
        L58:
            r16 = 1
            long r16 = r8 - r16
            long r8 = r8 & r16
            goto L41
        L5f:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L72
            r10 = -1
        L69:
            if (r10 < 0) goto L6c
            r4 = r11
        L6c:
            if (r4 == 0) goto L71
            r0.f(r10)
        L71:
            return r4
        L72:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q31.e(int):boolean");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q31)) {
            return false;
        }
        q31 q31Var = (q31) obj;
        if (q31Var.d != this.d) {
            return false;
        }
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !q31Var.b(iArr[(i << 3) + i3])) {
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
        this.d--;
        long[] jArr = this.a;
        int i2 = this.c;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
    }

    public final int hashCode() {
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        i2 = Integer.hashCode(iArr[(i << 3) + i4]) + i2;
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return i2;
                }
            }
            if (i != length) {
                i++;
            } else {
                return i2;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.b;
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
                            int i5 = iArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(i5);
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
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ q31() {
        this(6);
    }
}
