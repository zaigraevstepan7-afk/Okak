package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ma0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public ma0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof ma0)) {
            ma0 ma0Var = (ma0) obj;
            if (f20.b(this.a, ma0Var.a) && f20.b(this.b, ma0Var.b) && f20.b(this.c, ma0Var.c)) {
                return f20.b(this.d, ma0Var.d);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + l90.a(this.c, l90.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }
}
