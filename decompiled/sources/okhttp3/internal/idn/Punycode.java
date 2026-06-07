package okhttp3.internal.idn;

import defpackage.bl;
import defpackage.go;
import defpackage.hk;
import defpackage.i32;
import defpackage.p32;
import defpackage.xl1;
import defpackage.y61;
import defpackage.ym0;
import defpackage.yq1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010&R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010&R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010&R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010&R\u0018\u0010/\u001a\u00020\u0006*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lokhttp3/internal/idn/Punycode;", "", "<init>", "()V", "", "string", "", "pos", "limit", "Lhk;", "result", "", "encodeLabel", "(Ljava/lang/String;IILhk;)Z", "decodeLabel", "delta", "numpoints", "first", "adapt", "(IIZ)I", "requiresEncode", "(Ljava/lang/String;II)Z", "", "codePoints", "(Ljava/lang/String;II)Ljava/util/List;", "encode", "(Ljava/lang/String;)Ljava/lang/String;", "decode", "PREFIX_STRING", "Ljava/lang/String;", "getPREFIX_STRING", "()Ljava/lang/String;", "Lbl;", "PREFIX", "Lbl;", "getPREFIX", "()Lbl;", "BASE", "I", "TMIN", "TMAX", "SKEW", "DAMP", "INITIAL_BIAS", "INITIAL_N", "getPunycodeDigit", "(I)I", "punycodeDigit", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class Punycode {
    private static final int BASE = 36;
    private static final int DAMP = 700;
    private static final int INITIAL_BIAS = 72;
    private static final int INITIAL_N = 128;
    private static final bl PREFIX;
    private static final int SKEW = 38;
    private static final int TMAX = 26;
    private static final int TMIN = 1;
    public static final Punycode INSTANCE = new Punycode();
    private static final String PREFIX_STRING = "xn--";

    static {
        bl blVar = bl.h;
        PREFIX = xl1.p("xn--");
    }

    private Punycode() {
    }

    private final int adapt(int delta, int numpoints, boolean first) {
        int i;
        if (first) {
            i = delta / DAMP;
        } else {
            i = delta / 2;
        }
        int i2 = (i / numpoints) + i;
        int i3 = 0;
        while (i2 > 455) {
            i2 /= 35;
            i3 += 36;
        }
        return ((i2 * 36) / (i2 + SKEW)) + i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [char] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    private final List<Integer> codePoints(String str, int i, int i2) {
        char c;
        ArrayList arrayList = new ArrayList();
        while (i < i2) {
            int charAt = str.charAt(i);
            if (55296 <= charAt && charAt < 57344) {
                int i3 = i + 1;
                if (i3 < i2) {
                    c = str.charAt(i3);
                } else {
                    c = 0;
                }
                if (!Character.isLowSurrogate(charAt) && Character.isLowSurrogate(c)) {
                    charAt = 65536 + (((charAt & 1023) << 10) | (c & 1023));
                    i = i3;
                } else {
                    charAt = 63;
                }
            }
            arrayList.add(Integer.valueOf(charAt));
            i++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean decodeLabel(String string, int pos, int limit, hk result) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4 = 1;
        if (!p32.z(string, pos, PREFIX_STRING, 0, 4, true)) {
            result.X(pos, limit, string);
            return true;
        }
        int i5 = pos + 4;
        ArrayList arrayList = new ArrayList();
        int P = i32.P(string, '-', limit, 4);
        char c = '0';
        char c2 = AbstractJsonLexerKt.BEGIN_LIST;
        char c3 = AbstractJsonLexerKt.BEGIN_OBJ;
        if (P >= i5) {
            while (i5 < P) {
                int i6 = i5 + 1;
                char charAt = string.charAt(i5);
                if (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || (('0' <= charAt && charAt < ':') || charAt == '-'))) {
                    arrayList.add(Integer.valueOf(charAt));
                    i5 = i6;
                } else {
                    return false;
                }
            }
            i5++;
        }
        int i7 = 128;
        int i8 = INITIAL_BIAS;
        int i9 = 0;
        while (i5 < limit) {
            int i10 = i4;
            ym0 T = go.T(go.X(36, Integer.MAX_VALUE), 36);
            int i11 = T.e;
            int i12 = T.f;
            int i13 = T.g;
            if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                i = i9;
                int i14 = i10;
                while (i5 != limit) {
                    int i15 = i5 + 1;
                    char charAt2 = string.charAt(i5);
                    if ('a' <= charAt2 && charAt2 < c3) {
                        i2 = charAt2 - 'a';
                    } else if ('A' <= charAt2 && charAt2 < c2) {
                        i2 = charAt2 - 'A';
                    } else {
                        if (c > charAt2 || charAt2 >= ':') {
                            return false;
                        }
                        i2 = charAt2 - 22;
                    }
                    int i16 = i14;
                    int i17 = i2 * i16;
                    int i18 = i;
                    if (i18 > Integer.MAX_VALUE - i17) {
                        return false;
                    }
                    i = i18 + i17;
                    if (i11 <= i8) {
                        i3 = i10;
                    } else if (i11 >= i8 + TMAX) {
                        i3 = TMAX;
                    } else {
                        i3 = i11 - i8;
                    }
                    if (i2 >= i3) {
                        int i19 = 36 - i3;
                        if (i16 > Integer.MAX_VALUE / i19) {
                            return false;
                        }
                        i14 = i16 * i19;
                        if (i11 != i12) {
                            i11 += i13;
                            i5 = i15;
                            c = '0';
                            c2 = AbstractJsonLexerKt.BEGIN_LIST;
                            c3 = AbstractJsonLexerKt.BEGIN_OBJ;
                        }
                    }
                    i5 = i15;
                }
                return false;
            }
            i = i9;
            int i20 = i - i9;
            int size = arrayList.size() + 1;
            if (i9 == 0) {
                z = i10;
            } else {
                z = false;
            }
            i8 = adapt(i20, size, z);
            int size2 = i / (arrayList.size() + 1);
            if (i7 > Integer.MAX_VALUE - size2) {
                return false;
            }
            i7 += size2;
            int size3 = i % (arrayList.size() + 1);
            if (i7 > 1114111) {
                return false;
            }
            arrayList.add(size3, Integer.valueOf(i7));
            i9 = size3 + 1;
            i4 = i10;
            c = '0';
            c2 = AbstractJsonLexerKt.BEGIN_LIST;
            c3 = AbstractJsonLexerKt.BEGIN_OBJ;
        }
        boolean z2 = i4;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            result.Z(((Number) it.next()).intValue());
        }
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean encodeLabel(String string, int pos, int limit, hk result) {
        int i;
        int i2;
        int i3;
        boolean z;
        int i4 = 1;
        if (!requiresEncode(string, pos, limit)) {
            result.X(pos, limit, string);
            return true;
        }
        result.P(PREFIX);
        List<Integer> codePoints = codePoints(string, pos, limit);
        Iterator<Integer> it = codePoints.iterator();
        int i5 = 0;
        while (true) {
            i = 128;
            if (!it.hasNext()) {
                break;
            }
            int intValue = it.next().intValue();
            if (intValue < 128) {
                result.Q(intValue);
                i5++;
            }
        }
        if (i5 > 0) {
            result.Q(45);
        }
        int i6 = INITIAL_BIAS;
        int i7 = 0;
        int i8 = i5;
        while (i8 < codePoints.size()) {
            Iterator<T> it2 = codePoints.iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                if (it2.hasNext()) {
                    int intValue2 = ((Number) next).intValue();
                    if (intValue2 < i) {
                        intValue2 = Integer.MAX_VALUE;
                    }
                    do {
                        Object next2 = it2.next();
                        int intValue3 = ((Number) next2).intValue();
                        if (intValue3 < i) {
                            intValue3 = Integer.MAX_VALUE;
                        }
                        if (intValue2 > intValue3) {
                            next = next2;
                            intValue2 = intValue3;
                        }
                    } while (it2.hasNext());
                }
                int intValue4 = ((Number) next).intValue();
                int i9 = (i8 + 1) * (intValue4 - i);
                if (i7 <= Integer.MAX_VALUE - i9) {
                    int i10 = i7 + i9;
                    Iterator<Integer> it3 = codePoints.iterator();
                    while (it3.hasNext()) {
                        int intValue5 = it3.next().intValue();
                        if (intValue5 < intValue4) {
                            if (i10 != Integer.MAX_VALUE) {
                                i10++;
                            }
                        } else if (intValue5 == intValue4) {
                            ym0 T = go.T(go.X(36, Integer.MAX_VALUE), 36);
                            int i11 = T.e;
                            int i12 = T.f;
                            int i13 = T.g;
                            if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                                i3 = i10;
                                while (true) {
                                    if (i11 <= i6) {
                                        i2 = i4;
                                    } else {
                                        i2 = i4;
                                        if (i11 >= i6 + TMAX) {
                                            i4 = TMAX;
                                        } else {
                                            i4 = i11 - i6;
                                        }
                                    }
                                    if (i3 < i4) {
                                        break;
                                    }
                                    int i14 = i3 - i4;
                                    int i15 = 36 - i4;
                                    result.Q(getPunycodeDigit((i14 % i15) + i4));
                                    i3 = i14 / i15;
                                    if (i11 == i12) {
                                        break;
                                    }
                                    i11 += i13;
                                    i4 = i2;
                                }
                            } else {
                                i2 = i4;
                                i3 = i10;
                            }
                            result.Q(getPunycodeDigit(i3));
                            int i16 = i8 + 1;
                            if (i8 == i5) {
                                z = i2;
                            } else {
                                z = false;
                            }
                            i6 = adapt(i10, i16, z);
                            i8 = i16;
                            i10 = 0;
                            i4 = i2;
                        }
                    }
                    i7 = i10 + 1;
                    i = intValue4 + 1;
                }
                return false;
            }
            y61.c();
            return false;
        }
        return i4;
    }

    private final int getPunycodeDigit(int i) {
        if (i < TMAX) {
            return i + 97;
        }
        if (i < 36) {
            return i + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + i).toString());
    }

    private final boolean requiresEncode(String str, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) >= 128) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [hk, java.lang.Object] */
    public final String decode(String string) {
        int K;
        string.getClass();
        int length = string.length();
        ?? obj = new Object();
        for (int i = 0; i < length; i = K + 1) {
            K = i32.K(string, '.', i, 4);
            if (K == -1) {
                K = length;
            }
            if (!decodeLabel(string, i, K, obj)) {
                return null;
            }
            if (K >= length) {
                break;
            }
            obj.Q(46);
        }
        return obj.G();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [hk, java.lang.Object] */
    public final String encode(String string) {
        int K;
        string.getClass();
        int length = string.length();
        ?? obj = new Object();
        for (int i = 0; i < length; i = K + 1) {
            K = i32.K(string, '.', i, 4);
            if (K == -1) {
                K = length;
            }
            if (!encodeLabel(string, i, K, obj)) {
                return null;
            }
            if (K >= length) {
                break;
            }
            obj.Q(46);
        }
        return obj.G();
    }

    public final bl getPREFIX() {
        return PREFIX;
    }

    public final String getPREFIX_STRING() {
        return PREFIX_STRING;
    }
}
