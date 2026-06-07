package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class bb1 extends nb1 {
    public static final bb1 c = new nb1(0, 1, 1);

    @Override // defpackage.nb1
    public final void a(gf0 gf0Var, ge geVar, jz1 jz1Var, fm1 fm1Var, ob1 ob1Var) {
        dl1 dl1Var = (dl1) gf0Var.d(0);
        Set set = fm1Var.a;
        if (set == null) {
            return;
        }
        mf1 mf1Var = new mf1(set);
        i41 i41Var = fm1Var.i;
        if (i41Var == null) {
            long[] jArr = sr1.a;
            i41Var = new i41();
            fm1Var.i = i41Var;
        }
        i41Var.m(dl1Var, mf1Var);
        fm1Var.e.b(new hm1(mf1Var, -1));
    }
}
