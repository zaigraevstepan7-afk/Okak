package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class lw0 implements AccessibilityManager.AccessibilityStateChangeListener, o22 {
    public final boolean e;
    public final boolean f;
    public final je1 g = fr1.k(Boolean.FALSE);
    public final kw0 h;
    public final jw0 i;

    public lw0(boolean z, boolean z2, boolean z3) {
        kw0 kw0Var;
        this.e = z2;
        this.f = z3;
        jw0 jw0Var = null;
        if (z) {
            kw0Var = new kw0();
        } else {
            kw0Var = null;
        }
        this.h = kw0Var;
        if ((z2 || z3) && Build.VERSION.SDK_INT >= 33) {
            jw0Var = new jw0(this);
        }
        this.i = jw0Var;
    }

    public static boolean a(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && i32.G(settingsActivityName, "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && i32.G(settingsActivityName, "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (((java.lang.Boolean) r2.a.getValue()).booleanValue() == true) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (((java.lang.Boolean) r2.b.getValue()).booleanValue() == true) goto L22;
     */
    @Override // defpackage.o22
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getValue() {
        /*
            r3 = this;
            je1 r0 = r3.g
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4e
            r0 = 1
            kw0 r1 = r3.h
            if (r1 == 0) goto L22
            je1 r1 = r1.e
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != r0) goto L22
            goto L4f
        L22:
            boolean r1 = r3.e
            jw0 r2 = r3.i
            if (r1 == 0) goto L39
            if (r2 == 0) goto L39
            je1 r1 = r2.a
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != r0) goto L39
            goto L4f
        L39:
            boolean r3 = r3.f
            if (r3 == 0) goto L4e
            if (r2 == 0) goto L4e
            je1 r3 = r2.b
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != r0) goto L4e
            goto L4f
        L4e:
            r0 = 0
        L4f:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lw0.getValue():java.lang.Object");
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.g.setValue(Boolean.valueOf(z));
    }
}
