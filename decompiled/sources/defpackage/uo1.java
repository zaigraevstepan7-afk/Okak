package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class uo1 {
    public final long a = co.g;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof uo1) {
                if (!co.c(this.a, ((uo1) obj).a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = co.h;
        return Long.hashCode(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) co.i(this.a)) + ", rippleAlpha=null)";
    }
}
