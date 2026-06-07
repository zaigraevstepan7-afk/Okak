package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class wj0 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ xj0 f;

    public /* synthetic */ wj0(xj0 xj0Var, int i) {
        this.e = i;
        this.f = xj0Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        float f;
        float f2;
        int i = this.e;
        int i2 = 1;
        xj0 xj0Var = this.f;
        switch (i) {
            case 0:
                xj0Var.Q0(xj0Var.K);
                return ((dl) obj).b(new wj0(xj0Var, i2));
            default:
                cr0 cr0Var = (cr0) obj;
                ya yaVar = xj0Var.D;
                float f3 = 0.0f;
                if (yaVar != null) {
                    f = ((Number) yaVar.d()).floatValue();
                } else {
                    f = 0.0f;
                }
                nv0 nv0Var = xj0Var.F;
                vl vlVar = cr0Var.e;
                vl vlVar2 = cr0Var.e;
                long d = vlVar.d();
                float W = cr0Var.W(xj0Var.z);
                float[] fArr = xj0Var.L;
                fArr[0] = ((Number) xj0Var.H.invoke()).floatValue();
                fArr[1] = ((Number) xj0Var.G.invoke()).floatValue();
                fArr[2] = ((Number) xj0Var.J.invoke()).floatValue();
                fArr[3] = ((Number) xj0Var.I.invoke()).floatValue();
                if (f > 0.0f) {
                    f2 = xj0Var.B.g();
                } else {
                    f2 = 0.0f;
                }
                nv0Var.a(d, W, fArr, f, f2, cr0Var.W(xj0Var.y), xj0Var.w, xj0Var.x);
                nv0 nv0Var2 = xj0Var.F;
                if (cr0Var.getLayoutDirection() != jq0.e) {
                    f3 = 180.0f;
                }
                long l0 = vlVar2.l0();
                ld ldVar = vlVar2.f;
                long k = ldVar.k();
                ldVar.h().h();
                try {
                    ((rg2) ldVar.f).y(l0, f3);
                    c40.y0(cr0Var, nv0Var2.l, xj0Var.v, 0.0f, xj0Var.x, 52);
                    n8[] n8VarArr = nv0Var2.m;
                    if (n8VarArr != null) {
                        for (n8 n8Var : n8VarArr) {
                            c40.y0(cr0Var, n8Var, xj0Var.u, 0.0f, xj0Var.w, 52);
                        }
                    }
                    l90.v(ldVar, k);
                    return od2.a;
                } catch (Throwable th) {
                    l90.v(ldVar, k);
                    throw th;
                }
        }
    }
}
