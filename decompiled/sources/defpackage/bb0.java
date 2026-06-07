package defpackage;

/* loaded from: classes.dex */
public final class bb0 extends wt {
    public /* synthetic */ Object e;
    public int f;
    public final /* synthetic */ cb0 g;
    public Object h;
    public wa0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb0(cb0 cb0Var, vt vtVar) {
        super(vtVar);
        this.g = cb0Var;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f |= Integer.MIN_VALUE;
        return this.g.a(null, this);
    }
}
