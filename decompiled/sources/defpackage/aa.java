package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class aa implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ o41 f;

    public /* synthetic */ aa(o41 o41Var, int i) {
        this.e = i;
        this.f = o41Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.e;
        od2 od2Var = od2.a;
        o41 o41Var = this.f;
        switch (i) {
            case 0:
                o41Var.setValue((iq0) obj);
                return od2Var;
            case 1:
                o41Var.setValue((iq0) obj);
                return od2Var;
            case 2:
                o41Var.setValue((iq0) obj);
                return od2Var;
            case 3:
                zm1 zm1Var = (zm1) obj;
                zm1Var.getClass();
                o41Var.setValue(zm1Var);
                return od2Var;
            case 4:
                Float f = (Float) obj;
                f.getClass();
                return Float.valueOf(((Number) ((oe0) o41Var.getValue()).invoke(f)).floatValue());
            case 5:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                o41Var.setValue(bool);
                return od2Var;
            case 6:
                ((oe0) o41Var.getValue()).invoke((z81) obj);
                return od2Var;
            case 7:
                o41Var.setValue((iq0) obj);
                return od2Var;
            default:
                o41Var.setValue(new z81(((iq0) obj).u(0L)));
                return od2Var;
        }
    }
}
