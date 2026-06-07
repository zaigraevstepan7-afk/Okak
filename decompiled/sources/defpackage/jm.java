package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class jm extends wt {
    public km e;
    public Object f;
    public /* synthetic */ Object g;
    public final /* synthetic */ km h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm(km kmVar, vt vtVar) {
        super(vtVar);
        this.h = kmVar;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(null, this);
    }
}
