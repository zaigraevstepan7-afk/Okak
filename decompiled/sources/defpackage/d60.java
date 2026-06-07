package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class d60 implements c60 {
    public final int e;
    public int f = -1;
    public int g = -1;

    public d60(int i) {
        this.e = i;
    }

    @Override // defpackage.c60
    public final boolean m(CharSequence charSequence, int i, int i2, kc2 kc2Var) {
        int i3 = this.e;
        if (i <= i3 && i3 < i2) {
            this.f = i;
            this.g = i2;
            return false;
        }
        if (i2 > i3) {
            return false;
        }
        return true;
    }

    @Override // defpackage.c60
    public final Object i() {
        return this;
    }
}
