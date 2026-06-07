package defpackage;

import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fg1 extends c0 {
    public final dg1 g;
    public int h;
    public xb2 i;
    public int j;

    public fg1(dg1 dg1Var, int i) {
        super(i, dg1Var.l);
        this.g = dg1Var;
        this.h = dg1Var.e();
        this.j = -1;
        b();
    }

    public final void a() {
        if (this.h == this.g.e()) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // defpackage.c0, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.e;
        dg1 dg1Var = this.g;
        dg1Var.add(i, obj);
        this.e++;
        this.f = dg1Var.a();
        this.h = dg1Var.e();
        this.j = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void b() {
        dg1 dg1Var = this.g;
        Object[] objArr = dg1Var.j;
        if (objArr == null) {
            this.i = null;
            return;
        }
        int i = (dg1Var.l - 1) & (-32);
        int i2 = this.e;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (dg1Var.h / 5) + 1;
        xb2 xb2Var = this.i;
        if (xb2Var == null) {
            this.i = new xb2(objArr, i2, i, i3);
            return;
        }
        xb2Var.e = i2;
        xb2Var.f = i;
        xb2Var.g = i3;
        if (xb2Var.h.length < i3) {
            xb2Var.h = new Object[i3];
        }
        ?? r0 = 0;
        xb2Var.h[0] = objArr;
        if (i2 == i) {
            r0 = 1;
        }
        xb2Var.i = r0;
        xb2Var.b(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (hasNext()) {
            int i = this.e;
            this.j = i;
            xb2 xb2Var = this.i;
            dg1 dg1Var = this.g;
            if (xb2Var == null) {
                Object[] objArr = dg1Var.k;
                this.e = i + 1;
                return objArr[i];
            }
            if (xb2Var.hasNext()) {
                this.e++;
                return xb2Var.next();
            }
            Object[] objArr2 = dg1Var.k;
            int i2 = this.e;
            this.e = i2 + 1;
            return objArr2[i2 - xb2Var.f];
        }
        y61.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (hasPrevious()) {
            int i = this.e;
            this.j = i - 1;
            xb2 xb2Var = this.i;
            dg1 dg1Var = this.g;
            if (xb2Var == null) {
                Object[] objArr = dg1Var.k;
                int i2 = i - 1;
                this.e = i2;
                return objArr[i2];
            }
            int i3 = xb2Var.f;
            if (i > i3) {
                Object[] objArr2 = dg1Var.k;
                int i4 = i - 1;
                this.e = i4;
                return objArr2[i4 - i3];
            }
            this.e = i - 1;
            return xb2Var.previous();
        }
        y61.c();
        return null;
    }

    @Override // defpackage.c0, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.j;
        if (i != -1) {
            dg1 dg1Var = this.g;
            dg1Var.b(i);
            int i2 = this.j;
            if (i2 < this.e) {
                this.e = i2;
            }
            this.f = dg1Var.a();
            this.h = dg1Var.e();
            this.j = -1;
            b();
            return;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.c0, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.j;
        if (i != -1) {
            dg1 dg1Var = this.g;
            dg1Var.set(i, obj);
            this.h = dg1Var.e();
            b();
            return;
        }
        throw new IllegalStateException();
    }
}
