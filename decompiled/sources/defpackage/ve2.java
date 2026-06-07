package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ve2 implements qe2 {
    public final se2 e;
    public final nm1 f;
    public final long g;
    public final long h = 0;

    public ve2(se2 se2Var, nm1 nm1Var) {
        this.e = se2Var;
        this.f = nm1Var;
        this.g = (se2Var.o() + se2Var.m()) * 1000000;
    }

    @Override // defpackage.qe2
    public final boolean a() {
        return true;
    }

    @Override // defpackage.qe2
    public final long b(mc mcVar, mc mcVar2, mc mcVar3) {
        return Long.MAX_VALUE;
    }

    public final long c(long j) {
        long j2 = this.h;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.g;
        long j5 = j3 / j4;
        if (this.f != nm1.e && j5 % 2 != 0) {
            return ((j5 + 1) * j4) - j3;
        }
        return j3 - (j5 * j4);
    }

    public final mc d(long j, mc mcVar, mc mcVar2, mc mcVar3) {
        long j2 = this.h;
        long j3 = j + j2;
        long j4 = this.g;
        if (j3 > j4) {
            return this.e.h(j4 - j2, mcVar, mcVar3, mcVar2);
        }
        return mcVar2;
    }

    @Override // defpackage.qe2
    public final mc h(long j, mc mcVar, mc mcVar2, mc mcVar3) {
        return this.e.h(c(j), mcVar, mcVar2, d(j, mcVar, mcVar3, mcVar2));
    }

    @Override // defpackage.qe2
    public final mc p(long j, mc mcVar, mc mcVar2, mc mcVar3) {
        return this.e.p(c(j), mcVar, mcVar2, d(j, mcVar, mcVar3, mcVar2));
    }
}
