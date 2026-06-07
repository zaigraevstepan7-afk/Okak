package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class l91 extends wt {
    public Object e;
    public oe1 f;
    public Object g;
    public /* synthetic */ Object h;
    public final /* synthetic */ m91 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l91(m91 m91Var, wt wtVar) {
        super(wtVar);
        this.i = m91Var;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.b(null, this);
    }
}
