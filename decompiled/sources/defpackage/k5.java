package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class k5 extends cq0 implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ q5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k5(q5 q5Var, int i) {
        super(0);
        this.e = i;
        this.f = q5Var;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        int actionMasked;
        d5 d5Var;
        int i = this.e;
        q5 q5Var = this.f;
        switch (i) {
            case 0:
                return sn0.v(q5Var);
            case 1:
                MotionEvent motionEvent = q5Var.w0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    q5Var.x0 = SystemClock.uptimeMillis();
                    q5Var.post(q5Var.C0);
                }
                return od2.a;
            default:
                d5Var = q5Var.get_viewTreeOwners();
                return d5Var;
        }
    }
}
