package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class pj extends wt {
    public pl1 e;
    public Object[] f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ qj j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj(qj qjVar, wt wtVar) {
        super(wtVar);
        this.j = qjVar;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, this);
    }
}
