package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public interface c00 {
    default long G(float f) {
        return p(M(f));
    }

    default float K(int i) {
        return i / a();
    }

    default float M(float f) {
        return f / a();
    }

    float P();

    default float W(float f) {
        return a() * f;
    }

    float a();

    default int d0(long j) {
        return Math.round(r0(j));
    }

    default int j0(float f) {
        float W = W(f);
        if (Float.isInfinite(W)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(W);
    }

    default long n0(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float W = W(j20.b(j));
        float W2 = W(j20.a(j));
        return (Float.floatToRawIntBits(W) << 32) | (Float.floatToRawIntBits(W2) & 4294967295L);
    }

    default long p(float f) {
        float P;
        float[] fArr = od0.a;
        if (P() >= 1.03f) {
            nd0 a = od0.a(P());
            if (a != null) {
                P = a.a(f);
            } else {
                P = f / P();
            }
            return pp1.C(4294967296L, P);
        }
        return pp1.C(4294967296L, f / P());
    }

    default long q(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        return go.e(M(Float.intBitsToFloat((int) (j >> 32))), M(Float.intBitsToFloat((int) (j & 4294967295L))));
    }

    default float r0(long j) {
        if (!o92.a(n92.b(j), 4294967296L)) {
            ml0.b("Only Sp can convert to Px");
        }
        return W(v(j));
    }

    default float v(long j) {
        if (!o92.a(n92.b(j), 4294967296L)) {
            ml0.b("Only Sp can convert to Px");
        }
        float[] fArr = od0.a;
        if (P() >= 1.03f) {
            nd0 a = od0.a(P());
            if (a == null) {
                return P() * n92.c(j);
            }
            return a.b(n92.c(j));
        }
        return P() * n92.c(j);
    }
}
