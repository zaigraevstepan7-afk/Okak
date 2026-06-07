package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class rn {
    public final float a;
    public final float b;

    public rn(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static boolean a(Float f, Float f2) {
        if (f.floatValue() <= f2.floatValue()) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rn) {
            float f = this.a;
            float f2 = this.b;
            if (f > f2) {
                rn rnVar = (rn) obj;
                if (rnVar.a > rnVar.b) {
                    return true;
                }
            }
            rn rnVar2 = (rn) obj;
            if (f == rnVar2.a && f2 == rnVar2.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        float f = this.a;
        float f2 = this.b;
        if (f > f2) {
            return -1;
        }
        return Float.hashCode(f2) + (Float.hashCode(f) * 31);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
