package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class fu implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ gu0 f;

    public /* synthetic */ fu(gu0 gu0Var, int i) {
        this.e = i;
        this.f = gu0Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        String str;
        int i = this.e;
        od2 od2Var = od2.a;
        gu0 gu0Var = this.f;
        switch (i) {
            case 0:
                iq0 iq0Var = (iq0) obj;
                x82 d = gu0Var.d();
                if (d != null) {
                    d.c = iq0Var;
                }
                return od2Var;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                gu0Var.q.setValue(bool);
                return od2Var;
            case 2:
                je1 je1Var = gu0Var.t;
                i82 i82Var = (i82) obj;
                String str2 = i82Var.a.f;
                rc rcVar = gu0Var.j;
                if (rcVar != null) {
                    str = rcVar.f;
                } else {
                    str = null;
                }
                if (!sn0.r(str2, str)) {
                    gu0Var.k.setValue(jg0.e);
                    if (((Boolean) je1Var.getValue()).booleanValue()) {
                        je1Var.setValue(Boolean.FALSE);
                    } else {
                        gu0Var.s.setValue(Boolean.FALSE);
                    }
                }
                long j = d92.b;
                gu0Var.f(j);
                gu0Var.e(j);
                gu0Var.u.invoke(i82Var);
                dl1 dl1Var = gu0Var.b;
                ds dsVar = dl1Var.a;
                if (dsVar != null) {
                    dsVar.s(dl1Var, null);
                }
                return od2Var;
            case 3:
                gu0Var.r.b(((mj0) obj).a);
                return od2Var;
            default:
                return Boolean.valueOf(gu0Var.r.b(((mj0) obj).a));
        }
    }
}
