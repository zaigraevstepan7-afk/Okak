package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class ke {
    public static final boolean a;

    static {
        String str;
        String[] strArr = Build.SUPPORTED_ABIS;
        strArr.getClass();
        if (strArr.length == 0) {
            str = null;
        } else {
            str = strArr[0];
        }
        a = sn0.r(str, "x86_64");
    }
}
