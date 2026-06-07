package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ig0 implements bi1 {
    public final i3 e;
    public final d91 f;
    public long g = 0;

    public ig0(i3 i3Var, d91 d91Var) {
        this.e = i3Var;
        this.f = d91Var;
    }

    @Override // defpackage.bi1
    public final long c(bn0 bn0Var, long j, jq0 jq0Var, long j2) {
        long a = this.f.a();
        if ((9223372034707292159L & a) == 9205357640488583168L) {
            a = this.g;
        }
        this.g = a;
        return xm0.c(xm0.c((bn0Var.b & 4294967295L) | (bn0Var.a << 32), fp.V(a)), this.e.a(j2, 0L, jq0Var));
    }
}
