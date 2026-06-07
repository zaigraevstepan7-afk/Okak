package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class qe1 extends jf1 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public qe1(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = z;
        this.g = z2;
        this.h = f4;
        this.i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe1)) {
            return false;
        }
        qe1 qe1Var = (qe1) obj;
        if (Float.compare(this.c, qe1Var.c) == 0 && Float.compare(this.d, qe1Var.d) == 0 && Float.compare(this.e, qe1Var.e) == 0 && this.f == qe1Var.f && this.g == qe1Var.g && Float.compare(this.h, qe1Var.h) == 0 && Float.compare(this.i, qe1Var.i) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + l90.a(this.h, mb2.a(mb2.a(l90.a(this.e, l90.a(this.d, Float.hashCode(this.c) * 31, 31), 31), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.d);
        sb.append(", theta=");
        sb.append(this.e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f);
        sb.append(", isPositiveArc=");
        sb.append(this.g);
        sb.append(", arcStartX=");
        sb.append(this.h);
        sb.append(", arcStartY=");
        return l90.n(sb, this.i, ')');
    }
}
