package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class u80 implements c91 {
    public final int e;
    public final int f;

    public /* synthetic */ u80(int i, int i2) {
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.c91
    public int c(int i) {
        if (i >= 0 && i <= this.f) {
            fc2.M(i, this.e, i);
        }
        return i;
    }

    @Override // defpackage.c91
    public int d(int i) {
        if (i >= 0 && i <= this.e) {
            fc2.L(i, this.f, i);
        }
        return i;
    }
}
