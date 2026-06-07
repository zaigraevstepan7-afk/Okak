package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class t30 extends q42 implements te0 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t30(int i, vt vtVar, int i2) {
        super(i, vtVar);
        this.f = i2;
    }

    @Override // defpackage.te0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f;
        od2 od2Var = od2.a;
        int i2 = 3;
        switch (i) {
            case 0:
                long j = ((z81) obj2).a;
                new t30(i2, (vt) obj3, 0).invokeSuspend(od2Var);
                return od2Var;
            case 1:
                ((Number) obj2).floatValue();
                new t30(i2, (vt) obj3, 1).invokeSuspend(od2Var);
                return od2Var;
            default:
                long j2 = ((z81) obj2).a;
                new t30(i2, (vt) obj3, 2).invokeSuspend(od2Var);
                return od2Var;
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        od2 od2Var = od2.a;
        switch (i) {
            case 0:
                io.K(obj);
                return od2Var;
            case 1:
                io.K(obj);
                return od2Var;
            default:
                io.K(obj);
                return od2Var;
        }
    }
}
