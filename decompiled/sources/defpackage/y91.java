package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class y91 {
    public final Runnable a;
    public final q4 b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, a71] */
    public y91(Runnable runnable) {
        this.a = runnable;
        q4 q4Var = new q4(new l2(this));
        this.b = q4Var;
        q4Var.d(new Object());
    }

    public final void a(uu0 uu0Var, u91 u91Var) {
        wu0 g = uu0Var.g();
        if (g.c == nu0.e) {
            return;
        }
        t91 t91Var = new t91(u91Var, new v91(uu0Var, u91Var));
        u91Var.a.add(t91Var);
        t91Var.g(false);
        q4.c(this.b, t91Var);
        x91 x91Var = new x91(t91Var, this, g);
        g.a(x91Var);
        u91Var.c.add(x91Var);
    }
}
