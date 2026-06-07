package defpackage;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class y50 implements u50 {
    public final Context a;

    public y50(Context context, int i) {
        switch (i) {
            case 1:
                this.a = context;
                return;
            default:
                this.a = context.getApplicationContext();
                return;
        }
    }

    @Override // defpackage.u50
    public void a(hp hpVar) {
        ls lsVar = new ls("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), lsVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new w9(this, hpVar, threadPoolExecutor, 1));
    }
}
