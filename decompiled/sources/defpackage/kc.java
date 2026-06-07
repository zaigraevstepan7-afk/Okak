package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class kc extends mc {
    public float a;
    public float b;
    public float c;

    public kc(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.mc
    public final float a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return 0.0f;
                }
                return this.c;
            }
            return this.b;
        }
        return this.a;
    }

    @Override // defpackage.mc
    public final int b() {
        return 3;
    }

    @Override // defpackage.mc
    public final mc c() {
        return new kc(0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.mc
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }

    @Override // defpackage.mc
    public final void e(int i, float f) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                this.c = f;
                return;
            }
            this.b = f;
            return;
        }
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kc) {
            kc kcVar = (kc) obj;
            if (kcVar.a == this.a && kcVar.b == this.b && kcVar.c == this.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + l90.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c;
    }
}
