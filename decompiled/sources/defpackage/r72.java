package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class r72 implements PointerInputEventHandler {
    public final /* synthetic */ gv a;
    public final /* synthetic */ o41 b;
    public final /* synthetic */ r31 c;
    public final /* synthetic */ o41 d;

    public r72(gv gvVar, o41 o41Var, r31 r31Var, o41 o41Var2) {
        this.a = gvVar;
        this.b = o41Var;
        this.c = r31Var;
        this.d = o41Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(uh1 uh1Var, vt vtVar) {
        q72 q72Var = new q72(this.a, this.b, this.c, null);
        aa aaVar = new aa(this.d, 6);
        t30 t30Var = w52.a;
        Object u = fp.u(new z7(uh1Var, q72Var, aaVar, new qi1(uh1Var), (vt) null), vtVar);
        od2 od2Var = od2.a;
        hv hvVar = hv.e;
        if (u != hvVar) {
            u = od2Var;
        }
        if (u == hvVar) {
            return u;
        }
        return od2Var;
    }
}
