package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class kh2 implements x01 {
    public final gi a;

    public kh2(gi giVar) {
        this.a = giVar;
    }

    @Override // defpackage.x01
    public final int a(bn0 bn0Var, long j, int i, jq0 jq0Var) {
        float f;
        int i2 = (int) (j >> 32);
        if (i >= i2) {
            float f2 = (i2 - i) / 2.0f;
            if (jq0Var == jq0.e) {
                f = 0.0f;
            } else {
                f = -0.0f;
            }
            return Math.round((1.0f + f) * f2);
        }
        return go.p(this.a.a(i, i2, jq0Var), 0, i2 - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof kh2) && this.a.equals(((kh2) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.a + ", margin=0)";
    }
}
