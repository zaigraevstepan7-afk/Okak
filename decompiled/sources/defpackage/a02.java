package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class a02 extends wt {
    public /* synthetic */ Object e;
    public final /* synthetic */ c02 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a02(c02 c02Var, wt wtVar) {
        super(wtVar);
        this.f = c02Var;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.d(null, 0.0f, null, this);
    }
}
