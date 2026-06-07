package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class gi2 extends fi2 {
    public static final ni2 g = ni2.b(null, WindowInsets.CONSUMED);

    public gi2(ni2 ni2Var, WindowInsets windowInsets) {
        super(ni2Var, windowInsets);
    }

    @Override // defpackage.ji2
    public yl0 f(int i) {
        return yl0.c(this.c.getInsets(ki2.a(i)));
    }

    @Override // defpackage.ji2
    public yl0 g(int i) {
        return yl0.c(this.c.getInsetsIgnoringVisibility(ki2.a(i)));
    }

    @Override // defpackage.ji2
    public boolean m(int i) {
        return this.c.isVisible(ki2.a(i));
    }

    @Override // defpackage.ji2
    public final void d(View view) {
    }
}
