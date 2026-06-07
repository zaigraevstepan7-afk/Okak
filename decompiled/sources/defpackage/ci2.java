package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class ci2 extends ji2 {
    public final WindowInsets c;
    public yl0 d;
    public int e;

    public ci2(ni2 ni2Var, WindowInsets windowInsets) {
        super(ni2Var);
        this.d = null;
        this.c = windowInsets;
    }

    public static boolean q(int i, int i2) {
        if ((i & 6) == (i2 & 6)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ji2
    public final yl0 i() {
        if (this.d == null) {
            WindowInsets windowInsets = this.c;
            this.d = yl0.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.d;
    }

    @Override // defpackage.ji2
    public boolean l() {
        return this.c.isRound();
    }

    @Override // defpackage.ji2
    public void p(int i) {
        this.e = i;
    }

    @Override // defpackage.ji2
    public void n(yl0[] yl0VarArr) {
    }

    @Override // defpackage.ji2
    public void o(ni2 ni2Var) {
    }
}
