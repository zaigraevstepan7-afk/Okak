package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hb1 extends nb1 {
    public static final hb1 c = new nb1(0, 1, 1);

    @Override // defpackage.nb1
    public final void a(gf0 gf0Var, ge geVar, jz1 jz1Var, fm1 fm1Var, ob1 ob1Var) {
        mf1 mf1Var;
        dl1 dl1Var = (dl1) gf0Var.d(0);
        i41 i41Var = fm1Var.i;
        if (i41Var != null) {
            mf1Var = (mf1) i41Var.g(dl1Var);
        } else {
            mf1Var = null;
        }
        if (mf1Var != null) {
            ArrayList arrayList = fm1Var.j;
            if (arrayList == null) {
                arrayList = new ArrayList();
                fm1Var.j = arrayList;
            }
            arrayList.add(fm1Var.e);
            fm1Var.e = mf1Var.f;
        }
    }
}
