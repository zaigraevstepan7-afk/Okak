package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class xz0 {
    public final long a;
    public final tu b;

    public xz0(long j, tu tuVar) {
        this.a = j;
        this.b = tuVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xz0) {
                xz0 xz0Var = (xz0) obj;
                if (!z81.b(this.a, xz0Var.a) || !sn0.r(this.b, xz0Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PointNRound(o=" + ((Object) z81.g(this.a)) + ", r=" + this.b + ')';
    }
}
