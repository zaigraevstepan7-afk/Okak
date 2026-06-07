package defpackage;

import com.elixir.loader.R;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class rj2 implements wr, su0 {
    public final q5 e;
    public final ds f;
    public boolean g;
    public wu0 h;
    public se0 i = pq.a;

    public rj2(q5 q5Var, ds dsVar) {
        this.e = q5Var;
        this.f = dsVar;
    }

    public final void a() {
        if (!this.g) {
            this.g = true;
            this.e.getView().setTag(R.id.wrapped_composition_tag, null);
            wu0 wu0Var = this.h;
            if (wu0Var != null) {
                wu0Var.f(this);
            }
        }
        this.f.m();
    }

    public final void d(se0 se0Var) {
        this.e.setOnViewTreeOwnersAvailable(new i6(10, this, se0Var));
    }

    @Override // defpackage.su0
    public final void g(uu0 uu0Var, mu0 mu0Var) {
        if (mu0Var == mu0.ON_DESTROY) {
            a();
        } else if (mu0Var == mu0.ON_CREATE && !this.g) {
            d(this.i);
        }
    }
}
