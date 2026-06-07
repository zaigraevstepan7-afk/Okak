package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class iz1 {
    public static final int a(ArrayList arrayList, int i, int i2) {
        int d = d(arrayList, i, i2);
        if (d >= 0) {
            return d;
        }
        return -(d + 1);
    }

    public static final int b(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void c(int[] iArr, int i, int i2) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final int d(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((p3) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int B = sn0.B(i5, i);
            if (B < 0) {
                i3 = i4 + 1;
            } else if (B > 0) {
                size = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i3 + 1);
    }

    public static final void e() {
        throw new ConcurrentModificationException();
    }
}
