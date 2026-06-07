package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ms0 implements o22 {
    public final je1 e;
    public int f;

    public ms0(int i) {
        int i2 = (i / 30) * 30;
        this.e = new je1(go.X(Math.max(i2 - 100, 0), i2 + 130), xl1.o);
        this.f = i;
    }

    public final void a(int i) {
        if (i != this.f) {
            this.f = i;
            int i2 = (i / 30) * 30;
            this.e.setValue(go.X(Math.max(i2 - 100, 0), i2 + 130));
        }
    }

    @Override // defpackage.o22
    public final Object getValue() {
        return (an0) this.e.getValue();
    }
}
