package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class jc extends mc {
    public float a;
    public float b;

    public jc(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.mc
    public final float a(int i) {
        if (i != 0) {
            if (i != 1) {
                return 0.0f;
            }
            return this.b;
        }
        return this.a;
    }

    @Override // defpackage.mc
    public final int b() {
        return 2;
    }

    @Override // defpackage.mc
    public final mc c() {
        return new jc(0.0f, 0.0f);
    }

    @Override // defpackage.mc
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // defpackage.mc
    public final void e(int i, float f) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.b = f;
            return;
        }
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jc) {
            jc jcVar = (jc) obj;
            if (jcVar.a == this.a && jcVar.b == this.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
