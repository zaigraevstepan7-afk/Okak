package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class y11 {
    public final ct1 a = ct1.e;
    public final boolean b = true;
    public final boolean c = true;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof y11) {
                y11 y11Var = (y11) obj;
                if (this.a != y11Var.a || this.c != y11Var.c || this.b != y11Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + mb2.a(this.a.hashCode() * 31, 29791, this.b);
    }
}
