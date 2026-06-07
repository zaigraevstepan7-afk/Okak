package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class as implements zr {
    public final wr e;

    public as(wr wrVar) {
        this.e = wrVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof as) {
            if (this.e.equals(((as) obj).e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() * 31;
    }
}
