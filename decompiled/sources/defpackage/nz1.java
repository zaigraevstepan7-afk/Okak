package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class nz1 implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ pz1 f;

    public /* synthetic */ nz1(pz1 pz1Var, int i) {
        this.e = i;
        this.f = pz1Var;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        int i = this.e;
        pz1 pz1Var = this.f;
        switch (i) {
            case 0:
                pl plVar = pz1Var.b;
                if (plVar.v()) {
                    plVar.resumeWith(xz1.e);
                }
                return Boolean.TRUE;
            default:
                pl plVar2 = pz1Var.b;
                if (plVar2.v()) {
                    plVar2.resumeWith(xz1.f);
                }
                return od2.a;
        }
    }
}
