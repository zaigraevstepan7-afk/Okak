package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class uc1 implements xj {
    public final uy b;
    public final xj c;

    public uc1(uy uyVar, xj xjVar) {
        this.b = uyVar;
        this.c = xjVar;
    }

    @Override // defpackage.xj
    public final float a(float f, float f2, float f3) {
        float a = this.c.a(f, f2, f3);
        boolean z = false;
        if (f <= 0.0f ? f + f2 <= 0.0f : f + f2 > f3) {
            z = true;
        }
        float abs = Math.abs(a);
        uy uyVar = this.b;
        if (abs != 0.0f && z) {
            float f4 = uyVar.f * (-1.0f);
            while (a > 0.0f && f4 < a) {
                f4 += uyVar.q();
            }
            while (a < 0.0f && f4 > a) {
                f4 -= uyVar.q();
            }
            return f4;
        }
        if (Math.abs(uyVar.f) < 1.0E-6d) {
            return 0.0f;
        }
        float f5 = uyVar.f * (-1.0f);
        if (((Boolean) uyVar.G.getValue()).booleanValue()) {
            f5 += uyVar.q();
        }
        return go.o(f5, -f3, f3);
    }
}
