package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class kg2 {
    public final mg2 a = new mg2();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        mg2 mg2Var = this.a;
        if (mg2Var != null) {
            if (mg2Var.d) {
                mg2.a(autoCloseable);
                return;
            }
            synchronized (mg2Var.a) {
                autoCloseable2 = (AutoCloseable) mg2Var.b.put(str, autoCloseable);
            }
            mg2.a(autoCloseable2);
        }
    }

    public final void b() {
        mg2 mg2Var = this.a;
        if (mg2Var != null && !mg2Var.d) {
            mg2Var.d = true;
            synchronized (mg2Var.a) {
                try {
                    Iterator it = mg2Var.b.values().iterator();
                    while (it.hasNext()) {
                        mg2.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = mg2Var.c.iterator();
                    while (it2.hasNext()) {
                        mg2.a((AutoCloseable) it2.next());
                    }
                    mg2Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        mg2 mg2Var = this.a;
        if (mg2Var != null) {
            synchronized (mg2Var.a) {
                autoCloseable = (AutoCloseable) mg2Var.b.get(str);
            }
            return autoCloseable;
        }
        return null;
    }

    public void d() {
    }
}
