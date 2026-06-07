package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class nj0 {
    public static final nj0 g = new nj0(false, 0, true, 1, 1, ix0.g);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final ix0 f;

    public nj0(boolean z, int i, boolean z2, int i2, int i3, ix0 ix0Var) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = ix0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof nj0) {
                nj0 nj0Var = (nj0) obj;
                if (this.a == nj0Var.a && this.b == nj0Var.b && this.c == nj0Var.c && this.d == nj0Var.d && this.e == nj0Var.e && sn0.r(this.f, nj0Var.f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f.e.hashCode() + l90.b(this.e, l90.b(this.d, mb2.a(l90.b(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31), 961);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=");
        sb.append(this.a);
        sb.append(", capitalization=");
        int i = this.b;
        if (i == -1) {
            str = "Unspecified";
        } else if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Characters";
        } else if (i == 2) {
            str = "Words";
        } else if (i == 3) {
            str = "Sentences";
        } else {
            str = "Invalid";
        }
        sb.append((Object) str);
        sb.append(", autoCorrect=");
        sb.append(this.c);
        sb.append(", keyboardType=");
        sb.append((Object) wp0.a(this.d));
        sb.append(", imeAction=");
        sb.append((Object) mj0.a(this.e));
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.f);
        sb.append(')');
        return sb.toString();
    }
}
