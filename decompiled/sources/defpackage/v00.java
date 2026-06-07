package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class v00 extends uh2 {
    public final /* synthetic */ w00 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v00(w00 w00Var) {
        super(1);
        this.f = w00Var;
    }

    @Override // defpackage.uh2
    public final ni2 d(ni2 ni2Var, List list) {
        w00 w00Var = this.f;
        if (!w00Var.p) {
            View childAt = w00Var.getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, w00Var.getWidth() - childAt.getRight());
            int max4 = Math.max(0, w00Var.getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return ni2Var.a.j(max, max2, max3, max4);
            }
        }
        return ni2Var;
    }

    @Override // defpackage.uh2
    public final h12 e(wh2 wh2Var, h12 h12Var) {
        w00 w00Var = this.f;
        if (!w00Var.p) {
            View childAt = w00Var.getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, w00Var.getWidth() - childAt.getRight());
            int max4 = Math.max(0, w00Var.getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                yl0 b = yl0.b(max, max2, max3, max4);
                int i = b.a;
                yl0 yl0Var = (yl0) h12Var.f;
                int i2 = b.b;
                int i3 = b.c;
                int i4 = b.d;
                return new h12(6, ni2.a(yl0Var, i, i2, i3, i4), ni2.a((yl0) h12Var.g, i, i2, i3, i4));
            }
        }
        return h12Var;
    }
}
