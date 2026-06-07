package defpackage;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class sx1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int e = 1;
    public final Object f;
    public final Object g;

    public sx1(tx1 tx1Var, Activity activity) {
        tx1Var.getClass();
        this.f = tx1Var;
        this.g = new WeakReference(activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        IBinder iBinder;
        Window window;
        WindowManager.LayoutParams attributes;
        switch (this.e) {
            case 0:
                view.getClass();
                view.removeOnAttachStateChangeListener(this);
                Activity activity = (Activity) ((WeakReference) this.g).get();
                if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
                    iBinder = attributes.token;
                } else {
                    iBinder = null;
                }
                if (activity != null && iBinder != null) {
                    ((tx1) this.f).c(iBinder, activity);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.e) {
            case 0:
                view.getClass();
                return;
            default:
                ((View) this.f).removeOnAttachStateChangeListener(this);
                ((jl1) this.g).x();
                return;
        }
    }

    public sx1(View view, jl1 jl1Var) {
        this.f = view;
        this.g = jl1Var;
    }

    private final void a(View view) {
    }
}
