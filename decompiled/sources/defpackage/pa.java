package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class pa extends wt {
    public /* synthetic */ Object e;
    public int f;
    public final /* synthetic */ qa g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(qa qaVar, vt vtVar) {
        super(vtVar);
        this.g = qaVar;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f |= Integer.MIN_VALUE;
        return this.g.b(null, this);
    }
}
