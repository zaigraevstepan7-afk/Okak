package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ue1 extends jf1 {
    public final float c;
    public final float d;

    public ue1(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue1)) {
            return false;
        }
        ue1 ue1Var = (ue1) obj;
        if (Float.compare(this.c, ue1Var.c) == 0 && Float.compare(this.d, ue1Var.d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.c);
        sb.append(", y=");
        return l90.n(sb, this.d, ')');
    }
}
