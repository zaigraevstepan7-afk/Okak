package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class b92 {
    public static final b92 c = new b92(2, false);
    public static final b92 d = new b92(1, true);
    public final int a;
    public final boolean b;

    public b92(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b92)) {
            return false;
        }
        b92 b92Var = (b92) obj;
        if (this.a == b92Var.a && this.b == b92Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        if (equals(c)) {
            return "TextMotion.Static";
        }
        if (equals(d)) {
            return "TextMotion.Animated";
        }
        return "Invalid";
    }
}
