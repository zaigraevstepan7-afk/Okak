package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class yi2 implements xi2 {
    public final g3 b;

    public yi2() {
        g3 g3Var;
        if (Build.VERSION.SDK_INT >= 34) {
            g3Var = g3.B;
        } else {
            g3Var = g3.C;
        }
        this.b = g3Var;
        xn.p(1, 2, 4, 8, 16, 32, 64, 128);
    }
}
