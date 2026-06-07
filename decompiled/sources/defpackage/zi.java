package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zi {
    public final float a;
    public final i12 b;

    public zi(float f, i12 i12Var) {
        this.a = f;
        this.b = i12Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zi) {
                zi ziVar = (zi) obj;
                if (!f20.b(this.a, ziVar.a) || !this.b.equals(ziVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) f20.c(this.a)) + ", brush=" + this.b + ')';
    }
}
