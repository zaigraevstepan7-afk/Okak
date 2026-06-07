package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class pl1 {
    public static final pl1 e = new pl1(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public pl1(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean a(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        boolean z4 = false;
        if (intBitsToFloat >= this.a) {
            z = true;
        } else {
            z = false;
        }
        if (intBitsToFloat < this.c) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z & z2;
        if (intBitsToFloat2 >= this.b) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 & z3;
        if (intBitsToFloat2 < this.d) {
            z4 = true;
        }
        return z6 & z4;
    }

    public final long b() {
        float f = this.c;
        float f2 = this.a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        return (Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final long c() {
        float f = this.c - this.a;
        float f2 = this.d - this.b;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final long d() {
        return (Float.floatToRawIntBits(this.a) << 32) | (Float.floatToRawIntBits(this.b) & 4294967295L);
    }

    public final pl1 e(pl1 pl1Var) {
        return new pl1(Math.max(this.a, pl1Var.a), Math.max(this.b, pl1Var.b), Math.min(this.c, pl1Var.c), Math.min(this.d, pl1Var.d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl1)) {
            return false;
        }
        pl1 pl1Var = (pl1) obj;
        if (Float.compare(this.a, pl1Var.a) == 0 && Float.compare(this.b, pl1Var.b) == 0 && Float.compare(this.c, pl1Var.c) == 0 && Float.compare(this.d, pl1Var.d) == 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        boolean z;
        boolean z2 = false;
        if (this.a >= this.c) {
            z = true;
        } else {
            z = false;
        }
        if (this.b >= this.d) {
            z2 = true;
        }
        return z | z2;
    }

    public final boolean g(pl1 pl1Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (this.a < pl1Var.c) {
            z = true;
        } else {
            z = false;
        }
        if (pl1Var.a < this.c) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z & z2;
        if (this.b < pl1Var.d) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 & z3;
        if (pl1Var.b < this.d) {
            z4 = true;
        }
        return z6 & z4;
    }

    public final pl1 h(float f, float f2) {
        return new pl1(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + l90.a(this.c, l90.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final pl1 i(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new pl1(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + go.W(this.a) + ", " + go.W(this.b) + ", " + go.W(this.c) + ", " + go.W(this.d) + ')';
    }
}
