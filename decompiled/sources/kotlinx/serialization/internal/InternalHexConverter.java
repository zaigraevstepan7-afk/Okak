package kotlinx.serialization.internal;

import defpackage.se;
import defpackage.yq1;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlinx/serialization/internal/InternalHexConverter;", "", "<init>", "()V", "hexCode", "", "parseHexBinary", "", "s", "hexToInt", "", "ch", "", "printHexBinary", "data", "lowerCase", "", "toHexString", "n", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class InternalHexConverter {
    public static final InternalHexConverter INSTANCE = new InternalHexConverter();
    private static final String hexCode = "0123456789ABCDEF";

    private InternalHexConverter() {
    }

    private final int hexToInt(char ch) {
        if ('0' <= ch && ch < ':') {
            return ch - '0';
        }
        if ('A' <= ch && ch < 'G') {
            return ch - '7';
        }
        if ('a' <= ch && ch < 'g') {
            return ch - 'W';
        }
        return -1;
    }

    public static /* synthetic */ String printHexBinary$default(InternalHexConverter internalHexConverter, byte[] bArr, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return internalHexConverter.printHexBinary(bArr, z);
    }

    public final byte[] parseHexBinary(String s) {
        s.getClass();
        int length = s.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[length / 2];
            for (int i = 0; i < length; i += 2) {
                int hexToInt = hexToInt(s.charAt(i));
                int i2 = i + 1;
                int hexToInt2 = hexToInt(s.charAt(i2));
                if (hexToInt != -1 && hexToInt2 != -1) {
                    bArr[i / 2] = (byte) ((hexToInt << 4) + hexToInt2);
                } else {
                    throw new IllegalArgumentException(("Invalid hex chars: " + s.charAt(i) + s.charAt(i2)).toString());
                }
            }
            return bArr;
        }
        se.h("HexBinary string must be even length");
        return null;
    }

    public final String printHexBinary(byte[] data, boolean lowerCase) {
        data.getClass();
        StringBuilder sb = new StringBuilder(data.length * 2);
        for (byte b : data) {
            sb.append(hexCode.charAt((b >> 4) & 15));
            sb.append(hexCode.charAt(b & 15));
        }
        String sb2 = sb.toString();
        if (lowerCase) {
            String lowerCase2 = sb2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            return lowerCase2;
        }
        return sb2;
    }

    public final String toHexString(int n) {
        CharSequence charSequence;
        boolean z;
        byte[] bArr = new byte[4];
        boolean z2 = false;
        for (int i = 0; i < 4; i++) {
            bArr[i] = (byte) (n >> (24 - (i * 8)));
        }
        String printHexBinary = printHexBinary(bArr, true);
        char[] cArr = {'0'};
        printHexBinary.getClass();
        int length = printHexBinary.length();
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                char charAt = printHexBinary.charAt(i2);
                int i3 = 0;
                while (true) {
                    if (i3 < 1) {
                        if (charAt == cArr[i3]) {
                            break;
                        }
                        i3++;
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                if (i3 >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    charSequence = printHexBinary.subSequence(i2, printHexBinary.length());
                    break;
                }
                i2++;
            } else {
                charSequence = "";
                break;
            }
        }
        String obj = charSequence.toString();
        if (obj.length() > 0) {
            z2 = true;
        }
        if (!z2) {
            obj = null;
        }
        if (obj == null) {
            return "0";
        }
        return obj;
    }
}
