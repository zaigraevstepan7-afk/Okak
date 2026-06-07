package defpackage;

import android.graphics.Rect;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class vi2 {
    public final ej a;
    public final float b;

    public vi2(Rect rect, float f) {
        this.a = new ej(rect);
        this.b = f;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!vi2.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        vi2 vi2Var = (vi2) obj;
        if (sn0.r(this.a, vi2Var.a) && this.b == vi2Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowMetrics(_bounds=");
        sb.append(this.a);
        sb.append(", density=");
        return l90.n(sb, this.b, ')');
    }
}
