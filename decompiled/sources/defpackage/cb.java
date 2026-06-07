package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class cb extends cq0 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cb(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        float f;
        float f2;
        long j;
        long j2;
        boolean booleanValue;
        int i = this.e;
        int i2 = 1;
        cb2 cb2Var = null;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                return new n1((a12) obj4, obj3, (pb) obj2, i2);
            case 1:
                ub2 ub2Var = (ub2) obj;
                o20 o20Var = (o20) ub2Var;
                if (((f7) ((q5) hp.N((o20) obj3)).m293getDragAndDropManager()).b.contains(o20Var) && io.l(o20Var, lo.F((rg2) obj2))) {
                    ((wl1) obj4).e = ub2Var;
                    return tb2.g;
                }
                return tb2.e;
            case 2:
                io1 io1Var = (io1) obj;
                o22 o22Var = (o22) obj3;
                o22 o22Var2 = (o22) obj4;
                float f3 = 1.0f;
                if (o22Var2 != null) {
                    f = ((Number) o22Var2.getValue()).floatValue();
                } else {
                    f = 1.0f;
                }
                io1Var.c(f);
                if (o22Var != null) {
                    f2 = ((Number) o22Var.getValue()).floatValue();
                } else {
                    f2 = 1.0f;
                }
                io1Var.j(f2);
                if (o22Var != null) {
                    f3 = ((Number) o22Var.getValue()).floatValue();
                }
                io1Var.k(f3);
                o22 o22Var3 = (o22) obj2;
                if (o22Var3 != null) {
                    j = ((cb2) o22Var3.getValue()).a;
                } else {
                    j = cb2.b;
                }
                io1Var.o(j);
                return od2.a;
            case 3:
                nb2 nb2Var = ((c70) obj3).a;
                u70 u70Var = (u70) obj2;
                int ordinal = ((r60) obj).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            qr1 qr1Var = u70Var.a.d;
                            if (qr1Var != null) {
                                cb2Var = new cb2(qr1Var.b);
                            } else {
                                qr1 qr1Var2 = nb2Var.d;
                                if (qr1Var2 != null) {
                                    cb2Var = new cb2(qr1Var2.b);
                                }
                            }
                        } else {
                            se.m();
                            return null;
                        }
                    } else {
                        cb2Var = (cb2) obj4;
                    }
                } else {
                    qr1 qr1Var3 = nb2Var.d;
                    if (qr1Var3 != null) {
                        cb2Var = new cb2(qr1Var3.b);
                    } else {
                        qr1 qr1Var4 = u70Var.a.d;
                        if (qr1Var4 != null) {
                            cb2Var = new cb2(qr1Var4.b);
                        }
                    }
                }
                if (cb2Var != null) {
                    j2 = cb2Var.a;
                } else {
                    j2 = cb2.b;
                }
                return new cb2(j2);
            default:
                tc0 tc0Var = (tc0) obj;
                if (sn0.r(tc0Var, (tc0) obj4)) {
                    booleanValue = false;
                } else if (!sn0.r(tc0Var, ((mc0) obj3).c)) {
                    booleanValue = ((Boolean) ((oe0) obj2).invoke(tc0Var)).booleanValue();
                } else {
                    se.p("Focus search landed at the root.");
                    return null;
                }
                return Boolean.valueOf(booleanValue);
        }
    }
}
