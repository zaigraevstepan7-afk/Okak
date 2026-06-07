package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class vr1 extends v implements iv {
    public final vt h;

    public vr1(vt vtVar, xu xuVar) {
        super(xuVar, true);
        this.h = vtVar;
    }

    @Override // defpackage.no0
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.iv
    public final iv getCallerFrame() {
        vt vtVar = this.h;
        if (vtVar instanceof iv) {
            return (iv) vtVar;
        }
        return null;
    }

    @Override // defpackage.no0
    public void m(Object obj) {
        mp0.K(go.F(this.h), xn.S(obj));
    }

    @Override // defpackage.no0
    public void n(Object obj) {
        this.h.resumeWith(xn.S(obj));
    }
}
