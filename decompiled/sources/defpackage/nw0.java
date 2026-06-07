package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class nw0 extends wt {
    public /* synthetic */ Object e;
    public final /* synthetic */ pw0 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw0(pw0 pw0Var, wt wtVar) {
        super(wtVar);
        this.f = pw0Var;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        Object a = this.f.a(null, this);
        if (a == hv.e) {
            return a;
        }
        return new go1(a);
    }
}
