package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class xx {
    public static final xx a = new Object();

    public final void a(q4 q4Var, ur urVar, int i) {
        int i2;
        boolean z;
        urVar.Y(1565826668);
        if (urVar.f(q4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i3 & 1, z)) {
            bf.c((de0) q4Var.f, (z00) q4Var.h, go.N(1163527043, new h8(q4Var, 5), urVar), urVar, 384);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new u2(this, i, 8, q4Var);
        }
    }
}
