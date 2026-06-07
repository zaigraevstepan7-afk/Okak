package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class jj2 {
    public static final jj2 b = new jj2(0);
    public static final jj2 c = new jj2(1);
    public static final jj2 d = new jj2(2);
    public final int a;

    public jj2(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && jj2.class == obj.getClass() && this.a == ((jj2) obj).a) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        String str;
        if (equals(b)) {
            str = "COMPACT";
        } else if (equals(c)) {
            str = "MEDIUM";
        } else if (equals(d)) {
            str = "EXPANDED";
        } else {
            str = "UNKNOWN";
        }
        return "WindowWidthSizeClass: ".concat(str);
    }
}
