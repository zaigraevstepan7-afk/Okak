package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class n92 {
    public static final o92[] b = {new o92(0), new o92(4294967296L), new o92(8589934592L)};
    public static final long c = pp1.C(0, Float.NaN);
    public final long a;

    public static final boolean a(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final long b(long j) {
        return b[(int) ((j & 1095216660480L) >>> 32)].a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        long b2 = b(j);
        if (o92.a(b2, 0L)) {
            return "Unspecified";
        }
        if (o92.a(b2, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (o92.a(b2, 8589934592L)) {
            return c(j) + ".em";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n92) {
            if (this.a != ((n92) obj).a) {
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
