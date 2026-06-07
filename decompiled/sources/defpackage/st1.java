package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class st1 implements te0 {
    public final /* synthetic */ dk0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ de0 g;

    public st1(dk0 dk0Var, boolean z, de0 de0Var) {
        this.e = dk0Var;
        this.f = z;
        this.g = de0Var;
    }

    @Override // defpackage.te0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ur urVar = (ur) obj2;
        ((Number) obj3).intValue();
        urVar.X(-1525724089);
        Object L = urVar.L();
        if (L == or.a) {
            L = new r31();
            urVar.h0(L);
        }
        r31 r31Var = (r31) L;
        e21 d = ak0.a(b21.a, r31Var, this.e).d(new rt1(this.f, r31Var, null, this.g));
        urVar.p(false);
        return d;
    }
}
