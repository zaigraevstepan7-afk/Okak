package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class wt1 {
    public final vt1 a;
    public final vt1 b;
    public final boolean c;

    public wt1(vt1 vt1Var, vt1 vt1Var2, boolean z) {
        this.a = vt1Var;
        this.b = vt1Var2;
        this.c = z;
    }

    public static wt1 a(wt1 wt1Var, vt1 vt1Var, vt1 vt1Var2, boolean z, int i) {
        if ((i & 1) != 0) {
            vt1Var = wt1Var.a;
        }
        if ((i & 2) != 0) {
            vt1Var2 = wt1Var.b;
        }
        wt1Var.getClass();
        return new wt1(vt1Var, vt1Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt1)) {
            return false;
        }
        wt1 wt1Var = (wt1) obj;
        if (sn0.r(this.a, wt1Var.a) && sn0.r(this.b, wt1Var.b) && this.c == wt1Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.a + ", end=" + this.b + ", handlesCrossed=" + this.c + ')';
    }
}
