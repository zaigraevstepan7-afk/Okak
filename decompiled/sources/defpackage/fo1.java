package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fo1 implements Serializable {
    public final Throwable e;

    public fo1(Throwable th) {
        th.getClass();
        this.e = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fo1) {
            if (sn0.r(this.e, ((fo1) obj).e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.e + ')';
    }
}
