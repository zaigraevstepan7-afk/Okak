package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ua2 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public ua2(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ua2)) {
            return false;
        }
        ua2 ua2Var = (ua2) obj;
        if (co.c(this.a, ua2Var.a) && co.c(this.b, ua2Var.b) && co.c(this.c, ua2Var.c) && co.c(this.d, ua2Var.d) && co.c(this.e, ua2Var.e) && co.c(this.f, ua2Var.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = co.h;
        return Long.hashCode(this.f) + l90.e(this.e, l90.e(this.d, l90.e(this.c, l90.e(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31);
    }
}
