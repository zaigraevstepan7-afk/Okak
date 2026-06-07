package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class q extends q42 implements se0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ kn g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(kn knVar, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.g = knVar;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        kn knVar = this.g;
        switch (i) {
            case 0:
                return new q(knVar, vtVar, 0);
            default:
                return new q(knVar, vtVar, 1);
        }
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        od2 od2Var = od2.a;
        gv gvVar = (gv) obj;
        vt vtVar = (vt) obj2;
        switch (i) {
            case 0:
                ((q) create(gvVar, vtVar)).invokeSuspend(od2Var);
                return od2Var;
            default:
                ((q) create(gvVar, vtVar)).invokeSuspend(od2Var);
                return od2Var;
        }
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [li0, java.lang.Object] */
    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        od2 od2Var = od2.a;
        vt vtVar = null;
        kn knVar = this.g;
        switch (i) {
            case 0:
                io.K(obj);
                if (knVar.F == null) {
                    ?? obj2 = new Object();
                    r31 r31Var = knVar.u;
                    if (r31Var != null) {
                        rx.C(knVar.z0(), null, new j(r31Var, obj2, vtVar, 0), 3);
                    }
                    knVar.F = obj2;
                }
                return od2Var;
            default:
                io.K(obj);
                li0 li0Var = knVar.F;
                if (li0Var != null) {
                    mi0 mi0Var = new mi0(li0Var);
                    r31 r31Var2 = knVar.u;
                    if (r31Var2 != null) {
                        rx.C(knVar.z0(), null, new j(r31Var2, mi0Var, vtVar, 1), 3);
                    }
                    knVar.F = null;
                }
                return od2Var;
        }
    }
}
