package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class im extends q42 implements se0 {
    public final /* synthetic */ int f = 0;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ lm i;
    public final /* synthetic */ wa0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im(lm lmVar, wa0 wa0Var, Object obj, vt vtVar) {
        super(2, vtVar);
        this.i = lmVar;
        this.j = wa0Var;
        this.h = obj;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        wa0 wa0Var = this.j;
        lm lmVar = this.i;
        switch (i) {
            case 0:
                return new im(lmVar, wa0Var, this.h, vtVar);
            default:
                im imVar = new im(lmVar, wa0Var, vtVar);
                imVar.h = obj;
                return imVar;
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
                return ((im) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((im) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        od2 od2Var = od2.a;
        hv hvVar = hv.e;
        switch (i) {
            case 0:
                int i2 = this.g;
                if (i2 != 0) {
                    if (i2 == 1) {
                        io.K(obj);
                        return od2Var;
                    }
                    se.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                io.K(obj);
                te0 te0Var = this.i.i;
                Object obj2 = this.h;
                this.g = 1;
                if (te0Var.invoke(this.j, obj2, this) == hvVar) {
                    return hvVar;
                }
                return od2Var;
            default:
                int i3 = this.g;
                if (i3 != 0) {
                    if (i3 == 1) {
                        io.K(obj);
                        return od2Var;
                    }
                    se.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                io.K(obj);
                gv gvVar = (gv) this.h;
                Object obj3 = new Object();
                lm lmVar = this.i;
                va0 va0Var = lmVar.h;
                km kmVar = new km(obj3, gvVar, lmVar, this.j, 0);
                this.g = 1;
                if (va0Var.a(kmVar, this) == hvVar) {
                    return hvVar;
                }
                return od2Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im(lm lmVar, wa0 wa0Var, vt vtVar) {
        super(2, vtVar);
        this.i = lmVar;
        this.j = wa0Var;
    }
}
