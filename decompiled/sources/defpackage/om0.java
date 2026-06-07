package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class om0 implements pm0 {
    public final long e;
    public final int f;

    public om0(int i, long j) {
        this.e = j;
        this.f = i;
    }

    @Override // defpackage.pm0
    public final lm0 toInstant() {
        km0 km0Var = lm0.g;
        long j = lm0.h.e;
        long j2 = this.e;
        if (j2 >= j && j2 <= lm0.i.e) {
            return km0.a(this.f, j2);
        }
        throw new IllegalArgumentException("The parsed date is outside the range representable by Instant (Unix epoch second " + j2 + ')');
    }
}
