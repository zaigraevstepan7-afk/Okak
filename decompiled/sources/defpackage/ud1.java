package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class ud1 {
    public f8 a;
    public ni b;
    public float c = 1.0f;
    public jq0 d = jq0.e;

    public abstract void a(float f);

    public abstract void b(ni niVar);

    public final void c(cr0 cr0Var, long j, float f, ni niVar) {
        vl vlVar = cr0Var.e;
        if (this.c != f) {
            a(f);
            this.c = f;
        }
        if (!sn0.r(this.b, niVar)) {
            b(niVar);
            this.b = niVar;
        }
        jq0 layoutDirection = cr0Var.getLayoutDirection();
        if (this.d != layoutDirection) {
            this.d = layoutDirection;
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (vlVar.d() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (vlVar.d() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((rg2) vlVar.f.f).p(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    e(cr0Var);
                }
            } finally {
                ((rg2) vlVar.f.f).p(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
            }
        }
    }

    public abstract long d();

    public abstract void e(cr0 cr0Var);
}
