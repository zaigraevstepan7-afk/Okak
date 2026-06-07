package defpackage;

import android.view.Choreographer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ia implements Choreographer.FrameCallback {
    public final /* synthetic */ pl e;
    public final /* synthetic */ oe0 f;

    public ia(pl plVar, ja jaVar, oe0 oe0Var) {
        this.e = plVar;
        this.f = oe0Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object fo1Var;
        try {
            fo1Var = this.f.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            fo1Var = new fo1(th);
        }
        this.e.resumeWith(fo1Var);
    }
}
