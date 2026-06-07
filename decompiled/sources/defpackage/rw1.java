package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class rw1 extends wt {
    public sw1 e;
    public wa0 f;
    public tw1 g;
    public go0 h;
    public /* synthetic */ Object i;
    public final /* synthetic */ sw1 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw1(sw1 sw1Var, vt vtVar) {
        super(vtVar);
        this.j = sw1Var;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        sw1.k(this.j, null, this);
        return hv.e;
    }
}
