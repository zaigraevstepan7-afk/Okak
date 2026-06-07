package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class af1 extends jf1 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public af1(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af1)) {
            return false;
        }
        af1 af1Var = (af1) obj;
        if (Float.compare(this.c, af1Var.c) == 0 && Float.compare(this.d, af1Var.d) == 0 && Float.compare(this.e, af1Var.e) == 0 && Float.compare(this.f, af1Var.f) == 0 && Float.compare(this.g, af1Var.g) == 0 && Float.compare(this.h, af1Var.h) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + l90.a(this.g, l90.a(this.f, l90.a(this.e, l90.a(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.c);
        sb.append(", dy1=");
        sb.append(this.d);
        sb.append(", dx2=");
        sb.append(this.e);
        sb.append(", dy2=");
        sb.append(this.f);
        sb.append(", dx3=");
        sb.append(this.g);
        sb.append(", dy3=");
        return l90.n(sb, this.h, ')');
    }
}
