package defpackage;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.elixir.loader.MainActivity;
import com.elixir.loader.R;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class s12 extends h12 {
    public q12 h;
    public final r12 i;

    public s12(MainActivity mainActivity) {
        super(mainActivity);
        this.i = new r12(this, mainActivity);
    }

    @Override // defpackage.h12
    public final void a() {
        int i;
        MainActivity mainActivity = (MainActivity) this.f;
        Resources.Theme theme = mainActivity.getTheme();
        theme.getClass();
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) && (i = typedValue.resourceId) != 0) {
            mainActivity.setTheme(i);
        }
        ((ViewGroup) mainActivity.getWindow().getDecorView()).setOnHierarchyChangeListener(this.i);
    }

    @Override // defpackage.h12
    public final void b(l2 l2Var) {
        this.g = l2Var;
        View findViewById = ((MainActivity) this.f).findViewById(android.R.id.content);
        ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
        if (this.h != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.h);
        }
        q12 q12Var = new q12(this, findViewById, 1);
        this.h = q12Var;
        viewTreeObserver.addOnPreDrawListener(q12Var);
    }
}
