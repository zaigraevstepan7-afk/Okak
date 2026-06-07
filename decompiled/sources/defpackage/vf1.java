package defpackage;

import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class vf1 extends uf1 {
    public final rf1 h;
    public Object i;
    public boolean j;
    public int k;

    public vf1(rf1 rf1Var, zb2[] zb2VarArr) {
        super(rf1Var.f, zb2VarArr);
        this.h = rf1Var;
        this.k = rf1Var.h;
    }

    public final void c(int i, yb2 yb2Var, Object obj, int i2) {
        int i3 = i2 * 5;
        zb2[] zb2VarArr = this.e;
        if (i3 > 30) {
            zb2 zb2Var = zb2VarArr[i2];
            Object[] objArr = yb2Var.d;
            zb2Var.a(objArr, objArr.length, 0);
            while (true) {
                zb2 zb2Var2 = zb2VarArr[i2];
                if (!sn0.r(zb2Var2.e[zb2Var2.g], obj)) {
                    zb2VarArr[i2].g += 2;
                } else {
                    this.f = i2;
                    return;
                }
            }
        } else {
            int k = 1 << op1.k(i, i3);
            if (yb2Var.h(k)) {
                zb2VarArr[i2].a(yb2Var.d, Integer.bitCount(yb2Var.a) * 2, yb2Var.f(k));
                this.f = i2;
            } else {
                int t = yb2Var.t(k);
                yb2 s = yb2Var.s(t);
                zb2VarArr[i2].a(yb2Var.d, Integer.bitCount(yb2Var.a) * 2, t);
                c(i, s, obj, i2 + 1);
            }
        }
    }

    @Override // defpackage.uf1, java.util.Iterator
    public final Object next() {
        if (this.h.h == this.k) {
            if (this.g) {
                zb2 zb2Var = this.e[this.f];
                this.i = zb2Var.e[zb2Var.g];
                this.j = true;
                return super.next();
            }
            y61.c();
            return null;
        }
        throw new ConcurrentModificationException();
    }

    @Override // defpackage.uf1, java.util.Iterator
    public final void remove() {
        int i;
        if (this.j) {
            boolean z = this.g;
            rf1 rf1Var = this.h;
            if (z) {
                if (z) {
                    zb2 zb2Var = this.e[this.f];
                    Object obj = zb2Var.e[zb2Var.g];
                    fc2.r(rf1Var).remove(this.i);
                    if (obj != null) {
                        i = obj.hashCode();
                    } else {
                        i = 0;
                    }
                    c(i, rf1Var.f, obj, 0);
                } else {
                    y61.c();
                    return;
                }
            } else {
                fc2.r(rf1Var).remove(this.i);
            }
            this.i = null;
            this.j = false;
            this.k = rf1Var.h;
            return;
        }
        throw new IllegalStateException();
    }
}
