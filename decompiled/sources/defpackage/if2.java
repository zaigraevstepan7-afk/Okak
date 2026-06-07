package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class if2 extends wt {
    public /* synthetic */ Object e;
    public final /* synthetic */ kf2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if2(kf2 kf2Var, wt wtVar) {
        super(wtVar);
        this.f = kf2Var;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        Object a = this.f.a(null, this);
        if (a == hv.e) {
            return a;
        }
        return new go1(a);
    }
}
