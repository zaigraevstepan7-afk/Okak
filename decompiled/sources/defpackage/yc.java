package defpackage;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class yc implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yc(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                de0 de0Var = (de0) obj;
                if (de0Var != null) {
                    de0Var.invoke();
                    return;
                }
                return;
            default:
                ((r91) obj).a();
                return;
        }
    }
}
