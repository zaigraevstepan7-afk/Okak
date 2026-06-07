package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class k22 implements qe2 {
    public final qe2 e;
    public final long f;

    public k22(qe2 qe2Var, long j) {
        this.e = qe2Var;
        this.f = j;
    }

    @Override // defpackage.qe2
    public final boolean a() {
        return this.e.a();
    }

    @Override // defpackage.qe2
    public final long b(mc mcVar, mc mcVar2, mc mcVar3) {
        return this.e.b(mcVar, mcVar2, mcVar3) + this.f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k22)) {
            return false;
        }
        k22 k22Var = (k22) obj;
        if (k22Var.f != this.f || !sn0.r(k22Var.e, this.e)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.qe2
    public final mc h(long j, mc mcVar, mc mcVar2, mc mcVar3) {
        long j2 = this.f;
        if (j < j2) {
            return mcVar3;
        }
        return this.e.h(j - j2, mcVar, mcVar2, mcVar3);
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + (this.e.hashCode() * 31);
    }

    @Override // defpackage.qe2
    public final mc p(long j, mc mcVar, mc mcVar2, mc mcVar3) {
        long j2 = this.f;
        if (j < j2) {
            return mcVar;
        }
        return this.e.p(j - j2, mcVar, mcVar2, mcVar3);
    }
}
