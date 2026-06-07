package defpackage;

import android.view.autofill.AutofillValue;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class ym implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ av1 f;

    public /* synthetic */ ym(av1 av1Var, int i) {
        this.e = i;
        this.f = av1Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        Boolean bool;
        ka2 ka2Var;
        int i = this.e;
        boolean z = true;
        av1 av1Var = this.f;
        switch (i) {
            case 0:
                ub2 ub2Var = (ub2) obj;
                ub2Var.getClass();
                le1 le1Var = (le1) ub2Var;
                le1Var.t = true;
                le1Var.s.invoke(av1Var);
                xp1.m(le1Var);
                return Boolean.FALSE;
            default:
                AutofillValue autofillValue = ((m7) obj).a;
                if (autofillValue.isToggle()) {
                    bool = Boolean.valueOf(autofillValue.getToggleValue());
                } else {
                    bool = null;
                }
                if (bool != null) {
                    if (bool.booleanValue()) {
                        ka2Var = ka2.e;
                    } else {
                        ka2Var = ka2.f;
                    }
                    ep0[] ep0VarArr = xu1.a;
                    zu1 zu1Var = vu1.J;
                    ep0 ep0Var = xu1.a[25];
                    av1Var.a(zu1Var, ka2Var);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
