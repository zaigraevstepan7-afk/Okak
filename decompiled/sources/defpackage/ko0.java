package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ko0 extends pl {
    public final no0 m;

    public ko0(vt vtVar, no0 no0Var) {
        super(1, vtVar);
        this.m = no0Var;
    }

    @Override // defpackage.pl
    public final Throwable p(no0 no0Var) {
        Throwable c;
        no0 no0Var2 = this.m;
        no0Var2.getClass();
        Object obj = no0.e.get(no0Var2);
        if ((obj instanceof mo0) && (c = ((mo0) obj).c()) != null) {
            return c;
        }
        if (obj instanceof lp) {
            return ((lp) obj).a;
        }
        return no0Var.o();
    }

    @Override // defpackage.pl
    public final String y() {
        return "AwaitContinuation";
    }
}
