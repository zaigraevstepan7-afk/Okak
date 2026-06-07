package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class eh1 {
    public final zg1 a;
    public final rg1 b;

    public eh1(zg1 zg1Var, rg1 rg1Var) {
        this.a = zg1Var;
        this.b = rg1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh1)) {
            return false;
        }
        eh1 eh1Var = (eh1) obj;
        if (sn0.r(this.b, eh1Var.b) && sn0.r(this.a, eh1Var.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        zg1 zg1Var = this.a;
        if (zg1Var != null) {
            i = zg1Var.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        rg1 rg1Var = this.b;
        if (rg1Var != null) {
            i2 = rg1Var.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ')';
    }
}
