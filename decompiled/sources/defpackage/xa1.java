package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class xa1 extends nb1 {
    public static final xa1 c = new nb1(0, 3, 1);

    @Override // defpackage.nb1
    public final void a(gf0 gf0Var, ge geVar, jz1 jz1Var, fm1 fm1Var, ob1 ob1Var) {
        sl0 sl0Var;
        gz1 gz1Var = (gz1) gf0Var.d(1);
        p3 p3Var = (p3) gf0Var.d(0);
        y90 y90Var = (y90) gf0Var.d(2);
        jz1 d = gz1Var.d();
        if (ob1Var != null) {
            try {
                sl0Var = new sl0(ob1Var, jz1Var);
            } catch (Throwable th) {
                d.e(false);
                throw th;
            }
        } else {
            sl0Var = null;
        }
        if (!y90Var.e.c0()) {
            vr.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        y90Var.d.b0(geVar, d, fm1Var, sl0Var);
        d.e(true);
        jz1Var.d();
        p3Var.getClass();
        jz1Var.A(gz1Var, gz1Var.a(p3Var));
        jz1Var.k();
    }
}
