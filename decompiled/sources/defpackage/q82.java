package defpackage;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class q82 implements Executor {
    public final /* synthetic */ Choreographer e;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.e.postFrameCallback(new gj1(runnable));
    }
}
