package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class t10 extends jo0 {
    public final /* synthetic */ int i;
    public final Object j;

    public /* synthetic */ t10(Object obj, int i) {
        this.i = i;
        this.j = obj;
    }

    @Override // defpackage.jo0
    public final boolean k() {
        switch (this.i) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return false;
        }
    }

    @Override // defpackage.jo0
    public final void l(Throwable th) {
        int i = this.i;
        Object obj = this.j;
        switch (i) {
            case 0:
                ((q10) obj).a();
                return;
            case 1:
                ((oe0) obj).invoke(th);
                return;
            default:
                Object obj2 = no0.e.get(j());
                ko0 ko0Var = (ko0) obj;
                if (obj2 instanceof lp) {
                    ko0Var.resumeWith(io.s(((lp) obj2).a));
                    return;
                } else {
                    ko0Var.resumeWith(d6.G(obj2));
                    return;
                }
        }
    }
}
