package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hx extends wt {
    public boolean e;
    public n22 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ nx h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx(nx nxVar, vt vtVar) {
        super(vtVar);
        this.h = nxVar;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return nx.e(this.h, false, this);
    }
}
