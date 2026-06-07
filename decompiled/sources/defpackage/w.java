package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class w implements vu {
    public final wu e;

    public w(wu wuVar) {
        this.e = wuVar;
    }

    @Override // defpackage.xu
    public final /* bridge */ xu G(xu xuVar) {
        return go.M(this, xuVar);
    }

    @Override // defpackage.xu
    public /* bridge */ vu H(wu wuVar) {
        return go.D(this, wuVar);
    }

    @Override // defpackage.vu
    public final wu getKey() {
        return this.e;
    }

    @Override // defpackage.xu
    public final Object p(se0 se0Var, Object obj) {
        return se0Var.invoke(obj, this);
    }

    @Override // defpackage.xu
    public /* bridge */ xu s(wu wuVar) {
        return go.I(this, wuVar);
    }
}
