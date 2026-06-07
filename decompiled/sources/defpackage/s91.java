package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class s91 implements OnBackAnimationCallback {
    public final /* synthetic */ r91 a;

    public s91(r91 r91Var) {
        this.a = r91Var;
    }

    public final void onBackCancelled() {
        r91 r91Var = this.a;
        q4 q4Var = r91Var.a;
        if (q4Var != null) {
            if (!r91Var.b) {
                q4Var.f(r91Var, null);
            }
            b71 b71Var = (b71) q4Var.g;
            b71Var.getClass();
            if (r91Var.equals(b71Var.h) && -1 == b71Var.g) {
                x61 x61Var = b71Var.f;
                if (x61Var == null) {
                    x61Var = b71Var.c(-1);
                }
                b71Var.f = null;
                b71Var.g = 0;
                b71Var.h = null;
                if (x61Var != null) {
                    x61Var.a();
                }
                r22 r22Var = b71Var.a;
                r22Var.getClass();
                r22Var.k(null, c71.c);
            }
            r91Var.b = false;
            return;
        }
        se.p("This input is not added to any dispatcher.");
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        v61 g = fp.g(backEvent);
        r91 r91Var = this.a;
        q4 q4Var = r91Var.a;
        if (q4Var != null) {
            if (r91Var.b) {
                b71 b71Var = (b71) q4Var.g;
                b71Var.getClass();
                if (r91Var.equals(b71Var.h) && -1 == b71Var.g) {
                    x61 x61Var = b71Var.f;
                    if (x61Var == null) {
                        x61Var = b71Var.c(-1);
                    }
                    if (x61Var != null) {
                        x61Var.c(g);
                    }
                    r22 r22Var = b71Var.a;
                    d71 d71Var = new d71(g);
                    r22Var.getClass();
                    r22Var.k(null, d71Var);
                    return;
                }
                return;
            }
            return;
        }
        se.p("This input is not added to any dispatcher.");
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        v61 g = fp.g(backEvent);
        r91 r91Var = this.a;
        q4 q4Var = r91Var.a;
        if (q4Var != null) {
            if (!r91Var.b) {
                q4Var.f(r91Var, g);
                r91Var.b = true;
                return;
            }
            return;
        }
        se.p("This input is not added to any dispatcher.");
    }
}
