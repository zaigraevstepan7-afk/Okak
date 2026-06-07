package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class rs1 extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public final /* synthetic */ ts1 h;
    public /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rs1(ts1 ts1Var, long j, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.h = ts1Var;
        this.i = j;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        switch (this.f) {
            case 0:
                return new rs1(this.h, this.i, vtVar, 0);
            case 1:
                return new rs1(this.h, this.i, vtVar, 1);
            default:
                rs1 rs1Var = new rs1(this.h, vtVar);
                rs1Var.i = ((z81) obj).a;
                return rs1Var;
        }
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        od2 od2Var = od2.a;
        switch (i) {
            case 0:
                return ((rs1) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 1:
                return ((rs1) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            default:
                long j = ((z81) obj).a;
                rs1 rs1Var = new rs1(this.h, (vt) obj2);
                rs1Var.i = j;
                return rs1Var.invokeSuspend(od2Var);
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        od2 od2Var = od2.a;
        ts1 ts1Var = this.h;
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
                at1 at1Var = ts1Var.R;
                qs1 qs1Var = new qs1(this.i, null);
                this.g = 1;
                if (at1Var.f(t41.f, qs1Var, this) == hvVar) {
                    return hvVar;
                }
                return od2Var;
            case 1:
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
                at1 at1Var2 = ts1Var.R;
                long j = this.i;
                this.g = 1;
                if (at1Var2.b(j, true, this) == hvVar) {
                    return hvVar;
                }
                return od2Var;
            default:
                int i4 = this.g;
                if (i4 != 0) {
                    if (i4 == 1) {
                        io.K(obj);
                        return obj;
                    }
                    se.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                io.K(obj);
                long j2 = this.i;
                at1 at1Var3 = ts1Var.R;
                this.g = 1;
                Object a = ms1.a(at1Var3, j2, this);
                if (a == hvVar) {
                    return hvVar;
                }
                return a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs1(ts1 ts1Var, vt vtVar) {
        super(2, vtVar);
        this.f = 2;
        this.h = ts1Var;
    }
}
