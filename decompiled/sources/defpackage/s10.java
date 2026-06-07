package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class s10 extends cq0 implements de0 {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ sl0 f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s10(boolean z, sl0 sl0Var, String str) {
        super(0);
        this.e = z;
        this.f = sl0Var;
        this.g = str;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        if (this.e) {
            sl0 sl0Var = this.f;
            String str = this.g;
            br1 br1Var = (br1) sl0Var.e;
            synchronized (br1Var.c) {
            }
        }
        return od2.a;
    }
}
