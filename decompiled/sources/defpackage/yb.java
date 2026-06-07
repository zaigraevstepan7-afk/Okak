package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class yb extends cq0 implements se0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ lb2 f;
    public final /* synthetic */ oe0 g;
    public final /* synthetic */ fq h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(lb2 lb2Var, oe0 oe0Var, c70 c70Var, u70 u70Var, fq fqVar, int i) {
        super(2);
        this.f = lb2Var;
        this.g = oe0Var;
        this.j = c70Var;
        this.k = u70Var;
        this.h = fqVar;
        this.i = i;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        od2 od2Var = od2.a;
        int i2 = this.i;
        Object obj3 = this.k;
        Object obj4 = this.j;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int b0 = lo.b0(i2 | 1);
                lb2 lb2Var = this.f;
                oe0 oe0Var = this.g;
                d6.c(lb2Var, oe0Var, (c70) obj4, (u70) obj3, this.h, (ur) obj, b0);
                return od2Var;
            default:
                ((Number) obj2).intValue();
                int b02 = lo.b0(i2 | 1);
                lb2 lb2Var2 = this.f;
                vn.f(lb2Var2, (e21) obj4, (u90) obj3, this.g, this.h, (ur) obj, b02);
                return od2Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(lb2 lb2Var, e21 e21Var, u90 u90Var, oe0 oe0Var, fq fqVar, int i) {
        super(2);
        this.f = lb2Var;
        this.j = e21Var;
        this.k = u90Var;
        this.g = oe0Var;
        this.h = fqVar;
        this.i = i;
    }
}
