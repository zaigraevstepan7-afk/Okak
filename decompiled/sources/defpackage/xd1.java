package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class xd1 implements Serializable {
    public final Object e;
    public final Object f;

    public xd1(Object obj, Object obj2) {
        this.e = obj;
        this.f = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd1)) {
            return false;
        }
        xd1 xd1Var = (xd1) obj;
        if (sn0.r(this.e, xd1Var.e) && sn0.r(this.f, xd1Var.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        Object obj = this.e;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = hashCode * 31;
        Object obj2 = this.f;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "(" + this.e + ", " + this.f + ')';
    }
}
