package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hi implements i3 {
    public final float a;

    public hi(float f) {
        this.a = f;
    }

    @Override // defpackage.i3
    public final long a(long j, long j2, jq0 jq0Var) {
        long j3 = ((((int) (j2 >> 32)) - ((int) (j >> 32))) << 32) | ((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L);
        return (Math.round((((int) (j3 & 4294967295L)) / 2.0f) * 0.0f) & 4294967295L) | (Math.round((1.0f + this.a) * (((int) (j3 >> 32)) / 2.0f)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof hi) || Float.compare(this.a, ((hi) obj).a) != 0 || Float.compare(-1.0f, -1.0f) != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.a + ", verticalBias=-1.0)";
    }
}
