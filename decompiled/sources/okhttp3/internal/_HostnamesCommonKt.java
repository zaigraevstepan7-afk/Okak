package okhttp3.internal;

import defpackage.am1;
import defpackage.an0;
import defpackage.bf;
import defpackage.go;
import defpackage.i32;
import defpackage.p32;
import defpackage.se;
import defpackage.sn0;
import defpackage.yq1;
import kotlin.Metadata;
import okhttp3.internal.idn.IdnaMappingTableInstanceKt;
import okhttp3.internal.idn.Punycode;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0015\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0017\u0010\u0012\u001a\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001b\u0010\u0019\"\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"", "", "canParseAsIpAddress", "(Ljava/lang/String;)Z", "containsInvalidLabelLengths", "containsInvalidHostnameAsciiCodes", "input", "", "pos", "limit", "", "decodeIpv6", "(Ljava/lang/String;II)[B", "address", "addressOffset", "decodeIpv4Suffix", "(Ljava/lang/String;II[BI)Z", "inet6AddressToAscii", "([B)Ljava/lang/String;", "canonicalizeInetAddress", "([B)[B", "isMappedIpv4Address", "([B)Z", "inet4AddressToAscii", "toCanonicalHost", "(Ljava/lang/String;)Ljava/lang/String;", "host", "idnToAscii", "Lam1;", "VERIFY_AS_IP_ADDRESS", "Lam1;", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class _HostnamesCommonKt {
    private static final am1 VERIFY_AS_IP_ADDRESS = new am1("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static final boolean canParseAsIpAddress(String str) {
        str.getClass();
        am1 am1Var = VERIFY_AS_IP_ADDRESS;
        am1Var.getClass();
        return am1Var.e.matcher(str).matches();
    }

    public static final byte[] canonicalizeInetAddress(byte[] bArr) {
        bArr.getClass();
        if (isMappedIpv4Address(bArr)) {
            an0 X = go.X(12, 16);
            X.getClass();
            if (X.isEmpty()) {
                return new byte[0];
            }
            return bf.H(bArr, X.e, X.f + 1);
        }
        return bArr;
    }

    public static final boolean containsInvalidHostnameAsciiCodes(String str) {
        str.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (sn0.B(charAt, 31) <= 0 || sn0.B(charAt, 127) >= 0 || i32.K(" #%/:?@[\\]", charAt, 0, 6) != -1) {
                return true;
            }
        }
        return false;
    }

    public static final boolean containsInvalidLabelLengths(String str) {
        int i;
        str.getClass();
        int length = str.length();
        if (1 <= length && length < 254) {
            int i2 = 0;
            while (true) {
                int K = i32.K(str, '.', i2, 4);
                if (K == -1) {
                    i = str.length() - i2;
                } else {
                    i = K - i2;
                }
                if (1 > i || i >= 64) {
                    break;
                }
                if (K == -1 || K == str.length() - 1) {
                    break;
                }
                i2 = K + 1;
            }
            return false;
        }
        return true;
    }

    public static final boolean decodeIpv4Suffix(String str, int i, int i2, byte[] bArr, int i3) {
        str.getClass();
        bArr.getClass();
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char charAt = str.charAt(i5);
                if (sn0.B(charAt, 48) < 0 || sn0.B(charAt, 57) > 0) {
                    break;
                }
                if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                    return false;
                }
                i5++;
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        if (i4 != i3 + 4) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final byte[] decodeIpv6(java.lang.String r10, int r11, int r12) {
        /*
            r10.getClass()
            r0 = 16
            byte[] r1 = new byte[r0]
            r2 = 0
            r3 = -1
            r4 = r2
            r5 = r3
            r6 = r5
        Lc:
            if (r11 >= r12) goto L79
            if (r4 != r0) goto L12
            goto L7d
        L12:
            int r7 = r11 + 2
            if (r7 > r12) goto L2a
            java.lang.String r8 = "::"
            boolean r8 = defpackage.p32.C(r10, r8, r11, r2)
            if (r8 == 0) goto L2a
            if (r5 == r3) goto L22
            goto L7d
        L22:
            int r4 = r4 + 2
            r5 = r4
            if (r7 != r12) goto L28
            goto L79
        L28:
            r6 = r7
            goto L4c
        L2a:
            if (r4 == 0) goto L36
            java.lang.String r7 = ":"
            boolean r7 = defpackage.p32.C(r10, r7, r11, r2)
            if (r7 == 0) goto L38
            int r11 = r11 + 1
        L36:
            r6 = r11
            goto L4c
        L38:
            java.lang.String r7 = "."
            boolean r11 = defpackage.p32.C(r10, r7, r11, r2)
            if (r11 == 0) goto L7d
            int r11 = r4 + (-2)
            boolean r10 = decodeIpv4Suffix(r10, r6, r12, r1, r11)
            if (r10 != 0) goto L49
            goto L7d
        L49:
            int r4 = r4 + 2
            goto L79
        L4c:
            r7 = r2
            r11 = r6
        L4e:
            if (r11 >= r12) goto L60
            char r8 = r10.charAt(r11)
            int r8 = okhttp3.internal._UtilCommonKt.parseHexDigit(r8)
            if (r8 == r3) goto L60
            int r7 = r7 << 4
            int r7 = r7 + r8
            int r11 = r11 + 1
            goto L4e
        L60:
            int r8 = r11 - r6
            if (r8 == 0) goto L7d
            r9 = 4
            if (r8 <= r9) goto L68
            goto L7d
        L68:
            int r8 = r4 + 1
            int r9 = r7 >>> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r1[r4] = r9
            int r4 = r4 + 2
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            r1[r8] = r7
            goto Lc
        L79:
            if (r4 == r0) goto L8b
            if (r5 != r3) goto L7f
        L7d:
            r10 = 0
            return r10
        L7f:
            int r10 = r4 - r5
            int r10 = 16 - r10
            defpackage.bf.z(r1, r10, r1, r5, r4)
            int r0 = r0 - r4
            int r0 = r0 + r5
            java.util.Arrays.fill(r1, r5, r0, r2)
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal._HostnamesCommonKt.decodeIpv6(java.lang.String, int, int):byte[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [hk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [hk, java.lang.Object, ok] */
    public static final String idnToAscii(String str) {
        str.getClass();
        ?? obj = new Object();
        obj.Y(str);
        ?? obj2 = new Object();
        while (!obj.j()) {
            if (!IdnaMappingTableInstanceKt.getIDNA_MAPPING_TABLE().map(obj.H(), obj2)) {
                return null;
            }
        }
        obj.Y(_NormalizeJvmKt.normalizeNfc(obj2.G()));
        Punycode punycode = Punycode.INSTANCE;
        String decode = punycode.decode(obj.G());
        if (decode == null || !decode.equals(_NormalizeJvmKt.normalizeNfc(decode))) {
            return null;
        }
        return punycode.encode(decode);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hk, java.lang.Object] */
    public static final String inet4AddressToAscii(byte[] bArr) {
        bArr.getClass();
        if (bArr.length == 4) {
            ?? obj = new Object();
            obj.R(_UtilCommonKt.and(bArr[0], 255));
            obj.Q(46);
            obj.R(_UtilCommonKt.and(bArr[1], 255));
            obj.Q(46);
            obj.R(_UtilCommonKt.and(bArr[2], 255));
            obj.Q(46);
            obj.R(_UtilCommonKt.and(bArr[3], 255));
            return obj.G();
        }
        se.h("Failed requirement.");
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [hk, java.lang.Object] */
    public static final String inet6AddressToAscii(byte[] bArr) {
        bArr.getClass();
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        ?? obj = new Object();
        while (i2 < bArr.length) {
            if (i2 == i) {
                obj.Q(58);
                i2 += i4;
                if (i2 == 16) {
                    obj.Q(58);
                }
            } else {
                if (i2 > 0) {
                    obj.Q(58);
                }
                obj.S((_UtilCommonKt.and(bArr[i2], 255) << 8) | _UtilCommonKt.and(bArr[i2 + 1], 255));
                i2 += 2;
            }
        }
        return obj.G();
    }

    private static final boolean isMappedIpv4Address(byte[] bArr) {
        if (bArr.length != 16) {
            return false;
        }
        for (int i = 0; i < 10; i++) {
            if (bArr[i] != 0) {
                return false;
            }
        }
        if (bArr[10] != -1 || bArr[11] != -1) {
            return false;
        }
        return true;
    }

    public static final String toCanonicalHost(String str) {
        byte[] decodeIpv6;
        str.getClass();
        if (i32.G(str, ":", false)) {
            if (p32.D(str, "[", false) && p32.w(str, "]", false)) {
                decodeIpv6 = decodeIpv6(str, 1, str.length() - 1);
            } else {
                decodeIpv6 = decodeIpv6(str, 0, str.length());
            }
            if (decodeIpv6 != null) {
                byte[] canonicalizeInetAddress = canonicalizeInetAddress(decodeIpv6);
                if (canonicalizeInetAddress.length == 16) {
                    return inet6AddressToAscii(canonicalizeInetAddress);
                }
                if (canonicalizeInetAddress.length == 4) {
                    return inet4AddressToAscii(canonicalizeInetAddress);
                }
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
        } else {
            String idnToAscii = idnToAscii(str);
            if (idnToAscii != null && idnToAscii.length() != 0 && !containsInvalidHostnameAsciiCodes(idnToAscii) && !containsInvalidLabelLengths(idnToAscii)) {
                return idnToAscii;
            }
        }
        return null;
    }
}
