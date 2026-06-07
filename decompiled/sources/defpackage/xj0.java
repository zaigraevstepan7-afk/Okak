package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class xj0 extends ih {
    public de0 G;
    public de0 H;
    public de0 I;
    public de0 J;
    public float K;
    public final float[] L;
    public final cl M;

    public xj0(float f, float f2, float f3, float f4, long j, long j2, de0 de0Var, de0 de0Var2, de0 de0Var3, de0 de0Var4, q32 q32Var, q32 q32Var2) {
        super(j, j2, q32Var, q32Var2, f2, f3, f4);
        this.G = de0Var;
        this.H = de0Var2;
        this.I = de0Var3;
        this.J = de0Var4;
        f = f < 0.0f ? 0.0f : f;
        this.K = f > 1.0f ? 1.0f : f;
        this.L = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        cl clVar = new cl(new dl(), new wj0(this, 0));
        L0(clVar);
        this.M = clVar;
    }

    @Override // defpackage.ih
    public final void O0() {
        fp.I(this.M);
    }

    @Override // defpackage.ih
    public final void P0() {
        this.M.L0();
    }
}
