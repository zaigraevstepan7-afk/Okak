package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class wf extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wf(Object obj, boolean z, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.i = obj;
        this.h = z;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        boolean z = this.h;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                return new wf((ag) obj2, z, vtVar, 0);
            default:
                return new wf((b82) obj2, z, vtVar, 1);
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
                return ((wf) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((wf) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        nn nnVar;
        int i = this.f;
        boolean z = this.h;
        hv hvVar = hv.e;
        od2 od2Var = od2.a;
        Object obj2 = this.i;
        rc rcVar = null;
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
                    rw rwVar = ((ag) obj2).c;
                    this.g = 1;
                    Object i3 = rwVar.a.i(new hw(z, null), this);
                    if (i3 != hvVar) {
                        i3 = od2Var;
                    }
                    if (i3 == hvVar) {
                        return hvVar;
                    }
                }
                return od2Var;
            default:
                b82 b82Var = (b82) obj2;
                int i4 = this.g;
                if (i4 != 0) {
                    if (i4 == 1) {
                        io.K(obj);
                    } else {
                        se.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    io.K(obj);
                    if (!d92.c(b82Var.n().b)) {
                        rcVar = xq1.m(b82Var.n());
                        if (z) {
                            int e = d92.e(b82Var.n().b);
                            b82Var.c.invoke(b82.e(b82Var.n().a, fr1.a(e, e)));
                            b82Var.q(jg0.e);
                        }
                    }
                    if (rcVar != null && (nnVar = b82Var.g) != null) {
                        mn O = mp0.O(rcVar);
                        this.g = 1;
                        ((w4) nnVar).a.a.setPrimaryClip(O.a);
                        if (od2Var == hvVar) {
                            return hvVar;
                        }
                    }
                }
                return od2Var;
        }
    }
}
