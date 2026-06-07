package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class m11 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ de0 g;

    public /* synthetic */ m11(String str, de0 de0Var, int i) {
        this.e = i;
        this.f = str;
        this.g = de0Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.e;
        od2 od2Var = od2.a;
        de0 de0Var = this.g;
        String str = this.f;
        av1 av1Var = (av1) obj;
        switch (i) {
            case 0:
                ep0[] ep0VarArr = xu1.a;
                zu1 zu1Var = vu1.t;
                ep0 ep0Var = xu1.a[11];
                av1Var.a(zu1Var, Float.valueOf(1.0f));
                xu1.b(av1Var, str);
                av1Var.a(lu1.b, new s0(null, new og0(de0Var, 1)));
                return od2Var;
            default:
                xu1.b(av1Var, str);
                av1Var.a(lu1.b, new s0(null, new og0(de0Var, 3)));
                return od2Var;
        }
    }
}
