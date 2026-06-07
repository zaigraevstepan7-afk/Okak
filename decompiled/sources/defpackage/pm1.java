package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import defpackage.rm1;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class pm1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, mu0 mu0Var) {
        mu0Var.getClass();
        if (activity instanceof uu0) {
            wu0 g = ((uu0) activity).g();
            if (g instanceof wu0) {
                g.d(mu0Var);
            }
        }
    }

    public static void b(Activity activity) {
        rm1.a.Companion.getClass();
        activity.registerActivityLifecycleCallbacks(new rm1.a());
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new rm1(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
