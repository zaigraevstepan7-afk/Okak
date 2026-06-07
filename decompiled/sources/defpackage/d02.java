package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class d02 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ float f;
    public final /* synthetic */ tl1 g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ d02(float f, tl1 tl1Var, Object obj, Object obj2, int i) {
        this.e = i;
        this.f = f;
        this.g = tl1Var;
        this.h = obj;
        this.i = obj2;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.e;
        float f = 0.0f;
        od2 od2Var = od2.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        tl1 tl1Var = this.g;
        float f2 = this.f;
        switch (i) {
            case 0:
                ds1 ds1Var = (ds1) obj3;
                oe0 oe0Var = (oe0) obj2;
                fc fcVar = (fc) obj;
                float abs = Math.abs(((Number) fcVar.e.getValue()).floatValue());
                float abs2 = Math.abs(f2);
                je1 je1Var = fcVar.e;
                if (abs >= abs2) {
                    float i2 = xp1.i(((Number) je1Var.getValue()).floatValue(), f2);
                    xp1.f(fcVar, ds1Var, oe0Var, i2 - tl1Var.e);
                    fcVar.a();
                    tl1Var.e = i2;
                } else {
                    xp1.f(fcVar, ds1Var, oe0Var, ((Number) je1Var.getValue()).floatValue() - tl1Var.e);
                    tl1Var.e = ((Number) je1Var.getValue()).floatValue();
                }
                return od2Var;
            case 1:
                ds1 ds1Var2 = (ds1) obj3;
                oe0 oe0Var2 = (oe0) obj2;
                fc fcVar2 = (fc) obj;
                float i3 = xp1.i(((Number) fcVar2.e.getValue()).floatValue(), f2);
                float f3 = i3 - tl1Var.e;
                try {
                    f = ds1Var2.a(f3);
                } catch (CancellationException unused) {
                    fcVar2.a();
                }
                oe0Var2.invoke(Float.valueOf(f));
                if (Math.abs(f3 - f) > 0.5f || i3 != ((Number) fcVar2.e.getValue()).floatValue()) {
                    fcVar2.a();
                }
                tl1Var.e += f;
                return od2Var;
            default:
                m4 m4Var = (m4) obj3;
                tl1 tl1Var2 = (tl1) obj2;
                fc fcVar3 = (fc) obj;
                je1 je1Var2 = fcVar3.e;
                if ((((Number) je1Var2.getValue()).floatValue() < f2 && tl1Var.e > f2) || (((Number) je1Var2.getValue()).floatValue() > f2 && tl1Var.e < f2)) {
                    float floatValue = ((Number) je1Var2.getValue()).floatValue();
                    if (f2 == 0.0f) {
                        f2 = 0.0f;
                    } else if (f2 <= 0.0f ? floatValue >= f2 : floatValue <= f2) {
                        f2 = floatValue;
                    }
                    m4Var.a(f2, ((Number) fcVar3.b()).floatValue());
                    if (!Float.isNaN(((Number) fcVar3.b()).floatValue())) {
                        f = ((Number) fcVar3.b()).floatValue();
                    }
                    tl1Var2.e = f;
                    tl1Var.e = f2;
                    fcVar3.a();
                } else {
                    m4Var.a(((Number) je1Var2.getValue()).floatValue(), ((Number) fcVar3.b()).floatValue());
                    tl1Var2.e = ((Number) fcVar3.b()).floatValue();
                    tl1Var.e = ((Number) je1Var2.getValue()).floatValue();
                }
                return od2Var;
        }
    }
}
