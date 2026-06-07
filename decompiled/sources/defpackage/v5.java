package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class v5 extends cq0 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ w5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v5(w5 w5Var, int i) {
        super(1);
        this.e = i;
        this.f = w5Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.e;
        w5 w5Var = this.f;
        switch (i) {
            case 0:
                View view = w5Var.h;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                cs1 cs1Var = (cs1) obj;
                if (cs1Var.f.contains(cs1Var)) {
                    lc1 snapshotObserver = w5Var.h.getSnapshotObserver();
                    snapshotObserver.a.c(cs1Var, w5Var.R, new f5(2, cs1Var, w5Var));
                }
                return od2.a;
        }
    }
}
