package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class mp1 implements ih1 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public mp1(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.ih1
    public final long a(float f, float f2) {
        float f3 = f + this.a;
        float f4 = this.b;
        return ha0.a(f3 / f4, (f2 + this.c) / f4);
    }
}
