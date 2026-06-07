package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class u91 {
    public boolean b;
    public final ArrayList a = new ArrayList();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    public u91(boolean z) {
        this.b = z;
    }

    public abstract void b();

    public final void e(boolean z) {
        boolean z2;
        this.b = z;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            t91 t91Var = (t91) it.next();
            if (t91Var.e && z) {
                z2 = true;
            } else {
                z2 = false;
            }
            t91Var.f(z2);
        }
    }

    public void a() {
    }

    public void c(rg rgVar) {
    }

    public void d(rg rgVar) {
    }
}
