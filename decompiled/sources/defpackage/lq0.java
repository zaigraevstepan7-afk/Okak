package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class lq0 {
    public final int a;
    public final int b;
    public final boolean c;

    public lq0(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq0)) {
            return false;
        }
        lq0 lq0Var = (lq0) obj;
        if (this.a == lq0Var.a && this.b == lq0Var.b && this.c == lq0Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + l90.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "BidiRun(start=" + this.a + ", end=" + this.b + ", isRtl=" + this.c + ')';
    }
}
