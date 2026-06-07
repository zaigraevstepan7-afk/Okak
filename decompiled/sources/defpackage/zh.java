package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zh extends q42 implements se0 {
    public /* synthetic */ boolean f;
    public final /* synthetic */ ta2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh(ta2 ta2Var, vt vtVar) {
        super(2, vtVar);
        this.g = ta2Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        zh zhVar = new zh(this.g, vtVar);
        zhVar.f = ((Boolean) obj).booleanValue();
        return zhVar;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        zh zhVar = (zh) create(bool, (vt) obj2);
        od2 od2Var = od2.a;
        zhVar.invokeSuspend(od2Var);
        return od2Var;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        io.K(obj);
        if (!this.f) {
            this.g.a();
        }
        return od2.a;
    }
}
