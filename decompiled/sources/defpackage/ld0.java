package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ld0 implements u50 {
    public final Context a;
    public final kd0 b;
    public final wc0 c;
    public final Object d = new Object();
    public Handler e;
    public ThreadPoolExecutor f;
    public ThreadPoolExecutor g;
    public hp h;

    public ld0(Context context, kd0 kd0Var) {
        go.m(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = kd0Var;
        this.c = md0.d;
    }

    @Override // defpackage.u50
    public final void a(hp hpVar) {
        synchronized (this.d) {
            this.h = hpVar;
        }
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ls("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.g = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                this.f.execute(new r5(this, 6));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.e = null;
                ThreadPoolExecutor threadPoolExecutor = this.g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ud0 c() {
        try {
            wc0 wc0Var = this.c;
            Context context = this.a;
            kd0 kd0Var = this.b;
            wc0Var.getClass();
            np a = jd0.a(context, List.of(kd0Var));
            int i = a.a;
            if (i == 0) {
                ud0[] ud0VarArr = (ud0[]) ((List) a.b).get(0);
                if (ud0VarArr != null && ud0VarArr.length != 0) {
                    return ud0VarArr[0];
                }
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            throw new RuntimeException(l90.i("fetchFonts failed (", i, ")"));
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
