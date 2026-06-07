package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ta2 {
    public final y41 a;
    public final p41 b = new p41(Boolean.FALSE);
    public pl c;

    public ta2(y41 y41Var) {
        this.a = y41Var;
    }

    public final void a() {
        this.b.c.setValue(Boolean.FALSE);
    }

    public final boolean b() {
        p41 p41Var = this.b;
        if (!((Boolean) p41Var.b.getValue()).booleanValue() && !((Boolean) p41Var.c.getValue()).booleanValue()) {
            return false;
        }
        return true;
    }

    public final Object c(t41 t41Var, q42 q42Var) {
        vt vtVar = null;
        l4 l4Var = new l4(this, t41Var, new dx(this, vtVar, 2), vtVar, 1);
        y41 y41Var = this.a;
        y41Var.getClass();
        Object u = fp.u(new uw0(t41Var, y41Var, l4Var, null), q42Var);
        if (u == hv.e) {
            return u;
        }
        return od2.a;
    }
}
