package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class x72 implements b72 {
    public final /* synthetic */ b82 a;

    public x72(b82 b82Var) {
        this.a = b82Var;
    }

    @Override // defpackage.b72
    public final void a() {
        b82 b82Var = this.a;
        b82Var.q.setValue(null);
        b82Var.r.setValue(null);
    }

    @Override // defpackage.b72
    public final void b() {
        b82 b82Var = this.a;
        b82Var.q.setValue(null);
        b82Var.r.setValue(null);
    }

    @Override // defpackage.b72
    public final void d(long j, y61 y61Var) {
        x82 d;
        b82 b82Var = this.a;
        long a = gu1.a(b82Var.l(true));
        gu0 gu0Var = b82Var.d;
        if (gu0Var != null && (d = gu0Var.d()) != null) {
            long e = d.e(a);
            b82Var.n = e;
            b82Var.r.setValue(new z81(e));
            b82Var.p = 0L;
            b82Var.q.setValue(hg0.e);
            b82Var.t(false);
        }
    }

    @Override // defpackage.b72
    public final void e(long j) {
        x82 d;
        rg0 rg0Var;
        b82 b82Var = this.a;
        b82Var.p = z81.e(b82Var.p, j);
        gu0 gu0Var = b82Var.d;
        if (gu0Var != null && (d = gu0Var.d()) != null) {
            b82Var.r.setValue(new z81(z81.e(b82Var.n, b82Var.p)));
            c91 c91Var = b82Var.b;
            z81 i = b82Var.i();
            i.getClass();
            int c = c91Var.c(d.b(i.a, true));
            long a = fr1.a(c, c);
            if (!d92.b(a, b82Var.n().b)) {
                gu0 gu0Var2 = b82Var.d;
                if ((gu0Var2 == null || ((Boolean) gu0Var2.q.getValue()).booleanValue()) && (rg0Var = b82Var.j) != null) {
                    rg0Var.a();
                }
                b82Var.c.invoke(b82.e(b82Var.n().a, a));
                b82Var.v = new d92(a);
            }
        }
    }

    @Override // defpackage.b72
    public final void c() {
    }

    @Override // defpackage.b72
    public final void onCancel() {
    }
}
