package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class fy {
    public static final oz a;

    static {
        String str;
        boolean z;
        oz ozVar;
        int i = j52.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            z = Boolean.parseBoolean(str);
        } else {
            z = false;
        }
        if (!z) {
            ozVar = ey.n;
        } else {
            vy vyVar = k10.a;
            mg0 mg0Var = gz0.a;
            mg0 mg0Var2 = mg0Var.j;
            ozVar = mg0Var;
            if (mg0Var == null) {
                ozVar = ey.n;
            }
        }
        a = ozVar;
    }
}
