package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class gb2 implements o22 {
    public final kb2 e;
    public oe0 f;
    public oe0 g;
    public final /* synthetic */ hb2 h;

    public gb2(hb2 hb2Var, kb2 kb2Var, oe0 oe0Var, oe0 oe0Var2) {
        this.h = hb2Var;
        this.e = kb2Var;
        this.f = oe0Var;
        this.g = oe0Var2;
    }

    public final void a(ib2 ib2Var) {
        Object invoke = this.g.invoke(ib2Var.c());
        boolean g = this.h.c.g();
        kb2 kb2Var = this.e;
        if (g) {
            kb2Var.g(this.g.invoke(ib2Var.b()), invoke, (u90) this.f.invoke(ib2Var));
        } else {
            kb2Var.h(invoke, (u90) this.f.invoke(ib2Var));
        }
    }

    @Override // defpackage.o22
    public final Object getValue() {
        a(this.h.c.f());
        return this.e.n.getValue();
    }
}
