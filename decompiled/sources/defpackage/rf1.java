package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class rf1 extends AbstractMap implements Map, ap0 {
    public wc0 e = new wc0(12);
    public yb2 f;
    public Object g;
    public int h;
    public int i;
    public sf1 j;

    public rf1(sf1 sf1Var) {
        this.f = sf1Var.e;
        this.i = sf1Var.f;
        this.j = sf1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [tf1] */
    public final sf1 a() {
        yb2 yb2Var = this.f;
        sf1 sf1Var = this.j;
        yb2 yb2Var2 = sf1Var.e;
        sf1 sf1Var2 = sf1Var;
        if (yb2Var != yb2Var2) {
            this.e = new wc0(12);
            sf1Var2 = new tf1(this.f, this.i);
        }
        this.j = sf1Var2;
        return sf1Var2;
    }

    public final boolean b(Object obj) {
        int i;
        yb2 yb2Var = this.f;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return yb2Var.d(obj, i, 0);
    }

    public final Object c(Object obj) {
        int i;
        yb2 yb2Var = this.f;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return yb2Var.g(obj, i, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f = yb2.e;
        e(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof xj1)) {
            return false;
        }
        return b((xj1) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof ge2)) {
            return false;
        }
        return super.containsValue((ge2) obj);
    }

    public final Object d(Object obj) {
        int i;
        this.g = null;
        yb2 yb2Var = this.f;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        yb2 n = yb2Var.n(i, obj, 0, this);
        if (n == null) {
            n = yb2.e;
        }
        this.f = n;
        return this.g;
    }

    public final void e(int i) {
        this.i = i;
        this.h++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new wf1(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (!(obj instanceof xj1)) {
            return null;
        }
        return (ge2) c((xj1) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof xj1)) {
            return obj2;
        }
        return (ge2) super.getOrDefault((xj1) obj, (ge2) obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new wf1(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        this.g = null;
        yb2 yb2Var = this.f;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        this.f = yb2Var.l(i, obj, obj2, 0, this);
        return this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [tf1] */
    /* JADX WARN: Type inference failed for: r3v0, types: [yb2] */
    /* JADX WARN: Type inference failed for: r6v1, types: [b00, java.lang.Object] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        sf1 sf1Var;
        rf1 rf1Var;
        sf1 sf1Var2 = null;
        if (map instanceof tf1) {
            sf1Var = (tf1) map;
        } else {
            sf1Var = null;
        }
        if (sf1Var == null) {
            if (map instanceof rf1) {
                rf1Var = (rf1) map;
            } else {
                rf1Var = null;
            }
            if (rf1Var != null) {
                sf1Var2 = rf1Var.a();
            }
        } else {
            sf1Var2 = sf1Var;
        }
        if (sf1Var2 != null) {
            ?? obj = new Object();
            obj.a = 0;
            int i = this.i;
            ?? r3 = this.f;
            yb2 yb2Var = sf1Var2.e;
            yb2Var.getClass();
            this.f = r3.m(yb2Var, 0, obj, this);
            int i2 = (sf1Var2.f + i) - obj.a;
            if (i != i2) {
                e(i2);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i;
        int i2 = this.i;
        yb2 yb2Var = this.f;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        yb2 o = yb2Var.o(i, obj, obj2, 0, this);
        if (o == null) {
            o = yb2.e;
        }
        this.f = o;
        if (i2 == this.i) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new pz0(this, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof xj1) {
            return (ge2) d((xj1) obj);
        }
        return null;
    }
}
