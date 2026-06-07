package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class oz1 extends q42 implements se0 {
    public int f;
    public final /* synthetic */ ya g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ gc i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz1(ya yaVar, boolean z, gc gcVar, vt vtVar) {
        super(2, vtVar);
        this.g = yaVar;
        this.h = z;
        this.i = gcVar;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        return new oz1(this.g, this.h, this.i, vtVar);
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        return ((oz1) create((gv) obj, (vt) obj2)).invokeSuspend(od2.a);
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        float f;
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
            if (this.h) {
                f = 1.0f;
            } else {
                f = 0.8f;
            }
            Float f2 = new Float(f);
            this.f = 1;
            Object b = ya.b(this.g, f2, this.i, null, this, 12);
            hv hvVar = hv.e;
            if (b == hvVar) {
                return hvVar;
            }
        }
        return od2.a;
    }
}
