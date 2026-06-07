package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class mq implements te0 {
    public static final mq f = new mq(0);
    public static final mq g = new mq(1);
    public final /* synthetic */ int e;

    public /* synthetic */ mq(int i) {
        this.e = i;
    }

    @Override // defpackage.te0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        od2 od2Var = od2.a;
        switch (i) {
            case 0:
                ((Number) obj3).intValue();
                return od2Var;
            default:
                c40 c40Var = (c40) obj;
                long j = ((z81) obj2).a;
                long j2 = ((co) obj3).a;
                ry1 ry1Var = ry1.a;
                c40.q0(c40Var, j2, c40Var.W(ry1.c) / 2.0f, j, 120);
                return od2Var;
        }
    }
}
