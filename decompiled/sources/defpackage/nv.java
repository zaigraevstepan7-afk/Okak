package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class nv {
    public final LinkedHashMap a = new LinkedHashMap();

    public abstract Object a(wm1 wm1Var);

    public final boolean equals(Object obj) {
        if (obj instanceof nv) {
            if (sn0.r(this.a, ((nv) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.a + ')';
    }
}
