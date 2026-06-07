package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class k40 extends q42 implements ue0 {
    public int f;
    public /* synthetic */ m4 g;
    public /* synthetic */ cy h;
    public /* synthetic */ m40 i;
    public final /* synthetic */ l40 j;
    public final /* synthetic */ float k;
    public final /* synthetic */ gc l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k40(l40 l40Var, float f, gc gcVar, vt vtVar) {
        super(4, vtVar);
        this.j = l40Var;
        this.k = f;
        this.l = gcVar;
    }

    @Override // defpackage.ue0
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        float f = this.k;
        gc gcVar = this.l;
        k40 k40Var = new k40(this.j, f, gcVar, (vt) obj4);
        k40Var.g = (m4) obj;
        k40Var.h = (cy) obj2;
        k40Var.i = (m40) obj3;
        return k40Var.invokeSuspend(od2.a);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [tl1, java.lang.Object] */
    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        float g;
        int i = this.f;
        if (i != 0) {
            if (i == 1) {
                io.K(obj);
            } else {
                se.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            io.K(obj);
            m4 m4Var = this.g;
            float f = this.h.f(this.i);
            if (!Float.isNaN(f)) {
                ?? obj2 = new Object();
                l40 l40Var = this.j;
                if (Float.isNaN(l40Var.b.j.g())) {
                    g = 0.0f;
                } else {
                    g = l40Var.b.j.g();
                }
                float f2 = g;
                obj2.e = f2;
                w3 w3Var = new w3(m4Var, obj2, 1);
                this.g = null;
                this.h = null;
                this.f = 1;
                Object e = yq1.e(f2, f, this.k, this.l, w3Var, this);
                hv hvVar = hv.e;
                if (e == hvVar) {
                    return hvVar;
                }
            }
        }
        return od2.a;
    }
}
