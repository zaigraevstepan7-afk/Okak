package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class x32 extends cq0 implements se0 {
    public final /* synthetic */ b42 e;
    public final /* synthetic */ e21 f;
    public final /* synthetic */ se0 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x32(b42 b42Var, e21 e21Var, se0 se0Var, int i) {
        super(2);
        this.e = b42Var;
        this.f = e21Var;
        this.g = se0Var;
        this.h = i;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int b0 = lo.b0(this.h | 1);
        bf.t(this.e, this.f, this.g, (ur) obj, b0);
        return od2.a;
    }
}
