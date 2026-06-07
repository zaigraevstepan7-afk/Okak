package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ed2 implements Comparable {
    public static final dd2 f = new Object();
    public final short e;

    public /* synthetic */ ed2(short s) {
        this.e = s;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return sn0.B(this.e & 65535, ((ed2) obj).e & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ed2) {
            if (this.e != ((ed2) obj).e) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.e);
    }

    public final String toString() {
        return String.valueOf(this.e & 65535);
    }
}
