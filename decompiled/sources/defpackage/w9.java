package defpackage;

import android.view.ActionMode;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class w9 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ w9(Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                x9 x9Var = (x9) this.f;
                u9 u9Var = (u9) this.g;
                v9 v9Var = (v9) this.h;
                ActionMode startActionMode = x9Var.a.startActionMode(new ua0(u9Var), 1);
                sn0.r(x9Var.h, startActionMode);
                if (startActionMode == null) {
                    v9Var.close();
                    return;
                }
                return;
            default:
                y50 y50Var = (y50) this.f;
                hp hpVar = (hp) this.g;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.h;
                try {
                    md0 x = qo.x(y50Var.a);
                    if (x != null) {
                        ld0 ld0Var = (ld0) x.a;
                        synchronized (ld0Var.d) {
                            ld0Var.f = threadPoolExecutor;
                        }
                        x.a.a(new x50(hpVar, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th) {
                    hpVar.F(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
        }
    }
}
