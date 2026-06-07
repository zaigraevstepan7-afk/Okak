package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class vc1 {
    public final p31 a;
    public final p31 b;
    public int c;
    public int d;

    public vc1(wc0 wc0Var, vs0 vs0Var, kd1 kd1Var) {
        p31 p31Var = wm0.a;
        this.a = new p31();
        new q31();
        this.b = new p31();
        this.c = Integer.MAX_VALUE;
        this.d = Integer.MIN_VALUE;
    }

    public final void a() {
        this.c = Integer.MAX_VALUE;
        this.d = Integer.MIN_VALUE;
        this.b.c();
        p31 p31Var = this.a;
        long[] jArr = p31Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            int i5 = p31Var.b[i4];
                            List list = (List) p31Var.c[i4];
                            int size = list.size();
                            for (int i6 = 0; i6 < size; i6++) {
                                ((us0) list.get(i6)).cancel();
                            }
                            p31Var.h(i4);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
