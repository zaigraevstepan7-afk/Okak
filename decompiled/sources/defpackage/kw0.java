package defpackage;

import android.view.accessibility.AccessibilityManager;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class kw0 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final je1 e = fr1.k(Boolean.FALSE);

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.e.setValue(Boolean.valueOf(z));
    }
}
