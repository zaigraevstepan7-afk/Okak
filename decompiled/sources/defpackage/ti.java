package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ti {
    public t7 a = null;
    public u4 b = null;
    public vl c = null;
    public n8 d = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ti) {
                ti tiVar = (ti) obj;
                if (!sn0.r(this.a, tiVar.a) || !sn0.r(this.b, tiVar.b) || !sn0.r(this.c, tiVar.c) || !sn0.r(this.d, tiVar.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        t7 t7Var = this.a;
        int i = 0;
        if (t7Var == null) {
            hashCode = 0;
        } else {
            hashCode = t7Var.hashCode();
        }
        int i2 = hashCode * 31;
        u4 u4Var = this.b;
        if (u4Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = u4Var.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        vl vlVar = this.c;
        if (vlVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = vlVar.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        n8 n8Var = this.d;
        if (n8Var != null) {
            i = n8Var.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }
}
