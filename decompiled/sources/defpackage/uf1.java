package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class uf1 implements Iterator, xo0 {
    public final zb2[] e;
    public int f;
    public boolean g = true;

    public uf1(yb2 yb2Var, zb2[] zb2VarArr) {
        this.e = zb2VarArr;
        zb2VarArr[0].a(yb2Var.d, Integer.bitCount(yb2Var.a) * 2, 0);
        this.f = 0;
        a();
    }

    public final void a() {
        int i = this.f;
        zb2[] zb2VarArr = this.e;
        zb2 zb2Var = zb2VarArr[i];
        if (zb2Var.g < zb2Var.f) {
            return;
        }
        while (-1 < i) {
            int b = b(i);
            if (b == -1) {
                zb2 zb2Var2 = zb2VarArr[i];
                int i2 = zb2Var2.g;
                Object[] objArr = zb2Var2.e;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    zb2Var2.g = i2 + 1;
                    b = b(i);
                }
            }
            if (b != -1) {
                this.f = b;
                return;
            }
            if (i > 0) {
                zb2 zb2Var3 = zb2VarArr[i - 1];
                int i3 = zb2Var3.g;
                int length2 = zb2Var3.e.length;
                zb2Var3.g = i3 + 1;
            }
            zb2VarArr[i].a(yb2.e.d, 0, 0);
            i--;
        }
        this.g = false;
    }

    public final int b(int i) {
        zb2[] zb2VarArr = this.e;
        zb2 zb2Var = zb2VarArr[i];
        int i2 = zb2Var.g;
        if (i2 < zb2Var.f) {
            return i;
        }
        Object[] objArr = zb2Var.e;
        if (i2 < objArr.length) {
            int length = objArr.length;
            Object obj = objArr[i2];
            obj.getClass();
            yb2 yb2Var = (yb2) obj;
            if (i == 6) {
                zb2 zb2Var2 = zb2VarArr[i + 1];
                Object[] objArr2 = yb2Var.d;
                zb2Var2.a(objArr2, objArr2.length, 0);
            } else {
                zb2VarArr[i + 1].a(yb2Var.d, Integer.bitCount(yb2Var.a) * 2, 0);
            }
            return b(i + 1);
        }
        return -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.g) {
            Object next = this.e[this.f].next();
            a();
            return next;
        }
        y61.c();
        return null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
