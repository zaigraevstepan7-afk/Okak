package defpackage;

import android.view.MotionEvent;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class n5 implements Runnable {
    public final /* synthetic */ q5 e;

    public n5(q5 q5Var) {
        this.e = q5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q5 q5Var = this.e;
        q5Var.removeCallbacks(this);
        MotionEvent motionEvent = q5Var.w0;
        if (motionEvent != null) {
            boolean z = false;
            if (motionEvent.getToolType(0) == 3) {
                z = true;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (z) {
                if (actionMasked == 10 || actionMasked == 1) {
                    return;
                }
            } else if (actionMasked == 1) {
                return;
            }
            int i = 7;
            if (actionMasked != 7 && actionMasked != 9) {
                i = 2;
            }
            q5Var.G(motionEvent, i, q5Var.x0, false);
        }
    }
}
