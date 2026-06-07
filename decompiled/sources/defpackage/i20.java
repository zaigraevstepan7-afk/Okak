package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class i20 {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof i20) {
            if (this.a != ((i20) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long j = this.a;
        if (j != 9205357640488583168L) {
            return "(" + ((Object) f20.c(Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((Object) f20.c(Float.intBitsToFloat((int) (4294967295L & j)))) + ')';
        }
        return "DpOffset.Unspecified";
    }
}
