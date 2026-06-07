package defpackage;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class e1 {
    public static final e1 c;
    public static final e1 d;
    public static final e1 e;
    public static final e1 f;
    public static final e1 g;
    public static final e1 h;
    public static final e1 i;
    public static final e1 j;
    public final Object a;
    public final int b;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        new e1(null, 1, null, null);
        new e1(null, 2, null, null);
        new e1(null, 4, null, null);
        new e1(null, 8, null, null);
        new e1(null, 16, null, null);
        new e1(null, 32, null, null);
        c = new e1(null, 64, null, null);
        d = new e1(null, 128, null, null);
        new e1(null, 256, null, s1.class);
        new e1(null, 512, null, s1.class);
        new e1(null, 1024, null, t1.class);
        new e1(null, 2048, null, t1.class);
        e = new e1(null, 4096, null, null);
        f = new e1(null, SharedConstants.DefaultBufferSize, null, null);
        new e1(null, 16384, null, null);
        new e1(null, 32768, null, null);
        new e1(null, 65536, null, null);
        new e1(null, 131072, null, x1.class);
        new e1(null, 262144, null, null);
        new e1(null, 524288, null, null);
        new e1(null, 1048576, null, null);
        new e1(null, 2097152, null, y1.class);
        new e1(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null);
        new e1(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, v1.class);
        g = new e1(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null);
        h = new e1(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null);
        i = new e1(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null);
        j = new e1(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null);
        new e1(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, R.id.accessibilityActionPageUp, null, null);
        new e1(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, R.id.accessibilityActionPageDown, null, null);
        new e1(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, R.id.accessibilityActionPageLeft, null, null);
        new e1(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, R.id.accessibilityActionPageRight, null, null);
        new e1(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null);
        new e1(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, w1.class);
        new e1(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, u1.class);
        new e1(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null);
        new e1(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null);
        new e1(AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD, R.id.accessibilityActionPressAndHold, null, null);
        new e1(AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER, R.id.accessibilityActionImeEnter, null, null);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 32) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction = null;
        }
        new e1(accessibilityAction, R.id.ALT, null, null);
        if (i2 >= 32) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
        } else {
            accessibilityAction2 = null;
        }
        new e1(accessibilityAction2, R.id.CTRL, null, null);
        if (i2 >= 32) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
        } else {
            accessibilityAction3 = null;
        }
        new e1(accessibilityAction3, R.id.FUNCTION, null, null);
        if (i2 >= 33) {
            accessibilityAction4 = d1.h();
        } else {
            accessibilityAction4 = null;
        }
        new e1(accessibilityAction4, R.id.KEYCODE_0, null, null);
        if (i2 >= 34) {
            accessibilityAction5 = w0.a();
        } else {
            accessibilityAction5 = null;
        }
        new e1(accessibilityAction5, R.id.KEYCODE_3D_MODE, null, null);
    }

    public e1(Object obj, int i2, CharSequence charSequence, Class cls) {
        this.b = i2;
        if (obj == null) {
            this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
        } else {
            this.a = obj;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof e1)) {
            return false;
        }
        Object obj2 = ((e1) obj).a;
        Object obj3 = this.a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        }
        if (!obj3.equals(obj2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String c2 = h1.c(this.b);
        if (c2.equals("ACTION_UNKNOWN")) {
            Object obj = this.a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                c2 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(c2);
        return sb.toString();
    }

    public e1(int i2, String str) {
        this(null, i2, str, null);
    }
}
