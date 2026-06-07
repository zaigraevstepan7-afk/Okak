package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fe2 extends yq1 {
    public final Object g;
    public final cf2 h;
    public final g3 i;

    public fe2(Object obj, cf2 cf2Var, g3 g3Var) {
        obj.getClass();
        cf2Var.getClass();
        this.g = obj;
        this.h = cf2Var;
        this.i = g3Var;
    }

    @Override // defpackage.yq1
    public final Object l() {
        return this.g;
    }

    @Override // defpackage.yq1
    public final yq1 y(String str, oe0 oe0Var) {
        Object obj = this.g;
        if (((Boolean) oe0Var.invoke(obj)).booleanValue()) {
            return this;
        }
        return new z80(obj, str, this.i, this.h);
    }
}
