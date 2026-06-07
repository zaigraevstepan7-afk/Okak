package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class l00 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ m00 f;

    public /* synthetic */ l00(m00 m00Var, int i) {
        this.e = i;
        this.f = m00Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        float f;
        float f2;
        long j;
        int i = this.e;
        float f3 = 0.0f;
        int i2 = 1;
        m00 m00Var = this.f;
        switch (i) {
            case 0:
                dl dlVar = (dl) obj;
                float floatValue = ((Number) m00Var.G.invoke()).floatValue();
                if (floatValue < 0.0f) {
                    floatValue = 0.0f;
                }
                float f4 = 1.0f;
                if (floatValue > 1.0f) {
                    floatValue = 1.0f;
                }
                float floatValue2 = ((Number) m00Var.H.invoke(Float.valueOf(floatValue))).floatValue();
                if (floatValue2 >= 0.0f) {
                    f3 = floatValue2;
                }
                if (f3 <= 1.0f) {
                    f4 = f3;
                }
                m00Var.Q0(f4);
                return dlVar.b(new l00(m00Var, i2));
            default:
                cr0 cr0Var = (cr0) obj;
                ya yaVar = m00Var.D;
                if (yaVar != null) {
                    f = ((Number) yaVar.d()).floatValue();
                } else {
                    f = 0.0f;
                }
                nv0 nv0Var = m00Var.F;
                vl vlVar = cr0Var.e;
                vl vlVar2 = cr0Var.e;
                long d = vlVar.d();
                float W = cr0Var.W(m00Var.z);
                float[] S0 = m00Var.S0();
                if (f > 0.0f) {
                    f2 = m00Var.B.g();
                } else {
                    f2 = 0.0f;
                }
                nv0Var.a(d, W, S0, f, f2, cr0Var.W(m00Var.y), m00Var.w, m00Var.x);
                nv0 nv0Var2 = m00Var.F;
                if (cr0Var.getLayoutDirection() != jq0.e) {
                    f3 = 180.0f;
                }
                long l0 = vlVar2.l0();
                ld ldVar = vlVar2.f;
                long k = ldVar.k();
                ldVar.h().h();
                try {
                    ((rg2) ldVar.f).y(l0, f3);
                    c40.y0(cr0Var, nv0Var2.l, m00Var.v, 0.0f, m00Var.x, 52);
                    n8[] n8VarArr = nv0Var2.m;
                    if (n8VarArr != null) {
                        int length = n8VarArr.length;
                        int i3 = 0;
                        while (i3 < length) {
                            int i4 = i3;
                            c40.y0(cr0Var, n8VarArr[i4], m00Var.u, 0.0f, m00Var.w, 52);
                            i3 = i4 + 1;
                        }
                    }
                    float f5 = m00Var.S0()[1];
                    long d2 = vlVar2.d();
                    float f6 = m00Var.I;
                    float f7 = nv0Var2.n;
                    j = k;
                    try {
                        rx.n(cr0Var, f5, d2, f6, f7, m00Var.x, m00Var.u);
                        l90.v(ldVar, j);
                        return od2.a;
                    } catch (Throwable th) {
                        th = th;
                        l90.v(ldVar, j);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j = k;
                }
        }
    }
}
