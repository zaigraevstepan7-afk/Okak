package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class w80 {
    public final u90 a;

    public w80(u90 u90Var) {
        this.a = u90Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w80) {
                w80 w80Var = (w80) obj;
                if (Float.compare(0.0f, 0.0f) != 0 || !sn0.r(this.a, w80Var.a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.a + ')';
    }
}
