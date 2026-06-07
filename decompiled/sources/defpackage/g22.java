package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class g22 implements vt, iv {
    public final vt e;
    public final xu f;

    public g22(vt vtVar, xu xuVar) {
        this.e = vtVar;
        this.f = xuVar;
    }

    @Override // defpackage.iv
    public final iv getCallerFrame() {
        vt vtVar = this.e;
        if (vtVar instanceof iv) {
            return (iv) vtVar;
        }
        return null;
    }

    @Override // defpackage.vt
    public final xu getContext() {
        return this.f;
    }

    @Override // defpackage.vt
    public final void resumeWith(Object obj) {
        this.e.resumeWith(obj);
    }
}
