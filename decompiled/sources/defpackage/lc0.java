package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class lc0 extends cq0 implements oe0 {
    public final /* synthetic */ wl1 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc0(wl1 wl1Var, int i) {
        super(1);
        this.e = wl1Var;
        this.f = i;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        Boolean valueOf = Boolean.valueOf(((tc0) obj).S0(this.f));
        this.e.e = valueOf;
        return valueOf;
    }
}
