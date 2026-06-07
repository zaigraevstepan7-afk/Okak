package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class z00 {
    public final boolean a = true;
    public final boolean b = true;
    public final ct1 c = ct1.e;
    public final boolean d = true;
    public final boolean e = true;
    public final String f = "";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof z00) {
                z00 z00Var = (z00) obj;
                if (this.a != z00Var.a || this.b != z00Var.b || this.c != z00Var.c || this.d != z00Var.d || this.e != z00Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + mb2.a((this.c.hashCode() + mb2.a(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d);
    }
}
