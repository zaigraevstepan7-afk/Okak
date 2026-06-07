package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class gf1 extends jf1 {
    public final float c;
    public final float d;

    public gf1(float f, float f2) {
        super(1);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf1)) {
            return false;
        }
        gf1 gf1Var = (gf1) obj;
        if (Float.compare(this.c, gf1Var.c) == 0 && Float.compare(this.d, gf1Var.d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.c);
        sb.append(", dy=");
        return l90.n(sb, this.d, ')');
    }
}
