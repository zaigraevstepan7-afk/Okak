package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class jh {
    public final float a;

    public final boolean equals(Object obj) {
        if (obj instanceof jh) {
            if (Float.compare(this.a, ((jh) obj).a) != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.a + ')';
    }
}
