package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class my1 {
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

    public my1(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
    }

    public final long a(boolean z, boolean z2) {
        if (z) {
            if (z2) {
                return this.b;
            }
            return this.d;
        }
        if (z2) {
            return this.g;
        }
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof my1)) {
            return false;
        }
        my1 my1Var = (my1) obj;
        if (co.c(this.a, my1Var.a) && co.c(this.b, my1Var.b) && co.c(this.c, my1Var.c) && co.c(this.d, my1Var.d) && co.c(this.e, my1Var.e) && co.c(this.f, my1Var.f) && co.c(this.g, my1Var.g) && co.c(this.h, my1Var.h) && co.c(this.i, my1Var.i) && co.c(this.j, my1Var.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = co.h;
        return Long.hashCode(this.j) + l90.e(this.i, l90.e(this.h, l90.e(this.g, l90.e(this.f, l90.e(this.e, l90.e(this.d, l90.e(this.c, l90.e(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
