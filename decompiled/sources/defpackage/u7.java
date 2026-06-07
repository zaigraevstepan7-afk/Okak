package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class u7 {
    public int a;
    public Object b;
    public Object c;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c9, code lost:
    
        if (r9 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u7(defpackage.an0 r13, defpackage.fp r14) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u7.<init>(an0, fp):void");
    }

    public static /* synthetic */ void e(u7 u7Var, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, int i7) {
        int i8;
        if ((i7 & 32) != 0) {
            i8 = -1;
        } else {
            i8 = i6;
        }
        u7Var.d(i, i2, i3, i4, i5, i8, z, z2, z3, -1);
    }

    public void a(int i, bs0 bs0Var) {
        if (i < 0) {
            nl0.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        ln0 ln0Var = new ln0(this.a, i, bs0Var);
        this.a += i;
        ((q41) this.b).b(ln0Var);
    }

    public ln0 b(int i) {
        if (i < 0 || i >= this.a) {
            StringBuilder q = l90.q("Index ", i, ", size ");
            q.append(this.a);
            nl0.e(q.toString());
        }
        ln0 ln0Var = (ln0) this.c;
        if (ln0Var != null) {
            int i2 = ln0Var.a;
            if (i < ln0Var.b + i2 && i2 <= i) {
                return ln0Var;
            }
        }
        q41 q41Var = (q41) this.b;
        ln0 ln0Var2 = (ln0) q41Var.e[xn.l(i, q41Var)];
        this.c = ln0Var2;
        return ln0Var2;
    }

    public int c(Object obj) {
        x31 x31Var = (x31) this.b;
        int d = x31Var.d(obj);
        if (d >= 0) {
            return x31Var.c[d];
        }
        return -1;
    }

    public void d(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, int i7) {
        int i8;
        long[] jArr = (long[]) this.b;
        int i9 = this.a;
        int i10 = i9 + 3;
        this.a = i10;
        int length = jArr.length;
        if (length <= i10) {
            int max = Math.max(length * 2, i10);
            this.b = Arrays.copyOf(jArr, max);
            this.c = Arrays.copyOf((long[]) this.c, max);
        }
        long[] jArr2 = (long[]) this.b;
        jArr2[i9] = (i2 << 32) | (i3 & 4294967295L);
        jArr2[i9 + 1] = (i4 << 32) | (i5 & 4294967295L);
        int i11 = i6 & 33554431;
        jArr2[i9 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (Math.min(0, 1023) << 50) | (i11 << 25) | (i & 33554431);
        if (i6 >= 0) {
            if (i7 != -1) {
                i8 = i7;
            } else {
                i8 = i9 - 3;
            }
            while (i8 >= 0) {
                int i12 = i8 + 2;
                long j = jArr2[i12];
                if ((((int) j) & 33554431) == i11) {
                    int i13 = (i9 - i8) / 3;
                    int i14 = ql1.b;
                    jArr2[i12] = (Math.min(i13, 1023) << 50) | (j & (-1151795604700004353L));
                    return;
                }
                i8 -= 3;
            }
        }
    }

    public void f(int i, boolean z) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.b;
        int i3 = this.a;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            int i5 = i4 + 2;
            long j = jArr[i5];
            if ((((int) j) & 33554431) == i2) {
                long j2 = 8070450532247928831L & j;
                long j3 = z ? 1L : 0L;
                jArr[i5] = j2 | (1152921504606846976L * j3) | (j3 * Long.MIN_VALUE);
                return;
            }
        }
    }

    public void g(long j, int i, int i2) {
        int i3;
        int i4;
        char c;
        char c2;
        long[] jArr = (long[]) this.b;
        long[] jArr2 = (long[]) this.c;
        jArr2[0] = j;
        int i5 = 1;
        while (i5 > 0) {
            i5--;
            long j2 = jArr2[i5];
            int i6 = 33554431;
            int i7 = ((int) j2) & 33554431;
            char c3 = 25;
            int i8 = ((int) (j2 >> 25)) & 33554431;
            char c4 = '2';
            int i9 = ((int) (j2 >> 50)) & 1023;
            if (i9 == 1023) {
                i3 = this.a;
            } else {
                i3 = (i9 * 3) + i8;
            }
            if (i8 >= 0) {
                while (i8 < jArr.length - 2 && i8 < i3) {
                    int i10 = i8 + 2;
                    long j3 = jArr[i10];
                    if ((((int) (j3 >> c3)) & i6) == i7) {
                        long j4 = jArr[i8];
                        int i11 = i8 + 1;
                        i4 = i6;
                        c = c3;
                        long j5 = jArr[i11];
                        c2 = c4;
                        jArr[i8] = ((((int) j4) + i2) & 4294967295L) | ((((int) (j4 >> 32)) + i) << 32);
                        jArr[i11] = ((((int) j5) + i2) & 4294967295L) | ((((int) (j5 >> 32)) + i) << 32);
                        jArr[i10] = (((j3 >> 63) & 1) << 60) | j3;
                        if ((((int) (j3 >> c2)) & 1023) > 0) {
                            int i12 = ql1.b;
                            jArr2[i5] = ((-1125899873288193L) & j3) | (((i8 + 3) & i4) << c);
                            i5++;
                        }
                    } else {
                        i4 = i6;
                        c = c3;
                        c2 = c4;
                    }
                    i8 += 3;
                    i6 = i4;
                    c3 = c;
                    c4 = c2;
                }
            } else {
                return;
            }
        }
    }

    public void h(int i, ue0 ue0Var) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.b;
        int i3 = this.a;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 33554431) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                ue0Var.c(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }

    public u7() {
        this.b = new q41(new ln0[16]);
    }
}
