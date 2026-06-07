package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ze implements Map {
    public int[] e = f2.c;
    public Object[] f = f2.e;
    public int g;
    public ue h;
    public we i;
    public ye j;

    public final int a(Object obj) {
        int i = this.g * 2;
        Object[] objArr = this.f;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final boolean b(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final boolean containsKey(Object obj) {
        if (e(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.g > 0) {
            this.e = f2.c;
            this.f = f2.e;
            this.g = 0;
        }
        if (this.g <= 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        if (a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int d(int i, Object obj) {
        int i2 = this.g;
        if (i2 == 0) {
            return -1;
        }
        int m = f2.m(this.e, i2, i);
        if (m < 0 || sn0.r(obj, this.f[m << 1])) {
            return m;
        }
        int i3 = m + 1;
        while (i3 < i2 && this.e[i3] == i) {
            if (sn0.r(obj, this.f[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = m - 1; i4 >= 0 && this.e[i4] == i; i4--) {
            if (sn0.r(obj, this.f[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int e(Object obj) {
        if (obj == null) {
            return f();
        }
        return d(obj.hashCode(), obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        ue ueVar = this.h;
        if (ueVar == null) {
            ue ueVar2 = new ue(this);
            this.h = ueVar2;
            return ueVar2;
        }
        return ueVar;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof ze) {
                int i = this.g;
                if (i != ((ze) obj).g) {
                    return false;
                }
                ze zeVar = (ze) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object g = g(i2);
                    Object k = k(i2);
                    Object obj2 = zeVar.get(g);
                    if (k == null) {
                        if (obj2 != null || !zeVar.containsKey(g)) {
                            return false;
                        }
                    } else if (!k.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.g != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.g;
            for (int i4 = 0; i4 < i3; i4++) {
                Object g2 = g(i4);
                Object k2 = k(i4);
                Object obj3 = ((Map) obj).get(g2);
                if (k2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(g2)) {
                        return false;
                    }
                } else if (!k2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int f() {
        int i = this.g;
        if (i == 0) {
            return -1;
        }
        int m = f2.m(this.e, i, 0);
        if (m < 0 || this.f[m << 1] == null) {
            return m;
        }
        int i2 = m + 1;
        while (i2 < i && this.e[i2] == 0) {
            if (this.f[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = m - 1; i3 >= 0 && this.e[i3] == 0; i3--) {
            if (this.f[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final Object g(int i) {
        boolean z = false;
        if (i >= 0 && i < this.g) {
            z = true;
        }
        if (z) {
            return this.f[i << 1];
        }
        se.h(l90.g(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int e = e(obj);
        if (e >= 0) {
            return this.f[(e << 1) + 1];
        }
        return null;
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        int e = e(obj);
        if (e >= 0) {
            return this.f[(e << 1) + 1];
        }
        return obj2;
    }

    @Override // java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Object remove(Object obj) {
        int e = e(obj);
        if (e >= 0) {
            return i(e);
        }
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i;
        int[] iArr = this.e;
        Object[] objArr = this.f;
        int i2 = this.g;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            int i6 = iArr[i4];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i5 += i ^ i6;
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public final Object i(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.g)) {
            Object[] objArr = this.f;
            int i3 = i << 1;
            Object obj = objArr[i3 + 1];
            if (i2 <= 1) {
                clear();
                return obj;
            }
            int i4 = i2 - 1;
            int[] iArr = this.e;
            int i5 = 8;
            if (iArr.length > 8 && i2 < iArr.length / 3) {
                if (i2 > 8) {
                    i5 = i2 + (i2 >> 1);
                }
                this.e = Arrays.copyOf(iArr, i5);
                this.f = Arrays.copyOf(this.f, i5 << 1);
                if (i2 == this.g) {
                    if (i > 0) {
                        bf.B(iArr, this.e, 0, 0, i);
                        bf.D(objArr, this.f, 0, 0, i3);
                    }
                    if (i < i4) {
                        int i6 = i + 1;
                        bf.B(iArr, this.e, i, i6, i2);
                        bf.D(objArr, this.f, i3, i6 << 1, i2 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i < i4) {
                    int i7 = i + 1;
                    bf.B(iArr, iArr, i, i7, i2);
                    Object[] objArr2 = this.f;
                    bf.D(objArr2, objArr2, i3, i7 << 1, i2 << 1);
                }
                Object[] objArr3 = this.f;
                int i8 = i4 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            }
            if (i2 == this.g) {
                this.g = i4;
                return obj;
            }
            throw new ConcurrentModificationException();
        }
        se.h(l90.g(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.g <= 0) {
            return true;
        }
        return false;
    }

    public final Object j(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.g) {
            z = true;
        }
        if (z) {
            int i2 = (i << 1) + 1;
            Object[] objArr = this.f;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
            return obj2;
        }
        se.h(l90.g(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final Object k(int i) {
        boolean z = false;
        if (i >= 0 && i < this.g) {
            z = true;
        }
        if (z) {
            return this.f[(i << 1) + 1];
        }
        se.h(l90.g(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    @Override // java.util.Map
    public final Set keySet() {
        we weVar = this.i;
        if (weVar == null) {
            we weVar2 = new we(this);
            this.i = weVar2;
            return weVar2;
        }
        return weVar;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        int f;
        int i2 = this.g;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        if (obj != null) {
            f = d(i, obj);
        } else {
            f = f();
        }
        if (f >= 0) {
            int i3 = (f << 1) + 1;
            Object[] objArr = this.f;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~f;
        int[] iArr = this.e;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            this.e = Arrays.copyOf(iArr, i5);
            this.f = Arrays.copyOf(this.f, i5 << 1);
            if (i2 != this.g) {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr2 = this.e;
            int i6 = i4 + 1;
            bf.B(iArr2, iArr2, i6, i4, i2);
            Object[] objArr2 = this.f;
            bf.D(objArr2, objArr2, i6 << 1, i4 << 1, this.g << 1);
        }
        int i7 = this.g;
        if (i2 == i7) {
            int[] iArr3 = this.e;
            if (i4 < iArr3.length) {
                iArr3[i4] = i;
                Object[] objArr3 = this.f;
                int i8 = i4 << 1;
                objArr3[i8] = obj;
                objArr3[i8 + 1] = obj2;
                this.g = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.g;
        int i = this.g;
        int[] iArr = this.e;
        if (iArr.length < size) {
            this.e = Arrays.copyOf(iArr, size);
            this.f = Arrays.copyOf(this.f, size * 2);
        }
        if (this.g == i) {
            for (Map.Entry entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int e = e(obj);
        if (e >= 0 && sn0.r(obj2, k(e))) {
            i(e);
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int e = e(obj);
        if (e >= 0 && sn0.r(obj2, k(e))) {
            j(e, obj3);
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final int size() {
        return this.g;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.g * 28);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int i = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object g = g(i2);
            if (g != sb) {
                sb.append(g);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object k = k(i2);
            if (k != sb) {
                sb.append(k);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        ye yeVar = this.j;
        if (yeVar == null) {
            ye yeVar2 = new ye(this);
            this.j = yeVar2;
            return yeVar2;
        }
        return yeVar;
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        int e = e(obj);
        if (e >= 0) {
            return j(e, obj2);
        }
        return null;
    }
}
