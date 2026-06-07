package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ka0 implements ea0 {
    public final float a;
    public final e22 b;

    /* JADX WARN: Type inference failed for: r6v1, types: [e22, java.lang.Object] */
    public ka0(float f, float f2, float f3) {
        this.a = f3;
        ?? obj = new Object();
        obj.a = 1.0f;
        obj.b = Math.sqrt(50.0d);
        obj.c = 1.0f;
        if (f < 0.0f) {
            gi1.a("Damping ratio must be non-negative");
        }
        obj.c = f;
        double d = obj.b;
        if (((float) (d * d)) <= 0.0f) {
            gi1.a("Spring stiffness constant must be positive.");
        }
        obj.b = Math.sqrt(f2);
        this.b = obj;
    }

    @Override // defpackage.ea0
    public final float b(long j, float f, float f2, float f3) {
        e22 e22Var = this.b;
        e22Var.a = f2;
        return Float.intBitsToFloat((int) (e22Var.a(f, f3, j / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0132  */
    @Override // defpackage.ea0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(float r34, float r35, float r36) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ka0.c(float, float, float):long");
    }

    @Override // defpackage.ea0
    public final float d(float f, float f2, float f3) {
        return 0.0f;
    }

    @Override // defpackage.ea0
    public final float e(long j, float f, float f2, float f3) {
        e22 e22Var = this.b;
        e22Var.a = f2;
        return Float.intBitsToFloat((int) (e22Var.a(f, f3, j / 1000000) >> 32));
    }
}
