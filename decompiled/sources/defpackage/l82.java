package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class l82 {
    public static final l82 c = new l82(1.0f, 0.0f);
    public final float a;
    public final float b;

    public l82(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l82)) {
            return false;
        }
        l82 l82Var = (l82) obj;
        if (this.a == l82Var.a && this.b == l82Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.a);
        sb.append(", skewX=");
        return l90.n(sb, this.b, ')');
    }
}
