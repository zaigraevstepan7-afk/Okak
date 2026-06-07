package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class o72 {
    public final ii a;
    public final ii b;

    public o72() {
        ii iiVar = g3.r;
        this.a = iiVar;
        this.b = iiVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o72) {
                o72 o72Var = (o72) obj;
                if (!sn0.r(this.a, o72Var.a) || !sn0.r(this.b, o72Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + l90.a(this.a.a, Boolean.hashCode(false) * 31, 31);
    }

    public final String toString() {
        return "Attached(alwaysMinimize=false, minimizedAlignment=" + this.a + ", expandedAlignment=" + this.b + ')';
    }
}
