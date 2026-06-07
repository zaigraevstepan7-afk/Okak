package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ld1 extends wt {
    public int e;
    public f22 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ od1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld1(od1 od1Var, wt wtVar) {
        super(wtVar);
        this.h = od1Var;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.f(0, null, this);
    }
}
