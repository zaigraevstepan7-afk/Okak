package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class pk0 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ qk0 a;

    public pk0(qk0 qk0Var) {
        this.a = qk0Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        qk0 qk0Var = this.a;
        j5 j5Var = qk0Var.a;
        if (!qk0Var.c) {
            int i = qk0Var.b;
            int i2 = 2;
            if (i == 1) {
                if (Math.abs(f) > Math.abs(f2)) {
                    if (f > 0.0f) {
                        i2 = 1;
                    }
                    ((mc0) j5Var.f.getFocusOwner()).g(i2, false);
                    return true;
                }
            } else if (i == 2 && Math.abs(f2) > Math.abs(f)) {
                if (f2 > 0.0f) {
                    i2 = 1;
                }
                ((mc0) j5Var.f.getFocusOwner()).g(i2, false);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
