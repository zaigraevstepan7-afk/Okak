package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class uy extends od1 {
    public static final sl0 J;
    public final je1 I;

    static {
        int i = 22;
        J = fp.O(new le(i), new p1(i));
    }

    public uy(int i, float f, de0 de0Var) {
        super(i, f);
        this.I = fr1.k(de0Var);
    }

    @Override // defpackage.od1
    public final int o() {
        return ((Number) ((de0) this.I.getValue()).invoke()).intValue();
    }
}
