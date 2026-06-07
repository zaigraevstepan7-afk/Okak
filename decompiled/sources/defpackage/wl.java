package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class wl {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public wl(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof wl)) {
            return false;
        }
        wl wlVar = (wl) obj;
        if (co.c(this.a, wlVar.a) && co.c(this.b, wlVar.b) && co.c(this.c, wlVar.c) && co.c(this.d, wlVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = co.h;
        return Long.hashCode(this.d) + l90.e(this.c, l90.e(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }
}
