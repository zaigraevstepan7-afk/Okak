package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class qu implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ su f;

    public /* synthetic */ qu(su suVar, int i) {
        this.e = i;
        this.f = suVar;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        f12 f12Var;
        int i = this.e;
        od2 od2Var = od2.a;
        su suVar = this.f;
        switch (i) {
            case 0:
                hp.J(suVar);
                return od2Var;
            case 1:
                suVar.A.h(true);
                break;
            case 2:
                suVar.A.d(true);
                break;
            case 3:
                suVar.A.f();
                break;
            case 4:
                hp.J(suVar);
                return od2Var;
            case 5:
                suVar.A.p();
                break;
            case 6:
                suVar.w.w.f.r.b(suVar.B.e);
                break;
            default:
                gu0 gu0Var = suVar.w;
                oc0 oc0Var = suVar.C;
                boolean z = suVar.x;
                if (!gu0Var.b()) {
                    oc0.a(oc0Var);
                } else if (!z && (f12Var = gu0Var.c) != null) {
                    ((sz) f12Var).b();
                }
                return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }
}
