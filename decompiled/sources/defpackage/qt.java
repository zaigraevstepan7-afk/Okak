package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class qt {
    public final a12 a = new a12();

    public static void b(qt qtVar, se0 se0Var, fq fqVar, de0 de0Var, int i) {
        if ((i & 8) != 0) {
            fqVar = null;
        }
        qtVar.a.add(new fq(-1789283891, true, new js0(se0Var, qtVar, fqVar, de0Var)));
    }

    public final void a(pt ptVar, ur urVar, int i) {
        int i2;
        int i3;
        boolean z;
        urVar.Y(-798501095);
        if (urVar.f(ptVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (urVar.f(this)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i5 & 1, z)) {
            a12 a12Var = this.a;
            int size = a12Var.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((te0) a12Var.get(i6)).invoke(ptVar, urVar, Integer.valueOf(i5 & 14));
            }
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new u2(this, i, 7, ptVar);
        }
    }
}
