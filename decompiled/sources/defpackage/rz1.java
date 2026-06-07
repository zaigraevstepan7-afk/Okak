package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class rz1 extends wt {
    public qz1 e;
    public b51 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ sz1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz1(sz1 sz1Var, wt wtVar) {
        super(wtVar);
        this.h = sz1Var;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, this);
    }
}
