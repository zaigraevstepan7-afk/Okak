package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class v60 extends cq0 implements oe0 {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ de0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v60(boolean z, de0 de0Var) {
        super(1);
        this.e = z;
        this.f = de0Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        boolean z;
        io1 io1Var = (io1) obj;
        if (!this.e && ((Boolean) this.f.invoke()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        io1Var.h(z);
        return od2.a;
    }
}
