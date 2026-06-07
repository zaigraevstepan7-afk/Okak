package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class aa0 {
    public final float a;
    public final float b;
    public final long c;

    public aa0(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa0)) {
            return false;
        }
        aa0 aa0Var = (aa0) obj;
        if (Float.compare(this.a, aa0Var.a) == 0 && Float.compare(this.b, aa0Var.b) == 0 && this.c == aa0Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + l90.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.a + ", distance=" + this.b + ", duration=" + this.c + ')';
    }
}
