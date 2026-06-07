package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class rv extends cq0 implements se0 {
    public final /* synthetic */ Object e;
    public final /* synthetic */ e21 f;
    public final /* synthetic */ u90 g;
    public final /* synthetic */ String h;
    public final /* synthetic */ fq i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv(Object obj, e21 e21Var, u90 u90Var, String str, fq fqVar, int i, int i2) {
        super(2);
        this.e = obj;
        this.f = e21Var;
        this.g = u90Var;
        this.h = str;
        this.i = fqVar;
        this.j = i;
        this.k = i2;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        vn.g(this.e, this.f, this.g, this.h, this.i, (ur) obj, lo.b0(this.j | 1), this.k);
        return od2.a;
    }
}
