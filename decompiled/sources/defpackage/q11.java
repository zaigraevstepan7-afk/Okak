package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class q11 implements de0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ ex1 f;
    public final /* synthetic */ gv g;
    public final /* synthetic */ de0 h;

    public /* synthetic */ q11(ex1 ex1Var, gv gvVar, de0 de0Var) {
        this.f = ex1Var;
        this.g = gvVar;
        this.h = de0Var;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        int i = this.e;
        od2 od2Var = od2.a;
        de0 de0Var = this.h;
        gv gvVar = this.g;
        ex1 ex1Var = this.f;
        switch (i) {
            case 0:
                int ordinal = ex1Var.c().ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        rx.C(gvVar, null, new ey0(ex1Var, null, 7), 3);
                    } else {
                        rx.C(gvVar, null, new ey0(ex1Var, null, 6), 3);
                    }
                } else {
                    de0Var.invoke();
                }
                return od2Var;
            default:
                if (((Boolean) ex1Var.c.invoke(fx1.e)).booleanValue()) {
                    rx.C(gvVar, null, new ey0(ex1Var, null, 5), 3).r(new i(21, ex1Var, de0Var));
                }
                return od2Var;
        }
    }

    public /* synthetic */ q11(ex1 ex1Var, de0 de0Var, gv gvVar) {
        this.f = ex1Var;
        this.h = de0Var;
        this.g = gvVar;
    }
}
