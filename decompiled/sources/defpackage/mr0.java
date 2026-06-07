package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class mr0 implements z32 {
    public final q31 a;
    public final /* synthetic */ nr0 b;
    public final /* synthetic */ Object c;

    public mr0(nr0 nr0Var, Object obj) {
        this.b = nr0Var;
        this.c = obj;
        int[] iArr = dn0.a;
        this.a = new q31();
    }

    @Override // defpackage.z32
    public final void a() {
        nr0 nr0Var = this.b;
        ar0 ar0Var = nr0Var.e;
        nr0Var.g();
        i41 i41Var = nr0Var.n;
        Object obj = this.c;
        ar0 ar0Var2 = (ar0) i41Var.k(obj);
        if (ar0Var2 != null) {
            if (nr0Var.s <= 0) {
                kl0.b("No pre-composed items to dispose");
            }
            int i = ((q41) ((z31) ar0Var.o()).f).i(ar0Var2);
            if (i < ((q41) ((z31) ar0Var.o()).f).g - nr0Var.s) {
                kl0.b("Item is not in pre-composed item range");
            }
            nr0Var.r++;
            nr0Var.s--;
            gr0 gr0Var = (gr0) nr0Var.j.g(ar0Var2);
            if (gr0Var != null) {
                nr0.d(gr0Var);
            }
            int i2 = (((q41) ((z31) ar0Var.o()).f).g - nr0Var.s) - nr0Var.r;
            nr0Var.i(i, i2);
            nr0Var.f(i2);
        }
        if (nr0Var.q.h(obj)) {
            ar0.X(ar0Var, true, 6);
        }
    }

    @Override // defpackage.z32
    public final void b(a61 a61Var) {
        a81 a81Var;
        d21 d21Var;
        ar0 ar0Var = (ar0) this.b.n.g(this.c);
        if (ar0Var != null && (a81Var = ar0Var.J) != null && (d21Var = a81Var.f) != null) {
            fr1.v(d21Var, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", a61Var);
        }
    }

    @Override // defpackage.z32
    public final int c() {
        ar0 ar0Var = (ar0) this.b.n.g(this.c);
        if (ar0Var != null) {
            return ((q41) ((z31) ar0Var.n()).f).g;
        }
        return 0;
    }

    @Override // defpackage.z32
    public final void d(int i, long j) {
        nr0 nr0Var = this.b;
        ar0 ar0Var = (ar0) nr0Var.n.g(this.c);
        if (ar0Var != null && ar0Var.H()) {
            int i2 = ((q41) ((z31) ar0Var.n()).f).g;
            if (i < 0 || i >= i2) {
                kl0.d("Index (" + i + ") is out of bound of [0, " + i2 + ')');
            }
            if (ar0Var.I()) {
                kl0.a("Pre-measure called on node that is not placed");
            }
            ar0 ar0Var2 = nr0Var.e;
            ar0Var2.u = true;
            ((q5) dr0.a(ar0Var)).u((ar0) ((z31) ar0Var.n()).get(i), j);
            ar0Var2.u = false;
            this.a.a(i);
        }
    }
}
