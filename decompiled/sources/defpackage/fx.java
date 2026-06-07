package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fx extends wt {
    public b51 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ nx g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx(nx nxVar, wt wtVar) {
        super(wtVar);
        this.g = nxVar;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return nx.c(this.g, this);
    }
}
