package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ng extends d21 {
    public w92 s;
    public final /* synthetic */ og t;

    public ng(og ogVar) {
        this.t = ogVar;
    }

    @Override // defpackage.d21
    public final void D0() {
        og ogVar = this.t;
        ogVar.a = this;
        if (ogVar.b != null) {
            L0();
        }
    }

    @Override // defpackage.d21
    public final void E0() {
        og ogVar = this.t;
        if (ogVar.a == this) {
            ogVar.a = null;
        }
        w92 w92Var = this.s;
        if (w92Var != null) {
            w92Var.b();
        }
        this.s = null;
    }

    public final void L0() {
        i iVar = new i(3, this, this.t);
        ar0 M = hp.M(this);
        int i = M.f;
        rl1 rectManager = ((q5) dr0.a(M)).getRectManager();
        x92 x92Var = rectManager.b;
        x92Var.getClass();
        p31 p31Var = x92Var.a;
        w92 w92Var = new w92(x92Var, i, this, iVar);
        Object b = p31Var.b(i);
        if (b == null) {
            p31Var.i(i, w92Var);
            b = w92Var;
        }
        w92 w92Var2 = (w92) b;
        if (w92Var2 != w92Var) {
            while (true) {
                w92 w92Var3 = w92Var2.d;
                if (w92Var3 == null) {
                    break;
                } else {
                    w92Var2 = w92Var3;
                }
            }
            w92Var2.d = w92Var;
        }
        if (hp.M(this.e).l) {
            rectManager.a.f(i, true);
        }
        rectManager.d = true;
        rectManager.j();
        this.s = w92Var;
    }
}
