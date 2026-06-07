package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ht extends q42 implements se0 {
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ jt h;
    public final /* synthetic */ wd2 i;
    public final /* synthetic */ xj j;
    public final /* synthetic */ long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht(jt jtVar, wd2 wd2Var, xj xjVar, long j, vt vtVar) {
        super(2, vtVar);
        this.h = jtVar;
        this.i = wd2Var;
        this.j = xjVar;
        this.k = j;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        ht htVar = new ht(this.h, this.i, this.j, this.k, vtVar);
        htVar.g = obj;
        return htVar;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        return ((ht) create((gv) obj, (vt) obj2)).invokeSuspend(od2.a);
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        jt jtVar = this.h;
        nj njVar = jtVar.x;
        int i = this.f;
        try {
            try {
                if (i != 0) {
                    if (i == 1) {
                        io.K(obj);
                    } else {
                        se.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    io.K(obj);
                    go0 D = lo.D(((gv) this.g).A());
                    jtVar.A = true;
                    at1 at1Var = jtVar.t;
                    t41 t41Var = t41.e;
                    gt gtVar = new gt(this.i, jtVar, this.j, this.k, D, null);
                    this.f = 1;
                    Object f = at1Var.f(t41Var, gtVar, this);
                    hv hvVar = hv.e;
                    if (f == hvVar) {
                        return hvVar;
                    }
                }
                njVar.b();
                jtVar.A = false;
                njVar.a(null);
                jtVar.y = false;
                return od2.a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            jtVar.A = false;
            njVar.a(null);
            jtVar.y = false;
            throw th;
        }
    }
}
