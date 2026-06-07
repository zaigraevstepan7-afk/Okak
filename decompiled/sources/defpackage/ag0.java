package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ag0 implements Iterator, xo0 {
    public final gz1 e;
    public final int f;
    public int g;
    public final int h;

    public ag0(gz1 gz1Var, int i, int i2) {
        this.e = gz1Var;
        this.f = i2;
        this.g = i;
        this.h = gz1Var.l;
        if (gz1Var.k) {
            iz1.e();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.g < this.f) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        gz1 gz1Var = this.e;
        int i = gz1Var.l;
        int i2 = this.h;
        if (i != i2) {
            iz1.e();
        }
        int i3 = this.g;
        this.g = gz1Var.e[(i3 * 5) + 3] + i3;
        return new hz1(gz1Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
