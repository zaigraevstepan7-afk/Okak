package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class br extends q42 implements te0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ br(Object obj, vt vtVar, int i) {
        super(3, vtVar);
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.te0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f;
        od2 od2Var = od2.a;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                new br((sl1) obj4, (vt) obj3, 0).invokeSuspend(od2Var);
                return od2Var;
            default:
                ((Number) obj2).floatValue();
                new br((dz1) obj4, (vt) obj3, 1).invokeSuspend(od2Var);
                return od2Var;
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        od2 od2Var = od2.a;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                io.K(obj);
                ((sl1) obj2).e = true;
                return od2Var;
            default:
                io.K(obj);
                ((dz1) obj2).m.invoke();
                return od2Var;
        }
    }
}
