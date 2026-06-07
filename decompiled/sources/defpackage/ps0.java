package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class ps0 extends tj1 implements cp0 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ps0(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.f = i2;
    }

    @Override // defpackage.gl
    public final so0 computeReflected() {
        yl1.a.getClass();
        return this;
    }

    @Override // defpackage.cp0
    public final Object get() {
        switch (this.f) {
            case 0:
                return ((o22) this.receiver).getValue();
            case 1:
                return ((o22) this.receiver).getValue();
            case 2:
                return this.receiver.getClass().getSimpleName();
            case 3:
                return ((o22) this.receiver).getValue();
            default:
                return ((o22) this.receiver).getValue();
        }
    }

    @Override // defpackage.de0
    public final Object invoke() {
        return get();
    }
}
