package defpackage;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class lm0 implements Comparable, Serializable {
    public static final km0 g = new Object();
    public static final lm0 h = new lm0(0, -31557014167219200L);
    public static final lm0 i = new lm0(999999999, 31556889864403199L);
    public final long e;
    public final int f;

    public lm0(int i2, long j) {
        this.e = j;
        this.f = i2;
        if (-31557014167219200L <= j && j < 31556889864403200L) {
            return;
        }
        se.h("Instant exceeds minimum or maximum instant");
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        lm0 lm0Var = (lm0) obj;
        lm0Var.getClass();
        int C = sn0.C(this.e, lm0Var.e);
        if (C != 0) {
            return C;
        }
        return sn0.B(this.f, lm0Var.f);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lm0) {
                lm0 lm0Var = (lm0) obj;
                if (this.e != lm0Var.e || this.f != lm0Var.f) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f * 51) + Long.hashCode(this.e);
    }

    public final String toString() {
        long j;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        long j2 = this.e;
        long j3 = j2 / 86400;
        if ((j2 ^ 86400) < 0 && j3 * 86400 != j2) {
            j3--;
        }
        long j4 = j2 % 86400;
        int i2 = (int) (j4 + (86400 & (((j4 ^ 86400) & ((-j4) | j4)) >> 63)));
        long j5 = 719468 + j3;
        if (j5 < 0) {
            long j6 = ((j3 + 719469) / 146097) - 1;
            j = j6 * 400;
            j5 += (-j6) * 146097;
        } else {
            j = 0;
        }
        long j7 = ((400 * j5) + 591) / 146097;
        long j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        if (j8 < 0) {
            j7--;
            j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        }
        int i3 = (int) j8;
        int i4 = ((i3 * 5) + 2) / 153;
        int i5 = ((i4 + 2) % 12) + 1;
        int i6 = (i3 - (((i4 * 306) + 5) / 10)) + 1;
        int i7 = (int) (j7 + j + (i4 / 10));
        int i8 = i2 / 3600;
        int i9 = i2 - (i8 * 3600);
        int i10 = i9 / 60;
        int i11 = i9 - (i10 * 60);
        int i12 = 0;
        if (Math.abs(i7) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i7 >= 0) {
                sb2.append(i7 + 10000);
                sb2.deleteCharAt(0).getClass();
            } else {
                sb2.append(i7 - 10000);
                sb2.deleteCharAt(1).getClass();
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i7 >= 10000) {
                sb.append('+');
            }
            sb.append(i7);
        }
        sb.append('-');
        fc2.z(sb, sb, i5);
        sb.append('-');
        fc2.z(sb, sb, i6);
        sb.append('T');
        fc2.z(sb, sb, i8);
        sb.append(AbstractJsonLexerKt.COLON);
        fc2.z(sb, sb, i10);
        sb.append(AbstractJsonLexerKt.COLON);
        fc2.z(sb, sb, i11);
        int i13 = this.f;
        if (i13 != 0) {
            sb.append('.');
            while (true) {
                iArr = fc2.o;
                int i14 = i12 + 1;
                if (i13 % iArr[i14] != 0) {
                    break;
                }
                i12 = i14;
            }
            int i15 = i12 - (i12 % 3);
            String valueOf = String.valueOf((i13 / iArr[i15]) + iArr[9 - i15]);
            valueOf.getClass();
            sb.append(valueOf.substring(1));
        }
        sb.append('Z');
        return sb.toString();
    }
}
