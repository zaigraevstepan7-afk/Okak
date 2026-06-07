package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zd1 {
    public final i8 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public zd1(i8 i8Var, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = i8Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final pl1 a(pl1 pl1Var) {
        return pl1Var.i((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(this.f) & 4294967295L));
    }

    public final long b(long j, boolean z) {
        if (z) {
            long j2 = d92.b;
            if (d92.b(j, j2)) {
                return j2;
            }
        }
        int i = d92.c;
        int i2 = this.b;
        return fr1.a(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    public final pl1 c(pl1 pl1Var) {
        float f = -this.f;
        return pl1Var.i((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return go.p(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zd1) {
                zd1 zd1Var = (zd1) obj;
                if (this.a == zd1Var.a && this.b == zd1Var.b && this.c == zd1Var.c && this.d == zd1Var.d && this.e == zd1Var.e && Float.compare(this.f, zd1Var.f) == 0 && Float.compare(this.g, zd1Var.g) == 0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + l90.a(this.f, l90.b(this.e, l90.b(this.d, l90.b(this.c, l90.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        sb.append(this.c);
        sb.append(", startLineIndex=");
        sb.append(this.d);
        sb.append(", endLineIndex=");
        sb.append(this.e);
        sb.append(", top=");
        sb.append(this.f);
        sb.append(", bottom=");
        return l90.n(sb, this.g, ')');
    }
}
