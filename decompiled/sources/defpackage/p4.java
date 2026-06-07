package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class p4 implements b1 {
    public final AccessibilityManager a;

    public p4(Context context) {
        Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        this.a = (AccessibilityManager) systemService;
    }
}
