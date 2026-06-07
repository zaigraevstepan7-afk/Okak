package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class i91 implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ j91 f;

    public /* synthetic */ i91(j91 j91Var, int i) {
        this.e = i;
        this.f = j91Var;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        int i = this.e;
        j91 j91Var = this.f;
        switch (i) {
            case 0:
                synchronized (j91.g) {
                    j91.f.remove(((oe1) j91Var.e.getValue()).e.r());
                }
                return od2.a;
            default:
                j1 j1Var = j91Var.d;
                oe1 oe1Var = (oe1) j1Var.invoke();
                if (f.a(oe1Var) != -1) {
                    return wc0.k(oe1Var.e.r(), true);
                }
                y61.o("OkioStorage requires absolute paths, but did not get an absolute path from producePath = ", j1Var, ", instead got ", oe1Var);
                return null;
        }
    }
}
