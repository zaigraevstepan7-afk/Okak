package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class va1 extends nb1 {
    public static final va1 d;
    public static final va1 e;
    public static final va1 f;
    public static final va1 g;
    public final /* synthetic */ int c;

    static {
        int i = 1;
        d = new va1(i, 2, 0);
        int i2 = 1;
        e = new va1(i2, i2, 1);
        f = new va1(i, 2, 2);
        int i3 = 1;
        g = new va1(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ va1(int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
    }

    @Override // defpackage.nb1
    public final void a(gf0 gf0Var, ge geVar, jz1 jz1Var, fm1 fm1Var, ob1 ob1Var) {
        switch (this.c) {
            case 0:
                Object invoke = ((de0) gf0Var.d(0)).invoke();
                p3 p3Var = (p3) gf0Var.d(1);
                int c = gf0Var.c(0);
                p3Var.getClass();
                jz1Var.U(jz1Var.c(p3Var), invoke);
                geVar.j(c, invoke);
                geVar.d(invoke);
                return;
            case 1:
                p3 p3Var2 = (p3) gf0Var.d(0);
                int c2 = gf0Var.c(0);
                geVar.i();
                p3Var2.getClass();
                geVar.c(c2, jz1Var.D(jz1Var.c(p3Var2)));
                return;
            case 2:
                Object d2 = gf0Var.d(0);
                p3 p3Var3 = (p3) gf0Var.d(1);
                int c3 = gf0Var.c(0);
                if (d2 instanceof hm1) {
                    hm1 hm1Var = (hm1) d2;
                    fm1Var.e.b(hm1Var);
                    fm1Var.d.a(hm1Var);
                }
                Object K = jz1Var.K(d2, jz1Var.c(p3Var3), c3);
                if (K instanceof hm1) {
                    fm1Var.e((hm1) K);
                    return;
                } else {
                    if (K instanceof dl1) {
                        ((dl1) K).c();
                        return;
                    }
                    return;
                }
            default:
                Object d3 = gf0Var.d(0);
                int c4 = gf0Var.c(0);
                if (d3 instanceof hm1) {
                    hm1 hm1Var2 = (hm1) d3;
                    fm1Var.e.b(hm1Var2);
                    fm1Var.d.a(hm1Var2);
                }
                Object K2 = jz1Var.K(d3, jz1Var.t, c4);
                if (K2 instanceof hm1) {
                    fm1Var.e((hm1) K2);
                    return;
                } else {
                    if (K2 instanceof dl1) {
                        ((dl1) K2).c();
                        return;
                    }
                    return;
                }
        }
    }

    @Override // defpackage.nb1
    public p3 b(gf0 gf0Var) {
        switch (this.c) {
            case 0:
                return (p3) gf0Var.d(1);
            case 1:
                return (p3) gf0Var.d(0);
            default:
                return super.b(gf0Var);
        }
    }
}
