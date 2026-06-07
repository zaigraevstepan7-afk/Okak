package defpackage;

import android.view.KeyEvent;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ei implements oe0 {
    public final /* synthetic */ ta2 e;
    public final /* synthetic */ o41 f;
    public final /* synthetic */ o41 g;

    public ei(ta2 ta2Var, o41 o41Var, o41 o41Var2) {
        this.e = ta2Var;
        this.f = o41Var;
        this.g = o41Var2;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        KeyEvent keyEvent = ((lp0) obj).a;
        ta2 ta2Var = this.e;
        if (!ta2Var.b()) {
            this.f.setValue(Boolean.FALSE);
        } else if (mp0.w(keyEvent) == 2 && jp0.a(vn.i(keyEvent.getKeyCode()), jp0.u)) {
            this.g.setValue(Boolean.FALSE);
            ta2Var.a();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
