package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.elixir.loader.R;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class dx0 {
    public static final js a = new js(new ax0(2));

    public static z91 a(ur urVar) {
        z91 z91Var;
        z91 z91Var2 = (z91) urVar.j(a);
        Object obj = null;
        if (z91Var2 == null) {
            urVar.X(1208426157);
            View view = (View) urVar.j(l6.f);
            view.getClass();
            while (true) {
                if (view != null) {
                    Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                    if (tag instanceof z91) {
                        z91Var = (z91) tag;
                    } else {
                        z91Var = null;
                    }
                    if (z91Var != null) {
                        z91Var2 = z91Var;
                        break;
                    }
                    Object k = xp1.k(view);
                    if (k instanceof View) {
                        view = (View) k;
                    } else {
                        view = null;
                    }
                } else {
                    z91Var2 = null;
                    break;
                }
            }
            urVar.p(false);
        } else {
            urVar.X(1208423708);
            urVar.p(false);
        }
        if (z91Var2 == null) {
            urVar.X(1208428160);
            Context context = (Context) urVar.j(l6.b);
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof z91) {
                    obj = context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            z91 z91Var3 = (z91) obj;
            urVar.p(false);
            return z91Var3;
        }
        urVar.X(1208423789);
        urVar.p(false);
        return z91Var2;
    }
}
