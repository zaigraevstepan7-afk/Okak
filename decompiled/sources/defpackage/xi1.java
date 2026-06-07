package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class xi1 extends h60 {
    final /* synthetic */ yi1 this$0;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class a extends h60 {
        final /* synthetic */ yi1 this$0;

        public a(yi1 yi1Var) {
            this.this$0 = yi1Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            yi1 yi1Var = this.this$0;
            int i = yi1Var.f + 1;
            yi1Var.f = i;
            if (i == 1) {
                if (yi1Var.g) {
                    yi1Var.j.d(mu0.ON_RESUME);
                    yi1Var.g = false;
                } else {
                    Handler handler = yi1Var.i;
                    handler.getClass();
                    handler.removeCallbacks(yi1Var.k);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            yi1 yi1Var = this.this$0;
            int i = yi1Var.e + 1;
            yi1Var.e = i;
            if (i == 1 && yi1Var.h) {
                yi1Var.j.d(mu0.ON_START);
                yi1Var.h = false;
            }
        }
    }

    public xi1(yi1 yi1Var) {
        this.this$0 = yi1Var;
    }

    @Override // defpackage.h60, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // defpackage.h60, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        yi1 yi1Var = this.this$0;
        int i = yi1Var.f - 1;
        yi1Var.f = i;
        if (i == 0) {
            Handler handler = yi1Var.i;
            handler.getClass();
            handler.postDelayed(yi1Var.k, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        activity.registerActivityLifecycleCallbacks(new a(this.this$0));
    }

    @Override // defpackage.h60, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        yi1 yi1Var = this.this$0;
        int i = yi1Var.e - 1;
        yi1Var.e = i;
        if (i == 0 && yi1Var.g) {
            yi1Var.j.d(mu0.ON_STOP);
            yi1Var.h = true;
        }
    }
}
