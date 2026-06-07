package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class xa extends q42 implements oe0 {
    public final /* synthetic */ ya f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa(ya yaVar, Object obj, vt vtVar) {
        super(1, vtVar);
        this.f = yaVar;
        this.g = obj;
    }

    @Override // defpackage.eh
    public final vt create(vt vtVar) {
        return new xa(this.f, this.g, vtVar);
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        xa xaVar = (xa) create((vt) obj);
        od2 od2Var = od2.a;
        xaVar.invokeSuspend(od2Var);
        return od2Var;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        io.K(obj);
        ya yaVar = this.f;
        ya.a(yaVar);
        Object c = yaVar.c(this.g);
        yaVar.c.f.setValue(c);
        yaVar.e.setValue(c);
        return od2.a;
    }
}
