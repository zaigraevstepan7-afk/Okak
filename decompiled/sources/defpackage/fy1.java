package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fy1 {
    public final long a;

    public /* synthetic */ fy1(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final float b(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static final boolean c(long j) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (j == 9205357640488583168L) {
            z = true;
        } else {
            z = false;
        }
        if (Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = z | z2;
        if (Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f) {
            z3 = true;
        }
        return z4 | z3;
    }

    public static String d(long j) {
        if (j != 9205357640488583168L) {
            return "Size(" + go.W(Float.intBitsToFloat((int) (j >> 32))) + ", " + go.W(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
        }
        return "Size.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fy1) {
            if (this.a != ((fy1) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
