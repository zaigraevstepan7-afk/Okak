package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class rg1 {
    public static final rg1 c = new rg1(0, false);
    public final boolean a;
    public final int b;

    public rg1() {
        this.a = false;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg1)) {
            return false;
        }
        rg1 rg1Var = (rg1) obj;
        if (this.a == rg1Var.a && this.b == rg1Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + ((Object) f60.a(this.b)) + ')';
    }

    public rg1(int i, boolean z) {
        this.a = z;
        this.b = i;
    }
}
