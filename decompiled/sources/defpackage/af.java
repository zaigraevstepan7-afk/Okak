package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class af implements Collection, Set, yo0, bp0 {
    public int[] e = f2.c;
    public Object[] f = f2.e;
    public int g;

    public final Object a(int i) {
        int i2 = this.g;
        Object[] objArr = this.f;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.e;
        int i4 = 8;
        if (iArr.length > 8 && i2 < iArr.length / 3) {
            if (i2 > 8) {
                i4 = i2 + (i2 >> 1);
            }
            int[] iArr2 = new int[i4];
            this.e = iArr2;
            this.f = new Object[i4];
            if (i > 0) {
                bf.F(iArr, iArr2, 0, i, 6);
                bf.G(objArr, this.f, 0, i, 6);
            }
            if (i < i3) {
                int i5 = i + 1;
                bf.B(iArr, this.e, i, i5, i2);
                bf.D(objArr, this.f, i, i5, i2);
            }
        } else {
            if (i < i3) {
                int i6 = i + 1;
                bf.B(iArr, iArr, i, i6, i2);
                Object[] objArr2 = this.f;
                bf.D(objArr2, objArr2, i, i6, i2);
            }
            this.f[i3] = null;
        }
        if (i2 == this.g) {
            this.g = i3;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int z;
        int i2 = this.g;
        if (obj == null) {
            z = rx.z(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            z = rx.z(this, obj, hashCode);
        }
        if (z >= 0) {
            return false;
        }
        int i3 = ~z;
        int[] iArr = this.e;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f;
            int[] iArr2 = new int[i4];
            this.e = iArr2;
            this.f = new Object[i4];
            if (i2 == this.g) {
                if (iArr2.length != 0) {
                    bf.F(iArr, iArr2, 0, iArr.length, 6);
                    bf.G(objArr, this.f, 0, objArr.length, 6);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.e;
            int i5 = i3 + 1;
            bf.B(iArr3, iArr3, i5, i3, i2);
            Object[] objArr2 = this.f;
            bf.D(objArr2, objArr2, i5, i3, i2);
        }
        int i6 = this.g;
        if (i2 == i6) {
            int[] iArr4 = this.e;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.f[i3] = obj;
                this.g = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.g;
        int i = this.g;
        int[] iArr = this.e;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f;
            int[] iArr2 = new int[size];
            this.e = iArr2;
            this.f = new Object[size];
            if (i > 0) {
                bf.F(iArr, iArr2, 0, i, 6);
                bf.G(objArr, this.f, 0, this.g, 6);
            }
        }
        if (this.g == i) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z |= add(it.next());
            }
            return z;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.g != 0) {
            this.e = f2.c;
            this.f = f2.e;
            this.g = 0;
        }
        if (this.g == 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int z;
        if (obj == null) {
            z = rx.z(this, null, 0);
        } else {
            z = rx.z(this, obj, obj.hashCode());
        }
        if (z < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.g != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.g;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.f[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.e;
        int i = this.g;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.g <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ve(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int z;
        if (obj == null) {
            z = rx.z(this, null, 0);
        } else {
            z = rx.z(this, obj, obj.hashCode());
        }
        if (z < 0) {
            return false;
        }
        a(z);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.g - 1; -1 < i; i--) {
            if (!wn.f0(collection, this.f[i])) {
                a(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.g;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.g;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        bf.D(this.f, objArr, 0, 0, this.g);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.g * 14);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int i = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return bf.I(this.f, 0, this.g);
    }
}
