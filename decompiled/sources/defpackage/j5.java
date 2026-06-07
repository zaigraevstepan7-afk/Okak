package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class j5 extends cq0 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ q5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j5(q5 q5Var, int i) {
        super(1);
        this.e = i;
        this.f = q5Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        Looper looper;
        int i = this.e;
        od2 od2Var = od2.a;
        q5 q5Var = this.f;
        switch (i) {
            case 0:
                ((mc0) q5Var.getFocusOwner()).g(((ac0) obj).a, false);
                return od2Var;
            case 1:
                de0 de0Var = (de0) obj;
                q5Var.getUncaughtExceptionHandler$ui();
                Handler handler = q5Var.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                } else {
                    looper = null;
                }
                if (looper == Looper.myLooper()) {
                    de0Var.invoke();
                } else {
                    Handler handler2 = q5Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new n2(de0Var, 1));
                    }
                }
                return od2Var;
            default:
                return new t8(q5Var, q5Var.getTextInputService(), (gv) obj);
        }
    }
}
