package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class vp0 {
    public static final vp0 d = new vp0(127);
    public final Boolean a;
    public final int b;
    public final int c;

    public vp0(int i) {
        int i2;
        int i3;
        Boolean bool = (i & 2) != 0 ? null : Boolean.FALSE;
        if ((i & 4) != 0) {
            i2 = 0;
        } else {
            i2 = 2;
        }
        if ((i & 8) != 0) {
            i3 = -1;
        } else {
            i3 = 7;
        }
        this.a = bool;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vp0) {
                vp0 vp0Var = (vp0) obj;
                if (sn0.r(this.a, vp0Var.a) && this.b == vp0Var.b && this.c == vp0Var.c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = Integer.hashCode(-1) * 31;
        Boolean bool = this.a;
        if (bool != null) {
            i = bool.hashCode();
        } else {
            i = 0;
        }
        return l90.b(this.c, l90.b(this.b, (hashCode + i) * 31, 31), 29791);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) "Unspecified") + ", autoCorrectEnabled=" + this.a + ", keyboardType=" + ((Object) wp0.a(this.b)) + ", imeAction=" + ((Object) mj0.a(this.c)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}
