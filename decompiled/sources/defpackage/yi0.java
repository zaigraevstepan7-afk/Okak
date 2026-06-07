package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class yi0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public yi0(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof yi0)) {
            return false;
        }
        yi0 yi0Var = (yi0) obj;
        if (co.c(this.a, yi0Var.a) && co.c(this.b, yi0Var.b) && co.c(this.c, yi0Var.c) && co.c(this.d, yi0Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = co.h;
        return Long.hashCode(this.d) + l90.e(this.c, l90.e(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }
}
