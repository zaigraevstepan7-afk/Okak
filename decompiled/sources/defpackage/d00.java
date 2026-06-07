package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class d00 implements c00 {
    public final float e;
    public final float f;

    public d00(float f, float f2) {
        this.e = f;
        this.f = f2;
    }

    @Override // defpackage.c00
    public final float P() {
        return this.f;
    }

    @Override // defpackage.c00
    public final float a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d00)) {
            return false;
        }
        d00 d00Var = (d00) obj;
        if (Float.compare(this.e, d00Var.e) == 0 && Float.compare(this.f, d00Var.f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + (Float.hashCode(this.e) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.e);
        sb.append(", fontScale=");
        return l90.n(sb, this.f, ')');
    }
}
