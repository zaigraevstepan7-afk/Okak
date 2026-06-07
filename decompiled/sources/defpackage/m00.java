package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class m00 extends ih {
    public de0 G;
    public oe0 H;
    public float I;
    public final float[] J;
    public final cl K;

    public m00(float f, float f2, float f3, float f4, long j, long j2, de0 de0Var, oe0 oe0Var, q32 q32Var, q32 q32Var2) {
        super(j, j2, q32Var, q32Var2, f2, f3, f4);
        this.G = de0Var;
        this.H = oe0Var;
        this.I = f;
        this.J = new float[]{0.0f, 0.0f};
        cl clVar = new cl(new dl(), new l00(this, 0));
        L0(clVar);
        this.K = clVar;
    }

    @Override // defpackage.ih
    public final void O0() {
        fp.I(this.K);
    }

    @Override // defpackage.ih
    public final void P0() {
        this.K.L0();
    }

    public final float[] S0() {
        float[] fArr = this.J;
        float f = 0.0f;
        fArr[0] = 0.0f;
        float floatValue = ((Number) this.G.invoke()).floatValue();
        if (floatValue >= 0.0f) {
            f = floatValue;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        fArr[1] = f;
        return fArr;
    }
}
