package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class eb extends cq0 implements se0 {
    public final /* synthetic */ lb2 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ oe0 g;
    public final /* synthetic */ pb h;
    public final /* synthetic */ a12 i;
    public final /* synthetic */ fq j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(lb2 lb2Var, Object obj, oe0 oe0Var, pb pbVar, a12 a12Var, fq fqVar) {
        super(2);
        this.e = lb2Var;
        this.f = obj;
        this.g = oe0Var;
        this.h = pbVar;
        this.i = a12Var;
        this.j = fqVar;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        u70 u70Var;
        ur urVar = (ur) obj;
        int intValue = ((Number) obj2).intValue();
        if ((intValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(intValue & 1, z)) {
            Object L = urVar.L();
            oe0 oe0Var = this.g;
            pb pbVar = this.h;
            xl1 xl1Var = or.a;
            if (L == xl1Var) {
                L = (lt) oe0Var.invoke(pbVar);
                urVar.h0(L);
            }
            lt ltVar = (lt) L;
            lb2 lb2Var = this.e;
            ib2 f = lb2Var.f();
            je1 je1Var = lb2Var.d;
            Object c = f.c();
            Object obj3 = this.f;
            boolean g = urVar.g(sn0.r(c, obj3));
            Object L2 = urVar.L();
            if (g || L2 == xl1Var) {
                if (sn0.r(lb2Var.f().c(), obj3)) {
                    u70Var = u70.b;
                } else {
                    u70Var = ((lt) oe0Var.invoke(pbVar)).b;
                }
                L2 = u70Var;
                urVar.h0(L2);
            }
            u70 u70Var2 = (u70) L2;
            Object L3 = urVar.L();
            if (L3 == xl1Var) {
                L3 = new kb(sn0.r(obj3, je1Var.getValue()));
                urVar.h0(L3);
            }
            kb kbVar = (kb) L3;
            c70 c70Var = ltVar.a;
            boolean h = urVar.h(ltVar);
            Object L4 = urVar.L();
            if (h || L4 == xl1Var) {
                L4 = new bb(ltVar, 0);
                urVar.h0(L4);
            }
            e21 D = mp0.D(b21.a, (te0) L4);
            kbVar.a.setValue(Boolean.valueOf(sn0.r(obj3, je1Var.getValue())));
            e21 d = D.d(kbVar);
            boolean h2 = urVar.h(obj3);
            Object L5 = urVar.L();
            if (h2 || L5 == xl1Var) {
                L5 = new n3(obj3, 6);
                urVar.h0(L5);
            }
            oe0 oe0Var2 = (oe0) L5;
            boolean f2 = urVar.f(u70Var2);
            Object L6 = urVar.L();
            if (f2 || L6 == xl1Var) {
                L6 = new t(u70Var2, 3);
                urVar.h0(L6);
            }
            d6.a(this.e, oe0Var2, d, c70Var, u70Var2, (se0) L6, go.N(-143346359, new db(this.i, obj3, pbVar, this.j), urVar), urVar, 12582912);
        } else {
            urVar.R();
        }
        return od2.a;
    }
}
