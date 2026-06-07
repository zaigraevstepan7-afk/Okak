package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class sa1 extends nb1 {
    public static final sa1 c = new nb1(0, 1, 1);

    @Override // defpackage.nb1
    public final void a(gf0 gf0Var, ge geVar, jz1 jz1Var, fm1 fm1Var, ob1 ob1Var) {
        q41 q41Var;
        dl1 dl1Var = (dl1) gf0Var.d(0);
        i41 i41Var = fm1Var.i;
        if (i41Var != null && ((mf1) i41Var.g(dl1Var)) != null) {
            ArrayList arrayList = fm1Var.j;
            if (arrayList != null && (q41Var = (q41) arrayList.remove(arrayList.size() - 1)) != null) {
                fm1Var.e = q41Var;
            }
            i41Var.k(dl1Var);
        }
    }
}
