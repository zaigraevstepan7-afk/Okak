package defpackage;

/* loaded from: classes.dex */
public final class dw1 extends wt {
    public /* synthetic */ Object e;
    public int f;
    public final /* synthetic */ qa g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw1(qa qaVar, vt vtVar) {
        super(vtVar);
        this.g = qaVar;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f |= Integer.MIN_VALUE;
        return this.g.b(null, this);
    }
}
