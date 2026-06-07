package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class er extends wt {
    public Object e;
    public bn0 f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ fr j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er(fr frVar, wt wtVar) {
        super(wtVar);
        this.j = frVar;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return fr.a(this.j, null, null, this);
    }
}
