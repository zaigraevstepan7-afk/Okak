package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class w72 extends q42 implements oe0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ b82 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w72(b82 b82Var, vt vtVar, int i) {
        super(1, vtVar);
        this.f = i;
        this.g = b82Var;
    }

    @Override // defpackage.eh
    public final vt create(vt vtVar) {
        int i = this.f;
        b82 b82Var = this.g;
        switch (i) {
            case 0:
                return new w72(b82Var, vtVar, 0);
            case 1:
                return new w72(b82Var, vtVar, 1);
            case 2:
                return new w72(b82Var, vtVar, 2);
            default:
                return new w72(b82Var, vtVar, 3);
        }
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.f;
        od2 od2Var = od2.a;
        vt vtVar = (vt) obj;
        switch (i) {
            case 0:
                ((w72) create(vtVar)).invokeSuspend(od2Var);
                return od2Var;
            case 1:
                ((w72) create(vtVar)).invokeSuspend(od2Var);
                return od2Var;
            case 2:
                ((w72) create(vtVar)).invokeSuspend(od2Var);
                return od2Var;
            default:
                ((w72) create(vtVar)).invokeSuspend(od2Var);
                return od2Var;
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        od2 od2Var = od2.a;
        b82 b82Var = this.g;
        switch (i) {
            case 0:
                io.K(obj);
                b82Var.A = false;
                return od2Var;
            case 1:
                io.K(obj);
                b82Var.f();
                return od2Var;
            case 2:
                io.K(obj);
                b82Var.d(b82Var.A);
                return od2Var;
            default:
                io.K(obj);
                b82Var.p();
                return od2Var;
        }
    }
}
