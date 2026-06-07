package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class m0 extends sn0 {
    @Override // defpackage.sn0
    public final void P(n0 n0Var, n0 n0Var2) {
        n0Var.b = n0Var2;
    }

    @Override // defpackage.sn0
    public final void Q(n0 n0Var, Thread thread) {
        n0Var.a = thread;
    }

    @Override // defpackage.sn0
    public final boolean w(o0 o0Var, k0 k0Var) {
        k0 k0Var2 = k0.b;
        synchronized (o0Var) {
            try {
                if (o0Var.f == k0Var) {
                    o0Var.f = k0Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.sn0
    public final boolean x(o0 o0Var, Object obj, Object obj2) {
        synchronized (o0Var) {
            try {
                if (o0Var.e == obj) {
                    o0Var.e = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.sn0
    public final boolean y(o0 o0Var, n0 n0Var, n0 n0Var2) {
        synchronized (o0Var) {
            try {
                if (o0Var.g == n0Var) {
                    o0Var.g = n0Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
