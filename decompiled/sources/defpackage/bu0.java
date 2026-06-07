package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class bu0 extends d21 implements es, kf0 {
    public b8 s;
    public gu0 t;
    public b82 u;
    public final je1 v = fr1.k(null);

    public bu0(b8 b8Var, gu0 gu0Var, b82 b82Var) {
        this.s = b8Var;
        this.t = gu0Var;
        this.u = b82Var;
    }

    @Override // defpackage.d21
    public final void D0() {
        b8 b8Var = this.s;
        if (b8Var.a != null) {
            nl0.c("Expected textInputModifierNode to be null");
        }
        b8Var.a = this;
    }

    @Override // defpackage.d21
    public final void E0() {
        this.s.k(this);
    }

    @Override // defpackage.kf0
    public final void U(e81 e81Var) {
        this.v.setValue(e81Var);
    }
}
