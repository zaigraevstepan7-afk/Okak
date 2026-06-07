package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class vt1 {
    public final um1 a;
    public final int b;
    public final long c;

    public vt1(um1 um1Var, int i, long j) {
        this.a = um1Var;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt1)) {
            return false;
        }
        vt1 vt1Var = (vt1) obj;
        if (this.a == vt1Var.a && this.b == vt1Var.b && this.c == vt1Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + l90.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.a + ", offset=" + this.b + ", selectableId=" + this.c + ')';
    }
}
