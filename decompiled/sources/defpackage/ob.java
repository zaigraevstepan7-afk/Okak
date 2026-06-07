package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ob extends uq0 {
    public hb2 s;
    public o41 t;
    public pb u;
    public long v;

    @Override // defpackage.d21
    public final void F0() {
        this.v = -9223372034707292160L;
    }

    @Override // defpackage.rq0
    public final k01 b(l01 l01Var, e01 e01Var, long j) {
        long j2;
        ig1 x = e01Var.x(j);
        if (l01Var.S()) {
            j2 = (x.e << 32) | (x.f & 4294967295L);
        } else {
            hb2 hb2Var = this.s;
            int i = x.e;
            if (hb2Var == null) {
                j2 = (i << 32) | (x.f & 4294967295L);
                this.v = j2;
            } else {
                long j3 = (x.f & 4294967295L) | (i << 32);
                gb2 a = hb2Var.a(new nb(this, j3, 0), new nb(this, j3, 1));
                this.u.getClass();
                j2 = ((en0) a.getValue()).a;
                this.v = ((en0) a.getValue()).a;
            }
        }
        return l01Var.s0((int) (j2 >> 32), (int) (4294967295L & j2), m60.e, new mb(this, x, j2));
    }
}
