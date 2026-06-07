package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class r9 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ x9 f;

    public /* synthetic */ r9(x9 x9Var, int i) {
        this.e = i;
        this.f = x9Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        Looper looper;
        int i = this.e;
        od2 od2Var = od2.a;
        x9 x9Var = this.f;
        switch (i) {
            case 0:
                de0 de0Var = (de0) obj;
                View view = x9Var.a;
                Handler handler = view.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                } else {
                    looper = null;
                }
                if (looper == Looper.myLooper()) {
                    de0Var.invoke();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new n2(de0Var, 2));
                    }
                }
                return od2Var;
            case 1:
                ActionMode actionMode = x9Var.h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return od2Var;
            case 2:
                ActionMode actionMode2 = x9Var.h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return od2Var;
            default:
                x9Var.e.d();
                return new m2(x9Var, 4);
        }
    }
}
