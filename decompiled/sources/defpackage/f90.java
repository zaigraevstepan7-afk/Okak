package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class f90 {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: Type inference failed for: r0v2, types: [ng1, java.lang.Object] */
    static {
        if (ng1.a == null) {
            try {
                if ("The Android Project".equalsIgnoreCase(System.getProperty("java.vendor"))) {
                    int i = q8.b;
                    ng1.a = (ng1) q8.class.newInstance();
                } else {
                    ng1.a = (ng1) Class.forName("com.google.android.filament.DesktopPlatform").newInstance();
                }
            } catch (Exception unused) {
            }
            if (ng1.a == null) {
                ng1.a = new Object();
            }
        }
        System.loadLibrary("filament-jni");
    }
}
