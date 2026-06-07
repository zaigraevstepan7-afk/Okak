package defpackage;

/* loaded from: classes.dex */
public final class kb0 extends wt {
    public lb0 e;
    public /* synthetic */ Object f;
    public int g;
    public final /* synthetic */ lb0 h;
    public Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb0(lb0 lb0Var, vt vtVar) {
        super(vtVar);
        this.h = lb0Var;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.g |= Integer.MIN_VALUE;
        return this.h.b(null, this);
    }
}
