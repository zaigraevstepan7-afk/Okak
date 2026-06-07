package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class i52 extends fm0 {
    public ke2 v;
    public pi2 w;

    @Override // defpackage.am0, defpackage.d21
    public final void D0() {
        View I = vn.I(this);
        WeakHashMap weakHashMap = pi2.w;
        pi2 s = wm1.s(I);
        s.a(I);
        this.v.getClass();
        sa saVar = s.c;
        if (!sn0.r(saVar, this.u)) {
            this.u = saVar;
            M0();
        }
        this.w = s;
        super.D0();
    }

    @Override // defpackage.am0, defpackage.d21
    public final void E0() {
        View I = vn.I(this);
        pi2 pi2Var = this.w;
        if (pi2Var != null) {
            int i = pi2Var.u - 1;
            pi2Var.u = i;
            if (i == 0) {
                int i2 = eg2.a;
                ag2.a(I, null);
                I.setWindowInsetsAnimationCallback(null);
                I.removeOnAttachStateChangeListener(pi2Var.v);
            }
        }
        super.E0();
    }
}
