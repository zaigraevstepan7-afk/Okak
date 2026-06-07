package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class lo0 extends jo0 {
    public final no0 i;
    public final mo0 j;
    public final wm k;
    public final Object l;

    public lo0(no0 no0Var, mo0 mo0Var, wm wmVar, Object obj) {
        this.i = no0Var;
        this.j = mo0Var;
        this.k = wmVar;
        this.l = obj;
    }

    @Override // defpackage.jo0
    public final boolean k() {
        return false;
    }

    @Override // defpackage.jo0
    public final void l(Throwable th) {
        wm wmVar = this.k;
        wm U = no0.U(wmVar);
        no0 no0Var = this.i;
        mo0 mo0Var = this.j;
        Object obj = this.l;
        if (U == null || !no0Var.d0(mo0Var, U, obj)) {
            mo0Var.e.e(new wv0(2), 2);
            wm U2 = no0.U(wmVar);
            if (U2 != null && no0Var.d0(mo0Var, U2, obj)) {
                return;
            }
            no0Var.m(no0Var.C(mo0Var, obj));
        }
    }
}
