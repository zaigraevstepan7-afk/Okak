package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class j71 extends n41 {
    public final n41 o;
    public boolean p;

    public j71(long j, o02 o02Var, oe0 oe0Var, oe0 oe0Var2, n41 n41Var) {
        super(j, o02Var, oe0Var, oe0Var2);
        this.o = n41Var;
        n41Var.k();
    }

    @Override // defpackage.n41, defpackage.i02
    public final void c() {
        if (!this.c) {
            super.c();
            if (!this.p) {
                this.p = true;
                this.o.l();
            }
        }
    }

    @Override // defpackage.n41
    public final xq1 w() {
        HashMap hashMap;
        j71 j71Var;
        n41 n41Var = this.o;
        if (!n41Var.m && !n41Var.c) {
            j41 j41Var = this.h;
            long j = this.b;
            if (j41Var != null) {
                hashMap = q02.b(n41Var.g(), this, this.o.d());
            } else {
                hashMap = null;
            }
            Object obj = q02.c;
            synchronized (obj) {
                try {
                    q02.c(this);
                    if (j41Var == null || j41Var.d == 0) {
                        j71Var = this;
                        j71Var.a();
                    } else {
                        j71Var = this;
                        xq1 z = j71Var.z(this.o.g(), j41Var, hashMap, this.o.d());
                        if (!z.equals(l02.a)) {
                            return z;
                        }
                        j41 x = j71Var.o.x();
                        if (x != null) {
                            x.j(j41Var);
                        } else {
                            j71Var.o.B(j41Var);
                            j71Var.h = null;
                        }
                    }
                    if (sn0.C(j71Var.o.g(), j) < 0) {
                        j71Var.o.v();
                    }
                    n41 n41Var2 = j71Var.o;
                    n41Var2.r(n41Var2.d().b(j).a(j71Var.j));
                    j71Var.o.A(j);
                    n41 n41Var3 = j71Var.o;
                    int i = j71Var.d;
                    j71Var.d = -1;
                    if (i >= 0) {
                        int[] iArr = n41Var3.k;
                        iArr.getClass();
                        int length = iArr.length;
                        int[] copyOf = Arrays.copyOf(iArr, length + 1);
                        copyOf[length] = i;
                        n41Var3.k = copyOf;
                    } else {
                        n41Var3.getClass();
                    }
                    n41 n41Var4 = j71Var.o;
                    o02 o02Var = j71Var.j;
                    n41Var4.getClass();
                    synchronized (obj) {
                        n41Var4.j = n41Var4.j.d(o02Var);
                        n41 n41Var5 = j71Var.o;
                        int[] iArr2 = j71Var.k;
                        n41Var5.getClass();
                        if (iArr2.length != 0) {
                            int[] iArr3 = n41Var5.k;
                            if (iArr3.length != 0) {
                                int length2 = iArr3.length;
                                int length3 = iArr2.length;
                                int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                                System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                                iArr2 = copyOf2;
                            }
                            n41Var5.k = iArr2;
                        }
                    }
                    j71Var.m = true;
                    if (!j71Var.p) {
                        j71Var.p = true;
                        j71Var.o.l();
                    }
                    return l02.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return new k02(this);
    }
}
