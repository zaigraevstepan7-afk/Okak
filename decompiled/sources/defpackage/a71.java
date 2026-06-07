package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class a71 {
    public q4 a;
    public boolean b;

    public final void a() {
        q4 q4Var = this.a;
        if (q4Var != null) {
            if (!this.b) {
                q4Var.f(this, null);
            }
            b71 b71Var = (b71) q4Var.g;
            l2 l2Var = (l2) q4Var.f;
            b71Var.getClass();
            if (equals(b71Var.h) && -1 == b71Var.g) {
                x61 x61Var = b71Var.f;
                if (x61Var == null) {
                    x61Var = b71Var.c(-1);
                }
                b71Var.f = null;
                b71Var.g = 0;
                b71Var.h = null;
                if (x61Var == null) {
                    ((y91) l2Var.e).a.run();
                } else {
                    x61Var.b();
                }
                r22 r22Var = b71Var.a;
                r22Var.getClass();
                r22Var.k(null, c71.c);
            }
            this.b = false;
            return;
        }
        se.p("This input is not added to any dispatcher.");
    }

    public void b(boolean z) {
    }
}
