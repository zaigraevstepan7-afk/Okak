package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class km0 {
    public static lm0 a(int i, long j) {
        long j2 = i;
        long j3 = j2 / 1000000000;
        if ((j2 ^ 1000000000) < 0 && j3 * 1000000000 != j2) {
            j3--;
        }
        long j4 = j + j3;
        if ((j ^ j4) < 0 && (j3 ^ j) >= 0) {
            if (j > 0) {
                return lm0.i;
            }
            return lm0.h;
        }
        if (j4 < -31557014167219200L) {
            return lm0.h;
        }
        if (j4 > 31556889864403199L) {
            return lm0.i;
        }
        long j5 = j2 % 1000000000;
        return new lm0((int) (j5 + ((((j5 ^ 1000000000) & ((-j5) | j5)) >> 63) & 1000000000)), j4);
    }
}
