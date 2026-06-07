package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class x91 implements su0, AutoCloseable {
    public final /* synthetic */ t91 e;
    public final /* synthetic */ wu0 f;

    public x91(t91 t91Var, y91 y91Var, wu0 wu0Var) {
        this.e = t91Var;
        this.f = wu0Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f.f(this);
    }

    @Override // defpackage.su0
    public final void g(uu0 uu0Var, mu0 mu0Var) {
        mu0 mu0Var2 = mu0.ON_START;
        t91 t91Var = this.e;
        if (mu0Var == mu0Var2) {
            t91Var.g(true);
        } else if (mu0Var == mu0.ON_STOP) {
            t91Var.g(false);
        }
        if (mu0Var == mu0.ON_DESTROY) {
            t91Var.e();
            this.f.f(this);
        }
    }
}
