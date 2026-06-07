package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class tg extends u91 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg(y6 y6Var) {
        super(true);
        this.d = 2;
        this.e = y6Var;
    }

    @Override // defpackage.u91
    public void a() {
        switch (this.d) {
            case 0:
                ((x0) this.e).e();
                return;
            default:
                return;
        }
    }

    @Override // defpackage.u91
    public final void b() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((x0) obj).f();
                return;
            case 1:
                j51 j51Var = ((c61) obj).b;
                if (!j51Var.f.isEmpty()) {
                    r51 g = j51Var.g();
                    g.getClass();
                    if (j51Var.l(g.f.a, true, false)) {
                        j51Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((y6) obj).invoke(this);
                return;
        }
    }

    @Override // defpackage.u91
    public void c(rg rgVar) {
        switch (this.d) {
            case 0:
                ((x0) this.e).g(rgVar);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.u91
    public void d(rg rgVar) {
        switch (this.d) {
            case 0:
                ((x0) this.e).h();
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tg(Object obj, int i) {
        super(false);
        this.d = i;
        this.e = obj;
    }
}
