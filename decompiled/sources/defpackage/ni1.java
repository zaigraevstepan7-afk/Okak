package defpackage;

import android.os.Build;
import java.util.Locale;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class ni1 {
    public static final mi1 a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        mi1 mi1Var;
        String str = Build.FINGERPRINT;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.equals("robolectric")) {
                mi1Var = new Object();
                a = mi1Var;
            }
        }
        mi1Var = null;
        a = mi1Var;
    }
}
