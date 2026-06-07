package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class x92 {
    public final p31 a;
    public w92 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public float[] g;

    public x92() {
        p31 p31Var = wm0.a;
        this.a = new p31();
        this.c = -1L;
        this.d = 0L;
        this.e = 0L;
    }

    public final void a(w92 w92Var, long j, long j2, float[] fArr, long j3) {
        boolean z;
        long j4 = w92Var.g;
        if (j3 - j4 <= 0 && j4 != Long.MIN_VALUE) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            w92Var.g = j3;
            w92Var.a(w92Var.e, w92Var.f, j, j2, fArr);
        }
    }
}
