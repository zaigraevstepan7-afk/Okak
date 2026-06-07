package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class n01 {
    public final uv a;
    public final float b;
    public float c;
    public float d;
    public final /* synthetic */ o01 e;

    public n01(o01 o01Var, uv uvVar, float f, float f2) {
        uvVar.getClass();
        this.e = o01Var;
        this.a = uvVar;
        if (f2 >= f) {
            this.b = o01Var.e.e(uvVar);
            this.c = f;
            this.d = f2;
            return;
        }
        se.h("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [ta] */
    public final xd1 a(float f) {
        float o = go.o(f, this.c, this.d);
        float f2 = this.d;
        float f3 = this.c;
        float f4 = (o - f3) / (f2 - f3);
        o01 o01Var = this.e;
        final ua uaVar = o01Var.e;
        final float f5 = f4 * this.b;
        uaVar.getClass();
        final uv uvVar = this.a;
        uvVar.getClass();
        float[] fArr = uvVar.a;
        final float a = be2.a(fArr[0] - uaVar.e, fArr[1] - uaVar.f);
        ?? r5 = new Object() { // from class: ta
            public final float a(float f6) {
                uv uvVar2 = uv.this;
                uvVar2.getClass();
                ua uaVar2 = uaVar;
                uaVar2.getClass();
                long c = uvVar2.c(f6);
                return Math.abs(be2.d(be2.a(lo.G(c) - uaVar2.e, lo.H(c) - uaVar2.f) - a, be2.c) - f5);
            }
        };
        float f6 = 0.0f;
        float f7 = 1.0f;
        while (f7 - f6 > 1.0E-5f) {
            float f8 = ((2.0f * f6) + f7) / 3.0f;
            float f9 = ((2.0f * f7) + f6) / 3.0f;
            if (r5.a(f8) < r5.a(f9)) {
                f7 = f9;
            } else {
                f6 = f8;
            }
        }
        float f10 = (f6 + f7) / 2.0f;
        if (0.0f <= f10 && f10 <= 1.0f) {
            xd1 d = uvVar.d(f10);
            return new xd1(new n01(o01Var, (uv) d.e, this.c, o), new n01(o01Var, (uv) d.f, o, this.d));
        }
        se.h("Cubic cut point is expected to be between 0 and 1");
        return null;
    }

    public final String toString() {
        return "MeasuredCubic(outlineProgress=[" + this.c + " .. " + this.d + "], size=" + this.b + ", cubic=" + this.a + ')';
    }
}
