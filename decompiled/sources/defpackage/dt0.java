package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class dt0 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ft0 f;

    public /* synthetic */ dt0(ft0 ft0Var, int i) {
        this.e = i;
        this.f = ft0Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.e;
        ft0 ft0Var = this.f;
        switch (i) {
            case 0:
                is0 is0Var = (is0) ft0Var.s.invoke();
                int a = is0Var.a();
                int i2 = 0;
                while (true) {
                    if (i2 < a) {
                        if (!is0Var.c(i2).equals(obj)) {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                    }
                }
                return Integer.valueOf(i2);
            default:
                int intValue = ((Integer) obj).intValue();
                is0 is0Var2 = (is0) ft0Var.s.invoke();
                if (intValue < 0 || intValue >= is0Var2.a()) {
                    StringBuilder q = l90.q("Can't scroll to index ", intValue, ", it is out of bounds [0, ");
                    q.append(is0Var2.a());
                    q.append(')');
                    nl0.a(q.toString());
                }
                rx.C(ft0Var.z0(), null, new hh(ft0Var, intValue, null, 1), 3);
                return Boolean.TRUE;
        }
    }
}
