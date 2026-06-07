package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class go1 implements Serializable {
    public final Object e;

    public static final Throwable a(Object obj) {
        if (obj instanceof fo1) {
            return ((fo1) obj).e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof go1) {
            if (!sn0.r(this.e, ((go1) obj).e)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.e;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.e;
        if (obj instanceof fo1) {
            return ((fo1) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
