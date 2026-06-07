package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zh0 extends q42 implements se0 {
    public final /* synthetic */ int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ bi0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zh0(bi0 bi0Var, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.h = bi0Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        switch (this.f) {
            case 0:
                zh0 zh0Var = new zh0(this.h, vtVar, 0);
                zh0Var.g = obj;
                return zh0Var;
            case 1:
                zh0 zh0Var2 = new zh0(this.h, vtVar, 1);
                zh0Var2.g = obj;
                return zh0Var2;
            default:
                zh0 zh0Var3 = new zh0(this.h, vtVar, 2);
                zh0Var3.g = obj;
                return zh0Var3;
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
                return ((zh0) create(gvVar, vtVar)).invokeSuspend(od2Var);
            case 1:
                return ((zh0) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((zh0) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        Object fo1Var;
        Object fo1Var2;
        Object fo1Var3;
        int i = this.f;
        l60 l60Var = l60.e;
        bi0 bi0Var = this.h;
        switch (i) {
            case 0:
                io.K(obj);
                try {
                    fo1Var = i32.Y(xn.Q(bi0.f(bi0Var))).toString();
                } catch (Throwable th) {
                    fo1Var = new fo1(th);
                }
                if (fo1Var instanceof fo1) {
                    return "";
                }
                return fo1Var;
            case 1:
                io.K(obj);
                try {
                    fo1Var2 = xn.P(bi0.e(bi0Var));
                } catch (Throwable th2) {
                    fo1Var2 = new fo1(th2);
                }
                if (!(fo1Var2 instanceof fo1)) {
                    return fo1Var2;
                }
                return l60Var;
            default:
                io.K(obj);
                try {
                    fo1Var3 = wn.y0(50, xn.P(bi0.e(bi0Var)));
                } catch (Throwable th3) {
                    fo1Var3 = new fo1(th3);
                }
                if (!(fo1Var3 instanceof fo1)) {
                    return fo1Var3;
                }
                return l60Var;
        }
    }
}
