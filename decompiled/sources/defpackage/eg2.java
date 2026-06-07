package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class eg2 {
    public static final /* synthetic */ int a = 0;

    static {
        new WeakHashMap();
    }

    public static void a(View view, uh2 uh2Var) {
        vh2 vh2Var;
        if (uh2Var != null) {
            vh2Var = new vh2(uh2Var);
        } else {
            vh2Var = null;
        }
        view.setWindowInsetsAnimationCallback(vh2Var);
    }
}
