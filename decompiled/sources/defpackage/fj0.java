package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fj0 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof fj0) {
            if (this.a != ((fj0) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "Argb8888";
        }
        if (i == 1) {
            return "Alpha8";
        }
        if (i == 2) {
            return "Rgb565";
        }
        if (i == 3) {
            return "F16";
        }
        if (i == 4) {
            return "Gpu";
        }
        return "Unknown";
    }
}
