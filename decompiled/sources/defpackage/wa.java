package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class wa extends q42 implements oe0 {
    public hc f;
    public sl1 g;
    public int h;
    public final /* synthetic */ ya i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ x52 k;
    public final /* synthetic */ long l;
    public final /* synthetic */ oe0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(ya yaVar, Object obj, x52 x52Var, long j, oe0 oe0Var, vt vtVar) {
        super(1, vtVar);
        this.i = yaVar;
        this.j = obj;
        this.k = x52Var;
        this.l = j;
        this.m = oe0Var;
    }

    @Override // defpackage.eh
    public final vt create(vt vtVar) {
        return new wa(this.i, this.j, this.k, this.l, this.m, vtVar);
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        return ((wa) create((vt) obj)).invokeSuspend(od2.a);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [sl1, java.lang.Object] */
    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        ya yaVar;
        hc hcVar;
        ?? obj2;
        long j;
        va vaVar;
        hc hcVar2;
        sl1 sl1Var;
        CancellationException cancellationException;
        cc ccVar;
        x52 x52Var = this.k;
        int i = this.h;
        ya yaVar2 = this.i;
        if (i != 0) {
            if (i == 1) {
                sl1Var = this.g;
                hcVar2 = this.f;
                try {
                    io.K(obj);
                    yaVar = yaVar2;
                } catch (CancellationException e) {
                    cancellationException = e;
                    yaVar = yaVar2;
                    ya.a(yaVar);
                    throw cancellationException;
                }
            } else {
                se.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            io.K(obj);
            try {
                yaVar2.c.g = (mc) yaVar2.a.a.invoke(this.j);
                yaVar2.e.setValue(x52Var.c);
                yaVar2.d.setValue(Boolean.TRUE);
                hc hcVar3 = yaVar2.c;
                hcVar = new hc(hcVar3.e, hcVar3.f.getValue(), fc2.v(hcVar3.g), hcVar3.h, Long.MIN_VALUE, hcVar3.j);
                obj2 = new Object();
                j = this.l;
                vaVar = new va(yaVar2, hcVar, this.m, obj2, 0);
                yaVar = yaVar2;
            } catch (CancellationException e2) {
                e = e2;
                yaVar = yaVar2;
                cancellationException = e;
                ya.a(yaVar);
                throw cancellationException;
            }
            try {
                this.f = hcVar;
                this.g = obj2;
                this.h = 1;
                Object f = yq1.f(hcVar, x52Var, j, vaVar, this);
                hv hvVar = hv.e;
                if (f == hvVar) {
                    return hvVar;
                }
                hcVar2 = hcVar;
                sl1Var = obj2;
            } catch (CancellationException e3) {
                e = e3;
                cancellationException = e;
                ya.a(yaVar);
                throw cancellationException;
            }
        }
        if (sl1Var.e) {
            ccVar = cc.e;
        } else {
            ccVar = cc.f;
        }
        ya.a(yaVar);
        return new ec(hcVar2, ccVar);
    }
}
