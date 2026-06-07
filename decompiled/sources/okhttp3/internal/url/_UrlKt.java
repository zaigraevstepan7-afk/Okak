package okhttp3.internal.url;

import defpackage.hk;
import defpackage.i32;
import defpackage.sm;
import defpackage.yq1;
import java.nio.charset.Charset;
import kotlin.Metadata;
import okhttp3.internal._UtilCommonKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0019\n\u0002\b\u0011\u001a]\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001ac\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a3\u0010\u0014\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aW\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a1\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a#\u0010\u001a\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u001a\u0010\u001d\u001a\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0014\u0010!\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010\"\"\u0014\u0010#\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010\"\"\u0014\u0010$\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b$\u0010\"\"\u0014\u0010%\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b%\u0010\"\"\u0014\u0010&\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b&\u0010\"\"\u0014\u0010'\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b'\u0010\"\"\u0014\u0010(\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b(\u0010\"\"\u0014\u0010)\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b)\u0010\"\"\u0014\u0010*\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b*\u0010\"\"\u0014\u0010+\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b+\u0010\"\"\u0014\u0010,\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b,\u0010\"¨\u0006-"}, d2 = {"Lhk;", "", "input", "", "pos", "limit", "encodeSet", "", "alreadyEncoded", "strict", "plusIsSpace", "unicodeAllowed", "Ljava/nio/charset/Charset;", "charset", "Lod2;", "writeCanonicalized", "(Lhk;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)V", "canonicalizeWithCharset", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "encoded", "writePercentDecoded", "(Lhk;Ljava/lang/String;IIZ)V", "canonicalize", "(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;", "percentDecode", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "isPercentEncoded", "(Ljava/lang/String;II)Z", "", "HEX_DIGITS", "[C", "getHEX_DIGITS", "()[C", "USERNAME_ENCODE_SET", "Ljava/lang/String;", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_ENCODE_SET", "QUERY_COMPONENT_REENCODE_SET", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "FORM_ENCODE_SET", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class _UrlKt {
    public static final String FORM_ENCODE_SET = " !\"#$&'()+,/:;<=>?@[\\]^`{|}~";
    public static final String FRAGMENT_ENCODE_SET = "";
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    public static final String canonicalize(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        str.getClass();
        str2.getClass();
        return canonicalizeWithCharset$default(str, i, i2, str2, z, z2, z3, z4, null, 128, null);
    }

    public static /* synthetic */ String canonicalize$default(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 8) != 0) {
            z = false;
        }
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        if ((i3 & 32) != 0) {
            z3 = false;
        }
        if ((i3 & 64) != 0) {
            z4 = false;
        }
        return canonicalize(str, i, i2, str2, z, z2, z3, z4);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hk, java.lang.Object] */
    public static final String canonicalizeWithCharset(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        str.getClass();
        str2.getClass();
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z4) && !i32.H(str2, (char) codePointAt) && ((codePointAt != 37 || (z && (!z2 || isPercentEncoded(str, i3, i2)))) && (codePointAt != 43 || !z3)))) {
                i3 += Character.charCount(codePointAt);
            } else {
                ?? obj = new Object();
                obj.X(i, i3, str);
                writeCanonicalized(obj, str, i3, i2, str2, z, z2, z3, z4, charset);
                return obj.G();
            }
        }
        return str.substring(i, i2);
    }

    public static /* synthetic */ String canonicalizeWithCharset$default(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 8) != 0) {
            z = false;
        }
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        if ((i3 & 32) != 0) {
            z3 = false;
        }
        if ((i3 & 64) != 0) {
            z4 = false;
        }
        if ((i3 & 128) != 0) {
            charset = null;
        }
        return canonicalizeWithCharset(str, i, i2, str2, z, z2, z3, z4, charset);
    }

    public static final char[] getHEX_DIGITS() {
        return HEX_DIGITS;
    }

    public static final boolean isPercentEncoded(String str, int i, int i2) {
        str.getClass();
        int i3 = i + 2;
        if (i3 < i2 && str.charAt(i) == '%' && _UtilCommonKt.parseHexDigit(str.charAt(i + 1)) != -1 && _UtilCommonKt.parseHexDigit(str.charAt(i3)) != -1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [hk, java.lang.Object] */
    public static final String percentDecode(String str, int i, int i2, boolean z) {
        str.getClass();
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                ?? obj = new Object();
                obj.X(i, i3, str);
                writePercentDecoded(obj, str, i3, i2, z);
                return obj.G();
            }
        }
        return str.substring(i, i2);
    }

    public static /* synthetic */ String percentDecode$default(String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return percentDecode(str, i, i2, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [hk] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static final void writeCanonicalized(hk hkVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        hkVar.getClass();
        str.getClass();
        str2.getClass();
        ?? r0 = 0;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                String str3 = "+";
                if (codePointAt == 32 && str2 == FORM_ENCODE_SET) {
                    hkVar.Y("+");
                } else if (codePointAt == 43 && z3) {
                    if (!z) {
                        str3 = "%2B";
                    }
                    hkVar.Y(str3);
                } else if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z4) && !i32.H(str2, (char) codePointAt) && (codePointAt != 37 || (z && (!z2 || isPercentEncoded(str, i, i2)))))) {
                    hkVar.Z(codePointAt);
                } else {
                    if (r0 == 0) {
                        r0 = new Object();
                    }
                    if (charset != null && !charset.equals(sm.a)) {
                        r0.W(str, i, Character.charCount(codePointAt) + i, charset);
                    } else {
                        r0.Z(codePointAt);
                    }
                    while (!r0.j()) {
                        byte readByte = r0.readByte();
                        hkVar.Q(37);
                        char[] cArr = HEX_DIGITS;
                        hkVar.Q(cArr[((readByte & 255) >> 4) & 15]);
                        hkVar.Q(cArr[readByte & 15]);
                    }
                }
            }
            i += Character.charCount(codePointAt);
            r0 = r0;
        }
    }

    public static final void writePercentDecoded(hk hkVar, String str, int i, int i2, boolean z) {
        int i3;
        hkVar.getClass();
        str.getClass();
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int parseHexDigit = _UtilCommonKt.parseHexDigit(str.charAt(i + 1));
                int parseHexDigit2 = _UtilCommonKt.parseHexDigit(str.charAt(i3));
                if (parseHexDigit != -1 && parseHexDigit2 != -1) {
                    hkVar.Q((parseHexDigit << 4) + parseHexDigit2);
                    i = Character.charCount(codePointAt) + i3;
                }
                hkVar.Z(codePointAt);
                i += Character.charCount(codePointAt);
            } else {
                if (codePointAt == 43 && z) {
                    hkVar.Q(32);
                    i++;
                }
                hkVar.Z(codePointAt);
                i += Character.charCount(codePointAt);
            }
        }
    }
}
