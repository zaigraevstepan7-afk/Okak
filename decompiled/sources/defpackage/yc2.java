package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class yc2 implements Comparable {
    public static final xc2 f = new Object();
    public final int e;

    public /* synthetic */ yc2(int i) {
        this.e = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return sn0.B(this.e ^ Integer.MIN_VALUE, ((yc2) obj).e ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yc2) {
            if (this.e != ((yc2) obj).e) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e);
    }

    public final String toString() {
        return String.valueOf(this.e & 4294967295L);
    }
}
