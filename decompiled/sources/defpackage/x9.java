package defpackage;

import android.view.ActionMode;
import android.view.View;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class x9 implements q62 {
    public final View a;
    public final oe0 b;
    public final de0 c;
    public final y41 d = new y41();
    public final c12 e = new c12(new r9(this, 0));
    public final r9 f = new r9(this, 1);
    public final r9 g = new r9(this, 2);
    public ActionMode h;
    public w9 i;
    public Runnable j;

    public x9(View view, oe0 oe0Var, de0 de0Var) {
        this.a = view;
        this.b = oe0Var;
        this.c = de0Var;
    }

    @Override // defpackage.q62
    public final Object a(i62 i62Var, q42 q42Var) {
        j4 j4Var = new j4(this, i62Var, null, 1);
        y41 y41Var = this.d;
        y41Var.getClass();
        Object u = fp.u(new uw0(t41.e, y41Var, j4Var, null), q42Var);
        if (u == hv.e) {
            return u;
        }
        return od2.a;
    }
}
