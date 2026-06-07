package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class g20 implements uu {
    public final float a;

    public g20(float f) {
        this.a = f;
    }

    @Override // defpackage.uu
    public final float a(long j, c00 c00Var) {
        return c00Var.W(this.a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof g20) || !f20.b(this.a, ((g20) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
