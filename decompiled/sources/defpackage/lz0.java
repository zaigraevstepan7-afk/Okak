package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class lz0 implements Map.Entry, xo0 {
    public final nz0 e;
    public final int f;
    public final int g;

    public lz0(nz0 nz0Var, int i) {
        nz0Var.getClass();
        this.e = nz0Var;
        this.f = i;
        this.g = nz0Var.l;
    }

    public final void a() {
        if (this.e.l == this.g) {
        } else {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (sn0.r(entry.getKey(), getKey()) && sn0.r(entry.getValue(), getValue())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.e.e[this.f];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.e.f;
        objArr.getClass();
        return objArr[this.f];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i;
        Object key = getKey();
        int i2 = 0;
        if (key != null) {
            i = key.hashCode();
        } else {
            i = 0;
        }
        Object value = getValue();
        if (value != null) {
            i2 = value.hashCode();
        }
        return i ^ i2;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        nz0 nz0Var = this.e;
        nz0Var.b();
        Object[] objArr = nz0Var.f;
        if (objArr == null) {
            int length = nz0Var.e.length;
            if (length >= 0) {
                objArr = new Object[length];
                nz0Var.f = objArr;
            } else {
                se.h("capacity must be non-negative.");
                return null;
            }
        }
        int i = this.f;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
