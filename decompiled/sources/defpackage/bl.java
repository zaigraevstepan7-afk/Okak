package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class bl implements Serializable, Comparable {
    public static final bl h = new bl(new byte[0]);
    public final byte[] e;
    public transient int f;
    public transient String g;

    public bl(byte[] bArr) {
        bArr.getClass();
        this.e = bArr;
    }

    public static int g(bl blVar, bl blVar2) {
        blVar.getClass();
        blVar2.getClass();
        return blVar.f(blVar2.h(), 0);
    }

    public static int k(bl blVar, bl blVar2) {
        blVar.getClass();
        blVar2.getClass();
        return blVar.j(blVar2.h());
    }

    public static /* synthetic */ bl p(bl blVar, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = -1234567890;
        }
        return blVar.o(i, i2);
    }

    public String a() {
        byte[] bArr = a.a;
        byte[] bArr2 = this.e;
        bArr2.getClass();
        bArr.getClass();
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr2[i];
            int i3 = i + 2;
            byte b2 = bArr2[i + 1];
            i += 3;
            byte b3 = bArr2[i3];
            bArr3[i2] = bArr[(b & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr[b3 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i5 = i + 1;
                byte b4 = bArr2[i];
                byte b5 = bArr2[i5];
                bArr3[i2] = bArr[(b4 & 255) >> 2];
                bArr3[i2 + 1] = bArr[((b4 & 3) << 4) | ((b5 & 255) >> 4)];
                bArr3[i2 + 2] = bArr[(b5 & 15) << 2];
                bArr3[i2 + 3] = 61;
            }
        } else {
            byte b6 = bArr2[i];
            bArr3[i2] = bArr[(b6 & 255) >> 2];
            bArr3[i2 + 1] = bArr[(b6 & 3) << 4];
            bArr3[i2 + 2] = 61;
            bArr3[i2 + 3] = 61;
        }
        return new String(bArr3, sm.a);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(bl blVar) {
        blVar.getClass();
        int d = d();
        int d2 = blVar.d();
        int min = Math.min(d, d2);
        for (int i = 0; i < min; i++) {
            int i2 = i(i) & 255;
            int i3 = blVar.i(i) & 255;
            if (i2 != i3) {
                if (i2 < i3) {
                    return -1;
                }
                return 1;
            }
        }
        if (d == d2) {
            return 0;
        }
        if (d < d2) {
            return -1;
        }
        return 1;
    }

    public bl c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.e, 0, d());
        byte[] digest = messageDigest.digest();
        digest.getClass();
        return new bl(digest);
    }

    public int d() {
        return this.e.length;
    }

    public String e() {
        byte[] bArr = this.e;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = d6.a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof bl) {
                bl blVar = (bl) obj;
                int d = blVar.d();
                byte[] bArr = this.e;
                if (d == bArr.length && blVar.m(0, bArr, 0, bArr.length)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int f(byte[] bArr, int i) {
        bArr.getClass();
        byte[] bArr2 = this.e;
        int length = bArr2.length - bArr.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (!rx.p(bArr2, max, bArr, 0, bArr.length)) {
                if (max != length) {
                    max++;
                } else {
                    return -1;
                }
            }
            return max;
        }
        return -1;
    }

    public byte[] h() {
        return this.e;
    }

    public int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.e);
        this.f = hashCode;
        return hashCode;
    }

    public byte i(int i) {
        return this.e[i];
    }

    public int j(byte[] bArr) {
        bArr.getClass();
        int d = d();
        byte[] bArr2 = this.e;
        for (int min = Math.min(d, bArr2.length - bArr.length); -1 < min; min--) {
            if (rx.p(bArr2, min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public boolean l(int i, bl blVar, int i2) {
        blVar.getClass();
        return blVar.m(0, this.e, i, i2);
    }

    public boolean m(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i >= 0) {
            byte[] bArr2 = this.e;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && rx.p(bArr2, i, bArr, i2, i3)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String n(Charset charset) {
        charset.getClass();
        return new String(this.e, charset);
    }

    public bl o(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = d();
        }
        if (i >= 0) {
            byte[] bArr = this.e;
            if (i2 <= bArr.length) {
                if (i2 - i >= 0) {
                    if (i == 0 && i2 == bArr.length) {
                        return this;
                    }
                    return new bl(bf.H(bArr, i, i2));
                }
                se.h("endIndex < beginIndex");
                return null;
            }
            se.e(l90.o(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
        se.h("beginIndex < 0");
        return null;
    }

    public bl q() {
        int i = 0;
        while (true) {
            byte[] bArr = this.e;
            if (i < bArr.length) {
                byte b = bArr[i];
                if (b >= 65 && b <= 90) {
                    byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                    copyOf[i] = (byte) (b + 32);
                    for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                        byte b2 = copyOf[i2];
                        if (b2 >= 65 && b2 <= 90) {
                            copyOf[i2] = (byte) (b2 + 32);
                        }
                    }
                    return new bl(copyOf);
                }
                i++;
            } else {
                return this;
            }
        }
    }

    public final String r() {
        String str = this.g;
        if (str == null) {
            byte[] h2 = h();
            h2.getClass();
            String str2 = new String(h2, sm.a);
            this.g = str2;
            return str2;
        }
        return str;
    }

    public void s(int i, hk hkVar) {
        hkVar.m79write(this.e, 0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x00f6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0130, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0134, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00d6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0173, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x017a, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x016c, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01aa, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01ad, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01b0, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0140, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01b3, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0096, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c4, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0085, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00fe, code lost:
    
        if (r6 == 64) goto L180;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl.toString():java.lang.String");
    }
}
