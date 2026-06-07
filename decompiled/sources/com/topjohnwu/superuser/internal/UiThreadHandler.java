package com.topjohnwu.superuser.internal;

import android.os.Handler;
import android.os.Looper;
import com.topjohnwu.superuser.ShellUtils;
import defpackage.ej1;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class UiThreadHandler {
    public static final Handler handler = new Handler(Looper.getMainLooper());
    public static final Executor executor = new ej1(1);

    public static void run(Runnable runnable) {
        if (ShellUtils.onMainThread()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static void runAndWait(Runnable runnable) {
        if (ShellUtils.onMainThread()) {
            runnable.run();
            return;
        }
        WaitRunnable waitRunnable = new WaitRunnable(runnable);
        handler.post(waitRunnable);
        waitRunnable.waitUntilDone();
    }
}
