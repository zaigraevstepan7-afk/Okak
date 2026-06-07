package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class na2 {
    public static final float a;

    static {
        go.e(16.0f, 8.0f);
        a = 200.0f;
    }

    public static ra2 a(ur urVar) {
        rc1 rc1Var = qa2.a;
        int j0 = ((c00) urVar.j(is.h)).j0(4.0f);
        long a2 = ((zt0) ((oh2) urVar.j(is.t))).a();
        boolean d = urVar.d(j0) | urVar.e(a2);
        Object L = urVar.L();
        if (d || L == or.a) {
            L = new ra2(j0, a2);
            urVar.h0(L);
        }
        return (ra2) L;
    }
}
