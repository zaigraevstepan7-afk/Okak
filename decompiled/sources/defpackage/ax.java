package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ax extends q42 implements te0 {
    public final /* synthetic */ int f = 1;
    public int g;
    public /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(nx nxVar, vt vtVar) {
        super(3, vtVar);
        this.h = nxVar;
    }

    @Override // defpackage.te0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f;
        od2 od2Var = od2.a;
        switch (i) {
            case 0:
                return new ax((nx) this.h, (vt) obj3).invokeSuspend(od2Var);
            default:
                ((Boolean) obj2).getClass();
                ax axVar = new ax(3, (vt) obj3);
                axVar.h = (h91) obj;
                return axVar.invokeSuspend(od2Var);
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        hv hvVar = hv.e;
        switch (i) {
            case 0:
                int i2 = this.g;
                if (i2 != 0) {
                    if (i2 == 1) {
                        io.K(obj);
                    } else {
                        se.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    io.K(obj);
                    nx nxVar = (nx) this.h;
                    this.g = 1;
                    if (nx.a(nxVar, this) == hvVar) {
                        return hvVar;
                    }
                }
                return od2.a;
            default:
                int i3 = this.g;
                if (i3 != 0) {
                    if (i3 == 1) {
                        io.K(obj);
                        return obj;
                    }
                    se.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                io.K(obj);
                h91 h91Var = (h91) this.h;
                this.g = 1;
                h91Var.getClass();
                Object a = h91.a(h91Var, this);
                if (a == hvVar) {
                    return hvVar;
                }
                return a;
        }
    }

    public /* synthetic */ ax(int i, vt vtVar) {
        super(i, vtVar);
    }
}
