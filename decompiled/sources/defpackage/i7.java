package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class i7 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [u7, java.lang.Object] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(uh1 uh1Var, vt vtVar) {
        int i = this.a;
        int i2 = 0;
        int i3 = 3;
        vt vtVar2 = null;
        Object obj = this.b;
        hv hvVar = hv.e;
        od2 od2Var = od2.a;
        switch (i) {
            case 0:
                Object o = vn.o(uh1Var, new h7((j7) obj, vtVar2, i2), vtVar);
                if (o == hvVar) {
                    return o;
                }
                return od2Var;
            case 1:
                b82 b82Var = (b82) obj;
                cy1 cy1Var = b82Var.z;
                z72 z72Var = b82Var.y;
                w42 w42Var = (w42) uh1Var;
                w42Var.getClass();
                hg2 hg2Var = hp.M(w42Var).E;
                ?? obj2 = new Object();
                obj2.b = hg2Var;
                Object o2 = vn.o(uh1Var, new di(obj2, cy1Var, z72Var, null), vtVar);
                if (o2 != hvVar) {
                    o2 = od2Var;
                }
                if (o2 == hvVar) {
                    return o2;
                }
                return od2Var;
            case 2:
                Object o3 = vn.o(uh1Var, new h7((f80) obj, vtVar2, 2), vtVar);
                if (o3 == hvVar) {
                    return o3;
                }
                return od2Var;
            case 3:
                Object u = fp.u(new j(uh1Var, (uy) obj, vtVar2, 23), vtVar);
                if (u == hvVar) {
                    return u;
                }
                return od2Var;
            case 4:
                Object L0 = ((w42) uh1Var).L0(new ro1((oe0) obj, vtVar2, 1), vtVar);
                if (L0 == hvVar) {
                    return L0;
                }
                return od2Var;
            case 5:
                Object o4 = vn.o(uh1Var, new di((s32) obj, vtVar2, i3), vtVar);
                if (o4 == hvVar) {
                    return o4;
                }
                return od2Var;
            case 6:
                Object o5 = vn.o(uh1Var, new ro1(new k(1, (m62) obj, m62.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, 5), vtVar2, i2), vtVar);
                if (o5 != hvVar) {
                    o5 = od2Var;
                }
                if (o5 == hvVar) {
                    return o5;
                }
                return od2Var;
            default:
                Object u2 = fp.u(new tb(uh1Var, (b72) obj, vtVar2, i3), vtVar);
                if (u2 != hvVar) {
                    u2 = od2Var;
                }
                if (u2 == hvVar) {
                    return u2;
                }
                return od2Var;
        }
    }
}
