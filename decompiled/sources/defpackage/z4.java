package defpackage;

import android.os.Trace;
import android.view.MotionEvent;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class z4 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ q5 f;

    public /* synthetic */ z4(q5 q5Var, int i) {
        this.e = i;
        this.f = q5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        q5 q5Var = this.f;
        switch (i) {
            case 0:
                te teVar = q5Var.l;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!teVar.isEmpty()) {
                    try {
                        ((de0) teVar.removeLast()).invoke();
                    } finally {
                        Trace.endSection();
                    }
                }
                return;
            default:
                q5Var.E0 = false;
                MotionEvent motionEvent = q5Var.w0;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    q5Var.F(motionEvent);
                    return;
                } else {
                    se.p("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
        }
    }
}
