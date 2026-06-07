package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class la0 implements ea0 {
    public final int a;
    public final x40 b;
    public final long c;
    public final long d;

    public la0(int i, int i2, x40 x40Var) {
        this.a = i;
        this.b = x40Var;
        this.c = i * 1000000;
        this.d = i2 * 1000000;
    }

    @Override // defpackage.ea0
    public final float b(long j, float f, float f2, float f3) {
        long j2;
        long j3 = j - this.d;
        if (j3 < 0) {
            j3 = 0;
        }
        long j4 = this.c;
        if (j3 > j4) {
            j2 = j4;
        } else {
            j2 = j3;
        }
        if (j2 == 0) {
            return f3;
        }
        return (e(j2, f, f2, f3) - e(j2 - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // defpackage.ea0
    public final long c(float f, float f2, float f3) {
        return this.d + this.c;
    }

    @Override // defpackage.ea0
    public final float e(long j, float f, float f2, float f3) {
        float f4;
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        if (j2 > j3) {
            j2 = j3;
        }
        if (this.a == 0) {
            f4 = 1.0f;
        } else {
            f4 = ((float) j2) / ((float) j3);
        }
        float a = this.b.a(f4);
        return (f2 * a) + ((1.0f - a) * f);
    }
}
