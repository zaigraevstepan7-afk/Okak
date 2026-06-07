package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class u00 implements se0 {
    public final /* synthetic */ d51 e;
    public final /* synthetic */ y00 f;
    public final /* synthetic */ lq1 g;
    public final /* synthetic */ a12 h;
    public final /* synthetic */ x00 i;

    public u00(d51 d51Var, y00 y00Var, mq1 mq1Var, a12 a12Var, x00 x00Var) {
        this.e = d51Var;
        this.f = y00Var;
        this.g = mq1Var;
        this.h = a12Var;
        this.i = x00Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        ur urVar = (ur) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && urVar.A()) {
            urVar.R();
        } else {
            d51 d51Var = this.e;
            boolean h = urVar.h(d51Var);
            y00 y00Var = this.f;
            boolean h2 = h | urVar.h(y00Var);
            Object L = urVar.L();
            if (h2 || L == or.a) {
                L = new k1(this.h, d51Var, y00Var, 8);
                urVar.h0(L);
            }
            bf.d(d51Var, (oe0) L, urVar);
            io.f(d51Var, this.g, go.N(-497631156, new t00(0, this.i, d51Var), urVar), urVar, 384);
        }
        return od2.a;
    }
}
