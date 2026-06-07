package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class s31 {
    public long[] a;
    public int b;

    public s31(int i) {
        long[] jArr;
        if (i == 0) {
            jArr = oy0.a;
        } else {
            jArr = new long[i];
        }
        this.a = jArr;
    }

    public final void a(long j) {
        int i = this.b + 1;
        long[] jArr = this.a;
        if (jArr.length < i) {
            this.a = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.a;
        int i2 = this.b;
        jArr2[i2] = j;
        this.b = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s31) {
            s31 s31Var = (s31) obj;
            int i = s31Var.b;
            int i2 = this.b;
            if (i == i2) {
                long[] jArr = this.a;
                long[] jArr2 = s31Var.a;
                an0 X = go.X(0, i2);
                int i3 = X.e;
                int i4 = X.f;
                if (i3 <= i4) {
                    while (jArr[i3] == jArr2[i3]) {
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
        long[] jArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Long.hashCode(jArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                long j = jArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append((CharSequence) ", ");
                }
                sb.append(j);
                i2++;
            } else {
                sb.append((CharSequence) "]");
                break;
            }
        }
        return sb.toString();
    }
}
