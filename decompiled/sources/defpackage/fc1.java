package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fc1 {
    public final long a;
    public final rc1 b;

    public fc1() {
        long c = go.c(4284900966L);
        rc1 k = sn0.k(3, 0.0f);
        this.a = c;
        this.b = k;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (fc1.class.equals(cls)) {
                obj.getClass();
                fc1 fc1Var = (fc1) obj;
                if (!co.c(this.a, fc1Var.a) || !sn0.r(this.b, fc1Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = co.h;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        l90.u(this.a, sb, ", drawPadding=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
