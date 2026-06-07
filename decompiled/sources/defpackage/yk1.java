package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class yk1 implements p22, va0, ff0 {
    public final /* synthetic */ r22 e;

    public yk1(r22 r22Var) {
        this.e = r22Var;
    }

    @Override // defpackage.va0
    public final Object a(wa0 wa0Var, vt vtVar) {
        this.e.a(wa0Var, vtVar);
        return hv.e;
    }

    @Override // defpackage.ff0
    public final va0 c(xu xuVar, int i, jk jkVar) {
        if ((((i >= 0 && i < 2) || i == -2) && jkVar == jk.f) || ((i == 0 || i == -3) && jkVar == jk.e)) {
            return this;
        }
        return new gm(this, xuVar, i, jkVar);
    }

    @Override // defpackage.p22
    public final Object getValue() {
        return this.e.getValue();
    }
}
