package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class m31 {
    public float[] a;
    public int b;

    public m31(int i) {
        float[] fArr;
        if (i == 0) {
            fArr = ja0.a;
        } else {
            fArr = new float[i];
        }
        this.a = fArr;
    }

    public static String c(m31 m31Var, int i) {
        String str;
        String str2 = "";
        if ((i & 2) != 0) {
            str = "";
        } else {
            str = "[";
        }
        if ((i & 4) == 0) {
            str2 = "]";
        }
        m31Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str);
        float[] fArr = m31Var.a;
        int i2 = m31Var.b;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                float f = fArr[i3];
                if (i3 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i3 != 0) {
                    sb.append((CharSequence) ", ");
                }
                sb.append(f);
                i3++;
            } else {
                sb.append((CharSequence) str2);
                break;
            }
        }
        return sb.toString();
    }

    public final void a(float f) {
        int i = this.b + 1;
        float[] fArr = this.a;
        if (fArr.length < i) {
            this.a = Arrays.copyOf(fArr, Math.max(i, (fArr.length * 3) / 2));
        }
        float[] fArr2 = this.a;
        int i2 = this.b;
        fArr2[i2] = f;
        this.b = i2 + 1;
    }

    public final float b(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        se.u("Index must be between 0 and size");
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m31) {
            m31 m31Var = (m31) obj;
            int i = m31Var.b;
            int i2 = this.b;
            if (i == i2) {
                float[] fArr = this.a;
                float[] fArr2 = m31Var.a;
                an0 X = go.X(0, i2);
                int i3 = X.e;
                int i4 = X.f;
                if (i3 <= i4) {
                    while (fArr[i3] == fArr2[i3]) {
                        if (i3 != i4) {
                            i3++;
                        } else {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        float[] fArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Float.hashCode(fArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        return c(this, 25);
    }
}
