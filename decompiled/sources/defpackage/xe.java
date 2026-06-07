package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class xe implements Iterator, Map.Entry {
    public int e;
    public int f = -1;
    public boolean g;
    public final /* synthetic */ ze h;

    public xe(ze zeVar) {
        this.h = zeVar;
        this.e = zeVar.g - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.g) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i = this.f;
                ze zeVar = this.h;
                if (sn0.r(key, zeVar.g(i)) && sn0.r(entry.getValue(), zeVar.k(this.f))) {
                    return true;
                }
            }
            return false;
        }
        se.p("This container does not support retaining Map.Entry objects");
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.g) {
            return this.h.g(this.f);
        }
        se.p("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.g) {
            return this.h.k(this.f);
        }
        se.p("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f < this.e) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i = 0;
        if (this.g) {
            int i2 = this.f;
            ze zeVar = this.h;
            Object g = zeVar.g(i2);
            Object k = zeVar.k(this.f);
            if (g == null) {
                hashCode = 0;
            } else {
                hashCode = g.hashCode();
            }
            if (k != null) {
                i = k.hashCode();
            }
            return hashCode ^ i;
        }
        se.p("This container does not support retaining Map.Entry objects");
        return 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f++;
            this.g = true;
            return this;
        }
        y61.c();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.g) {
            this.h.i(this.f);
            this.f--;
            this.e--;
            this.g = false;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.g) {
            return this.h.j(this.f, obj);
        }
        se.p("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
