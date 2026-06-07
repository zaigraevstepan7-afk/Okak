package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class wy implements ds1 {
    public final /* synthetic */ xy a;

    public wy(xy xyVar) {
        this.a = xyVar;
    }

    @Override // defpackage.ds1
    public final float a(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        xy xyVar = this.a;
        float floatValue = ((Number) xyVar.a.invoke(Float.valueOf(f))).floatValue();
        je1 je1Var = xyVar.e;
        boolean z2 = false;
        if (floatValue > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        je1Var.setValue(Boolean.valueOf(z));
        je1 je1Var2 = xyVar.f;
        if (floatValue < 0.0f) {
            z2 = true;
        }
        je1Var2.setValue(Boolean.valueOf(z2));
        return floatValue;
    }
}
