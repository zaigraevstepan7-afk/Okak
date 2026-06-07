package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class b22 extends wt {
    public /* synthetic */ Object e;
    public final /* synthetic */ c22 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b22(c22 c22Var, wt wtVar) {
        super(wtVar);
        this.f = c22Var;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return c22.e(this.f, this);
    }
}
