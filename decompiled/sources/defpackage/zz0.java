package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zz0 implements kw1 {
    public final n8 a;
    public n8 b;
    public long c;

    public zz0(np1 np1Var) {
        n8 a = p8.a();
        rp1.q(a, np1Var.d, np1Var.b, np1Var.c);
        this.a = a;
        this.c = 9205357640488583168L;
    }

    @Override // defpackage.kw1
    public final lo a(long j, jq0 jq0Var, c00 c00Var) {
        n8 n8Var;
        if (fy1.a(j, this.c) && (n8Var = this.b) != null) {
            n8Var.h();
        } else {
            this.c = j;
            this.b = p8.a();
        }
        n8 n8Var2 = this.b;
        n8Var2.getClass();
        n8.a(n8Var2, this.a);
        float[] a = d01.a();
        d01.g(a, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)), 4);
        n8Var2.j(a);
        n8Var2.k(z81.d(yq1.p(j), n8Var2.c().b()));
        return new ub1(n8Var2);
    }
}
