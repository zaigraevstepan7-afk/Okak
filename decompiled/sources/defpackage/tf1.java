package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class tf1 implements Map, xo0 {
    public static final tf1 g = new tf1(yb2.e, 0);
    public final yb2 e;
    public final int f;

    public tf1(yb2 yb2Var, int i) {
        this.e = yb2Var;
        this.f = i;
    }

    public final tf1 a(Object obj, tv0 tv0Var) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        np u = this.e.u(obj, i, 0, tv0Var);
        if (u == null) {
            return this;
        }
        return new tf1((yb2) u.b, this.f + u.a);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return this.e.d(obj, i, 0);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set entrySet = entrySet();
        if (entrySet.isEmpty()) {
            return false;
        }
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            if (sn0.r(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new zf1(this, 0);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.f != map.size()) {
            return false;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : entrySet) {
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = get(key);
                if (sn0.r(value, obj2) && (obj2 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return this.e.g(obj, i, 0);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.f == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new zf1(this, 1);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f;
    }

    public final String toString() {
        return wn.m0(entrySet(), ", ", "{", "}", new r(this, 1), 24);
    }

    @Override // java.util.Map
    public final Collection values() {
        return new wz0(this, 1);
    }
}
