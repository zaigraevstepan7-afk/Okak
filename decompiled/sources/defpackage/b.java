package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class b {
    public static final byte[] a;
    public static final long[] b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(sm.a);
        bytes.getClass();
        a = bytes;
        b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final long a(hk hkVar, bl blVar, long j, long j2, int i) {
        mt1 mt1Var;
        long j3 = j;
        long j4 = j2;
        blVar.getClass();
        long j5 = i;
        rx.q(blVar.d(), 0L, j5);
        if (i > 0) {
            if (j3 >= 0) {
                if (j3 <= j4) {
                    long j6 = hkVar.f;
                    if (j4 > j6) {
                        j4 = j6;
                    }
                    if (j3 != j4 && (mt1Var = hkVar.e) != null) {
                        long j7 = 0;
                        if (j6 - j3 < j3) {
                            while (j6 > j3) {
                                mt1Var = mt1Var.g;
                                mt1Var.getClass();
                                j6 -= mt1Var.c - mt1Var.b;
                            }
                            byte[] h = blVar.h();
                            byte b2 = h[0];
                            long min = Math.min(j4, (hkVar.f - j5) + 1);
                            while (j6 < min) {
                                byte[] bArr = mt1Var.a;
                                int min2 = (int) Math.min(mt1Var.c, (mt1Var.b + min) - j6);
                                for (int i2 = (int) ((mt1Var.b + j3) - j6); i2 < min2; i2++) {
                                    if (bArr[i2] == b2 && b(mt1Var, i2 + 1, h, 1, i)) {
                                        return (i2 - mt1Var.b) + j6;
                                    }
                                }
                                j6 += mt1Var.c - mt1Var.b;
                                mt1Var = mt1Var.f;
                                mt1Var.getClass();
                                j3 = j6;
                            }
                            return -1L;
                        }
                        while (true) {
                            long j8 = j7 + (mt1Var.c - mt1Var.b);
                            if (j8 > j3) {
                                break;
                            }
                            mt1Var = mt1Var.f;
                            mt1Var.getClass();
                            j7 = j8;
                        }
                        byte[] h2 = blVar.h();
                        byte b3 = h2[0];
                        long min3 = Math.min(j4, (hkVar.f - j5) + 1);
                        while (j7 < min3) {
                            byte[] bArr2 = mt1Var.a;
                            int min4 = (int) Math.min(mt1Var.c, (mt1Var.b + min3) - j7);
                            for (int i3 = (int) ((mt1Var.b + j3) - j7); i3 < min4; i3++) {
                                if (bArr2[i3] == b3 && b(mt1Var, i3 + 1, h2, 1, i)) {
                                    return (i3 - mt1Var.b) + j7;
                                }
                            }
                            j7 += mt1Var.c - mt1Var.b;
                            mt1Var = mt1Var.f;
                            mt1Var.getClass();
                            j3 = j7;
                        }
                        return -1L;
                    }
                    return -1L;
                }
                throw new IllegalArgumentException(("fromIndex > toIndex: " + j3 + " > " + j4).toString());
            }
            se.e(l90.k("fromIndex < 0: ", j3));
            return 0L;
        }
        se.h("byteCount == 0");
        return 0L;
    }

    public static final boolean b(mt1 mt1Var, int i, byte[] bArr, int i2, int i3) {
        int i4 = mt1Var.c;
        byte[] bArr2 = mt1Var.a;
        while (i2 < i3) {
            if (i == i4) {
                mt1Var = mt1Var.f;
                mt1Var.getClass();
                byte[] bArr3 = mt1Var.a;
                bArr2 = bArr3;
                i = mt1Var.b;
                i4 = mt1Var.c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String c(hk hkVar, long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (hkVar.k(j2) == 13) {
                String D = hkVar.D(j2, sm.a);
                hkVar.skip(2L);
                return D;
            }
        }
        String D2 = hkVar.D(j, sm.a);
        hkVar.skip(1L);
        return D2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
    
        return -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int d(defpackage.hk r16, defpackage.qb1 r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 171
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b.d(hk, qb1, boolean):int");
    }
}
