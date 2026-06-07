package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class cc2 implements Serializable {
    public final Object e;
    public final Object f;
    public final Object g;

    public cc2(Object obj, Object obj2, Object obj3) {
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc2)) {
            return false;
        }
        cc2 cc2Var = (cc2) obj;
        if (sn0.r(this.e, cc2Var.e) && sn0.r(this.f, cc2Var.f) && sn0.r(this.g, cc2Var.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        Object obj = this.e;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = hashCode * 31;
        Object obj2 = this.f;
        if (obj2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = obj2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Object obj3 = this.g;
        if (obj3 != null) {
            i = obj3.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        return "(" + this.e + ", " + this.f + ", " + this.g + ')';
    }
}
