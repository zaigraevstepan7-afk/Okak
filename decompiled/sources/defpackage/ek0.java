package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ek0 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof ek0) {
            if (this.a != ((ek0) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "IndirectPointerEventPrimaryDirectionalMotionAxis(value=" + this.a + ')';
    }
}
