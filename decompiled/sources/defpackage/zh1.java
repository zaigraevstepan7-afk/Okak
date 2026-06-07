package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zh1 extends cq0 implements de0 {
    public final /* synthetic */ vl1 e;
    public final /* synthetic */ ai1 f;
    public final /* synthetic */ bn0 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh1(vl1 vl1Var, ai1 ai1Var, bn0 bn0Var, long j, long j2) {
        super(0);
        this.e = vl1Var;
        this.f = ai1Var;
        this.g = bn0Var;
        this.h = j;
        this.i = j2;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        ai1 ai1Var = this.f;
        this.e.e = ai1Var.getPositionProvider().c(this.g, this.h, ai1Var.getParentLayoutDirection(), this.i);
        return od2.a;
    }
}
