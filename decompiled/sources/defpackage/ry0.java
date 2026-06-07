package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ry0 extends cq0 implements de0 {
    public final /* synthetic */ ty0 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ kg1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry0(ty0 ty0Var, long j, long j2, kg1 kg1Var) {
        super(0);
        this.e = ty0Var;
        this.f = j;
        this.g = j2;
        this.h = kg1Var;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        ty0 ty0Var = this.e;
        ty0Var.G0().e = false;
        ty0Var.G0().f = this.f;
        ty0Var.G0().g = this.g;
        oe0 e = this.h.e.e();
        if (e != null) {
            e.invoke(ty0Var.G0());
        }
        return od2.a;
    }
}
