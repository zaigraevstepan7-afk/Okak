package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class n11 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;

    public /* synthetic */ n11(Object obj, int i, long j) {
        this.e = i;
        this.f = j;
        this.g = obj;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.e;
        od2 od2Var = od2.a;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                c40.X((c40) obj, this.f, 0L, 0L, go.o(((Number) ((o22) obj2).getValue()).floatValue(), 0.0f, 1.0f), 118);
                return od2Var;
            default:
                c40.X((c40) obj, this.f, 0L, 0L, ((Number) ((de0) obj2).invoke()).floatValue(), 118);
                return od2Var;
        }
    }
}
