package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class t4 extends gg implements ic0 {
    public final rg2 e;
    public final uu1 f;
    public final q5 g;
    public final rl1 h;
    public final String i;
    public final Rect j = new Rect();
    public final AutofillId k;
    public final q31 l;
    public boolean m;

    public t4(rg2 rg2Var, uu1 uu1Var, q5 q5Var, rl1 rl1Var, String str) {
        this.e = rg2Var;
        this.f = uu1Var;
        this.g = q5Var;
        this.h = rl1Var;
        this.i = str;
        q5Var.setImportantForAutofill(1);
        AutofillId autofillId = q5Var.getAutofillId();
        if (autofillId != null) {
            this.k = autofillId;
            this.l = new q31();
            return;
        }
        throw l90.f("Required value was null.");
    }

    @Override // defpackage.ic0
    public final void a(tc0 tc0Var, tc0 tc0Var2) {
        ar0 M;
        mu1 x;
        ar0 M2;
        mu1 x2;
        if (tc0Var != null && (M2 = hp.M(tc0Var)) != null && (x2 = M2.x()) != null) {
            i41 i41Var = x2.e;
            if (i41Var.b(lu1.g) || i41Var.b(lu1.h)) {
                ((AutofillManager) this.e.f).notifyViewExited(this.g, M2.f);
            }
        }
        if (tc0Var2 != null && (M = hp.M(tc0Var2)) != null && (x = M.x()) != null) {
            i41 i41Var2 = x.e;
            if (!i41Var2.b(lu1.g) && !i41Var2.b(lu1.h)) {
                return;
            }
            int i = M.f;
            this.h.a.h(i, new r4(this, i));
        }
    }
}
