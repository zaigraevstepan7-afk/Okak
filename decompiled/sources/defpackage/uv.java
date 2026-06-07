package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class uv {
    public final float[] a;

    public uv(float[] fArr) {
        this.a = fArr;
        if (fArr.length == 8) {
            return;
        }
        se.h("Points array size should be 8");
        throw null;
    }

    public final float a() {
        return this.a[6];
    }

    public final float b() {
        return this.a[7];
    }

    public final long c(float f) {
        float f2 = 1.0f - f;
        float[] fArr = this.a;
        float f3 = f2 * f2 * f2;
        float f4 = 3.0f * f;
        float f5 = f4 * f2 * f2;
        float f6 = f4 * f * f2;
        float f7 = (fArr[4] * f6) + (fArr[2] * f5) + (fArr[0] * f3);
        float f8 = f * f * f;
        return ha0.a((a() * f8) + f7, (b() * f8) + (fArr[5] * f6) + (fArr[3] * f5) + (fArr[1] * f3));
    }

    public final xd1 d(float f) {
        float f2 = 1.0f - f;
        long c = c(f);
        float[] fArr = this.a;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[2];
        float f6 = fArr[3];
        float f7 = f2 * f2;
        float f8 = 2.0f * f2 * f;
        float f9 = f * f;
        return new xd1(xn.a(f3, f4, (f5 * f) + (f3 * f2), (f6 * f) + (f4 * f2), (fArr[4] * f9) + (f5 * f8) + (f3 * f7), (fArr[5] * f9) + (f6 * f8) + (f4 * f7), lo.G(c), lo.H(c)), xn.a(lo.G(c), lo.H(c), (a() * f9) + (fArr[4] * f8) + (fArr[2] * f7), (b() * f9) + (fArr[5] * f8) + (fArr[3] * f7), (a() * f) + (fArr[4] * f2), (b() * f) + (fArr[5] * f2), a(), b()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [uv, l31] */
    public final l31 e(ih1 ih1Var) {
        float[] fArr = new float[8];
        ?? uvVar = new uv(fArr);
        bf.E(this.a, fArr, 14);
        uvVar.g(ih1Var, 0);
        uvVar.g(ih1Var, 2);
        uvVar.g(ih1Var, 4);
        uvVar.g(ih1Var, 6);
        return uvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv)) {
            return false;
        }
        return Arrays.equals(this.a, ((uv) obj).a);
    }

    public final boolean f() {
        float[] fArr = this.a;
        if (Math.abs(fArr[0] - a()) >= 1.0E-4f || Math.abs(fArr[1] - b()) >= 1.0E-4f) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("anchor0: (");
        float[] fArr = this.a;
        sb.append(fArr[0]);
        sb.append(", ");
        sb.append(fArr[1]);
        sb.append(") control0: (");
        sb.append(fArr[2]);
        sb.append(", ");
        sb.append(fArr[3]);
        sb.append("), control1: (");
        sb.append(fArr[4]);
        sb.append(", ");
        sb.append(fArr[5]);
        sb.append("), anchor1: (");
        sb.append(a());
        sb.append(", ");
        sb.append(b());
        sb.append(')');
        return sb.toString();
    }
}
