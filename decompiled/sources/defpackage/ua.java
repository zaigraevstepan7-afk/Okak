package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ua implements ga0 {
    public final float e;
    public final float f;

    public ua() {
        this.e = Math.max(1.0E-7f, Math.abs(0.1f));
        this.f = Math.max(1.0E-4f, 1.0f) * (-4.2f);
    }

    public aa0 a(float f) {
        double b = b(f);
        double d = ba0.a;
        double d2 = d - 1.0d;
        return new aa0(f, (float) (Math.exp((d / d2) * b) * this.e * this.f), (long) (Math.exp(b / d2) * 1000.0d));
    }

    public double b(float f) {
        float[] fArr = o7.a;
        return Math.log((Math.abs(f) * 0.35f) / (this.e * this.f));
    }

    @Override // defpackage.ga0
    public float c() {
        return this.e;
    }

    @Override // defpackage.ga0
    public float d(float f, float f2, long j) {
        float f3 = this.f;
        return ((f2 / f3) * ((float) Math.exp((f3 * ((float) (j / 1000000))) / 1000.0f))) + (f - (f2 / f3));
    }

    public float e(uv uvVar) {
        uvVar.getClass();
        float a = uvVar.a();
        float f = this.e;
        float b = uvVar.b();
        float f2 = this.f;
        float a2 = be2.a(a - f, b - f2);
        float[] fArr = uvVar.a;
        float a3 = a2 - be2.a(fArr[0] - f, fArr[1] - f2);
        float f3 = be2.c;
        float d = be2.d(a3, f3);
        if (d > f3 - 1.0E-4f) {
            return 0.0f;
        }
        return d;
    }

    @Override // defpackage.ga0
    public long g(float f) {
        return ((((float) Math.log(this.e / Math.abs(f))) * 1000.0f) / this.f) * 1000000;
    }

    @Override // defpackage.ga0
    public float i(float f, float f2) {
        if (Math.abs(f2) <= this.e) {
            return f;
        }
        double log = Math.log(Math.abs(r1 / f2));
        float f3 = this.f;
        return ((f2 / f3) * ((float) Math.exp((f3 * ((log / f3) * 1000.0d)) / 1000.0d))) + (f - (f2 / f3));
    }

    @Override // defpackage.ga0
    public float j(long j, float f) {
        return f * ((float) Math.exp((((float) (j / 1000000)) / 1000.0f) * this.f));
    }

    public ua(float f, c00 c00Var) {
        this.e = f;
        float a = c00Var.a();
        float f2 = ba0.a;
        this.f = a * 386.0878f * 160.0f * 0.84f;
    }

    public ua(float f, float f2) {
        this.e = f;
        this.f = f2;
    }

    public ua(float f, float f2, float f3, float f4) {
        this.e = f3;
        this.f = f4;
    }
}
