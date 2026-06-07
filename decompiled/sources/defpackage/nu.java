package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class nu implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nu(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(uh1 uh1Var, vt vtVar) {
        int i = this.a;
        od2 od2Var = od2.a;
        hv hvVar = hv.e;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Object u = fp.u(new mu(uh1Var, (b72) obj2, (b82) obj, null), vtVar);
                if (u == hvVar) {
                    return u;
                }
                return od2Var;
            default:
                Object u2 = fp.u(new iu1(uh1Var, (r31) obj2, (dz1) obj, (vt) null), vtVar);
                if (u2 == hvVar) {
                    return u2;
                }
                return od2Var;
        }
    }
}
