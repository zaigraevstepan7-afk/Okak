package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class cr extends x0 {
    public final gv c;
    public se0 d;
    public lk e;
    public i22 f;
    public boolean g;

    public cr(gv gvVar, hi1 hi1Var) {
        super(hi1Var);
        this.c = gvVar;
        this.d = new ea(2, null, 1);
    }

    @Override // defpackage.x0
    public final void e() {
        lk lkVar = this.e;
        if (lkVar != null) {
            lkVar.i(new CancellationException("onBack cancelled"), true);
        }
        i22 i22Var = this.f;
        if (i22Var != null) {
            i22Var.c(null);
        }
        this.e = null;
        this.f = null;
        this.g = false;
    }

    @Override // defpackage.x0
    public final void f() {
        if (this.e != null && !this.g) {
            e();
        }
        vt vtVar = null;
        if (this.e == null) {
            this.g = false;
            this.e = sn0.c(-2, 4, jk.e);
            this.f = rx.C(this.c, null, new j(this, vtVar, 10), 3);
        }
        lk lkVar = this.e;
        if (lkVar != null) {
            lkVar.i(null, false);
        }
        this.g = false;
    }

    @Override // defpackage.x0
    public final void g(rg rgVar) {
        lk lkVar = this.e;
        if (lkVar != null) {
            lkVar.j(rgVar);
        }
    }

    @Override // defpackage.x0
    public final void h() {
        e();
        if (super.d()) {
            this.g = true;
            this.e = sn0.c(-2, 4, jk.e);
            this.f = rx.C(this.c, null, new j(this, null, 10), 3);
        }
    }

    public final void j(boolean z) {
        i22 i22Var;
        if (!z && super.d() && (i22Var = this.f) != null && !i22Var.b()) {
            e();
        }
        ((tg) this.a).e(z);
        ((sg) this.b).f(z);
    }
}
