package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class d42 implements Collection, xo0 {
    public final /* synthetic */ int e = 0;
    public final Object f;

    public d42() {
        int i = rb1.a;
        this.f = new c41(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.e) {
            case 0:
                return ((c41) this.f).a(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.e) {
            case 0:
                ((c41) this.f).b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.e) {
            case 0:
                return ((c41) this.f).c(obj);
            default:
                return ((i41) this.f).d(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((c41) obj).c(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                collection.getClass();
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        if (!((i41) obj).d(it2.next())) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.e) {
            case 0:
                if (((c41) this.f).g == 0) {
                    return true;
                }
                return false;
            default:
                return ((i41) this.f).i();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                c41 c41Var = (c41) this.f;
                c41Var.getClass();
                return new if0(new e41(c41Var));
            default:
                return yq1.t(new e70(this, null, 3));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.e) {
            case 0:
                return ((c41) this.f).g(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.e) {
            case 0:
                return ((c41) this.f).g(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.e) {
            case 0:
                return ((c41) this.f).i(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.e) {
            case 0:
                return ((c41) this.f).g;
            default:
                return ((i41) this.f).e;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.e) {
            case 0:
                return d6.F(this, objArr);
            default:
                objArr.getClass();
                return d6.F(this, objArr);
        }
    }

    public d42(i41 i41Var) {
        i41Var.getClass();
        this.f = i41Var;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.e) {
            case 0:
                return d6.E(this);
            default:
                return d6.E(this);
        }
    }
}
