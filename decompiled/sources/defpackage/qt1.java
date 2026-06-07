package defpackage;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class qt1 extends bl {
    public final transient byte[][] i;
    public final transient int[] j;

    public qt1(byte[][] bArr, int[] iArr) {
        super(bl.h.e);
        this.i = bArr;
        this.j = iArr;
    }

    @Override // defpackage.bl
    public final String a() {
        return u().a();
    }

    @Override // defpackage.bl
    public final bl c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.i;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.j;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = messageDigest.digest();
        digest.getClass();
        return new bl(digest);
    }

    @Override // defpackage.bl
    public final int d() {
        return this.j[this.i.length - 1];
    }

    @Override // defpackage.bl
    public final String e() {
        return u().e();
    }

    @Override // defpackage.bl
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof bl) {
                bl blVar = (bl) obj;
                if (blVar.d() == d() && l(0, blVar, d())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.bl
    public final int f(byte[] bArr, int i) {
        bArr.getClass();
        return u().f(bArr, i);
    }

    @Override // defpackage.bl
    public final byte[] h() {
        return t();
    }

    @Override // defpackage.bl
    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.i;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.j;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f = i3;
        return i3;
    }

    @Override // defpackage.bl
    public final byte i(int i) {
        int i2;
        byte[][] bArr = this.i;
        int length = bArr.length - 1;
        int[] iArr = this.j;
        rx.q(iArr[length], i, 1L);
        int M = rx.M(this, i);
        if (M == 0) {
            i2 = 0;
        } else {
            i2 = iArr[M - 1];
        }
        return bArr[M][(i - i2) + iArr[bArr.length + M]];
    }

    @Override // defpackage.bl
    public final int j(byte[] bArr) {
        bArr.getClass();
        return u().j(bArr);
    }

    @Override // defpackage.bl
    public final boolean l(int i, bl blVar, int i2) {
        int i3;
        blVar.getClass();
        if (i >= 0 && i <= d() - i2) {
            int i4 = i2 + i;
            int M = rx.M(this, i);
            int i5 = 0;
            while (i < i4) {
                int[] iArr = this.j;
                if (M == 0) {
                    i3 = 0;
                } else {
                    i3 = iArr[M - 1];
                }
                int i6 = iArr[M] - i3;
                byte[][] bArr = this.i;
                int i7 = iArr[bArr.length + M];
                int min = Math.min(i4, i6 + i3) - i;
                if (blVar.m(i5, bArr[M], (i - i3) + i7, min)) {
                    i5 += min;
                    i += min;
                    M++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.bl
    public final boolean m(int i, byte[] bArr, int i2, int i3) {
        int i4;
        bArr.getClass();
        if (i < 0 || i > d() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int M = rx.M(this, i);
        while (i < i5) {
            int[] iArr = this.j;
            if (M == 0) {
                i4 = 0;
            } else {
                i4 = iArr[M - 1];
            }
            int i6 = iArr[M] - i4;
            byte[][] bArr2 = this.i;
            int i7 = iArr[bArr2.length + M];
            int min = Math.min(i5, i6 + i4) - i;
            if (!rx.p(bArr2[M], (i - i4) + i7, bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            M++;
        }
        return true;
    }

    @Override // defpackage.bl
    public final String n(Charset charset) {
        charset.getClass();
        return u().n(charset);
    }

    @Override // defpackage.bl
    public final bl o(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = d();
        }
        if (i >= 0) {
            if (i2 <= d()) {
                int i3 = i2 - i;
                if (i3 >= 0) {
                    if (i == 0 && i2 == d()) {
                        return this;
                    }
                    if (i == i2) {
                        return bl.h;
                    }
                    int M = rx.M(this, i);
                    int M2 = rx.M(this, i2 - 1);
                    byte[][] bArr = this.i;
                    byte[][] bArr2 = (byte[][]) bf.I(bArr, M, M2 + 1);
                    int[] iArr = new int[bArr2.length * 2];
                    int i4 = 0;
                    int[] iArr2 = this.j;
                    if (M <= M2) {
                        int i5 = M;
                        int i6 = 0;
                        while (true) {
                            iArr[i6] = Math.min(iArr2[i5] - i, i3);
                            int i7 = i6 + 1;
                            iArr[i6 + bArr2.length] = iArr2[bArr.length + i5];
                            if (i5 == M2) {
                                break;
                            }
                            i5++;
                            i6 = i7;
                        }
                    }
                    if (M != 0) {
                        i4 = iArr2[M - 1];
                    }
                    int length = bArr2.length;
                    iArr[length] = (i - i4) + iArr[length];
                    return new qt1(bArr2, iArr);
                }
                se.e(l90.j("endIndex=", i2, " < beginIndex=", i));
                return null;
            }
            StringBuilder q = l90.q("endIndex=", i2, " > length(");
            q.append(d());
            q.append(')');
            throw new IllegalArgumentException(q.toString().toString());
        }
        se.e(l90.i("beginIndex=", i, " < 0"));
        return null;
    }

    @Override // defpackage.bl
    public final bl q() {
        return u().q();
    }

    @Override // defpackage.bl
    public final void s(int i, hk hkVar) {
        int i2;
        int M = rx.M(this, 0);
        int i3 = 0;
        while (i3 < i) {
            int[] iArr = this.j;
            if (M == 0) {
                i2 = 0;
            } else {
                i2 = iArr[M - 1];
            }
            int i4 = iArr[M] - i2;
            byte[][] bArr = this.i;
            int i5 = iArr[bArr.length + M];
            int min = Math.min(i, i4 + i2) - i3;
            int i6 = (i3 - i2) + i5;
            mt1 mt1Var = new mt1(bArr[M], i6, i6 + min, true, false);
            mt1 mt1Var2 = hkVar.e;
            if (mt1Var2 == null) {
                mt1Var.g = mt1Var;
                mt1Var.f = mt1Var;
                hkVar.e = mt1Var;
            } else {
                mt1 mt1Var3 = mt1Var2.g;
                mt1Var3.getClass();
                mt1Var3.b(mt1Var);
            }
            i3 += min;
            M++;
        }
        hkVar.f += i;
    }

    public final byte[] t() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.i;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.j;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            bf.z(bArr2[i], i3, bArr, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.bl
    public final String toString() {
        return u().toString();
    }

    public final bl u() {
        return new bl(t());
    }
}
