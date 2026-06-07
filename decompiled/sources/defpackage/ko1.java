package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ko1 implements ListIterator, xo0 {
    public final /* synthetic */ int e = 1;
    public final Object f;
    public final /* synthetic */ Object g;

    public ko1(vz0 vz0Var, int i) {
        this.g = vz0Var;
        List list = (List) vz0Var.f;
        if (i >= 0 && i <= vz0Var.a()) {
            this.f = list.listIterator(vz0Var.a() - i);
            return;
        }
        StringBuilder q = l90.q("Position index ", i, " must be in range [");
        q.append(new ym0(0, vz0Var.a(), 1));
        q.append("].");
        throw new IndexOutOfBoundsException(q.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((ListIterator) obj).hasPrevious();
            default:
                if (((ul1) obj).e < ((w32) this.g).h - 1) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((ListIterator) obj).hasNext();
            default:
                if (((ul1) obj).e >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((ListIterator) obj).previous();
            default:
                ul1 ul1Var = (ul1) obj;
                int i2 = ul1Var.e + 1;
                w32 w32Var = (w32) this.g;
                c01.o(i2, w32Var.h);
                ul1Var.e = i2;
                return w32Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                vz0 vz0Var = (vz0) this.g;
                return (vz0Var.size() - 1) - ((ListIterator) obj).previousIndex();
            default:
                return ((ul1) obj).e + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((ListIterator) obj).next();
            default:
                ul1 ul1Var = (ul1) obj;
                int i2 = ul1Var.e;
                w32 w32Var = (w32) this.g;
                c01.o(i2, w32Var.h);
                ul1Var.e = i2 - 1;
                return w32Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                vz0 vz0Var = (vz0) this.g;
                return (vz0Var.size() - 1) - ((ListIterator) obj).nextIndex();
            default:
                return ((ul1) obj).e;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public ko1(ul1 ul1Var, w32 w32Var) {
        this.f = ul1Var;
        this.g = w32Var;
    }
}
