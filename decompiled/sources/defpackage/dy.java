package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class dy {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public dy(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy)) {
            return false;
        }
        dy dyVar = (dy) obj;
        if (!co.c(this.a, dyVar.a) || !co.c(this.b, dyVar.b) || !co.c(this.c, dyVar.c) || !co.c(this.d, dyVar.d) || !co.c(this.e, dyVar.e) || !co.c(this.f, dyVar.f) || !co.c(this.g, dyVar.g)) {
            return false;
        }
        return co.c(this.h, dyVar.h);
    }

    public final int hashCode() {
        int i = co.h;
        return Long.hashCode(this.h) + l90.e(this.g, l90.e(this.f, l90.e(this.e, l90.e(this.d, l90.e(this.c, l90.e(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }
}
