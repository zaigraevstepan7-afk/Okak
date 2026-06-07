package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class gh extends q42 implements se0 {
    public final /* synthetic */ int f = 1;
    public int g;
    public /* synthetic */ float h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh(ya yaVar, float f, vt vtVar) {
        super(2, vtVar);
        this.i = yaVar;
        this.h = f;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                return new gh((ya) obj2, this.h, vtVar);
            default:
                gh ghVar = new gh((fr) obj2, vtVar);
                ghVar.h = ((Number) obj).floatValue();
                return ghVar;
        }
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        od2 od2Var = od2.a;
        switch (i) {
            case 0:
                return ((gh) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            default:
                return ((gh) create(Float.valueOf(((Number) obj).floatValue()), (vt) obj2)).invokeSuspend(od2Var);
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        dc2 dc2Var;
        int i = this.f;
        hv hvVar = hv.e;
        Object obj2 = this.i;
        Object obj3 = null;
        switch (i) {
            case 0:
                ya yaVar = (ya) obj2;
                float f = this.h;
                int i2 = this.g;
                if (i2 != 0) {
                    if (i2 == 1) {
                        io.K(obj);
                    } else {
                        se.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    io.K(obj);
                    Float f2 = new Float(f);
                    if (((Number) yaVar.d()).floatValue() < f) {
                        dc2Var = gh2.a;
                    } else {
                        dc2Var = gh2.b;
                    }
                    dc2 dc2Var2 = dc2Var;
                    this.g = 1;
                    if (ya.b(yaVar, f2, dc2Var2, null, this, 12) == hvVar) {
                        return hvVar;
                    }
                }
                return od2.a;
            default:
                fr frVar = (fr) obj2;
                int i3 = this.g;
                if (i3 != 0) {
                    if (i3 == 1) {
                        io.K(obj);
                    } else {
                        se.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    io.K(obj);
                    float f3 = this.h;
                    Object g = frVar.a.d.e.g(lu1.e);
                    if (g != null) {
                        obj3 = g;
                    }
                    se0 se0Var = (se0) obj3;
                    if (se0Var != null) {
                        z81 z81Var = new z81((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
                        this.g = 1;
                        obj = se0Var.invoke(z81Var, this);
                        if (obj == hvVar) {
                            return hvVar;
                        }
                    } else {
                        throw l90.f("Required value was null.");
                    }
                }
                return new Float(Float.intBitsToFloat((int) (((z81) obj).a & 4294967295L)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh(fr frVar, vt vtVar) {
        super(2, vtVar);
        this.i = frVar;
    }
}
