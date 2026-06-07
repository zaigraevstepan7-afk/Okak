package defpackage;

import android.content.res.Resources;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class kj0 {
    public final Resources.Theme a;
    public final int b;

    public kj0(Resources.Theme theme, int i) {
        this.a = theme;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kj0)) {
            return false;
        }
        kj0 kj0Var = (kj0) obj;
        if (sn0.r(this.a, kj0Var.a) && this.b == kj0Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.a);
        sb.append(", id=");
        return l90.o(sb, this.b, ')');
    }
}
