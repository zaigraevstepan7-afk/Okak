package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class g91 extends wt {
    public h91 e;
    public bl1 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ h91 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g91(h91 h91Var, wt wtVar) {
        super(wtVar);
        this.h = h91Var;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return h91.a(this.h, this);
    }
}
