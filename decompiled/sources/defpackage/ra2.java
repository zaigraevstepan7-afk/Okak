package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ra2 implements bi1 {
    public final int e;
    public final long f;

    public ra2(int i, long j) {
        this.e = i;
        this.f = j;
    }

    @Override // defpackage.bi1
    public final long c(bn0 bn0Var, long j, jq0 jq0Var, long j2) {
        int i = (int) (j2 >> 32);
        int c = ((bn0Var.c() - i) / 2) + bn0Var.a;
        long j3 = this.f;
        int i2 = 0;
        if (c < 0) {
            int i3 = bn0Var.a;
            int i4 = (i + i3) - ((int) (j3 >> 32));
            if (i4 >= 0) {
                i2 = i4;
            }
            c = i3 - i2;
        } else if (c + i > ((int) (j3 >> 32)) && (c = bn0Var.c - i) < 0) {
            c = 0;
        }
        int i5 = bn0Var.b - ((int) (j2 & 4294967295L));
        int i6 = this.e;
        int i7 = i5 - i6;
        if (i7 < 0) {
            i7 = bn0Var.d + i6;
        }
        return (c << 32) | (i7 & 4294967295L);
    }
}
