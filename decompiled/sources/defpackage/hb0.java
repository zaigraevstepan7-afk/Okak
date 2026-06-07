package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hb0 extends wt {
    public v10 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ v10 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb0(v10 v10Var, vt vtVar) {
        super(vtVar);
        this.g = v10Var;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(null, this);
    }
}
