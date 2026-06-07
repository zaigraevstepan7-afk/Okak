package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class a9 extends cq0 implements se0 {
    public final /* synthetic */ bi1 e;
    public final /* synthetic */ de0 f;
    public final /* synthetic */ ci1 g;
    public final /* synthetic */ fq h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(bi1 bi1Var, de0 de0Var, ci1 ci1Var, fq fqVar, int i, int i2) {
        super(2);
        this.e = bi1Var;
        this.f = de0Var;
        this.g = ci1Var;
        this.h = fqVar;
        this.i = i;
        this.j = i2;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        c9.a(this.e, this.f, this.g, this.h, (ur) obj, lo.b0(this.i | 1), this.j);
        return od2.a;
    }
}
