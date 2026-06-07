package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fa1 extends cq0 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ tc0 f;
    public final /* synthetic */ tc0 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ cb i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fa1(tc0 tc0Var, tc0 tc0Var2, Object obj, int i, cb cbVar, int i2) {
        super(1);
        this.e = i2;
        this.f = tc0Var;
        this.g = tc0Var2;
        this.j = obj;
        this.h = i;
        this.i = cbVar;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.e;
        cb cbVar = this.i;
        int i2 = this.h;
        Object obj2 = this.j;
        tc0 tc0Var = this.g;
        tc0 tc0Var2 = this.f;
        switch (i) {
            case 0:
                fi fiVar = (fi) obj;
                if (tc0Var2 != ((mc0) ((q5) hp.N(tc0Var)).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean Y = qo.Y(tc0Var, (tc0) obj2, i2, cbVar);
                Boolean valueOf = Boolean.valueOf(Y);
                if (!Y && fiVar.a()) {
                    return null;
                }
                return valueOf;
            default:
                fi fiVar2 = (fi) obj;
                if (tc0Var2 != ((mc0) ((q5) hp.N(tc0Var)).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean G = pp1.G(i2, cbVar, tc0Var, (pl1) obj2);
                Boolean valueOf2 = Boolean.valueOf(G);
                if (!G && fiVar2.a()) {
                    return null;
                }
                return valueOf2;
        }
    }
}
