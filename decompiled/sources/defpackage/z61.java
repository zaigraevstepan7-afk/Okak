package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class z61 {
    public final List a;
    public final int b;

    public z61(int i, List list) {
        this.a = list;
        this.b = i;
        if (!list.isEmpty() || i != -1) {
            if (!list.isEmpty()) {
                int size = list.size();
                if (i >= 0 && i < size) {
                    return;
                }
            }
            y61.p(l90.q("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", i, "', bounds = '"), xn.z(list), "'.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z61.class != obj.getClass()) {
            return false;
        }
        z61 z61Var = (z61) obj;
        if (this.b == z61Var.b && sn0.r(this.a, z61Var.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.b + ", mergedHistory=" + this.a + ')';
    }

    public z61() {
        this(-1, l60.e);
    }
}
