package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class y72 implements b72 {
    public final /* synthetic */ b82 a;
    public final /* synthetic */ boolean b;

    public y72(b82 b82Var, boolean z) {
        this.a = b82Var;
        this.b = z;
    }

    @Override // defpackage.b72
    public final void a() {
        b82 b82Var = this.a;
        b82Var.q.setValue(null);
        b82Var.r.setValue(null);
        b82Var.t(true);
    }

    @Override // defpackage.b72
    public final void b() {
        b82 b82Var = this.a;
        b82Var.q.setValue(null);
        b82Var.r.setValue(null);
        b82Var.t(true);
    }

    @Override // defpackage.b72
    public final void c() {
        hg0 hg0Var;
        x82 d;
        boolean z = this.b;
        if (z) {
            hg0Var = hg0.f;
        } else {
            hg0Var = hg0.g;
        }
        b82 b82Var = this.a;
        b82Var.q.setValue(hg0Var);
        long a = gu1.a(b82Var.l(z));
        gu0 gu0Var = b82Var.d;
        if (gu0Var != null && (d = gu0Var.d()) != null) {
            long e = d.e(a);
            b82Var.n = e;
            b82Var.r.setValue(new z81(e));
            b82Var.p = 0L;
            b82Var.s = -1;
            gu0 gu0Var2 = b82Var.d;
            if (gu0Var2 != null) {
                gu0Var2.q.setValue(Boolean.TRUE);
            }
            b82Var.t(false);
        }
    }

    @Override // defpackage.b72
    public final void e(long j) {
        b82 b82Var = this.a;
        long e = z81.e(b82Var.p, j);
        b82Var.p = e;
        b82Var.r.setValue(new z81(z81.e(b82Var.n, e)));
        i82 n = b82Var.n();
        z81 i = b82Var.i();
        i.getClass();
        b82.c(b82Var, n, i.a, false, this.b, xl1.m, true);
        b82Var.t(false);
    }

    @Override // defpackage.b72
    public final void onCancel() {
    }

    @Override // defpackage.b72
    public final void d(long j, y61 y61Var) {
    }
}
