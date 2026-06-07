package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class za2 {
    public sb1 a;
    public long b;

    public za2(long j, sb1 sb1Var) {
        this.a = sb1Var;
        this.b = j;
    }

    public final long a(float f, long j, long j2) {
        float abs;
        long j3;
        long e = z81.e(this.b, z81.d(j, j2));
        this.b = e;
        if (this.a == null) {
            abs = z81.c(e);
        } else {
            abs = Math.abs(b(e));
        }
        if (abs >= f) {
            sb1 sb1Var = this.a;
            long j4 = this.b;
            if (sb1Var == null) {
                float c = z81.c(j4);
                float intBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32)) / c;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (j4 & 4294967295L)) / c;
                return z81.d(this.b, z81.f((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), f));
            }
            float b = b(j4) - (Math.signum(b(this.b)) * f);
            long j5 = this.b;
            sb1 sb1Var2 = this.a;
            sb1 sb1Var3 = sb1.f;
            if (sb1Var2 == sb1Var3) {
                j3 = j5 & 4294967295L;
            } else {
                j3 = j5 >> 32;
            }
            float intBitsToFloat3 = Float.intBitsToFloat((int) j3);
            if (this.a == sb1Var3) {
                return (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(b) << 32);
            }
            return (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(b) & 4294967295L);
        }
        return 9205357640488583168L;
    }

    public final float b(long j) {
        long j2;
        if (this.a == sb1.f) {
            j2 = j >> 32;
        } else {
            j2 = j & 4294967295L;
        }
        return Float.intBitsToFloat((int) j2);
    }

    public /* synthetic */ za2(sb1 sb1Var) {
        this(0L, sb1Var);
    }
}
