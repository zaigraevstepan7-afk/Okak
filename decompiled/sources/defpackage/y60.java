package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class y60 extends cq0 implements oe0 {
    public final /* synthetic */ ig1 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ cb h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y60(ig1 ig1Var, long j, long j2, cb cbVar) {
        super(1);
        this.e = ig1Var;
        this.f = j;
        this.g = j2;
        this.h = cbVar;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        hg1 hg1Var = (hg1) obj;
        long j = this.f;
        long j2 = this.g;
        hg1Var.getClass();
        ig1 ig1Var = this.e;
        hg1.b(hg1Var, ig1Var);
        ig1Var.m0(xm0.c(((((int) (j >> 32)) + ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L))) & 4294967295L), ig1Var.i), 0.0f, this.h);
        return od2.a;
    }
}
