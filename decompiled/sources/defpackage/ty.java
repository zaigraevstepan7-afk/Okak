package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ty implements l71 {
    public final uy e;

    public ty(uy uyVar) {
        this.e = uyVar;
    }

    @Override // defpackage.l71
    public final long H(int i, long j) {
        if (i == 1) {
            uy uyVar = this.e;
            if (Math.abs(uyVar.m()) > 1.0E-6d) {
                int i2 = (int) (j & 4294967295L);
                if (Math.abs(Float.intBitsToFloat(i2)) > 0.0f) {
                    float m = uyVar.m() * uyVar.p();
                    float f = ((uyVar.n().b + uyVar.n().c) * (-Math.signum(uyVar.m()))) + m;
                    if (uyVar.m() > 0.0f) {
                        f = m;
                        m = f;
                    }
                    float f2 = -uyVar.k.e(-go.o(Float.intBitsToFloat(i2), m, f));
                    return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
                }
                return 0L;
            }
            return 0L;
        }
        return 0L;
    }

    @Override // defpackage.l71
    public final long o0(long j, long j2, int i) {
        if (i == 2 && Float.intBitsToFloat((int) (4294967295L & j2)) != 0.0f) {
            throw new CancellationException("Scroll cancelled");
        }
        return 0L;
    }

    @Override // defpackage.l71
    public final Object t0(long j, long j2, vt vtVar) {
        return new ye2(ye2.a(j2, 0.0f, 0.0f, 2));
    }
}
