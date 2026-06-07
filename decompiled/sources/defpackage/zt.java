package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class zt implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ b82 f;

    public /* synthetic */ zt(b82 b82Var, int i) {
        this.e = i;
        this.f = b82Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        pl1 pl1Var;
        gu0 gu0Var;
        iq0 c;
        long j;
        char c2;
        long j2;
        float f;
        iq0 c3;
        float f2;
        iq0 c4;
        float f3;
        iq0 c5;
        iq0 c6;
        int i = this.e;
        b82 b82Var = this.f;
        switch (i) {
            case 0:
                return new m2(b82Var, 7);
            case 1:
                b82Var.r();
                return od2.a;
            default:
                iq0 iq0Var = (iq0) obj;
                gu0 gu0Var2 = b82Var.d;
                pl1 pl1Var2 = pl1.e;
                if (gu0Var2 != null) {
                    if (gu0Var2.p) {
                        gu0Var2 = null;
                    }
                    if (gu0Var2 != null) {
                        c91 c91Var = b82Var.b;
                        long j3 = b82Var.n().b;
                        int i2 = d92.c;
                        int d = c91Var.d((int) (j3 >> 32));
                        int d2 = b82Var.b.d((int) (b82Var.n().b & 4294967295L));
                        gu0 gu0Var3 = b82Var.d;
                        long j4 = 0;
                        if (gu0Var3 != null && (c6 = gu0Var3.c()) != null) {
                            j = c6.Q(b82Var.l(true));
                        } else {
                            j = 0;
                        }
                        gu0 gu0Var4 = b82Var.d;
                        if (gu0Var4 != null && (c5 = gu0Var4.c()) != null) {
                            j4 = c5.Q(b82Var.l(false));
                        }
                        gu0 gu0Var5 = b82Var.d;
                        float f4 = 0.0f;
                        if (gu0Var5 != null && (c4 = gu0Var5.c()) != null) {
                            x82 d3 = gu0Var2.d();
                            if (d3 != null) {
                                f3 = d3.a.c(d).b;
                            } else {
                                f3 = 0.0f;
                            }
                            c2 = ' ';
                            j2 = j4;
                            f = Float.intBitsToFloat((int) (c4.Q((Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32)) & 4294967295L));
                        } else {
                            c2 = ' ';
                            j2 = j4;
                            f = 0.0f;
                        }
                        gu0 gu0Var6 = b82Var.d;
                        if (gu0Var6 != null && (c3 = gu0Var6.c()) != null) {
                            x82 d4 = gu0Var2.d();
                            if (d4 != null) {
                                f2 = d4.a.c(d2).b;
                            } else {
                                f2 = 0.0f;
                            }
                            f4 = Float.intBitsToFloat((int) (c3.Q((Float.floatToRawIntBits(0.0f) << c2) | (Float.floatToRawIntBits(f2) & 4294967295L)) & 4294967295L));
                        }
                        int i3 = (int) (j >> c2);
                        int i4 = (int) (j2 >> c2);
                        pl1Var = new pl1(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), Math.min(f, f4), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), (gu0Var2.a.g.a() * 25.0f) + Math.max(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L))));
                        gu0Var = b82Var.d;
                        if (gu0Var == null && (c = gu0Var.c()) != null) {
                            if (c.j() && iq0Var.j()) {
                                return hp.e(iq0Var.I(qo.D(c), pl1Var.d()), pl1Var.c());
                            }
                            return pl1Var2;
                        }
                        return null;
                    }
                }
                pl1Var = pl1Var2;
                gu0Var = b82Var.d;
                if (gu0Var == null) {
                }
                return null;
        }
    }
}
