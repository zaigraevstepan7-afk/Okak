package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ja1 extends nb1 {
    public static final ja1 c = new nb1(0, 2, 1);

    @Override // defpackage.nb1
    public final void a(gf0 gf0Var, ge geVar, jz1 jz1Var, fm1 fm1Var, ob1 ob1Var) {
        int i;
        sl0 sl0Var;
        cn0 cn0Var = (cn0) gf0Var.d(1);
        if (cn0Var != null) {
            i = cn0Var.a;
        } else {
            i = 0;
        }
        am amVar = (am) gf0Var.d(0);
        if (i > 0) {
            geVar = new a91(geVar, i);
        }
        if (ob1Var != null) {
            sl0Var = new sl0(ob1Var, jz1Var);
        } else {
            sl0Var = null;
        }
        amVar.a0(geVar, jz1Var, fm1Var, sl0Var);
    }
}
