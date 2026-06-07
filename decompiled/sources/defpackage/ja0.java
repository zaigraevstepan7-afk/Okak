package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class ja0 {
    public static final float[] a;

    static {
        int i;
        long[] jArr = sr1.a;
        int d = sr1.d(0);
        if (d > 0) {
            i = Math.max(7, sr1.c(d));
        } else {
            i = 0;
        }
        if (i != 0) {
            int i2 = ((i + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        int i3 = i >> 3;
        long j = 255 << ((i & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        float[] fArr = new float[i];
        a = new float[0];
    }
}
