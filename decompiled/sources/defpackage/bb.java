package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class bb extends cq0 implements te0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bb(Object obj, int i) {
        super(3);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.te0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                ig1 x = ((e01) obj2).x(((us) obj3).a);
                return ((l01) obj).s0(x.e, x.f, m60.e, new i6(7, x, (lt) obj4));
            default:
                ur urVar = (ur) obj2;
                ((Number) obj3).intValue();
                urVar.X(955869654);
                u90 u90Var = (u90) obj4;
                urVar.p(false);
                return u90Var;
        }
    }
}
