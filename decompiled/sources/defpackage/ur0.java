package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ur0 {
    public final int a;
    public final int b;

    public ur0(int i, int i2) {
        boolean z;
        this.a = i;
        this.b = i2;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            nl0.a("negative start index");
        }
        if (!(i2 >= i)) {
            nl0.a("end index greater than start");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur0)) {
            return false;
        }
        ur0 ur0Var = (ur0) obj;
        if (this.a == ur0Var.a && this.b == ur0Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.a);
        sb.append(", end=");
        return l90.o(sb, this.b, ')');
    }
}
