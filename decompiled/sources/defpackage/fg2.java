package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fg2 extends cq0 implements de0 {
    public final /* synthetic */ u e;
    public final /* synthetic */ r7 f;
    public final /* synthetic */ y61 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg2(u uVar, r7 r7Var, y61 y61Var) {
        super(0);
        this.e = uVar;
        this.f = r7Var;
        this.g = y61Var;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        r7 r7Var = this.f;
        u uVar = this.e;
        uVar.removeOnAttachStateChangeListener(r7Var);
        vn.C(uVar).a.remove(this.g);
        return od2.a;
    }
}
