package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ui2 {
    public final List a;

    public ui2(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ui2.class.equals(obj.getClass())) {
            return this.a.equals(((ui2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wn.m0(this.a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
