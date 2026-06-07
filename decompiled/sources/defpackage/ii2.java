package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ii2 extends hi2 {
    public static final ni2 h = ni2.b(null, WindowInsets.CONSUMED);

    public ii2(ni2 ni2Var, WindowInsets windowInsets) {
        super(ni2Var, windowInsets);
    }

    @Override // defpackage.gi2, defpackage.ji2
    public yl0 f(int i) {
        return yl0.c(this.c.getInsets(mi2.a(i)));
    }

    @Override // defpackage.gi2, defpackage.ji2
    public yl0 g(int i) {
        return yl0.c(this.c.getInsetsIgnoringVisibility(mi2.a(i)));
    }

    @Override // defpackage.gi2, defpackage.ji2
    public boolean m(int i) {
        return this.c.isVisible(mi2.a(i));
    }
}
