package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ kn f;

    public /* synthetic */ h(kn knVar, int i) {
        this.e = i;
        this.f = knVar;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        qz qzVar;
        int i = this.e;
        kn knVar = this.f;
        switch (i) {
            case 0:
                dk0 dk0Var = (dk0) hp.s(knVar, ak0.a);
                if (dk0Var == null) {
                    nl0.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + dk0Var);
                }
                dk0 dk0Var2 = knVar.C;
                knVar.C = dk0Var;
                if (dk0Var2 != null && !sn0.r(dk0Var, dk0Var2) && ((qzVar = knVar.D) != null || !knVar.K)) {
                    if (qzVar != null) {
                        knVar.M0(qzVar);
                    }
                    knVar.D = null;
                    knVar.T0();
                }
                return od2.a;
            default:
                knVar.A.invoke();
                return Boolean.TRUE;
        }
    }
}
