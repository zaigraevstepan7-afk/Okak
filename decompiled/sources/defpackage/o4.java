package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class o4 extends rp1 {
    public final int c;

    public o4(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o4) && ((o4) obj).c == this.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c * 31;
    }
}
