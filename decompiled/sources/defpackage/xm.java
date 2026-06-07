package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class xm {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public int a(sl0 sl0Var, q5 q5Var, boolean z) {
        Object[] objArr;
        int i;
        int i2;
        zg0 zg0Var = (zg0) this.c;
        ch0 ch0Var = (ch0) this.e;
        if (this.a) {
            return 0;
        }
        try {
            this.a = true;
            sl0 u = ((rg2) this.d).u(sl0Var, q5Var);
            py0 py0Var = (py0) u.e;
            int d = py0Var.d();
            for (int i3 = 0; i3 < d; i3++) {
                qh1 qh1Var = (qh1) py0Var.e(i3);
                if (!qh1Var.d && !qh1Var.h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int d2 = py0Var.d();
            for (int i4 = 0; i4 < d2; i4++) {
                qh1 qh1Var2 = (qh1) py0Var.e(i4);
                if (objArr != false || qo.o(qh1Var2)) {
                    ((ar0) this.b).A(qh1Var2.c, (ch0) this.e, qh1Var2.i, true);
                    if (!ch0Var.e.h()) {
                        zg0Var.a(qh1Var2.a, ch0Var, qo.o(qh1Var2));
                        ch0Var.clear();
                    }
                }
            }
            boolean b = zg0Var.b(u, z);
            int d3 = py0Var.d();
            int i5 = 0;
            while (true) {
                if (i5 < d3) {
                    qh1 qh1Var3 = (qh1) py0Var.e(i5);
                    if (!z81.b(qo.X(qh1Var3, true), 0L) && qh1Var3.b()) {
                        i = 1;
                        break;
                    }
                    i5++;
                } else {
                    i = 0;
                    break;
                }
            }
            int d4 = py0Var.d();
            int i6 = 0;
            while (true) {
                if (i6 < d4) {
                    if (((qh1) py0Var.e(i6)).b()) {
                        i2 = 1;
                        break;
                    }
                    i6++;
                } else {
                    i2 = 0;
                    break;
                }
            }
            int i7 = (b ? 1 : 0) | (i << 1) | (i2 << 2);
            this.a = false;
            return i7;
        } catch (Throwable th) {
            this.a = false;
            throw th;
        }
    }

    public void b(int i, int i2) {
        if (i < 0.0f) {
            nl0.a("Index should be non-negative (" + i + ')');
        }
        ((ge1) this.b).h(i);
        ((ms0) this.e).a(i);
        ((ge1) this.c).h(i2);
    }
}
