package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fc0 extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public final /* synthetic */ r31 h;
    public final /* synthetic */ o41 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fc0(r31 r31Var, o41 o41Var, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.h = r31Var;
        this.i = o41Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        switch (this.f) {
            case 0:
                return new fc0(this.h, this.i, vtVar, 0);
            default:
                return new fc0(this.h, this.i, vtVar, 1);
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
                return ((fc0) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((fc0) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        o41 o41Var = this.i;
        r31 r31Var = this.h;
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
                ArrayList arrayList = new ArrayList();
                sw1 sw1Var = r31Var.a;
                ec0 ec0Var = new ec0(arrayList, o41Var, 0);
                this.g = 1;
                sw1Var.getClass();
                sw1.k(sw1Var, ec0Var, this);
                return hvVar;
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
                ArrayList arrayList2 = new ArrayList();
                sw1 sw1Var2 = r31Var.a;
                ec0 ec0Var2 = new ec0(arrayList2, o41Var, 1);
                this.g = 1;
                sw1Var2.getClass();
                sw1.k(sw1Var2, ec0Var2, this);
                return hvVar;
        }
    }
}
