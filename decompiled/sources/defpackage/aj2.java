package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class aj2 implements zi2 {
    public static final aj2 e = new Object();

    @Override // defpackage.zi2
    public final vi2 e(Context context, g3 g3Var) {
        WindowManager windowManager;
        g3Var.getClass();
        if (context.isUiContext()) {
            windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        } else {
            windowManager = (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        }
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new vi2(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }
}
