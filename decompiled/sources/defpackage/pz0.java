package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class pz0 extends AbstractCollection implements Collection, yo0 {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ pz0(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.e) {
            case 0:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.e) {
            case 0:
                ((nz0) this.f).clear();
                return;
            default:
                ((rf1) this.f).clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.e) {
            case 0:
                return ((nz0) this.f).containsValue(obj);
            default:
                return ((rf1) this.f).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.e) {
            case 0:
                return ((nz0) this.f).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                nz0 nz0Var = (nz0) obj;
                nz0Var.getClass();
                return new kz0(nz0Var, 2);
            default:
                rf1 rf1Var = (rf1) obj;
                zb2[] zb2VarArr = new zb2[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    zb2VarArr[i2] = new ac2(2);
                }
                return new vf1(rf1Var, zb2VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.e) {
            case 0:
                nz0 nz0Var = (nz0) this.f;
                nz0Var.b();
                int g = nz0Var.g(obj);
                if (g < 0) {
                    return false;
                }
                nz0Var.j(g);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.e) {
            case 0:
                collection.getClass();
                ((nz0) this.f).b();
                return super.removeAll(collection);
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.e) {
            case 0:
                collection.getClass();
                ((nz0) this.f).b();
                return super.retainAll(collection);
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.e) {
            case 0:
                return ((nz0) this.f).m;
            default:
                return ((rf1) this.f).i;
        }
    }
}
