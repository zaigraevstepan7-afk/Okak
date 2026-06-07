package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class j80 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    public boolean e;
    public final /* synthetic */ View f;
    public final /* synthetic */ de0 g;

    public j80(View view, de0 de0Var) {
        this.f = view;
        this.g = de0Var;
        view.addOnAttachStateChangeListener(this);
        if (!this.e && view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.e = true;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.g.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (!this.e) {
            View view2 = this.f;
            if (view2.isAttachedToWindow()) {
                view2.getViewTreeObserver().addOnGlobalLayoutListener(this);
                this.e = true;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (!this.e) {
            return;
        }
        this.f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.e = false;
    }
}
