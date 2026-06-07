package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ch0 implements List, xo0 {
    public final b41 e = new b41(16);
    public final s31 f = new s31(16);
    public int g = -1;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a() {
        /*
            r7 = this;
            r0 = 2139095040(0x7f800000, float:Infinity)
            r1 = 0
            long r0 = defpackage.xn.b(r0, r1, r1)
            int r2 = r7.g
            int r2 = r2 + 1
            b41 r3 = r7.e
            int r3 = r3.b
            int r3 = r3 + (-1)
            if (r2 > r3) goto L46
        L13:
            s31 r4 = r7.f
            if (r2 < 0) goto L3c
            int r5 = r4.b
            if (r2 >= r5) goto L3f
            long[] r4 = r4.a
            r4 = r4[r2]
            int r6 = defpackage.hp.o(r4, r0)
            if (r6 >= 0) goto L26
            r0 = r4
        L26:
            float r4 = defpackage.hp.w(r0)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L36
            boolean r4 = defpackage.hp.C(r0)
            if (r4 == 0) goto L36
            goto L3b
        L36:
            if (r2 == r3) goto L3b
            int r2 = r2 + 1
            goto L13
        L3b:
            return r0
        L3c:
            r4.getClass()
        L3f:
            java.lang.String r7 = "Index must be between 0 and size"
            defpackage.se.u(r7)
            r0 = 0
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch0.a():long");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b(int i, int i2) {
        if (i < i2) {
            this.e.l(i, i2);
            s31 s31Var = this.f;
            if (i >= 0) {
                int i3 = s31Var.b;
                if (i <= i3 && i2 >= 0 && i2 <= i3) {
                    if (i2 >= i) {
                        if (i2 != i) {
                            if (i2 < i3) {
                                long[] jArr = s31Var.a;
                                bf.C(jArr, jArr, i, i2, i3);
                            }
                            s31Var.b -= i2 - i;
                            return;
                        }
                        return;
                    }
                    se.h("The end index must be < start index");
                    return;
                }
            } else {
                s31Var.getClass();
            }
            se.u("Index must be between 0 and size");
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.g = -1;
        this.e.d();
        this.f.b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof d21) || indexOf((d21) obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((d21) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object f = this.e.f(i);
        f.getClass();
        return (d21) f;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof d21)) {
            return -1;
        }
        d21 d21Var = (d21) obj;
        int size = size() - 1;
        if (size >= 0) {
            int i = 0;
            while (!sn0.r(this.e.f(i), d21Var)) {
                if (i != size) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.e.h();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ah0(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof d21)) {
            return -1;
        }
        d21 d21Var = (d21) obj;
        for (int size = size() - 1; -1 < size; size--) {
            if (sn0.r(this.e.f(size), d21Var)) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new ah0(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.e.b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new bh0(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return d6.E(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return d6.F(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new ah0(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
