package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class tp1 {
    public static final up1 a = new up1(c01.e, g3.o);

    public static final up1 a(oe oeVar, ji jiVar, ur urVar, int i) {
        boolean z;
        if (oeVar.equals(c01.e) && sn0.r(jiVar, g3.o)) {
            urVar.X(-1073830487);
            urVar.p(false);
            return a;
        }
        urVar.X(-1073779616);
        boolean z2 = true;
        if ((((i & 14) ^ 6) > 4 && urVar.f(oeVar)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        if ((((i & 112) ^ 48) <= 32 || !urVar.f(jiVar)) && (i & 48) != 32) {
            z2 = false;
        }
        boolean z3 = z | z2;
        Object L = urVar.L();
        if (z3 || L == or.a) {
            L = new up1(oeVar, jiVar);
            urVar.h0(L);
        }
        up1 up1Var = (up1) L;
        urVar.p(false);
        return up1Var;
    }
}
