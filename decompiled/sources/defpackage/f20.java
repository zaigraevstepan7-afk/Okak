package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class f20 implements Comparable {
    public final float e;

    public static int a(float f, float f2) {
        if (!Float.isNaN(f) && !Float.isNaN(f2)) {
            return Float.compare(f, f2);
        }
        return 0;
    }

    public static final boolean b(float f, float f2) {
        if (Float.compare(f, f2) == 0) {
            return true;
        }
        return false;
    }

    public static String c(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return a(this.e, ((f20) obj).e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f20) {
            if (Float.compare(this.e, ((f20) obj).e) != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.e);
    }

    public final String toString() {
        return c(this.e);
    }
}
