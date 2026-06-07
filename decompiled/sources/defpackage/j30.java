package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class j30 extends wt {
    public x20 e;
    public o30 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ m30 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j30(m30 m30Var, wt wtVar) {
        super(wtVar);
        this.h = m30Var;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return m30.P0(this.h, null, this);
    }
}
