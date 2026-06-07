package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class vp implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long e = SystemClock.uptimeMillis() + 10000;
    public Runnable f;
    public boolean g;
    public final /* synthetic */ yp h;

    public vp(yp ypVar) {
        this.h = ypVar;
    }

    public final void a(View view) {
        if (!this.g) {
            this.g = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.f = runnable;
        View decorView = this.h.getWindow().getDecorView();
        decorView.getClass();
        if (this.g) {
            if (sn0.r(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
                return;
            } else {
                decorView.postInvalidate();
                return;
            }
        }
        decorView.postOnAnimation(new r5(this, 4));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.f;
        if (runnable != null) {
            runnable.run();
            this.f = null;
            ce0 ce0Var = (ce0) this.h.k.getValue();
            synchronized (ce0Var.a) {
                z = ce0Var.b;
            }
            if (z) {
                this.g = false;
                this.h.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        if (SystemClock.uptimeMillis() > this.e) {
            this.g = false;
            this.h.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.h.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
