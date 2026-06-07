package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class t91 extends x61 {
    public final u91 d;
    public boolean e;

    public t91(u91 u91Var, v91 v91Var) {
        boolean z = u91Var.b;
        this.a = v91Var;
        this.b = z;
        this.d = u91Var;
        this.e = true;
    }

    @Override // defpackage.x61
    public final void a() {
        this.d.a();
    }

    @Override // defpackage.x61
    public final void b() {
        this.d.b();
    }

    @Override // defpackage.x61
    public final void c(v61 v61Var) {
        this.d.c(new rg(v61Var));
    }

    @Override // defpackage.x61
    public final void d(v61 v61Var) {
        v61Var.getClass();
        this.d.d(new rg(v61Var));
    }

    public final void g(boolean z) {
        boolean z2;
        this.e = z;
        if (z && this.d.b) {
            z2 = true;
        } else {
            z2 = false;
        }
        f(z2);
    }
}
