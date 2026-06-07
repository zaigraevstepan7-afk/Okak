package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class k6 implements ComponentCallbacks2 {
    public final /* synthetic */ ym1 e;

    public k6(ym1 ym1Var) {
        this.e = ym1Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        ym1 ym1Var = this.e;
        synchronized (ym1Var) {
            ym1Var.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        ym1 ym1Var = this.e;
        synchronized (ym1Var) {
            ym1Var.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        ym1 ym1Var = this.e;
        synchronized (ym1Var) {
            ym1Var.a.c();
        }
    }
}
