package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class t32 {
    public static final boolean a;

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 34) {
            z = true;
        } else {
            z = false;
        }
        a = z;
    }
}
