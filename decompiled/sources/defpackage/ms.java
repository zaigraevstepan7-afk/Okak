package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class ms {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
