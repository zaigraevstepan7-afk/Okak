package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class c5 extends d21 implements mj, pu1, pp0, rq0, ub2 {
    public final n3 s = new n3(this, 2);
    public final /* synthetic */ q5 t;

    public c5(q5 q5Var) {
        this.t = q5Var;
    }

    @Override // defpackage.mj
    public final Object C(e81 e81Var, f5 f5Var, wt wtVar) {
        pl1 pl1Var;
        long Q = e81Var.Q(0L);
        pl1 pl1Var2 = (pl1) f5Var.invoke();
        if (pl1Var2 != null) {
            pl1Var = pl1Var2.i(Q);
        } else {
            pl1Var = null;
        }
        if (pl1Var != null) {
            this.t.requestRectangleOnScreen(new Rect((int) pl1Var.a, (int) pl1Var.b, (int) pl1Var.c, (int) pl1Var.d), false);
        }
        return od2.a;
    }

    @Override // defpackage.rq0
    public final k01 b(l01 l01Var, e01 e01Var, long j) {
        ig1 x = e01Var.x(j);
        return l01Var.i0(x.e, x.f, m60.e, this.s, new b5(x, 0));
    }

    @Override // defpackage.pp0
    public final boolean j(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.ub2
    public final Object m() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.pp0
    public final boolean x(KeyEvent keyEvent) {
        ac0 ac0Var;
        int i;
        boolean z;
        boolean z2;
        int[] iArr = gc0.a;
        long v = mp0.v(keyEvent);
        Integer num = null;
        int i2 = 2;
        if (jp0.a(v, jp0.b)) {
            ac0Var = new ac0(2);
        } else if (jp0.a(v, jp0.c)) {
            ac0Var = new ac0(1);
        } else if (jp0.a(v, jp0.p)) {
            if (keyEvent.isShiftPressed()) {
                i = 2;
            } else {
                i = 1;
            }
            ac0Var = new ac0(i);
        } else if (jp0.a(v, jp0.g)) {
            ac0Var = new ac0(4);
        } else if (jp0.a(v, jp0.f)) {
            ac0Var = new ac0(3);
        } else if (!jp0.a(v, jp0.d) && !jp0.a(v, jp0.C)) {
            if (!jp0.a(v, jp0.e) && !jp0.a(v, jp0.D)) {
                if (!jp0.a(v, jp0.h) && !jp0.a(v, jp0.r) && !jp0.a(v, jp0.E)) {
                    if (!jp0.a(v, jp0.a) && !jp0.a(v, jp0.u)) {
                        ac0Var = null;
                    } else {
                        ac0Var = new ac0(8);
                    }
                } else {
                    ac0Var = new ac0(7);
                }
            } else {
                ac0Var = new ac0(6);
            }
        } else {
            ac0Var = new ac0(5);
        }
        if (ac0Var != null) {
            int i3 = ac0Var.a;
            if (mp0.w(keyEvent) == 2) {
                q5 q5Var = this.t;
                ((mc0) q5Var.getFocusOwner()).getClass();
                Boolean e = ((mc0) q5Var.getFocusOwner()).e(i3, q5Var.getEmbeddedViewFocusRect(), new n3(ac0Var, 1));
                if (e != null) {
                    z = e.booleanValue();
                } else {
                    z = true;
                }
                if (z) {
                    return true;
                }
                if (i3 == 1 || i3 == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (i3 == 5) {
                        num = 33;
                    } else if (i3 == 6) {
                        num = 130;
                    } else if (i3 == 3) {
                        num = 17;
                    } else if (i3 == 4) {
                        num = 66;
                    } else if (i3 == 1) {
                        num = 2;
                    } else if (i3 == 2) {
                        num = 1;
                    }
                    if (num != null) {
                        i2 = num.intValue();
                    }
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View rootView = q5Var.getRootView();
                    rootView.getClass();
                    View findNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, q5Var.getView(), i2);
                    if (findNextFocus == null || findNextFocus.equals(q5Var)) {
                        return ((mc0) q5Var.getFocusOwner()).h(i3);
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.pu1
    public final void u0(av1 av1Var) {
    }
}
