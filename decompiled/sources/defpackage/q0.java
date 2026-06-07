package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class q0 {
    public r0[] e;
    public int f;
    public int g;
    public f42 h;

    public final r0 d() {
        r0 r0Var;
        f42 f42Var;
        synchronized (this) {
            try {
                r0[] r0VarArr = this.e;
                if (r0VarArr == null) {
                    r0VarArr = f();
                    this.e = r0VarArr;
                } else if (this.f >= r0VarArr.length) {
                    Object[] copyOf = Arrays.copyOf(r0VarArr, r0VarArr.length * 2);
                    this.e = (r0[]) copyOf;
                    r0VarArr = (r0[]) copyOf;
                }
                int i = this.g;
                do {
                    r0Var = r0VarArr[i];
                    if (r0Var == null) {
                        r0Var = e();
                        r0VarArr[i] = r0Var;
                    }
                    i++;
                    if (i >= r0VarArr.length) {
                        i = 0;
                    }
                } while (!r0Var.a(this));
                this.g = i;
                this.f++;
                f42Var = this.h;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (f42Var != null) {
            f42Var.w(1);
        }
        return r0Var;
    }

    public abstract r0 e();

    public abstract r0[] f();

    public final void g(r0 r0Var) {
        f42 f42Var;
        int i;
        vt[] b;
        synchronized (this) {
            try {
                int i2 = this.f - 1;
                this.f = i2;
                f42Var = this.h;
                if (i2 == 0) {
                    this.g = 0;
                }
                r0Var.getClass();
                b = r0Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (vt vtVar : b) {
            if (vtVar != null) {
                vtVar.resumeWith(od2.a);
            }
        }
        if (f42Var != null) {
            f42Var.w(-1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [f42, sw1] */
    public final f42 h() {
        f42 f42Var;
        synchronized (this) {
            f42 f42Var2 = this.h;
            f42Var = f42Var2;
            if (f42Var2 == null) {
                int i = this.f;
                ?? sw1Var = new sw1(1, Integer.MAX_VALUE, jk.f);
                sw1Var.q(Integer.valueOf(i));
                this.h = sw1Var;
                f42Var = sw1Var;
            }
        }
        return f42Var;
    }
}
