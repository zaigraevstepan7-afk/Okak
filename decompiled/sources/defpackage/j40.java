package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class j40 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ oe0 f;

    public /* synthetic */ j40(oe0 oe0Var, int i) {
        this.e = i;
        this.f = oe0Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.e;
        oe0 oe0Var = this.f;
        switch (i) {
            case 0:
                return new l40((m40) obj, oe0Var);
            case 1:
                i02 i02Var = (i02) oe0Var.invoke((o02) obj);
                synchronized (q02.c) {
                    q02.d = q02.d.e(i02Var.g());
                }
                return i02Var;
            default:
                Long l = (Long) obj;
                l.getClass();
                return oe0Var.invoke(l);
        }
    }
}
