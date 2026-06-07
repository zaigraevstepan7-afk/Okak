package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class f1 {
    public static final void a(AccessibilityManager accessibilityManager, AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
        accessibilityManager.addAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
    }

    public static PackageInfo b(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }

    public static Object c(String str, Bundle bundle) {
        return bundle.getParcelable(str, d2.class);
    }

    public static ArrayList d(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    public static String e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static final void g(ai1 ai1Var, yc ycVar) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (ycVar != null && (findOnBackInvokedDispatcher = ai1Var.findOnBackInvokedDispatcher()) != null) {
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, ycVar);
        }
    }

    public static final void h(ai1 ai1Var, yc ycVar) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (ycVar != null && (findOnBackInvokedDispatcher = ai1Var.findOnBackInvokedDispatcher()) != null) {
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(ycVar);
        }
    }

    public static final void i(AccessibilityManager accessibilityManager, AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
        accessibilityManager.removeAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
    }
}
