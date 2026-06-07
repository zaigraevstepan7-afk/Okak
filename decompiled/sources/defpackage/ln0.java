package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ln0 {
    public final int a;
    public final int b;
    public final bs0 c;

    public ln0(int i, int i2, bs0 bs0Var) {
        this.a = i;
        this.b = i2;
        this.c = bs0Var;
        if (i < 0) {
            nl0.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        nl0.a("size should be > 0");
    }
}
