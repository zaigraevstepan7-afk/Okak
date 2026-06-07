package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ah0 implements ListIterator, xo0 {
    public final /* synthetic */ int e;
    public int f;
    public int g;
    public int h;
    public final Object i;

    public ah0(a12 a12Var, int i) {
        this.e = 3;
        this.i = a12Var;
        this.f = i - 1;
        this.g = -1;
        this.h = c01.C(a12Var);
    }

    public void a() {
        int i;
        i = ((AbstractList) ((uv0) this.i).i).modCount;
        if (i == this.h) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i2 = this.e;
        Object obj2 = this.i;
        switch (i2) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                uv0 uv0Var = (uv0) obj2;
                int i3 = this.f;
                this.f = i3 + 1;
                uv0Var.add(i3, obj);
                this.g = -1;
                this.h = uv0.c(uv0Var);
                return;
            case 2:
                b();
                vv0 vv0Var = (vv0) obj2;
                int i4 = this.f;
                this.f = i4 + 1;
                vv0Var.add(i4, obj);
                this.g = -1;
                i = ((AbstractList) vv0Var).modCount;
                this.h = i;
                return;
            default:
                c();
                a12 a12Var = (a12) obj2;
                a12Var.add(this.f + 1, obj);
                this.g = -1;
                this.f++;
                this.h = c01.C(a12Var);
                return;
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((vv0) this.i)).modCount;
        if (i == this.h) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (c01.C((a12) this.i) == this.h) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.e;
        Object obj = this.i;
        switch (i) {
            case 0:
                if (this.f >= this.h) {
                    return false;
                }
                return true;
            case 1:
                if (this.f >= ((uv0) obj).g) {
                    return false;
                }
                return true;
            case 2:
                if (this.f >= ((vv0) obj).f) {
                    return false;
                }
                return true;
            default:
                if (this.f >= ((a12) obj).size() - 1) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.e) {
            case 0:
                if (this.f > this.g) {
                    return true;
                }
                return false;
            case 1:
                if (this.f > 0) {
                    return true;
                }
                return false;
            case 2:
                if (this.f > 0) {
                    return true;
                }
                return false;
            default:
                if (this.f >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.e;
        Object obj = this.i;
        switch (i) {
            case 0:
                b41 b41Var = ((ch0) obj).e;
                int i2 = this.f;
                this.f = i2 + 1;
                Object f = b41Var.f(i2);
                f.getClass();
                return (d21) f;
            case 1:
                a();
                int i3 = this.f;
                uv0 uv0Var = (uv0) obj;
                if (i3 < uv0Var.g) {
                    this.f = i3 + 1;
                    this.g = i3;
                    return uv0Var.e[uv0Var.f + i3];
                }
                y61.c();
                return null;
            case 2:
                b();
                int i4 = this.f;
                vv0 vv0Var = (vv0) obj;
                if (i4 < vv0Var.f) {
                    this.f = i4 + 1;
                    this.g = i4;
                    return vv0Var.e[i4];
                }
                y61.c();
                return null;
            default:
                c();
                int i5 = this.f + 1;
                this.g = i5;
                a12 a12Var = (a12) obj;
                c01.o(i5, a12Var.size());
                Object obj2 = a12Var.get(i5);
                this.f = i5;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.e) {
            case 0:
                return this.f - this.g;
            case 1:
                return this.f;
            case 2:
                return this.f;
            default:
                return this.f + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.e;
        Object obj = this.i;
        switch (i) {
            case 0:
                b41 b41Var = ((ch0) obj).e;
                int i2 = this.f - 1;
                this.f = i2;
                Object f = b41Var.f(i2);
                f.getClass();
                return (d21) f;
            case 1:
                a();
                int i3 = this.f;
                if (i3 > 0) {
                    int i4 = i3 - 1;
                    this.f = i4;
                    this.g = i4;
                    uv0 uv0Var = (uv0) obj;
                    return uv0Var.e[uv0Var.f + i4];
                }
                y61.c();
                return null;
            case 2:
                b();
                int i5 = this.f;
                if (i5 > 0) {
                    int i6 = i5 - 1;
                    this.f = i6;
                    this.g = i6;
                    return ((vv0) obj).e[i6];
                }
                y61.c();
                return null;
            default:
                c();
                a12 a12Var = (a12) obj;
                c01.o(this.f, a12Var.size());
                int i7 = this.f;
                this.g = i7;
                this.f--;
                return a12Var.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.e) {
            case 0:
                return (this.f - this.g) - 1;
            case 1:
                i = this.f;
                break;
            case 2:
                i = this.f;
                break;
            default:
                return this.f;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i2 = this.e;
        Object obj = this.i;
        switch (i2) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                uv0 uv0Var = (uv0) obj;
                a();
                int i3 = this.g;
                if (i3 != -1) {
                    uv0Var.b(i3);
                    this.f = this.g;
                    this.g = -1;
                    this.h = uv0.c(uv0Var);
                    return;
                }
                se.p("Call next() or previous() before removing element from the iterator.");
                return;
            case 2:
                vv0 vv0Var = (vv0) obj;
                b();
                int i4 = this.g;
                if (i4 != -1) {
                    vv0Var.b(i4);
                    this.f = this.g;
                    this.g = -1;
                    i = ((AbstractList) vv0Var).modCount;
                    this.h = i;
                    return;
                }
                se.p("Call next() or previous() before removing element from the iterator.");
                return;
            default:
                c();
                a12 a12Var = (a12) obj;
                a12Var.remove(this.g);
                this.f--;
                this.g = -1;
                this.h = c01.C(a12Var);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.e;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i2 = this.g;
                if (i2 != -1) {
                    ((uv0) obj2).set(i2, obj);
                    return;
                } else {
                    se.p("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                b();
                int i3 = this.g;
                if (i3 != -1) {
                    ((vv0) obj2).set(i3, obj);
                    return;
                } else {
                    se.p("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                a12 a12Var = (a12) obj2;
                c();
                int i4 = this.g;
                if (i4 >= 0) {
                    a12Var.set(i4, obj);
                    this.h = c01.C(a12Var);
                    return;
                } else {
                    se.p("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                }
        }
    }

    public ah0(vv0 vv0Var, int i) {
        int i2;
        this.e = 2;
        this.i = vv0Var;
        this.f = i;
        this.g = -1;
        i2 = ((AbstractList) vv0Var).modCount;
        this.h = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ah0(ch0 ch0Var, int i, int i2) {
        this(ch0Var, (i2 & 1) != 0 ? 0 : i, 0, ch0Var.e.b);
        this.e = 0;
    }

    public ah0(ch0 ch0Var, int i, int i2, int i3) {
        this.e = 0;
        this.i = ch0Var;
        this.f = i;
        this.g = i2;
        this.h = i3;
    }

    public ah0(uv0 uv0Var, int i) {
        this.e = 1;
        this.i = uv0Var;
        this.f = i;
        this.g = -1;
        this.h = uv0.c(uv0Var);
    }
}
