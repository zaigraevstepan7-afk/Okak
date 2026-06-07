package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class un0 extends wt {
    public int e;
    public final /* synthetic */ se0 f;
    public final /* synthetic */ vt g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un0(vt vtVar, xu xuVar, se0 se0Var, vt vtVar2) {
        super(vtVar, xuVar);
        this.f = se0Var;
        this.g = vtVar2;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i != 0) {
            if (i == 1) {
                this.e = 2;
                io.K(obj);
                return obj;
            }
            se.p("This coroutine had already completed");
            return null;
        }
        this.e = 1;
        io.K(obj);
        se0 se0Var = this.f;
        se0Var.getClass();
        fc2.t(2, se0Var);
        return se0Var.invoke(this.g, this);
    }
}
