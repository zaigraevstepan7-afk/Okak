package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class w21 {
    public final long a;
    public final long b;
    public final boolean c;

    public w21(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final w21 a(w21 w21Var) {
        return new w21(z81.e(this.a, w21Var.a), Math.max(this.b, w21Var.b), this.c);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w21) {
                w21 w21Var = (w21) obj;
                if (!z81.b(this.a, w21Var.a) || this.b != w21Var.b || this.c != w21Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + l90.e(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) z81.g(this.a)) + ", timeMillis=" + this.b + ", shouldApplyImmediately=" + this.c + ')';
    }
}
