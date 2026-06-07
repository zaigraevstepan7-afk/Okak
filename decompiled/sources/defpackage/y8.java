package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class y8 extends cq0 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ai1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y8(ai1 ai1Var, int i) {
        super(1);
        this.e = i;
        this.f = ai1Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        Looper looper;
        int i = this.e;
        od2 od2Var = od2.a;
        ai1 ai1Var = this.f;
        switch (i) {
            case 0:
                iq0 D = ((iq0) obj).D();
                D.getClass();
                ai1Var.n(D);
                return od2Var;
            case 1:
                ai1Var.m1setPopupContentSizefhxjrPA(new en0(((en0) obj).a));
                ai1Var.o();
                return od2Var;
            default:
                de0 de0Var = (de0) obj;
                Handler handler = ai1Var.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                } else {
                    looper = null;
                }
                if (looper == Looper.myLooper()) {
                    de0Var.invoke();
                } else {
                    Handler handler2 = ai1Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new n2(de0Var, 3));
                    }
                }
                return od2Var;
        }
    }
}
