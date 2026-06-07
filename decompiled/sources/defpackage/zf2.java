package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zf2 implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ q91 a;

    public zf2(View view, q91 q91Var) {
        this.a = q91Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        ji2 ji2Var = this.a.b(view, ni2.b(view, windowInsets)).a;
        if (ji2Var instanceof ci2) {
            return ((ci2) ji2Var).c;
        }
        return null;
    }
}
