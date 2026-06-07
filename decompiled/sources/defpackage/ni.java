package defpackage;

import android.graphics.BlendModeColorFilter;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ni {
    public final BlendModeColorFilter a;
    public final long b;
    public final int c;

    public ni(int i, long j) {
        this.a = new BlendModeColorFilter(go.U(j), c01.T(i));
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni)) {
            return false;
        }
        ni niVar = (ni) obj;
        if (co.c(this.b, niVar.b) && this.c == niVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = co.h;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        l90.u(this.b, sb, ", blendMode=");
        sb.append((Object) c01.U(this.c));
        sb.append(')');
        return sb.toString();
    }
}
