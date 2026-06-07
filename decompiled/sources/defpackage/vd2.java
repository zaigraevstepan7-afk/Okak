package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class vd2 extends wt {
    public af0 e;
    public de0 f;
    public float g;
    public /* synthetic */ Object h;
    public final /* synthetic */ wd2 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd2(wd2 wd2Var, wt wtVar) {
        super(wtVar);
        this.i = wd2Var;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(null, null, this);
    }
}
