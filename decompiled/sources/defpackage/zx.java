package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zx extends d21 implements b40 {
    public final r31 s;
    public boolean t;
    public boolean u;
    public boolean v;

    public zx(r31 r31Var) {
        this.s = r31Var;
    }

    @Override // defpackage.d21
    public final void D0() {
        rx.C(z0(), null, new vf(this, (vt) null, 1), 3);
    }

    @Override // defpackage.b40
    public final void f0(cr0 cr0Var) {
        cr0Var.b();
        vl vlVar = cr0Var.e;
        if (this.t) {
            c40.X(cr0Var, co.b(co.b, 0.3f), 0L, vlVar.d(), 0.0f, 122);
        } else {
            if (!this.u && !this.v) {
                return;
            }
            c40.X(cr0Var, co.b(co.b, 0.1f), 0L, vlVar.d(), 0.0f, 122);
        }
    }
}
