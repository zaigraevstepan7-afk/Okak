package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hc0 {
    public final mc0 a;
    public final q5 b;
    public final j41 c;
    public final j41 d;
    public boolean e;

    public hc0(mc0 mc0Var, q5 q5Var) {
        this.a = mc0Var;
        this.b = q5Var;
        j41 j41Var = tr1.a;
        this.c = new j41();
        this.d = new j41();
    }

    public final void a() {
        if (!this.e) {
            e5 e5Var = new e5(0, this, hc0.class, "invalidateNodes", "invalidateNodes()V", 0, 2);
            b41 b41Var = this.b.z0;
            if (b41Var.g(e5Var) < 0) {
                b41Var.a(e5Var);
            }
            this.e = true;
        }
    }
}
