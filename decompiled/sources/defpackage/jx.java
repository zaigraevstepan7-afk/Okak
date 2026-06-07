package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class jx extends wt {
    public boolean e;
    public Object f;
    public wl1 g;
    public Serializable h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ nx k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx(nx nxVar, wt wtVar) {
        super(wtVar);
        this.k = nxVar;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return nx.f(this.k, false, this);
    }
}
