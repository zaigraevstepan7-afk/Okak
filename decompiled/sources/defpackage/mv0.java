package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class mv0 extends fw1 {
    public final List c;
    public final long d;
    public final long e;

    public mv0(List list, long j, long j2) {
        this.c = list;
        this.d = j;
        this.e = j2;
    }

    @Override // defpackage.fw1
    public final Shader b(long j) {
        long j2 = this.d;
        int i = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float intBitsToFloat2 = Float.intBitsToFloat(i2);
        long j3 = this.e;
        int i3 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float intBitsToFloat3 = Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float intBitsToFloat4 = Float.intBitsToFloat(i4);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L);
        List list = this.c;
        if (list.size() >= 2) {
            float intBitsToFloat5 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            float intBitsToFloat6 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            float intBitsToFloat7 = Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32));
            float intBitsToFloat8 = Float.intBitsToFloat((int) (floatToRawIntBits2 & 4294967295L));
            int size = list.size();
            int[] iArr = new int[size];
            for (int i5 = 0; i5 < size; i5++) {
                iArr[i5] = go.U(((co) list.get(i5)).a);
            }
            return new LinearGradient(intBitsToFloat5, intBitsToFloat6, intBitsToFloat7, intBitsToFloat8, iArr, (float[]) null, Shader.TileMode.CLAMP);
        }
        se.h("colors must have length of at least 2 if colorStops is omitted.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mv0) {
            mv0 mv0Var = (mv0) obj;
            if (this.c.equals(mv0Var.c) && z81.b(this.d, mv0Var.d) && z81.b(this.e, mv0Var.e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + l90.e(this.e, l90.e(this.d, this.c.hashCode() * 961, 31), 31);
    }

    public final String toString() {
        String str;
        long j = this.d;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) != 0) {
            str = "";
        } else {
            str = "start=" + ((Object) z81.g(j)) + ", ";
        }
        long j2 = this.e;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) z81.g(j2)) + ", ";
        }
        return "LinearGradient(colors=" + this.c + ", stops=null, " + str + str2 + "tileMode=" + ((Object) "Clamp") + ')';
    }
}
