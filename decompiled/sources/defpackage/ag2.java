package defpackage;

import android.view.View;
import com.elixir.loader.R;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class ag2 {
    public static void a(View view, q91 q91Var) {
        zf2 zf2Var;
        if (q91Var != null) {
            zf2Var = new zf2(view, q91Var);
        } else {
            zf2Var = null;
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (zf2Var != null) {
            view.setOnApplyWindowInsetsListener(zf2Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }
}
