package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ip1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        hp.f(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public ip1(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ip1) {
                ip1 ip1Var = (ip1) obj;
                if (Float.compare(this.a, ip1Var.a) != 0 || Float.compare(this.b, ip1Var.b) != 0 || Float.compare(this.c, ip1Var.c) != 0 || Float.compare(this.d, ip1Var.d) != 0 || !xn.w(this.e, ip1Var.e) || !xn.w(this.f, ip1Var.f) || !xn.w(this.g, ip1Var.g) || !xn.w(this.h, ip1Var.h)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + l90.e(this.g, l90.e(this.f, l90.e(this.e, l90.a(this.d, l90.a(this.c, l90.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String str = go.W(this.a) + ", " + go.W(this.b) + ", " + go.W(this.c) + ", " + go.W(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean w = xn.w(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (w && xn.w(j2, j3) && xn.w(j3, j4)) {
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
                return "RoundRect(rect=" + str + ", radius=" + go.W(Float.intBitsToFloat(i)) + ')';
            }
            return "RoundRect(rect=" + str + ", x=" + go.W(Float.intBitsToFloat(i)) + ", y=" + go.W(Float.intBitsToFloat(i2)) + ')';
        }
        return "RoundRect(rect=" + str + ", topLeft=" + ((Object) xn.V(j)) + ", topRight=" + ((Object) xn.V(j2)) + ", bottomRight=" + ((Object) xn.V(j3)) + ", bottomLeft=" + ((Object) xn.V(j4)) + ')';
    }
}
