package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class s01 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;

    public s01(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7 = co.g;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j7;
        this.i = j7;
        this.j = j7;
        this.k = j7;
        this.l = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof s01)) {
            return false;
        }
        s01 s01Var = (s01) obj;
        if (co.c(this.a, s01Var.a) && co.c(this.g, s01Var.g) && co.c(this.b, s01Var.b) && co.c(this.c, s01Var.c) && co.c(this.d, s01Var.d) && co.c(this.e, s01Var.e) && co.c(this.f, s01Var.f) && co.c(this.h, s01Var.h) && co.c(this.i, s01Var.i) && co.c(this.j, s01Var.j) && co.c(this.k, s01Var.k) && co.c(this.l, s01Var.l)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = co.h;
        return Long.hashCode(this.l) + l90.e(this.k, l90.e(this.j, l90.e(this.i, l90.e(this.h, l90.e(this.f, l90.e(this.e, l90.e(this.d, l90.e(this.c, l90.e(this.b, l90.e(this.g, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
