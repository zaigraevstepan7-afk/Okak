package defpackage;

import android.view.View;
import com.elixir.loader.R;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class cx0 {
    public static final js a = new js(new ax0(1));

    public static w61 a(ur urVar) {
        w61 w61Var;
        w61 w61Var2;
        w61 w61Var3 = (w61) urVar.j(a);
        if (w61Var3 == null) {
            urVar.X(950836184);
            View view = (View) urVar.j(l6.f);
            view.getClass();
            while (true) {
                w61Var = null;
                if (view == null) {
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
                if (tag instanceof w61) {
                    w61Var2 = (w61) tag;
                } else {
                    w61Var2 = null;
                }
                if (w61Var2 != null) {
                    w61Var = w61Var2;
                    break;
                }
                Object k = xp1.k(view);
                if (k instanceof View) {
                    view = (View) k;
                } else {
                    view = null;
                }
            }
            urVar.p(false);
            return w61Var;
        }
        urVar.X(950834231);
        urVar.p(false);
        return w61Var3;
    }
}
