package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ss1 extends q42 implements se0 {
    public int f;
    public final /* synthetic */ ts1 g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss1(ts1 ts1Var, float f, float f2, vt vtVar) {
        super(2, vtVar);
        this.g = ts1Var;
        this.h = f;
        this.i = f2;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        return new ss1(this.g, this.h, this.i, vtVar);
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        return ((ss1) create((gv) obj, (vt) obj2)).invokeSuspend(od2.a);
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        if (i != 0) {
            if (i == 1) {
                io.K(obj);
            } else {
                se.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            io.K(obj);
            this.f = 1;
            Object a = ms1.a(this.g.R, (Float.floatToRawIntBits(this.h) << 32) | (Float.floatToRawIntBits(this.i) & 4294967295L), this);
            hv hvVar = hv.e;
            if (a == hvVar) {
                return hvVar;
            }
        }
        return od2.a;
    }
}
