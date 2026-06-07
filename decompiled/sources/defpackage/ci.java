package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ci implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ ta2 b;

    public /* synthetic */ ci(ta2 ta2Var, int i) {
        this.a = i;
        this.b = ta2Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(uh1 uh1Var, vt vtVar) {
        int i = this.a;
        od2 od2Var = od2.a;
        hv hvVar = hv.e;
        vt vtVar2 = null;
        ta2 ta2Var = this.b;
        switch (i) {
            case 0:
                Object u = fp.u(new bi(uh1Var, ta2Var, vtVar2, 0), vtVar);
                if (u == hvVar) {
                    return u;
                }
                return od2Var;
            default:
                Object u2 = fp.u(new bi(uh1Var, ta2Var, vtVar2, 1), vtVar);
                if (u2 == hvVar) {
                    return u2;
                }
                return od2Var;
        }
    }
}
