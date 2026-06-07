package defpackage;

import android.view.KeyEvent;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class qp0 extends d21 implements pp0 {
    public oe0 s;
    public oe0 t;

    @Override // defpackage.pp0
    public final boolean j(KeyEvent keyEvent) {
        oe0 oe0Var = this.t;
        if (oe0Var != null) {
            return ((Boolean) oe0Var.invoke(new lp0(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.pp0
    public final boolean x(KeyEvent keyEvent) {
        oe0 oe0Var = this.s;
        if (oe0Var != null) {
            return ((Boolean) oe0Var.invoke(new lp0(keyEvent))).booleanValue();
        }
        return false;
    }
}
