package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class rj1 {
    public final float a;
    public final e90 b;

    public rj1(float f, e90 e90Var) {
        e90Var.getClass();
        this.a = f;
        this.b = e90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj1)) {
            return false;
        }
        rj1 rj1Var = (rj1) obj;
        if (Float.compare(this.a, rj1Var.a) == 0 && sn0.r(this.b, rj1Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ProgressableFeature(progress=" + this.a + ", feature=" + this.b + ')';
    }
}
