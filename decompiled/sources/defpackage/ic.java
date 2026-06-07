package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ic extends mc {
    public float a;

    public ic(float f) {
        this.a = f;
    }

    @Override // defpackage.mc
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // defpackage.mc
    public final int b() {
        return 1;
    }

    @Override // defpackage.mc
    public final mc c() {
        return new ic(0.0f);
    }

    @Override // defpackage.mc
    public final void d() {
        this.a = 0.0f;
    }

    @Override // defpackage.mc
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ic) && ((ic) obj).a == this.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
