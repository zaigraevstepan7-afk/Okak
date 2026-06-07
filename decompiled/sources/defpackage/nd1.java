package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class nd1 extends wt {
    public od1 e;
    public t41 f;
    public q42 g;
    public /* synthetic */ Object h;
    public final /* synthetic */ od1 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd1(od1 od1Var, wt wtVar) {
        super(wtVar);
        this.i = od1Var;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return od1.u(this.i, null, null, this);
    }
}
