package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ht1 extends q42 implements se0 {
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ lt1 j;
    public final /* synthetic */ lb2 k;
    public final /* synthetic */ float l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht1(Object obj, Object obj2, lt1 lt1Var, lb2 lb2Var, float f, vt vtVar) {
        super(2, vtVar);
        this.h = obj;
        this.i = obj2;
        this.j = lt1Var;
        this.k = lb2Var;
        this.l = f;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        ht1 ht1Var = new ht1(this.h, this.i, this.j, this.k, this.l, vtVar);
        ht1Var.g = obj;
        return ht1Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        return ((ht1) create((gv) obj, (vt) obj2)).invokeSuspend(od2.a);
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        od2 od2Var = od2.a;
        lt1 lt1Var = this.j;
        if (i != 0) {
            if (i == 1) {
                io.K(obj);
            } else {
                se.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            io.K(obj);
            gv gvVar = (gv) this.g;
            Object obj2 = this.h;
            Object obj3 = this.i;
            if (!sn0.r(obj2, obj3)) {
                lt1.i(lt1Var);
            } else {
                lt1Var.n = null;
                if (sn0.r(lt1Var.c.getValue(), obj2)) {
                    return od2Var;
                }
            }
            boolean r = sn0.r(obj2, obj3);
            float f = this.l;
            if (!r) {
                lb2 lb2Var = this.k;
                lb2Var.p(obj2);
                lb2Var.n(0L);
                lt1Var.b.setValue(obj2);
                lb2Var.j(f);
            }
            lt1Var.r(f);
            if (lt1Var.m.i()) {
                rx.C(gvVar, null, new vf(lt1Var, (vt) null, 12), 3);
            } else {
                lt1Var.l = Long.MIN_VALUE;
            }
            this.f = 1;
            Object l = lt1.l(lt1Var, this);
            hv hvVar = hv.e;
            if (l == hvVar) {
                return hvVar;
            }
        }
        lt1Var.q();
        return od2Var;
    }
}
