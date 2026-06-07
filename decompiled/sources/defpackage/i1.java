package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class i1 extends AccessibilityNodeProvider {
    public final sl0 a;

    public i1(sl0 sl0Var) {
        this.a = sl0Var;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        ((w5) this.a.f).b(i, new h1(accessibilityNodeInfo), str, bundle);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        h1 r = this.a.r(i);
        if (r == null) {
            return null;
        }
        return r.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        h1 r;
        sl0 sl0Var = this.a;
        w5 w5Var = (w5) sl0Var.f;
        if (i != 1) {
            if (i == 2) {
                r = sl0Var.r(w5Var.p);
            } else {
                se.h(l90.g(i, "Unknown focus type: "));
                r = null;
            }
        } else {
            int i2 = w5Var.q;
            if (i2 != Integer.MIN_VALUE) {
                r = sl0Var.r(i2);
            }
            r = null;
        }
        if (r == null) {
            return null;
        }
        return r.a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (r9 == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02e4, code lost:
    
        if (((java.lang.Boolean) r0.invoke(java.lang.Float.valueOf(r2), java.lang.Float.valueOf(r5))).booleanValue() == true) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x01b3, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x06e9, code lost:
    
        if (r0 != 16) goto L494;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x007f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:150:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x079a  */
    /* JADX WARN: Type inference failed for: r7v22, types: [z0, x0] */
    /* JADX WARN: Type inference failed for: r7v28, types: [a1, x0] */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performAction(int r19, int r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 2218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i1.performAction(int, int, android.os.Bundle):boolean");
    }
}
