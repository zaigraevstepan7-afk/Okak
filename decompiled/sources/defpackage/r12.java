package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import com.elixir.loader.MainActivity;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class r12 implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ MainActivity a;

    public r12(s12 s12Var, MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        View rootView;
        if (y4.z(view2)) {
            SplashScreenView o = y4.o(view2);
            o.getClass();
            WindowInsets build = new WindowInsets.Builder().build();
            build.getClass();
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            rootView = o.getRootView();
            if (build == rootView.computeSystemWindowInsets(build, rect)) {
                rect.isEmpty();
            }
            ((ViewGroup) this.a.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
    }
}
