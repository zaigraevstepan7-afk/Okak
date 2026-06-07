package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class g6 extends cq0 implements se0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g6(int i, Object obj, Object obj2) {
        super(2);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.e;
        od2 od2Var = od2.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                l6.a((q5) obj4, (se0) obj3, (ur) obj, lo.b0(1));
                return od2Var;
            case 1:
                int intValue = ((Number) obj).intValue();
                ru1 ru1Var = (ru1) obj2;
                p6 p6Var = (p6) obj3;
                if (!((su1) obj4).b.b(ru1Var.g)) {
                    p6Var.l(intValue, ru1Var);
                    p6Var.l.j(od2Var);
                }
                return od2Var;
            case 2:
                ur urVar = (ur) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar.O(intValue2 & 1, z)) {
                    Boolean bool = (Boolean) ((gr0) obj4).g.getValue();
                    boolean booleanValue = bool.booleanValue();
                    se0 se0Var = (se0) obj3;
                    urVar.Z(bool);
                    boolean g = urVar.g(booleanValue);
                    if (booleanValue) {
                        se0Var.invoke(urVar, 0);
                    } else {
                        if (urVar.l != 0) {
                            vr.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!urVar.S) {
                            if (!g) {
                                urVar.Q();
                            } else {
                                fz1 fz1Var = urVar.G;
                                int i2 = fz1Var.g;
                                int i3 = fz1Var.h;
                                pr prVar = urVar.M;
                                prVar.getClass();
                                prVar.d(false);
                                prVar.b.d.e0(ma1.c);
                                mp0.f(i2, i3, urVar.s);
                                urVar.G.t();
                            }
                        }
                    }
                    if (urVar.y && urVar.G.i == urVar.z) {
                        urVar.z = -1;
                        urVar.y = false;
                    }
                    urVar.p(false);
                } else {
                    urVar.R();
                }
                return od2Var;
            case 3:
                tl tlVar = (tl) obj;
                tf0 tf0Var = (tf0) obj2;
                e81 e81Var = (e81) obj4;
                ar0 ar0Var = e81Var.s;
                if (ar0Var.I()) {
                    e81Var.L = tlVar;
                    e81Var.K = tf0Var;
                    lc1 snapshotObserver = ((q5) dr0.a(ar0Var)).getSnapshotObserver();
                    io1 io1Var = e81.Q;
                    snapshotObserver.a.c(e81Var, i5.H, (b81) obj3);
                    e81Var.O = false;
                } else {
                    e81Var.O = true;
                }
                return od2Var;
            default:
                ((Number) obj2).intValue();
                bf.s((e21) obj4, (se0) obj3, (ur) obj, lo.b0(1));
                return od2Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g6(Object obj, se0 se0Var, int i, int i2) {
        super(2);
        this.e = i2;
        this.f = obj;
        this.g = se0Var;
    }
}
