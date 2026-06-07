package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class vk extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public final /* synthetic */ ya h;
    public final /* synthetic */ float i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ hn0 k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vk(ya yaVar, float f, boolean z, Object obj, hn0 hn0Var, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.h = yaVar;
        this.i = f;
        this.j = z;
        this.l = obj;
        this.k = hn0Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                return new vk(this.h, this.i, this.j, (wk) obj2, this.k, vtVar, 0);
            default:
                return new vk(this.h, this.i, this.j, (xl) obj2, this.k, vtVar, 1);
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
                return ((vk) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((vk) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v8, types: [hn0] */
    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        od2 od2Var = od2.a;
        hn0 hn0Var = this.k;
        boolean z = this.j;
        hv hvVar = hv.e;
        Object obj2 = this.l;
        ya yaVar = this.h;
        float f = this.i;
        si1 si1Var = null;
        ?? r15 = 0;
        switch (i) {
            case 0:
                wk wkVar = (wk) obj2;
                int i2 = this.g;
                if (i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        se.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    io.K(obj);
                    return od2Var;
                }
                io.K(obj);
                if (!f20.b(((f20) yaVar.e.getValue()).e, f)) {
                    if (!z) {
                        f20 f20Var = new f20(f);
                        this.g = 1;
                        if (yaVar.f(this, f20Var) != hvVar) {
                            return od2Var;
                        }
                    } else {
                        float f2 = ((f20) yaVar.e.getValue()).e;
                        if (f20.b(f2, 0.0f)) {
                            si1Var = new si1(0L);
                        } else if (f20.b(f2, wkVar.b)) {
                            si1Var = new Object();
                        } else if (f20.b(f2, 0.0f)) {
                            si1Var = new Object();
                        }
                        this.g = 2;
                        if (n50.a(yaVar, f, si1Var, hn0Var, this) != hvVar) {
                            return od2Var;
                        }
                    }
                    return hvVar;
                }
                return od2Var;
            default:
                xl xlVar = (xl) obj2;
                int i3 = this.g;
                if (i3 != 0) {
                    if (i3 != 1 && i3 != 2) {
                        se.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    io.K(obj);
                    return od2Var;
                }
                io.K(obj);
                if (!f20.b(((f20) yaVar.e.getValue()).e, f)) {
                    if (!z) {
                        f20 f20Var2 = new f20(f);
                        this.g = 1;
                        if (yaVar.f(this, f20Var2) != hvVar) {
                            return od2Var;
                        }
                    } else {
                        float f3 = ((f20) yaVar.e.getValue()).e;
                        if (f20.b(f3, 0.0f)) {
                            r15 = new si1(0L);
                        } else if (f20.b(f3, xlVar.b)) {
                            r15 = new Object();
                        } else if (f20.b(f3, 0.0f)) {
                            r15 = new Object();
                        } else if (f20.b(f3, xlVar.c)) {
                            r15 = new Object();
                        }
                        this.g = 2;
                        if (n50.a(yaVar, f, r15, hn0Var, this) != hvVar) {
                            return od2Var;
                        }
                    }
                    return hvVar;
                }
                return od2Var;
        }
    }
}
