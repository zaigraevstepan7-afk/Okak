package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class uy0 extends hg1 {
    public final /* synthetic */ int f;
    public final Object g;

    public /* synthetic */ uy0(Object obj, int i) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.c00
    public final float P() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return ((ty0) obj).P();
            default:
                return ((q5) obj).getDensity().P();
        }
    }

    @Override // defpackage.c00
    public final float a() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return ((ty0) obj).a();
            default:
                return ((q5) obj).getDensity().a();
        }
    }

    @Override // defpackage.hg1
    public float c(hi0 hi0Var) {
        float f;
        float intBitsToFloat;
        int X;
        switch (this.f) {
            case 0:
                se0 se0Var = hi0Var.a;
                if (se0Var != null) {
                    return ((Number) se0Var.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                ty0 ty0Var = (ty0) this.g;
                if (ty0Var.o) {
                    return Float.NaN;
                }
                ty0 ty0Var2 = ty0Var;
                while (true) {
                    u51 u51Var = ty0Var2.q;
                    if (u51Var != null && (X = bf.X((hi0[]) u51Var.b, hi0Var)) >= 0) {
                        f = ((float[]) u51Var.c)[X];
                    } else {
                        f = Float.NaN;
                    }
                    if (!Float.isNaN(f)) {
                        ty0Var2.t0(ty0Var.C0(), hi0Var);
                        iq0 A0 = ty0Var2.A0();
                        iq0 A02 = ty0Var.A0();
                        switch (hi0Var.b) {
                            case 0:
                                intBitsToFloat = Float.intBitsToFloat((int) (A02.I(A0, (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(((int) (A0.m() >> 32)) / 2.0f) << 32)) & 4294967295L));
                                break;
                            default:
                                intBitsToFloat = Float.intBitsToFloat((int) (A02.I(A0, (Float.floatToRawIntBits(f) << 32) | (4294967295L & Float.floatToRawIntBits(((int) (A0.m() & 4294967295L)) / 2.0f))) >> 32));
                                break;
                        }
                        return intBitsToFloat;
                    }
                    ty0 E0 = ty0Var2.E0();
                    if (E0 == null) {
                        ty0Var2.t0(ty0Var.C0(), hi0Var);
                        return Float.NaN;
                    }
                    ty0Var2 = E0;
                }
                break;
            default:
                return super.c(hi0Var);
        }
    }

    @Override // defpackage.hg1
    public final jq0 e() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return ((ty0) obj).getLayoutDirection();
            default:
                return ((q5) obj).getLayoutDirection();
        }
    }

    @Override // defpackage.hg1
    public final int h() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return ((ty0) obj).f0();
            default:
                return ((q5) obj).getRoot().K.p.e;
        }
    }
}
