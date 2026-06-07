package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class q12 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ h12 c;

    public /* synthetic */ q12(h12 h12Var, View view, int i) {
        this.a = i;
        this.c = h12Var;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = this.a;
        View view = this.b;
        h12 h12Var = this.c;
        switch (i) {
            case 0:
                if (((t12) h12Var.g).a()) {
                    return false;
                }
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            default:
                if (((t12) ((s12) h12Var).g).a()) {
                    return false;
                }
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
        }
    }
}
