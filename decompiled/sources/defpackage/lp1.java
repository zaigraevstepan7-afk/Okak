package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class lp1 {
    public static final kp1 a;

    static {
        qf1 qf1Var = new qf1(50.0f);
        a = new kp1(qf1Var, qf1Var, qf1Var, qf1Var);
    }

    public static final kp1 a(float f) {
        g20 g20Var = new g20(f);
        return new kp1(g20Var, g20Var, g20Var, g20Var);
    }

    public static final kp1 b(float f, float f2, float f3, float f4) {
        return new kp1(new g20(f), new g20(f2), new g20(f3), new g20(f4));
    }
}
