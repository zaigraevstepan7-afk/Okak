package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class mc2 {
    public final g52 a;
    public final sd0 b;
    public final int c;
    public final int d;
    public final Object e;

    public mc2(g52 g52Var, sd0 sd0Var, int i, int i2, Object obj) {
        this.a = g52Var;
        this.b = sd0Var;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mc2)) {
            return false;
        }
        mc2 mc2Var = (mc2) obj;
        if (sn0.r(this.a, mc2Var.a) && sn0.r(this.b, mc2Var.b) && this.c == mc2Var.c && this.d == mc2Var.d && sn0.r(this.e, mc2Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        g52 g52Var = this.a;
        if (g52Var == null) {
            hashCode = 0;
        } else {
            hashCode = g52Var.hashCode();
        }
        int b = l90.b(this.d, l90.b(this.c, ((hashCode * 31) + this.b.e) * 31, 31), 31);
        Object obj = this.e;
        if (obj != null) {
            i = obj.hashCode();
        }
        return b + i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        String str2 = "Invalid";
        int i = this.c;
        if (i == 0) {
            str = "Normal";
        } else if (i != 1) {
            str = "Invalid";
        } else {
            str = "Italic";
        }
        sb.append((Object) str);
        sb.append(", fontSynthesis=");
        int i2 = this.d;
        if (i2 == 0) {
            str2 = "None";
        } else if (i2 == 1) {
            str2 = "Weight";
        } else if (i2 == 2) {
            str2 = "Style";
        } else if (i2 == 65535) {
            str2 = "All";
        }
        sb.append((Object) str2);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
