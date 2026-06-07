package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class bd2 implements Comparable {
    public static final ad2 f = new Object();
    public final long e;

    public /* synthetic */ bd2(long j) {
        this.e = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return sn0.C(this.e ^ Long.MIN_VALUE, ((bd2) obj).e ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bd2) {
            if (this.e != ((bd2) obj).e) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e);
    }

    public final String toString() {
        return yq1.B(10, this.e);
    }
}
