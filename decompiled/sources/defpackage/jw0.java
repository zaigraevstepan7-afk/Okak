package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class jw0 implements AccessibilityManager$AccessibilityServicesStateChangeListener {
    public final je1 a;
    public final je1 b;

    public jw0(lw0 lw0Var) {
        Boolean bool = Boolean.FALSE;
        this.a = fr1.k(bool);
        this.b = fr1.k(bool);
    }

    public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
        this.a.setValue(Boolean.valueOf(lw0.a(accessibilityManager)));
        this.b.setValue(Boolean.valueOf(lw0.b(accessibilityManager)));
    }
}
