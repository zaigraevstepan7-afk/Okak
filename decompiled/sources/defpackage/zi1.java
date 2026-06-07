package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zi1 {
    public final int a;

    public zi1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zi1)) {
            return false;
        }
        if (this.a != ((zi1) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }
}
