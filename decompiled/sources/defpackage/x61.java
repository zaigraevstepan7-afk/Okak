package defpackage;

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class x61 {
    public lo a;
    public boolean b;
    public q4 c;

    public abstract void a();

    public abstract void b();

    public abstract void c(v61 v61Var);

    public abstract void d(v61 v61Var);

    public final void e() {
        q4 q4Var = this.c;
        if (q4Var != null && ((LinkedHashSet) q4Var.h).remove(this)) {
            b71 b71Var = (b71) q4Var.g;
            b71Var.getClass();
            if (equals(b71Var.f)) {
                if (b71Var.g == -1) {
                    a();
                }
                b71Var.f = null;
                b71Var.g = 0;
                b71Var.h = null;
            }
            b71Var.d.remove(this);
            b71Var.e.remove(this);
            this.c = null;
            b71Var.b();
        }
    }

    public final void f(boolean z) {
        b71 b71Var;
        if (this.b != z) {
            this.b = z;
            q4 q4Var = this.c;
            if (q4Var != null && (b71Var = (b71) q4Var.g) != null) {
                b71Var.b();
            }
        }
    }
}
