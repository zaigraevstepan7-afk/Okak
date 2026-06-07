package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class iv0 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof iv0) {
            if (this.a != ((iv0) obj).a) {
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
        int i = this.a;
        if (i == 1) {
            return "LineHeightStyle.Trim.FirstLineTop";
        }
        if (i == 16) {
            return "LineHeightStyle.Trim.LastLineBottom";
        }
        if (i == 17) {
            return "LineHeightStyle.Trim.Both";
        }
        if (i == 0) {
            return "LineHeightStyle.Trim.None";
        }
        return "Invalid";
    }
}
