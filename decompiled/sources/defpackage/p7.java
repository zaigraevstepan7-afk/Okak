package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class p7 implements tg1 {
    public final int e;

    public p7(int i) {
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof p7) && this.e == ((p7) obj).e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e);
    }

    public final String toString() {
        return l90.o(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.e, ')');
    }
}
