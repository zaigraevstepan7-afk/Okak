package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class xp0 {
    public final Float a;
    public x40 b;

    public xp0(Float f, x40 x40Var) {
        this.a = f;
        this.b = x40Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xp0) {
            xp0 xp0Var = (xp0) obj;
            if (xp0Var.a.equals(this.a) && sn0.r(xp0Var.b, this.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + l90.b(0, this.a.hashCode() * 31, 31);
    }
}
