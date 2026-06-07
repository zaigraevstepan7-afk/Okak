package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hk implements pk, ok, Cloneable, ByteChannel {
    public mt1 e;
    public long f;

    public final short A() {
        short readShort = readShort();
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    @Override // defpackage.ok
    public final /* bridge */ /* synthetic */ ok B(int i, int i2, String str) {
        X(i, i2, str);
        return this;
    }

    @Override // defpackage.pk
    public final boolean C(long j) {
        if (this.f >= j) {
            return true;
        }
        return false;
    }

    public final String D(long j, Charset charset) {
        charset.getClass();
        if (j >= 0 && j <= 2147483647L) {
            if (this.f >= j) {
                if (j == 0) {
                    return "";
                }
                mt1 mt1Var = this.e;
                mt1Var.getClass();
                int i = mt1Var.b;
                if (i + j > mt1Var.c) {
                    return new String(t(j), charset);
                }
                int i2 = (int) j;
                String str = new String(mt1Var.a, i, i2, charset);
                int i3 = mt1Var.b + i2;
                mt1Var.b = i3;
                this.f -= j;
                if (i3 == mt1Var.c) {
                    this.e = mt1Var.a();
                    pt1.a(mt1Var);
                }
                return str;
            }
            throw new EOFException();
        }
        se.e(l90.k("byteCount: ", j));
        return null;
    }

    @Override // defpackage.pk
    public final long E(hk hkVar) {
        long j = this.f;
        if (j > 0) {
            hkVar.write(this, j);
        }
        return j;
    }

    @Override // defpackage.pk
    public final String F() {
        return q(Long.MAX_VALUE);
    }

    public final String G() {
        return D(this.f, sm.a);
    }

    public final int H() {
        int i;
        int i2;
        int i3;
        if (this.f != 0) {
            byte k = k(0L);
            if ((k & 128) == 0) {
                i = k & AbstractJsonLexerKt.TC_INVALID;
                i3 = 0;
                i2 = 1;
            } else if ((k & 224) == 192) {
                i = k & 31;
                i2 = 2;
                i3 = 128;
            } else if ((k & 240) == 224) {
                i = k & 15;
                i2 = 3;
                i3 = 2048;
            } else if ((k & 248) == 240) {
                i = k & 7;
                i2 = 4;
                i3 = 65536;
            } else {
                skip(1L);
                return 65533;
            }
            long j = i2;
            if (this.f >= j) {
                for (int i4 = 1; i4 < i2; i4++) {
                    long j2 = i4;
                    byte k2 = k(j2);
                    if ((k2 & 192) == 128) {
                        i = (i << 6) | (k2 & 63);
                    } else {
                        skip(j2);
                        return 65533;
                    }
                }
                skip(j);
                if (i > 1114111) {
                    return 65533;
                }
                if ((55296 <= i && i < 57344) || i < i3) {
                    return 65533;
                }
                return i;
            }
            StringBuilder q = l90.q("size < ", i2, ": ");
            q.append(this.f);
            q.append(" (to read code point prefixed 0x");
            q.append(rx.O(k));
            q.append(')');
            throw new EOFException(q.toString());
        }
        throw new EOFException();
    }

    @Override // defpackage.pk
    public final boolean I(long j, bl blVar) {
        blVar.getClass();
        return r(blVar.d(), blVar, j);
    }

    @Override // defpackage.pk
    public final int J(qb1 qb1Var) {
        qb1Var.getClass();
        int d = b.d(this, qb1Var, false);
        if (d == -1) {
            return -1;
        }
        skip(qb1Var.e[d].d());
        return d;
    }

    @Override // defpackage.pk
    public final void K(long j) {
        if (this.f >= j) {
        } else {
            throw new EOFException();
        }
    }

    @Override // defpackage.ok
    public final /* bridge */ /* synthetic */ ok L(long j) {
        R(j);
        return this;
    }

    public final bl M(int i) {
        if (i == 0) {
            return bl.h;
        }
        rx.q(this.f, 0L, i);
        mt1 mt1Var = this.e;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            mt1Var.getClass();
            int i5 = mt1Var.c;
            int i6 = mt1Var.b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                mt1Var = mt1Var.f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 * 2];
        mt1 mt1Var2 = this.e;
        int i7 = 0;
        while (i2 < i) {
            mt1Var2.getClass();
            bArr[i7] = mt1Var2.a;
            i2 += mt1Var2.c - mt1Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = mt1Var2.b;
            mt1Var2.d = true;
            i7++;
            mt1Var2 = mt1Var2.f;
        }
        return new qt1(bArr, iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d A[EDGE_INSN: B:40:0x008d->B:37:0x008d BREAK  A[LOOP:0: B:4:0x000b->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085  */
    /* JADX WARN: Type inference failed for: r14v3, types: [hk, java.lang.Object] */
    @Override // defpackage.pk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long N() {
        /*
            r14 = this;
            long r0 = r14.f
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L94
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            mt1 r6 = r14.e
            r6.getClass()
            byte[] r7 = r6.a
            int r8 = r6.b
            int r9 = r6.c
        L16:
            if (r8 >= r9) goto L79
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L25
            r11 = 57
            if (r10 > r11) goto L25
            int r11 = r10 + (-48)
            goto L3a
        L25:
            r11 = 97
            if (r10 < r11) goto L30
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L30
            int r11 = r10 + (-87)
            goto L3a
        L30:
            r11 = 65
            if (r10 < r11) goto L65
            r11 = 70
            if (r10 > r11) goto L65
            int r11 = r10 + (-55)
        L3a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L16
        L4a:
            hk r14 = new hk
            r14.<init>()
            r14.S(r4)
            r14.Q(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r14 = r14.G()
            java.lang.String r1 = "Number too large: "
            java.lang.String r14 = r1.concat(r14)
            r0.<init>(r14)
            throw r0
        L65:
            if (r0 == 0) goto L69
            r1 = 1
            goto L79
        L69:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.String r0 = defpackage.rx.O(r10)
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r1.concat(r0)
            r14.<init>(r0)
            throw r14
        L79:
            if (r8 != r9) goto L85
            mt1 r7 = r6.a()
            r14.e = r7
            defpackage.pt1.a(r6)
            goto L87
        L85:
            r6.b = r8
        L87:
            if (r1 != 0) goto L8d
            mt1 r6 = r14.e
            if (r6 != 0) goto Lb
        L8d:
            long r1 = r14.f
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.f = r1
            return r4
        L94:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hk.N():long");
    }

    public final mt1 O(int i) {
        if (i >= 1 && i <= 8192) {
            mt1 mt1Var = this.e;
            if (mt1Var == null) {
                mt1 b = pt1.b();
                this.e = b;
                b.g = b;
                b.f = b;
                return b;
            }
            mt1 mt1Var2 = mt1Var.g;
            mt1Var2.getClass();
            if (mt1Var2.c + i <= 8192 && mt1Var2.e) {
                return mt1Var2;
            }
            mt1 b2 = pt1.b();
            mt1Var2.b(b2);
            return b2;
        }
        se.h("unexpected capacity");
        return null;
    }

    public final void P(bl blVar) {
        blVar.getClass();
        blVar.s(blVar.d(), this);
    }

    public final void Q(int i) {
        mt1 O = O(1);
        byte[] bArr = O.a;
        int i2 = O.c;
        O.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f++;
    }

    public final void R(long j) {
        boolean z;
        if (j == 0) {
            Q(48);
            return;
        }
        int i = 0;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                Y("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = b.a;
        int numberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        if (j > b.b[numberOfLeadingZeros]) {
            i = 1;
        }
        int i2 = numberOfLeadingZeros + i;
        if (z) {
            i2++;
        }
        mt1 O = O(i2);
        byte[] bArr2 = O.a;
        int i3 = O.c + i2;
        while (j != 0) {
            i3--;
            bArr2[i3] = b.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i3 - 1] = 45;
        }
        O.c += i2;
        this.f += i2;
    }

    public final void S(long j) {
        if (j == 0) {
            Q(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        mt1 O = O(i);
        byte[] bArr = O.a;
        int i2 = O.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = b.a[(int) (15 & j)];
            j >>>= 4;
        }
        O.c += i;
        this.f += i;
    }

    public final void T(int i) {
        mt1 O = O(4);
        byte[] bArr = O.a;
        int i2 = O.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        O.c = i2 + 4;
        this.f += 4;
    }

    public final void U(long j) {
        mt1 O = O(8);
        byte[] bArr = O.a;
        int i = O.c;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[i + 1] = (byte) ((j >>> 48) & 255);
        bArr[i + 2] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
        O.c = i + 8;
        this.f += 8;
    }

    public final void V(int i) {
        mt1 O = O(2);
        byte[] bArr = O.a;
        int i2 = O.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        O.c = i2 + 2;
        this.f += 2;
    }

    public final void W(String str, int i, int i2, Charset charset) {
        charset.getClass();
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    if (charset.equals(sm.a)) {
                        X(i, i2, str);
                        return;
                    }
                    byte[] bytes = str.substring(i, i2).getBytes(charset);
                    bytes.getClass();
                    m79write(bytes, 0, bytes.length);
                    return;
                }
                se.l(l90.q("endIndex > string.length: ", i2, " > "), str.length());
                return;
            }
            se.e(l90.j("endIndex < beginIndex: ", i2, " < ", i));
            return;
        }
        se.e(l90.g(i, "beginIndex < 0: "));
    }

    public final void X(int i, int i2, String str) {
        char charAt;
        char c;
        str.getClass();
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 < 128) {
                            mt1 O = O(1);
                            byte[] bArr = O.a;
                            int i3 = O.c - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt2;
                            while (true) {
                                i = i4;
                                if (i >= min || (charAt = str.charAt(i)) >= 128) {
                                    break;
                                }
                                i4 = i + 1;
                                bArr[i + i3] = (byte) charAt;
                            }
                            int i5 = O.c;
                            int i6 = (i3 + i) - i5;
                            O.c = i5 + i6;
                            this.f += i6;
                        } else {
                            if (charAt2 < 2048) {
                                mt1 O2 = O(2);
                                byte[] bArr2 = O2.a;
                                int i7 = O2.c;
                                bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                                O2.c = i7 + 2;
                                this.f += 2;
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i8 = i + 1;
                                if (i8 < i2) {
                                    c = str.charAt(i8);
                                } else {
                                    c = 0;
                                }
                                if (charAt2 <= 56319 && 56320 <= c && c < 57344) {
                                    int i9 = (((charAt2 & 1023) << 10) | (c & 1023)) + 65536;
                                    mt1 O3 = O(4);
                                    byte[] bArr3 = O3.a;
                                    int i10 = O3.c;
                                    bArr3[i10] = (byte) ((i9 >> 18) | 240);
                                    bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                                    bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                                    bArr3[i10 + 3] = (byte) ((i9 & 63) | 128);
                                    O3.c = i10 + 4;
                                    this.f += 4;
                                    i += 2;
                                } else {
                                    Q(63);
                                    i = i8;
                                }
                            } else {
                                mt1 O4 = O(3);
                                byte[] bArr4 = O4.a;
                                int i11 = O4.c;
                                bArr4[i11] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i11 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i11 + 2] = (byte) ((charAt2 & '?') | 128);
                                O4.c = i11 + 3;
                                this.f += 3;
                            }
                            i++;
                        }
                    }
                    return;
                }
                se.l(l90.q("endIndex > string.length: ", i2, " > "), str.length());
                return;
            }
            se.e(l90.j("endIndex < beginIndex: ", i2, " < ", i));
            return;
        }
        se.e(l90.g(i, "beginIndex < 0: "));
    }

    public final void Y(String str) {
        str.getClass();
        X(0, str.length(), str);
    }

    public final void Z(int i) {
        if (i < 128) {
            Q(i);
            return;
        }
        if (i < 2048) {
            mt1 O = O(2);
            byte[] bArr = O.a;
            int i2 = O.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            O.c = i2 + 2;
            this.f += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            Q(63);
            return;
        }
        if (i < 65536) {
            mt1 O2 = O(3);
            byte[] bArr2 = O2.a;
            int i3 = O2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            O2.c = i3 + 3;
            this.f += 3;
            return;
        }
        if (i <= 1114111) {
            mt1 O3 = O(4);
            byte[] bArr3 = O3.a;
            int i4 = O3.c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            O3.c = i4 + 4;
            this.f += 4;
            return;
        }
        se.h("Unexpected code point: 0x".concat(rx.P(i)));
    }

    public final void b() {
        skip(this.f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hk, java.lang.Object] */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final hk clone() {
        ?? obj = new Object();
        if (this.f == 0) {
            return obj;
        }
        mt1 mt1Var = this.e;
        mt1Var.getClass();
        mt1 c = mt1Var.c();
        obj.e = c;
        c.g = c;
        c.f = c;
        for (mt1 mt1Var2 = mt1Var.f; mt1Var2 != mt1Var; mt1Var2 = mt1Var2.f) {
            mt1 mt1Var3 = c.g;
            mt1Var3.getClass();
            mt1Var2.getClass();
            mt1Var3.b(mt1Var2.c());
        }
        obj.f = this.f;
        return obj;
    }

    @Override // defpackage.pk
    public final long d(long j, bl blVar) {
        blVar.getClass();
        byte[] bArr = b.a;
        return b.a(this, blVar, 0L, j, blVar.d());
    }

    @Override // defpackage.pk
    public final bl e(long j) {
        if (j >= 0 && j <= 2147483647L) {
            if (this.f >= j) {
                if (j >= 4096) {
                    bl M = M((int) j);
                    skip(j);
                    return M;
                }
                return new bl(t(j));
            }
            throw new EOFException();
        }
        se.e(l90.k("byteCount: ", j));
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk)) {
            return false;
        }
        long j = this.f;
        hk hkVar = (hk) obj;
        if (j != hkVar.f) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        mt1 mt1Var = this.e;
        mt1Var.getClass();
        mt1 mt1Var2 = hkVar.e;
        mt1Var2.getClass();
        int i = mt1Var.b;
        int i2 = mt1Var2.b;
        long j2 = 0;
        while (j2 < this.f) {
            long min = Math.min(mt1Var.c - i, mt1Var2.c - i2);
            long j3 = 0;
            while (j3 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (mt1Var.a[i] != mt1Var2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == mt1Var.c) {
                mt1Var = mt1Var.f;
                mt1Var.getClass();
                i = mt1Var.b;
            }
            if (i2 == mt1Var2.c) {
                mt1Var2 = mt1Var2.f;
                mt1Var2.getClass();
                i2 = mt1Var2.b;
            }
            j2 += min;
        }
        return true;
    }

    @Override // defpackage.ok
    public final /* bridge */ /* synthetic */ ok f(int i) {
        Z(i);
        return this;
    }

    public final long g() {
        long j = this.f;
        if (j == 0) {
            return 0L;
        }
        mt1 mt1Var = this.e;
        mt1Var.getClass();
        mt1 mt1Var2 = mt1Var.g;
        mt1Var2.getClass();
        if (mt1Var2.c < 8192 && mt1Var2.e) {
            return j - (r2 - mt1Var2.b);
        }
        return j;
    }

    @Override // defpackage.pk
    public final byte[] h() {
        return t(this.f);
    }

    public final int hashCode() {
        mt1 mt1Var = this.e;
        if (mt1Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = mt1Var.c;
            for (int i3 = mt1Var.b; i3 < i2; i3++) {
                i = (i * 31) + mt1Var.a[i3];
            }
            mt1Var = mt1Var.f;
            mt1Var.getClass();
        } while (mt1Var != this.e);
        return i;
    }

    public final void i(long j, hk hkVar, long j2) {
        hkVar.getClass();
        long j3 = j;
        rx.q(this.f, j3, j2);
        if (j2 != 0) {
            hkVar.f += j2;
            mt1 mt1Var = this.e;
            while (true) {
                mt1Var.getClass();
                long j4 = mt1Var.c - mt1Var.b;
                if (j3 < j4) {
                    break;
                }
                j3 -= j4;
                mt1Var = mt1Var.f;
            }
            long j5 = j2;
            while (j5 > 0) {
                mt1Var.getClass();
                mt1 c = mt1Var.c();
                int i = c.b + ((int) j3);
                c.b = i;
                c.c = Math.min(i + ((int) j5), c.c);
                mt1 mt1Var2 = hkVar.e;
                if (mt1Var2 == null) {
                    c.g = c;
                    c.f = c;
                    hkVar.e = c;
                } else {
                    mt1 mt1Var3 = mt1Var2.g;
                    mt1Var3.getClass();
                    mt1Var3.b(c);
                }
                j5 -= c.c - c.b;
                mt1Var = mt1Var.f;
                j3 = 0;
            }
        }
    }

    @Override // defpackage.pk
    public final InputStream inputStream() {
        return new gk(this, 0);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.pk
    public final boolean j() {
        if (this.f == 0) {
            return true;
        }
        return false;
    }

    public final byte k(long j) {
        rx.q(this.f, j, 1L);
        mt1 mt1Var = this.e;
        mt1Var.getClass();
        long j2 = this.f;
        if (j2 - j < j) {
            while (j2 > j) {
                mt1Var = mt1Var.g;
                mt1Var.getClass();
                j2 -= mt1Var.c - mt1Var.b;
            }
            return mt1Var.a[(int) ((mt1Var.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = mt1Var.c;
            int i2 = mt1Var.b;
            long j4 = (i - i2) + j3;
            if (j4 <= j) {
                mt1Var = mt1Var.f;
                mt1Var.getClass();
                j3 = j4;
            } else {
                return mt1Var.a[(int) ((i2 + j) - j3)];
            }
        }
    }

    @Override // defpackage.ok
    public final long l(k12 k12Var) {
        k12Var.getClass();
        long j = 0;
        while (true) {
            long read = k12Var.read(this, 8192L);
            if (read != -1) {
                j += read;
            } else {
                return j;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0093, code lost:
    
        r3 = r19.f - r1;
        r19.f = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
    
        if (r2 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009b, code lost:
    
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009e, code lost:
    
        if (r1 >= r14) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a2, code lost:
    
        if (r3 == r17) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a4, code lost:
    
        if (r2 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a6, code lost:
    
        r1 = "Expected a digit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ce, code lost:
    
        throw new java.lang.NumberFormatException(r1 + " but was 0x" + defpackage.rx.O(k(r17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
    
        r1 = "Expected a digit or '-'";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d4, code lost:
    
        throw new java.io.EOFException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d5, code lost:
    
        if (r2 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d7, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d9, code lost:
    
        return -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009d, code lost:
    
        r14 = 1;
     */
    /* JADX WARN: Type inference failed for: r0v7, types: [hk, java.lang.Object] */
    @Override // defpackage.pk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long n() {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hk.n():long");
    }

    public final long o(byte b, long j, long j2) {
        mt1 mt1Var;
        long j3 = 0;
        if (0 <= j && j <= j2) {
            long j4 = this.f;
            if (j2 > j4) {
                j2 = j4;
            }
            if (j != j2 && (mt1Var = this.e) != null) {
                if (j4 - j < j) {
                    while (j4 > j) {
                        mt1Var = mt1Var.g;
                        mt1Var.getClass();
                        j4 -= mt1Var.c - mt1Var.b;
                    }
                    while (j4 < j2) {
                        byte[] bArr = mt1Var.a;
                        int min = (int) Math.min(mt1Var.c, (mt1Var.b + j2) - j4);
                        for (int i = (int) ((mt1Var.b + j) - j4); i < min; i++) {
                            if (bArr[i] == b) {
                                return (i - mt1Var.b) + j4;
                            }
                        }
                        j4 += mt1Var.c - mt1Var.b;
                        mt1Var = mt1Var.f;
                        mt1Var.getClass();
                        j = j4;
                    }
                    return -1L;
                }
                while (true) {
                    long j5 = (mt1Var.c - mt1Var.b) + j3;
                    if (j5 > j) {
                        break;
                    }
                    mt1Var = mt1Var.f;
                    mt1Var.getClass();
                    j3 = j5;
                }
                while (j3 < j2) {
                    byte[] bArr2 = mt1Var.a;
                    int min2 = (int) Math.min(mt1Var.c, (mt1Var.b + j2) - j3);
                    for (int i2 = (int) ((mt1Var.b + j) - j3); i2 < min2; i2++) {
                        if (bArr2[i2] == b) {
                            return (i2 - mt1Var.b) + j3;
                        }
                    }
                    j3 += mt1Var.c - mt1Var.b;
                    mt1Var = mt1Var.f;
                    mt1Var.getClass();
                    j = j3;
                }
                return -1L;
            }
            return -1L;
        }
        throw new IllegalArgumentException(("size=" + this.f + " fromIndex=" + j + " toIndex=" + j2).toString());
    }

    public final long p(bl blVar) {
        int i;
        int i2;
        blVar.getClass();
        mt1 mt1Var = this.e;
        if (mt1Var != null) {
            long j = this.f;
            long j2 = 0;
            if (j < 0) {
                while (j > 0) {
                    mt1Var = mt1Var.g;
                    mt1Var.getClass();
                    j -= mt1Var.c - mt1Var.b;
                }
                if (blVar.d() == 2) {
                    byte i3 = blVar.i(0);
                    byte i4 = blVar.i(1);
                    while (j < this.f) {
                        byte[] bArr = mt1Var.a;
                        i = (int) ((mt1Var.b + j2) - j);
                        int i5 = mt1Var.c;
                        while (i < i5) {
                            byte b = bArr[i];
                            if (b != i3 && b != i4) {
                                i++;
                            }
                            i2 = mt1Var.b;
                        }
                        j2 = (mt1Var.c - mt1Var.b) + j;
                        mt1Var = mt1Var.f;
                        mt1Var.getClass();
                        j = j2;
                    }
                    return -1L;
                }
                byte[] h = blVar.h();
                while (j < this.f) {
                    byte[] bArr2 = mt1Var.a;
                    i = (int) ((mt1Var.b + j2) - j);
                    int i6 = mt1Var.c;
                    while (i < i6) {
                        byte b2 = bArr2[i];
                        for (byte b3 : h) {
                            if (b2 == b3) {
                                i2 = mt1Var.b;
                            }
                        }
                        i++;
                    }
                    j2 = (mt1Var.c - mt1Var.b) + j;
                    mt1Var = mt1Var.f;
                    mt1Var.getClass();
                    j = j2;
                }
                return -1L;
            }
            j = 0;
            while (true) {
                long j3 = (mt1Var.c - mt1Var.b) + j;
                if (j3 > 0) {
                    break;
                }
                mt1Var = mt1Var.f;
                mt1Var.getClass();
                j = j3;
            }
            if (blVar.d() == 2) {
                byte i7 = blVar.i(0);
                byte i8 = blVar.i(1);
                while (j < this.f) {
                    byte[] bArr3 = mt1Var.a;
                    i = (int) ((mt1Var.b + j2) - j);
                    int i9 = mt1Var.c;
                    while (i < i9) {
                        byte b4 = bArr3[i];
                        if (b4 != i7 && b4 != i8) {
                            i++;
                        }
                        i2 = mt1Var.b;
                    }
                    j2 = (mt1Var.c - mt1Var.b) + j;
                    mt1Var = mt1Var.f;
                    mt1Var.getClass();
                    j = j2;
                }
                return -1L;
            }
            byte[] h2 = blVar.h();
            while (j < this.f) {
                byte[] bArr4 = mt1Var.a;
                i = (int) ((mt1Var.b + j2) - j);
                int i10 = mt1Var.c;
                while (i < i10) {
                    byte b5 = bArr4[i];
                    for (byte b6 : h2) {
                        if (b5 == b6) {
                            i2 = mt1Var.b;
                        }
                    }
                    i++;
                }
                j2 = (mt1Var.c - mt1Var.b) + j;
                mt1Var = mt1Var.f;
                mt1Var.getClass();
                j = j2;
            }
            return -1L;
            return (i - i2) + j;
        }
        return -1L;
    }

    @Override // defpackage.pk
    public final bl1 peek() {
        return new bl1(new of1(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [hk, java.lang.Object] */
    @Override // defpackage.pk
    public final String q(long j) {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long j3 = j2;
            long o = o((byte) 10, 0L, j3);
            if (o != -1) {
                return b.c(this, o);
            }
            if (j3 < this.f && k(j3 - 1) == 13 && k(j3) == 10) {
                return b.c(this, j3);
            }
            ?? obj = new Object();
            i(0L, obj, Math.min(32L, this.f));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f, j) + " content=" + obj.e(obj.f).e() + (char) 8230);
        }
        se.e(l90.k("limit < 0: ", j));
        return null;
    }

    public final boolean r(int i, bl blVar, long j) {
        blVar.getClass();
        if (i >= 0 && j >= 0 && i + j <= this.f && i <= blVar.d()) {
            if (i == 0 || b.a(this, blVar, j, j + 1, i) != -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        rx.q(bArr.length, i, i2);
        mt1 mt1Var = this.e;
        if (mt1Var == null) {
            return -1;
        }
        int min = Math.min(i2, mt1Var.c - mt1Var.b);
        byte[] bArr2 = mt1Var.a;
        int i3 = mt1Var.b;
        bf.z(bArr2, i, bArr, i3, i3 + min);
        int i4 = mt1Var.b + min;
        mt1Var.b = i4;
        this.f -= min;
        if (i4 == mt1Var.c) {
            this.e = mt1Var.a();
            pt1.a(mt1Var);
        }
        return min;
    }

    @Override // defpackage.pk
    public final byte readByte() {
        if (this.f != 0) {
            mt1 mt1Var = this.e;
            mt1Var.getClass();
            int i = mt1Var.b;
            int i2 = mt1Var.c;
            int i3 = i + 1;
            byte b = mt1Var.a[i];
            this.f--;
            if (i3 == i2) {
                this.e = mt1Var.a();
                pt1.a(mt1Var);
                return b;
            }
            mt1Var.b = i3;
            return b;
        }
        throw new EOFException();
    }

    @Override // defpackage.pk
    public final void readFully(byte[] bArr) {
        bArr.getClass();
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // defpackage.pk
    public final int readInt() {
        if (this.f >= 4) {
            mt1 mt1Var = this.e;
            mt1Var.getClass();
            int i = mt1Var.b;
            int i2 = mt1Var.c;
            if (i2 - i < 4) {
                return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
            }
            byte[] bArr = mt1Var.a;
            int i3 = i + 3;
            int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
            int i5 = i + 4;
            int i6 = (bArr[i3] & 255) | i4;
            this.f -= 4;
            if (i5 == i2) {
                this.e = mt1Var.a();
                pt1.a(mt1Var);
                return i6;
            }
            mt1Var.b = i5;
            return i6;
        }
        throw new EOFException();
    }

    @Override // defpackage.pk
    public final long readLong() {
        if (this.f >= 8) {
            mt1 mt1Var = this.e;
            mt1Var.getClass();
            int i = mt1Var.b;
            int i2 = mt1Var.c;
            if (i2 - i < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = mt1Var.a;
            int i3 = i + 7;
            long j = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
            int i4 = i + 8;
            long j2 = j | (bArr[i3] & 255);
            this.f -= 8;
            if (i4 == i2) {
                this.e = mt1Var.a();
                pt1.a(mt1Var);
                return j2;
            }
            mt1Var.b = i4;
            return j2;
        }
        throw new EOFException();
    }

    @Override // defpackage.pk
    public final short readShort() {
        if (this.f >= 2) {
            mt1 mt1Var = this.e;
            mt1Var.getClass();
            int i = mt1Var.b;
            int i2 = mt1Var.c;
            if (i2 - i < 2) {
                return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
            }
            byte[] bArr = mt1Var.a;
            int i3 = i + 1;
            int i4 = (bArr[i] & 255) << 8;
            int i5 = i + 2;
            int i6 = (bArr[i3] & 255) | i4;
            this.f -= 2;
            if (i5 == i2) {
                this.e = mt1Var.a();
                pt1.a(mt1Var);
            } else {
                mt1Var.b = i5;
            }
            return (short) i6;
        }
        throw new EOFException();
    }

    public final fk s(fk fkVar) {
        fkVar.getClass();
        byte[] bArr = b.a;
        if (fkVar == rx.a) {
            fkVar = new fk();
        }
        if (fkVar.e == null) {
            fkVar.e = this;
            fkVar.f = true;
            return fkVar;
        }
        se.p("already attached to a buffer");
        return null;
    }

    @Override // defpackage.pk
    public final void skip(long j) {
        while (j > 0) {
            mt1 mt1Var = this.e;
            if (mt1Var != null) {
                int min = (int) Math.min(j, mt1Var.c - mt1Var.b);
                long j2 = min;
                this.f -= j2;
                j -= j2;
                int i = mt1Var.b + min;
                mt1Var.b = i;
                if (i == mt1Var.c) {
                    this.e = mt1Var.a();
                    pt1.a(mt1Var);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final byte[] t(long j) {
        if (j >= 0 && j <= 2147483647L) {
            if (this.f >= j) {
                byte[] bArr = new byte[(int) j];
                readFully(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        se.e(l90.k("byteCount: ", j));
        return null;
    }

    @Override // defpackage.k12
    public final ea2 timeout() {
        return ea2.NONE;
    }

    public final String toString() {
        long j = this.f;
        if (j <= 2147483647L) {
            return M((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f).toString());
    }

    @Override // defpackage.ok
    public final /* bridge */ /* synthetic */ ok u(String str) {
        Y(str);
        return this;
    }

    @Override // defpackage.pk
    public final void v(hk hkVar, long j) {
        hkVar.getClass();
        long j2 = this.f;
        if (j2 >= j) {
            hkVar.write(this, j);
        } else {
            hkVar.write(this, j2);
            throw new EOFException();
        }
    }

    @Override // defpackage.ok
    public final /* bridge */ /* synthetic */ ok w(bl blVar) {
        P(blVar);
        return this;
    }

    @Override // defpackage.ey1
    public final void write(hk hkVar, long j) {
        mt1 mt1Var;
        mt1 b;
        int i;
        hkVar.getClass();
        if (hkVar != this) {
            rx.q(hkVar.f, 0L, j);
            while (j > 0) {
                mt1 mt1Var2 = hkVar.e;
                mt1Var2.getClass();
                int i2 = mt1Var2.c;
                mt1 mt1Var3 = hkVar.e;
                mt1Var3.getClass();
                long j2 = i2 - mt1Var3.b;
                int i3 = 0;
                if (j < j2) {
                    mt1 mt1Var4 = this.e;
                    if (mt1Var4 != null) {
                        mt1Var = mt1Var4.g;
                    } else {
                        mt1Var = null;
                    }
                    if (mt1Var != null && mt1Var.e) {
                        long j3 = mt1Var.c + j;
                        if (mt1Var.d) {
                            i = 0;
                        } else {
                            i = mt1Var.b;
                        }
                        if (j3 - i <= 8192) {
                            mt1 mt1Var5 = hkVar.e;
                            mt1Var5.getClass();
                            mt1Var5.d(mt1Var, (int) j);
                            hkVar.f -= j;
                            this.f += j;
                            return;
                        }
                    }
                    mt1 mt1Var6 = hkVar.e;
                    mt1Var6.getClass();
                    int i4 = (int) j;
                    if (i4 > 0 && i4 <= mt1Var6.c - mt1Var6.b) {
                        if (i4 >= 1024) {
                            b = mt1Var6.c();
                        } else {
                            b = pt1.b();
                            byte[] bArr = mt1Var6.a;
                            byte[] bArr2 = b.a;
                            int i5 = mt1Var6.b;
                            bf.z(bArr, 0, bArr2, i5, i5 + i4);
                        }
                        b.c = b.b + i4;
                        mt1Var6.b += i4;
                        mt1 mt1Var7 = mt1Var6.g;
                        mt1Var7.getClass();
                        mt1Var7.b(b);
                        hkVar.e = b;
                    } else {
                        se.h("byteCount out of range");
                        return;
                    }
                }
                mt1 mt1Var8 = hkVar.e;
                mt1Var8.getClass();
                long j4 = mt1Var8.c - mt1Var8.b;
                hkVar.e = mt1Var8.a();
                mt1 mt1Var9 = this.e;
                if (mt1Var9 == null) {
                    this.e = mt1Var8;
                    mt1Var8.g = mt1Var8;
                    mt1Var8.f = mt1Var8;
                } else {
                    mt1 mt1Var10 = mt1Var9.g;
                    mt1Var10.getClass();
                    mt1Var10.b(mt1Var8);
                    mt1 mt1Var11 = mt1Var8.g;
                    if (mt1Var11 != mt1Var8) {
                        mt1Var11.getClass();
                        if (mt1Var11.e) {
                            int i6 = mt1Var8.c - mt1Var8.b;
                            mt1 mt1Var12 = mt1Var8.g;
                            mt1Var12.getClass();
                            int i7 = 8192 - mt1Var12.c;
                            mt1 mt1Var13 = mt1Var8.g;
                            mt1Var13.getClass();
                            if (!mt1Var13.d) {
                                mt1 mt1Var14 = mt1Var8.g;
                                mt1Var14.getClass();
                                i3 = mt1Var14.b;
                            }
                            if (i6 <= i7 + i3) {
                                mt1 mt1Var15 = mt1Var8.g;
                                mt1Var15.getClass();
                                mt1Var8.d(mt1Var15, i6);
                                mt1Var8.a();
                                pt1.a(mt1Var8);
                            }
                        }
                    } else {
                        se.p("cannot compact");
                        return;
                    }
                }
                hkVar.f -= j4;
                this.f += j4;
                j -= j4;
            }
            return;
        }
        se.h("source == this");
    }

    @Override // defpackage.ok
    public final /* bridge */ /* synthetic */ ok writeByte(int i) {
        Q(i);
        return this;
    }

    @Override // defpackage.ok
    public final /* bridge */ /* synthetic */ ok writeInt(int i) {
        T(i);
        return this;
    }

    @Override // defpackage.ok
    public final /* bridge */ /* synthetic */ ok writeShort(int i) {
        V(i);
        return this;
    }

    @Override // defpackage.pk
    public final String x(Charset charset) {
        charset.getClass();
        return D(this.f, charset);
    }

    @Override // defpackage.ok
    public final /* bridge */ /* synthetic */ ok y(long j) {
        S(j);
        return this;
    }

    @Override // defpackage.pk
    public final bl z() {
        return e(this.f);
    }

    @Override // defpackage.pk
    public final hk a() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.ey1
    public final void close() {
    }

    @Override // defpackage.ok, defpackage.ey1, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.ok
    public final ok m() {
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        mt1 mt1Var = this.e;
        if (mt1Var == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), mt1Var.c - mt1Var.b);
        byteBuffer.put(mt1Var.a, mt1Var.b, min);
        int i = mt1Var.b + min;
        mt1Var.b = i;
        this.f -= min;
        if (i == mt1Var.c) {
            this.e = mt1Var.a();
            pt1.a(mt1Var);
        }
        return min;
    }

    @Override // defpackage.k12
    public final long read(hk hkVar, long j) {
        hkVar.getClass();
        if (j >= 0) {
            long j2 = this.f;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            hkVar.write(this, j);
            return j;
        }
        se.e(l90.k("byteCount < 0: ", j));
        return 0L;
    }

    @Override // defpackage.ok
    public final /* bridge */ /* synthetic */ ok write(byte[] bArr, int i, int i2) {
        m79write(bArr, i, i2);
        return this;
    }

    @Override // defpackage.ok
    public final ok write(byte[] bArr) {
        bArr.getClass();
        m79write(bArr, 0, bArr.length);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            mt1 O = O(1);
            int min = Math.min(i, 8192 - O.c);
            byteBuffer.get(O.a, O.c, min);
            i -= min;
            O.c += min;
        }
        this.f += remaining;
        return remaining;
    }

    /* renamed from: write, reason: collision with other method in class */
    public final void m79write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        rx.q(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            mt1 O = O(1);
            int min = Math.min(i3 - i, 8192 - O.c);
            int i4 = i + min;
            bf.z(bArr, O.c, O.a, i, i4);
            O.c += min;
            i = i4;
        }
        this.f += j;
    }
}
