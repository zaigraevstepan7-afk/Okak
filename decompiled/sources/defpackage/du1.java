package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class du1 extends eo1 implements se0 {
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ long g;
    public final /* synthetic */ vl1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du1(long j, vl1 vl1Var, vt vtVar) {
        super(2, vtVar);
        this.g = j;
        this.h = vl1Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        du1 du1Var = new du1(this.g, this.h, vtVar);
        du1Var.f = obj;
        return du1Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        return ((du1) create((v42) obj, (vt) obj2)).invokeSuspend(od2.a);
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        v42 v42Var;
        int i = this.e;
        vl1 vl1Var = this.h;
        if (i != 0) {
            if (i == 1) {
                v42Var = (v42) this.f;
                io.K(obj);
            } else {
                se.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            io.K(obj);
            v42 v42Var2 = (v42) this.f;
            h8 h8Var = new h8(vl1Var, 17);
            this.f = v42Var2;
            this.e = 1;
            Object c = g30.c(v42Var2, this.g, h8Var, this);
            hv hvVar = hv.e;
            if (c == hvVar) {
                return hvVar;
            }
            obj = c;
            v42Var = v42Var2;
        }
        if (((qh1) obj) != null && (vl1Var.e & 9223372034707292159L) != 9205357640488583168L) {
            return d20.f;
        }
        qh1 qh1Var = (qh1) wn.g0(v42Var.j.w.a);
        if (qo.q(qh1Var)) {
            qh1Var.a();
            return d20.e;
        }
        return d20.h;
    }
}
