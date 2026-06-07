package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class k71 extends i02 {
    public final oe0 e;
    public final i02 f;

    public k71(long j, o02 o02Var, oe0 oe0Var, i02 i02Var) {
        super(j, o02Var);
        this.e = oe0Var;
        this.f = i02Var;
        i02Var.k();
    }

    @Override // defpackage.i02
    public final void c() {
        i02 i02Var = this.f;
        if (!this.c) {
            if (this.b != i02Var.g()) {
                a();
            }
            i02Var.l();
            this.c = true;
            synchronized (q02.c) {
                o();
            }
        }
    }

    @Override // defpackage.i02
    public final oe0 e() {
        return this.e;
    }

    @Override // defpackage.i02
    public final boolean f() {
        return true;
    }

    @Override // defpackage.i02
    public final oe0 i() {
        return null;
    }

    @Override // defpackage.i02
    public final void k() {
        op1.r();
        throw null;
    }

    @Override // defpackage.i02
    public final void l() {
        op1.r();
        throw null;
    }

    @Override // defpackage.i02
    public final void n(u22 u22Var) {
        nv1 nv1Var = q02.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.i02
    public final i02 u(oe0 oe0Var) {
        return new k71(this.b, this.a, q02.k(oe0Var, this.e, true), this.f);
    }

    @Override // defpackage.i02
    public final void m() {
    }
}
