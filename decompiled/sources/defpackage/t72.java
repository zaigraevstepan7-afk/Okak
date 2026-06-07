package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class t72 implements us1 {
    public final /* synthetic */ us1 a;
    public final j00 b;
    public final j00 c;

    public t72(us1 us1Var, final u72 u72Var) {
        this.a = us1Var;
        final int i = 0;
        this.b = fr1.h(new de0() { // from class: s72
            @Override // defpackage.de0
            public final Object invoke() {
                int i2 = i;
                boolean z = false;
                u72 u72Var2 = u72Var;
                switch (i2) {
                    case 0:
                        if (u72Var2.a.g() < u72Var2.b.g()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        if (u72Var2.a.g() > 0.0f) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
        final int i2 = 1;
        this.c = fr1.h(new de0() { // from class: s72
            @Override // defpackage.de0
            public final Object invoke() {
                int i22 = i2;
                boolean z = false;
                u72 u72Var2 = u72Var;
                switch (i22) {
                    case 0:
                        if (u72Var2.a.g() < u72Var2.b.g()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        if (u72Var2.a.g() > 0.0f) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
    }

    @Override // defpackage.us1
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.us1
    public final boolean b() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // defpackage.us1
    public final boolean c() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // defpackage.us1
    public final Object d(t41 t41Var, se0 se0Var, wt wtVar) {
        return this.a.d(t41Var, se0Var, wtVar);
    }

    @Override // defpackage.us1
    public final float e(float f) {
        return this.a.e(f);
    }
}
