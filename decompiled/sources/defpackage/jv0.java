package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class jv0 {
    public static final jv0 d = new jv0(gv0.c, 17, 0);
    public final float a;
    public final int b;
    public final int c;

    public jv0(float f, int i, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv0)) {
            return false;
        }
        jv0 jv0Var = (jv0) obj;
        float f = jv0Var.a;
        float f2 = gv0.b;
        if (Float.compare(this.a, f) == 0 && this.b == jv0Var.b && this.c == jv0Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        float f = gv0.b;
        return Integer.hashCode(this.c) + l90.b(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) gv0.b(this.a));
        sb.append(", trim=");
        String str2 = "Invalid";
        int i = this.b;
        if (i == 1) {
            str = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i == 16) {
            str = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i == 17) {
            str = "LineHeightStyle.Trim.Both";
        } else if (i != 0) {
            str = "Invalid";
        } else {
            str = "LineHeightStyle.Trim.None";
        }
        sb.append((Object) str);
        sb.append(",mode=");
        int i2 = this.c;
        if (i2 == 0) {
            str2 = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str2 = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str2 = "LineHeightStyle.Mode.Tight";
        }
        sb.append((Object) str2);
        sb.append(')');
        return sb.toString();
    }
}
