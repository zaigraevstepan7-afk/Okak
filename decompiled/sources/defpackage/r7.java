package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import com.elixir.loader.R;
import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class r7 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ r7(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.e) {
            case 0:
                s7 s7Var = (s7) this.f;
                Context context = view.getContext();
                if (!s7Var.c) {
                    context.getApplicationContext().registerComponentCallbacks(s7Var.d);
                    s7Var.c = true;
                    return;
                }
                return;
            case 1:
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Boolean bool;
        boolean z;
        int i = this.e;
        boolean z2 = false;
        Object obj = this.f;
        switch (i) {
            case 0:
                s7 s7Var = (s7) obj;
                Context context = view.getContext();
                if (s7Var.c) {
                    context.getApplicationContext().unregisterComponentCallbacks(s7Var.d);
                    s7Var.c = false;
                    return;
                }
                return;
            case 1:
                u uVar = (u) obj;
                Iterator it = mv1.G(uVar.getParent(), ig2.e).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj2 = (ViewParent) it.next();
                        if (obj2 instanceof View) {
                            View view2 = (View) obj2;
                            view2.getClass();
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            if (tag instanceof Boolean) {
                                bool = (Boolean) tag;
                            } else {
                                bool = null;
                            }
                            if (bool != null) {
                                z = bool.booleanValue();
                            } else {
                                z = false;
                            }
                            if (z) {
                                z2 = true;
                            }
                        }
                    }
                }
                if (!z2) {
                    uVar.e();
                    return;
                }
                return;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((i22) obj).c(null);
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
