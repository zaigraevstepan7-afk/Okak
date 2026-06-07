package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class sy1 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ dz1 f;

    public /* synthetic */ sy1(dz1 dz1Var, int i) {
        this.e = i;
        this.f = dz1Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.e;
        od2 od2Var = od2.a;
        dz1 dz1Var = this.f;
        switch (i) {
            case 0:
                float floatValue = ((Float) obj).floatValue();
                rn rnVar = dz1Var.a;
                fe1 fe1Var = dz1Var.b;
                float o = go.o(floatValue, rnVar.a, rnVar.b);
                if (o == fe1Var.g()) {
                    z = false;
                } else {
                    if (o != fe1Var.g()) {
                        oe0 oe0Var = dz1Var.c;
                        if (oe0Var != null) {
                            oe0Var.invoke(Float.valueOf(o));
                        } else {
                            dz1Var.c(o);
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                Float f = (Float) obj;
                float floatValue2 = f.floatValue();
                oe0 oe0Var2 = dz1Var.c;
                if (oe0Var2 != null) {
                    oe0Var2.invoke(f);
                } else {
                    dz1Var.c(floatValue2);
                }
                return od2Var;
            case 2:
                en0 en0Var = (en0) obj;
                dz1Var.i.h((int) (en0Var.a >> 32));
                dz1Var.j.h((int) (en0Var.a & 4294967295L));
                return od2Var;
            default:
                dz1Var.a(0.0f);
                dz1Var.m.invoke();
                return od2Var;
        }
    }
}
