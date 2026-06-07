package defpackage;

import com.topjohnwu.superuser.internal.UiThreadHandler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class ej1 implements Executor {
    public final /* synthetic */ int e;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.e) {
            case 0:
                runnable.run();
                return;
            default:
                UiThreadHandler.run(runnable);
                return;
        }
    }
}
