package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class yj1 implements se0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ k92 g;
    public final /* synthetic */ se0 h;
    public final /* synthetic */ int i;

    public /* synthetic */ yj1(long j, k92 k92Var, se0 se0Var, int i, int i2) {
        this.e = i2;
        this.f = j;
        this.g = k92Var;
        this.h = se0Var;
        this.i = i;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        od2 od2Var = od2.a;
        int i2 = this.i;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int b0 = lo.b0(i2 | 1);
                xn.i(this.f, this.g, this.h, (ur) obj, b0);
                return od2Var;
            default:
                ((Integer) obj2).getClass();
                int b02 = lo.b0(i2 | 1);
                pp1.b(this.f, this.g, this.h, (ur) obj, b02);
                return od2Var;
        }
    }
}
