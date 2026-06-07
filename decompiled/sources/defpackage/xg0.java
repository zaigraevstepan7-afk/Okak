package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class xg0 {
    public final pl1 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public xg0(pl1 pl1Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = pl1Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xg0) {
                xg0 xg0Var = (xg0) obj;
                if (!this.a.equals(xg0Var.a) || this.b != xg0Var.b || this.c != xg0Var.c || this.d != xg0Var.d || this.e != xg0Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + mb2.a(mb2.a(mb2.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "HingeInfo(bounds=" + this.a + ", isFlat=" + this.b + ", isVertical=" + this.c + ", isSeparating=" + this.d + ", isOccluding=" + this.e + ')';
    }
}
