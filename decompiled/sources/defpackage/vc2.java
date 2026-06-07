package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class vc2 implements Comparable {
    public static final uc2 f = new Object();
    public final byte e;

    public /* synthetic */ vc2(byte b) {
        this.e = b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return sn0.B(this.e & 255, ((vc2) obj).e & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vc2) {
            if (this.e != ((vc2) obj).e) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.e);
    }

    public final String toString() {
        return String.valueOf(this.e & 255);
    }
}
