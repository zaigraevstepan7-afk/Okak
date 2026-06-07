package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class in implements te0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ de0 f;

    public /* synthetic */ in(de0 de0Var, int i) {
        this.e = i;
        this.f = de0Var;
    }

    @Override // defpackage.te0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        r31 r31Var;
        int i = 0;
        switch (this.e) {
            case 0:
                ur urVar = (ur) obj2;
                ((Integer) obj3).getClass();
                urVar.X(-756081143);
                dk0 dk0Var = (dk0) urVar.j(ak0.a);
                if (dk0Var != null) {
                    urVar.X(-1604682242);
                    urVar.p(false);
                    r31Var = null;
                } else {
                    urVar.X(-1604549624);
                    Object L = urVar.L();
                    if (L == or.a) {
                        L = new r31();
                        urVar.h0(L);
                    }
                    r31Var = (r31) L;
                    urVar.p(false);
                }
                e21 q = f2.q(b21.a, r31Var, dk0Var, true, null, this.f);
                urVar.p(false);
                return q;
            default:
                l01 l01Var = (l01) obj;
                e01 e01Var = (e01) obj2;
                us usVar = (us) obj3;
                float f = ((f20) this.f.invoke()).e;
                long j = usVar.a;
                if (!f20.b(f, Float.NaN)) {
                    i = l01Var.j0(f);
                }
                ig1 x = e01Var.x(us.a(usVar.a, 0, 0, vs.f(i, j), 0, 11));
                return l01Var.s0(x.e, x.f, m60.e, new df(x, 7));
        }
    }
}
