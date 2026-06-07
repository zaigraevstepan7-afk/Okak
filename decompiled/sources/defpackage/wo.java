package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class wo {
    public static final yo a = new yo(c01.g, g3.r);

    public static final yo a(qe qeVar, ii iiVar, ur urVar, int i) {
        boolean z;
        if (qeVar.equals(c01.g) && iiVar.equals(g3.r)) {
            urVar.X(-1446604504);
            urVar.p(false);
            return a;
        }
        urVar.X(-1446550657);
        boolean z2 = true;
        if ((((i & 14) ^ 6) > 4 && urVar.f(qeVar)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        if ((((i & 112) ^ 48) <= 32 || !urVar.f(iiVar)) && (i & 48) != 32) {
            z2 = false;
        }
        boolean z3 = z | z2;
        Object L = urVar.L();
        if (z3 || L == or.a) {
            L = new yo(qeVar, iiVar);
            urVar.h0(L);
        }
        yo yoVar = (yo) L;
        urVar.p(false);
        return yoVar;
    }
}
