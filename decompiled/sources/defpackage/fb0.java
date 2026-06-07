package defpackage;

/* loaded from: classes.dex */
public final class fb0 extends wt {
    public /* synthetic */ Object e;
    public int f;
    public final /* synthetic */ eb0 g;
    public eb0 h;
    public wa0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb0(eb0 eb0Var, vt vtVar) {
        super(vtVar);
        this.g = eb0Var;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f |= Integer.MIN_VALUE;
        return this.g.a(null, this);
    }
}
