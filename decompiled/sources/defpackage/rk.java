package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class rk {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public rk(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final rk a(long j, long j2, long j3, long j4) {
        long j5;
        long j6;
        long j7;
        long j8;
        if (j != 16) {
            j5 = j;
        } else {
            j5 = this.a;
        }
        if (j2 != 16) {
            j6 = j2;
        } else {
            j6 = this.b;
        }
        if (j3 != 16) {
            j7 = j3;
        } else {
            j7 = this.c;
        }
        if (j4 != 16) {
            j8 = j4;
        } else {
            j8 = this.d;
        }
        return new rk(j5, j6, j7, j8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof rk)) {
            return false;
        }
        rk rkVar = (rk) obj;
        if (co.c(this.a, rkVar.a) && co.c(this.b, rkVar.b) && co.c(this.c, rkVar.c) && co.c(this.d, rkVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = co.h;
        return Long.hashCode(this.d) + l90.e(this.c, l90.e(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }
}
