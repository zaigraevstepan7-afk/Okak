package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class w11 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ de0 b;

    public /* synthetic */ w11(de0 de0Var, int i) {
        this.a = i;
        this.b = de0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(uh1 uh1Var, vt vtVar) {
        int i = this.a;
        od2 od2Var = od2.a;
        hv hvVar = hv.e;
        de0 de0Var = this.b;
        switch (i) {
            case 0:
                Object c = w52.c(uh1Var, null, new fd(de0Var, 2), vtVar, 7);
                if (c == hvVar) {
                    return c;
                }
                return od2Var;
            default:
                Object c2 = w52.c(uh1Var, null, new fd(de0Var, 3), vtVar, 7);
                if (c2 == hvVar) {
                    return c2;
                }
                return od2Var;
        }
    }
}
