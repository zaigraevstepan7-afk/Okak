package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class qs1 extends q42 implements se0 {
    public /* synthetic */ Object f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs1(long j, vt vtVar) {
        super(2, vtVar);
        this.g = j;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        qs1 qs1Var = new qs1(this.g, vtVar);
        qs1Var.f = obj;
        return qs1Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        qs1 qs1Var = (qs1) create((ys1) obj, (vt) obj2);
        od2 od2Var = od2.a;
        qs1Var.invokeSuspend(od2Var);
        return od2Var;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        io.K(obj);
        at1 at1Var = ((ys1) this.f).a;
        at1Var.c(at1Var.k, this.g, 1);
        return od2.a;
    }
}
