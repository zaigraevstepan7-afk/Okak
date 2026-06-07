package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class jn implements te0 {
    public final /* synthetic */ dk0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ap1 g;
    public final /* synthetic */ de0 h;

    public jn(dk0 dk0Var, boolean z, ap1 ap1Var, de0 de0Var) {
        this.e = dk0Var;
        this.f = z;
        this.g = ap1Var;
        this.h = de0Var;
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
        e21 d = ak0.a(b21.a, r31Var, this.e).d(new hn(r31Var, null, false, this.f, null, this.g, this.h));
        urVar.p(false);
        return d;
    }
}
