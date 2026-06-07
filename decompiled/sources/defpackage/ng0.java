package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class ng0 {
    public static final /* synthetic */ int a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object fo1Var;
        try {
            fo1Var = new mg0(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            fo1Var = new fo1(th);
        }
        if (fo1Var instanceof fo1) {
            fo1Var = null;
        }
    }

    public static final Handler a(Looper looper) {
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        invoke.getClass();
        return (Handler) invoke;
    }
}
