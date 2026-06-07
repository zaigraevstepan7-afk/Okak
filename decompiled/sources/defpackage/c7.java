package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class c7 extends cq0 implements se0 {
    public final /* synthetic */ e21 e;
    public final /* synthetic */ se0 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(e21 e21Var, se0 se0Var, int i) {
        super(2);
        this.e = e21Var;
        this.f = se0Var;
        this.g = i;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int b0 = lo.b0(this.g | 1);
        bf.u(this.e, this.f, (ur) obj, b0);
        return od2.a;
    }
}
