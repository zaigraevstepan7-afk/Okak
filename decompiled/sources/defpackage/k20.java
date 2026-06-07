package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class k20 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k20) && f20.b(10.0f, 10.0f) && f20.b(40.0f, 40.0f) && f20.b(10.0f, 10.0f) && f20.b(40.0f, 40.0f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + l90.a(40.0f, l90.a(10.0f, l90.a(40.0f, Float.hashCode(10.0f) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) f20.c(10.0f)) + ", top=" + ((Object) f20.c(40.0f)) + ", end=" + ((Object) f20.c(10.0f)) + ", bottom=" + ((Object) f20.c(40.0f)) + ", isLayoutDirectionAware=true)";
    }
}
