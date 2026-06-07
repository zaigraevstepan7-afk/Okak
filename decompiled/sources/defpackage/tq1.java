package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class tq1 implements su0, AutoCloseable {
    public final String e;
    public final sq1 f;
    public boolean g;

    public tq1(String str, sq1 sq1Var) {
        this.e = str;
        this.f = sq1Var;
    }

    @Override // defpackage.su0
    public final void g(uu0 uu0Var, mu0 mu0Var) {
        if (mu0Var == mu0.ON_DESTROY) {
            this.g = false;
            uu0Var.g().f(this);
        }
    }

    public final void k(sl0 sl0Var, wu0 wu0Var) {
        sl0Var.getClass();
        wu0Var.getClass();
        if (!this.g) {
            this.g = true;
            wu0Var.a(this);
            sl0Var.z(this.e, (rp) this.f.b.e);
            return;
        }
        se.p("Already attached to lifecycleOwner");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
