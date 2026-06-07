package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class od implements de0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ od(gv gvVar, l40 l40Var, uy uyVar, int i) {
        this.g = gvVar;
        this.h = l40Var;
        this.i = uyVar;
        this.f = i;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        pl1 pl1Var;
        int i;
        int i2 = this.e;
        od2 od2Var = od2.a;
        Object obj = this.i;
        Object obj2 = this.h;
        int i3 = this.f;
        Object obj3 = this.g;
        switch (i2) {
            case 0:
                rx.C((gv) obj3, null, new de((l40) obj2, (uy) obj, i3, null), 3);
                return od2Var;
            default:
                ge1 ge1Var = (ge1) obj;
                View view = ((nh2) obj3).a;
                Rect rect = new Rect();
                view.getWindowVisibleDisplayFrame(rect);
                int i4 = rect.top;
                int i5 = rect.bottom;
                iq0 iq0Var = (iq0) ((o41) obj2).getValue();
                if (iq0Var != null && iq0Var.j()) {
                    pl1Var = hp.e(iq0Var.e(0L), vn.O(iq0Var.m()));
                } else {
                    pl1Var = pl1.e;
                }
                int i6 = i4 + i3;
                int i7 = i5 - i3;
                float f = pl1Var.b;
                if (f <= i5) {
                    float f2 = pl1Var.d;
                    if (f2 >= i4) {
                        i = c01.R(Math.max(f - i6, i7 - f2));
                        ge1Var.h(Math.max(i, 0));
                        return od2Var;
                    }
                }
                i = i7 - i6;
                ge1Var.h(Math.max(i, 0));
                return od2Var;
        }
    }

    public /* synthetic */ od(nh2 nh2Var, int i, o41 o41Var, ge1 ge1Var) {
        this.g = nh2Var;
        this.f = i;
        this.h = o41Var;
        this.i = ge1Var;
    }
}
