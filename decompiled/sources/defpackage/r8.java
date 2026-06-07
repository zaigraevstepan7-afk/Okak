package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class r8 extends wt {
    public /* synthetic */ Object e;
    public final /* synthetic */ t8 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(t8 t8Var, wt wtVar) {
        super(wtVar);
        this.f = t8Var;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        this.f.a(null, this);
        return hv.e;
    }
}
