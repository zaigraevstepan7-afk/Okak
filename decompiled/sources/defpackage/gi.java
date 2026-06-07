package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class gi implements h3 {
    public final float a;

    public gi(float f) {
        this.a = f;
    }

    @Override // defpackage.h3
    public final int a(int i, int i2, jq0 jq0Var) {
        return Math.round((1.0f + this.a) * ((i2 - i) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof gi) && Float.compare(this.a, ((gi) obj).a) == 0) {
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
