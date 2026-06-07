package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ki implements i3 {
    public final float a;
    public final float b;

    public ki(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.i3
    public final long a(long j, long j2, jq0 jq0Var) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        jq0 jq0Var2 = jq0.e;
        float f3 = this.a;
        if (jq0Var != jq0Var2) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.b) * f2;
        int round = Math.round((f3 + 1.0f) * f);
        return (Math.round(f4) & 4294967295L) | (round << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki)) {
            return false;
        }
        ki kiVar = (ki) obj;
        if (Float.compare(this.a, kiVar.a) == 0 && Float.compare(this.b, kiVar.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.a);
        sb.append(", verticalBias=");
        return l90.n(sb, this.b, ')');
    }
}
