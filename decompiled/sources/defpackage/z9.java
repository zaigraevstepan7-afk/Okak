package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class z9 implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ o41 f;

    public /* synthetic */ z9(o41 o41Var, int i) {
        this.e = i;
        this.f = o41Var;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        int i = this.e;
        od2 od2Var = od2.a;
        o41 o41Var = this.f;
        switch (i) {
            case 0:
                iq0 iq0Var = (iq0) o41Var.getValue();
                if (iq0Var != null) {
                    return iq0Var;
                }
                nl0.d("Required value was null.");
                se.c();
                return null;
            case 1:
                iq0 iq0Var2 = (iq0) o41Var.getValue();
                if (iq0Var2 != null) {
                    return iq0Var2;
                }
                nl0.d("Required value was null.");
                se.c();
                return null;
            case 2:
                Boolean bool = (Boolean) o41Var.getValue();
                bool.booleanValue();
                return bool;
            case 3:
                o41Var.setValue(od2Var);
                return od2Var;
            case 4:
                ((x70) o41Var.getValue()).getClass();
                o41Var.setValue(new Object());
                return od2Var;
            case 5:
                o41Var.setValue(Boolean.FALSE);
                return od2Var;
            case 6:
                o41Var.setValue(Boolean.TRUE);
                return od2Var;
            case 7:
                o41Var.setValue(Boolean.FALSE);
                return od2Var;
            case 8:
                return (is0) ((de0) o41Var.getValue()).invoke();
            case 9:
                return new it0((oe0) o41Var.getValue());
            case 10:
                iq0 iq0Var3 = (iq0) o41Var.getValue();
                if (iq0Var3 != null) {
                    return iq0Var3;
                }
                nl0.d("Required value was null.");
                se.c();
                return null;
            case 11:
                o41Var.setValue(null);
                return od2Var;
            case 12:
                o41Var.setValue(Boolean.FALSE);
                return od2Var;
            case 13:
                o41Var.setValue(Boolean.valueOf(!((Boolean) o41Var.getValue()).booleanValue()));
                return od2Var;
            case 14:
                o41Var.setValue(Boolean.FALSE);
                return od2Var;
            default:
                return (iq0) o41Var.getValue();
        }
    }
}
