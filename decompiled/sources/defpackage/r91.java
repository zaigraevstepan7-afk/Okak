package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class r91 extends a71 {
    public final OnBackInvokedDispatcher c;
    public final int d;
    public final OnBackInvokedCallback e;
    public boolean f;

    public r91(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        OnBackInvokedCallback s91Var;
        this.c = onBackInvokedDispatcher;
        this.d = i;
        if (Build.VERSION.SDK_INT == 33) {
            s91Var = new yc(this, 1);
        } else {
            s91Var = new s91(this);
        }
        this.e = s91Var;
    }

    @Override // defpackage.a71
    public final void b(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback = this.e;
        if (z && !this.f) {
            this.c.registerOnBackInvokedCallback(this.d, onBackInvokedCallback);
            this.f = true;
        } else if (!z && this.f) {
            this.c.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.f = false;
        }
    }
}
