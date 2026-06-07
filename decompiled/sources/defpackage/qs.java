package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class qs extends rs {
    public final po1 e;
    public final po1 f;
    public final float[] g;

    public qs(po1 po1Var, po1 po1Var2) {
        super(po1Var2, po1Var, po1Var2, null);
        float[] S;
        this.e = po1Var;
        this.f = po1Var2;
        float[] fArr = p2.c.b;
        jh2 jh2Var = po1Var.d;
        float[] fArr2 = po1Var.i;
        jh2 jh2Var2 = po1Var2.d;
        float[] fArr3 = po1Var2.j;
        if (qo.w(jh2Var, jh2Var2)) {
            S = qo.S(fArr3, fArr2);
        } else {
            float[] a = jh2Var.a();
            float[] a2 = jh2Var2.a();
            jh2 jh2Var3 = mp0.z;
            S = qo.S(qo.w(jh2Var2, jh2Var3) ? fArr3 : qo.P(qo.S(qo.u(fArr, a2, new float[]{0.964212f, 1.0f, 0.825188f}), po1Var2.i)), qo.w(jh2Var, jh2Var3) ? fArr2 : qo.S(qo.u(fArr, a, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = S;
    }

    @Override // defpackage.rs
    public final long a(long j) {
        float h = co.h(j);
        float g = co.g(j);
        float e = co.e(j);
        float d = co.d(j);
        lo1 lo1Var = this.e.p;
        float b = (float) lo1Var.b(h);
        float b2 = (float) lo1Var.b(g);
        float b3 = (float) lo1Var.b(e);
        float[] fArr = this.g;
        float f = (fArr[6] * b3) + (fArr[3] * b2) + (fArr[0] * b);
        float f2 = (fArr[7] * b3) + (fArr[4] * b2) + (fArr[1] * b);
        float f3 = (fArr[8] * b3) + (fArr[5] * b2) + (fArr[2] * b);
        po1 po1Var = this.f;
        float b4 = (float) po1Var.m.b(f);
        lo1 lo1Var2 = po1Var.m;
        return go.a(b4, (float) lo1Var2.b(f2), (float) lo1Var2.b(f3), d, po1Var);
    }
}
