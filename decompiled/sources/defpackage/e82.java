package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class e82 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ c00 f;
    public final /* synthetic */ o41 g;

    public /* synthetic */ e82(c00 c00Var, o41 o41Var, int i) {
        this.e = i;
        this.f = c00Var;
        this.g = o41Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.e;
        o41 o41Var = this.g;
        c00 c00Var = this.f;
        switch (i) {
            case 0:
                g3 g3Var = g3.X;
                fd fdVar = new fd((de0) obj, 5);
                e82 e82Var = new e82(c00Var, o41Var, 1);
                zu1 zu1Var = ez0.a;
                return new bz0(fdVar, e82Var, g3Var);
            default:
                o41Var.setValue(new en0((c00Var.j0(j20.a(r7.a)) & 4294967295L) | (c00Var.j0(j20.b(((j20) obj).a)) << 32)));
                return od2.a;
        }
    }
}
