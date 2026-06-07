package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class cw extends q42 implements oe0 {
    public int f;

    @Override // defpackage.eh
    public final vt create(vt vtVar) {
        return new q42(1, vtVar);
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        cw cwVar = (cw) create((vt) obj);
        od2 od2Var = od2.a;
        cwVar.invokeSuspend(od2Var);
        return od2Var;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        if (i != 0) {
            if (i == 1) {
                io.K(obj);
                return od2.a;
            }
            se.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        io.K(obj);
        this.f = 1;
        throw null;
    }
}
