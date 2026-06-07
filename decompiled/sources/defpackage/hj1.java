package defpackage;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class hj1 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Context f;

    public /* synthetic */ hj1(Context context, int i) {
        this.e = i;
        this.f = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        Context context = this.f;
        switch (i) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new hj1(context, 1));
                return;
            default:
                mp0.R(context, new ej1(0), mp0.K, false);
                return;
        }
    }
}
