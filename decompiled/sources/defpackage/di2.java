package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class di2 extends ci2 {
    public yl0 f;

    public di2(ni2 ni2Var, WindowInsets windowInsets) {
        super(ni2Var, windowInsets);
        this.f = null;
    }

    @Override // defpackage.ji2
    public ni2 b() {
        return ni2.b(null, this.c.consumeStableInsets());
    }

    @Override // defpackage.ji2
    public ni2 c() {
        return ni2.b(null, this.c.consumeSystemWindowInsets());
    }

    @Override // defpackage.ji2
    public final yl0 h() {
        if (this.f == null) {
            WindowInsets windowInsets = this.c;
            this.f = yl0.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f;
    }

    @Override // defpackage.ji2
    public boolean k() {
        return this.c.isConsumed();
    }
}
