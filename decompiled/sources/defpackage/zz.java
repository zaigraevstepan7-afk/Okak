package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zz implements Iterator, xo0 {
    public final /* synthetic */ int e;
    public int f;
    public int g;
    public int h;
    public Object i;
    public final Object j;

    public zz(a00 a00Var) {
        this.e = 0;
        this.j = a00Var;
        this.f = -1;
        int p = go.p(0, 0, ((CharSequence) a00Var.b).length());
        this.g = p;
        this.h = p;
    }

    public void a() {
        a00 a00Var = (a00) this.j;
        CharSequence charSequence = (CharSequence) a00Var.b;
        int i = this.h;
        int i2 = 0;
        if (i < 0) {
            this.f = 0;
            this.i = null;
            return;
        }
        if (i > charSequence.length()) {
            int i3 = this.g;
            charSequence.getClass();
            this.i = new ym0(i3, charSequence.length() - 1, 1);
            this.h = -1;
        } else {
            xd1 xd1Var = (xd1) ((h8) a00Var.c).invoke(charSequence, Integer.valueOf(this.h));
            if (xd1Var == null) {
                int i4 = this.g;
                charSequence.getClass();
                this.i = new ym0(i4, charSequence.length() - 1, 1);
                this.h = -1;
            } else {
                int intValue = ((Number) xd1Var.e).intValue();
                int intValue2 = ((Number) xd1Var.f).intValue();
                this.i = go.X(this.g, intValue);
                int i5 = intValue + intValue2;
                this.g = i5;
                if (intValue2 == 0) {
                    i2 = 1;
                }
                this.h = i5 + i2;
            }
        }
        this.f = 1;
    }

    public boolean b() {
        this.f = 3;
        int i = this.g;
        if (i == 0) {
            this.f = 2;
        } else {
            so1 so1Var = (so1) this.j;
            Object[] objArr = so1Var.e;
            int i2 = this.h;
            this.i = objArr[i2];
            this.f = 1;
            this.h = (i2 + 1) % so1Var.f;
            this.g = i - 1;
        }
        if (this.f == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                if (this.f == -1) {
                    a();
                }
                if (this.f == 1) {
                    return true;
                }
                return false;
            case 1:
                int i = this.f;
                if (i != 0) {
                    if (i == 1) {
                        return true;
                    }
                    if (i != 2) {
                        se.h("hasNext called when the iterator is in the FAILED state.");
                    }
                    return false;
                }
                return b();
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                if (this.f == -1) {
                    a();
                }
                if (this.f != 0) {
                    an0 an0Var = (an0) this.i;
                    an0Var.getClass();
                    this.i = null;
                    this.f = -1;
                    return an0Var;
                }
                y61.c();
                return null;
            case 1:
                int i = this.f;
                if (i == 1) {
                    this.f = 0;
                    return this.i;
                }
                if (i != 2 && b()) {
                    this.f = 0;
                    return this.i;
                }
                y61.c();
                return null;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public zz(so1 so1Var) {
        this.e = 1;
        this.j = so1Var;
        this.g = so1Var.h;
        this.h = so1Var.g;
    }

    public zz(gz1 gz1Var, int i, dg0 dg0Var, rp1 rp1Var) {
        this.e = 2;
        this.i = gz1Var;
        this.f = i;
        this.j = rp1Var;
        this.g = gz1Var.l;
    }
}
