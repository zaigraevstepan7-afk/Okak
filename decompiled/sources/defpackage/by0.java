package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class by0 implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ag f;
    public final /* synthetic */ o22 g;

    public /* synthetic */ by0(ag agVar, o22 o22Var, int i) {
        this.e = i;
        this.f = agVar;
        this.g = o22Var;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        int i = this.e;
        od2 od2Var = od2.a;
        o22 o22Var = this.g;
        ag agVar = this.f;
        switch (i) {
            case 0:
                boolean z = !((Boolean) o22Var.getValue()).booleanValue();
                r22 r22Var = agVar.o;
                Boolean valueOf = Boolean.valueOf(z);
                r22Var.getClass();
                r22Var.k(null, valueOf);
                rx.C(rx.x(agVar), null, new wf(agVar, z, null, 0), 3);
                return od2Var;
            default:
                boolean z2 = !((Boolean) o22Var.getValue()).booleanValue();
                r22 r22Var2 = agVar.m;
                Boolean valueOf2 = Boolean.valueOf(z2);
                r22Var2.getClass();
                r22Var2.k(null, valueOf2);
                return od2Var;
        }
    }
}
