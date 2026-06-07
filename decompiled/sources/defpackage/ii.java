package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ii implements h3 {
    public final float a;

    public ii(float f) {
        this.a = f;
    }

    @Override // defpackage.h3
    public final int a(int i, int i2, jq0 jq0Var) {
        float f = (i2 - i) / 2.0f;
        jq0 jq0Var2 = jq0.e;
        float f2 = this.a;
        if (jq0Var != jq0Var2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ii) && Float.compare(this.a, ((ii) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return l90.n(new StringBuilder("Horizontal(bias="), this.a, ')');
    }
}
