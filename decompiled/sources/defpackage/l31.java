package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class l31 extends uv {
    public final void g(ih1 ih1Var, int i) {
        float[] fArr = this.a;
        int i2 = i + 1;
        long a = ih1Var.a(fArr[i], fArr[i2]);
        fArr[i] = Float.intBitsToFloat((int) (a >> 32));
        fArr[i2] = Float.intBitsToFloat((int) (4294967295L & a));
    }
}
