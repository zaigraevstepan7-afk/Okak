package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class gt1 extends wt {
    public /* synthetic */ Object e;
    public final /* synthetic */ lt1 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt1(lt1 lt1Var, wt wtVar) {
        super(wtVar);
        this.f = lt1Var;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return lt1.j(this.f, this);
    }
}
