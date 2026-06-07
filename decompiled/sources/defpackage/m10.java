package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class m10 implements gm1 {
    public final oe0 e;
    public n10 f;

    public m10(oe0 oe0Var) {
        this.e = oe0Var;
    }

    @Override // defpackage.gm1
    public final void d() {
        n10 n10Var = this.f;
        if (n10Var != null) {
            n10Var.a();
        }
        this.f = null;
    }

    @Override // defpackage.gm1
    public final void e() {
        this.f = (n10) this.e.invoke(bf.u);
    }

    @Override // defpackage.gm1
    public final void a() {
    }
}
