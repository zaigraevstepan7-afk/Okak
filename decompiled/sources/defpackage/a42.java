package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class a42 extends cq0 implements se0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ b42 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a42(b42 b42Var, int i) {
        super(2);
        this.e = i;
        this.f = b42Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        od2 od2Var = od2.a;
        b42 b42Var = this.f;
        switch (i) {
            case 0:
                b42Var.a().f = (xr) obj2;
                return od2Var;
            case 1:
                nr0 a = b42Var.a();
                ((ar0) obj).e0(new kr0(a, (se0) obj2, a.t));
                return od2Var;
            default:
                ar0 ar0Var = (ar0) obj;
                e42 e42Var = b42Var.a;
                nr0 nr0Var = ar0Var.L;
                if (nr0Var == null) {
                    nr0Var = new nr0(ar0Var, e42Var);
                    ar0Var.L = nr0Var;
                }
                b42Var.b = nr0Var;
                b42Var.a().g();
                nr0 a2 = b42Var.a();
                if (a2.g != e42Var) {
                    a2.g = e42Var;
                    a2.h(false);
                    ar0.X(a2.e, false, 7);
                }
                return od2Var;
        }
    }
}
