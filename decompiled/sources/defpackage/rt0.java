package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class rt0 extends wt {
    public t41 e;
    public q42 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ st0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt0(st0 st0Var, wt wtVar) {
        super(wtVar);
        this.h = st0Var;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.d(null, null, this);
    }
}
