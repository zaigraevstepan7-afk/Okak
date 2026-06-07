package defpackage;

import android.graphics.Insets;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class yl0 {
    public static final yl0 e = new yl0(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public yl0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static yl0 a(yl0 yl0Var, yl0 yl0Var2) {
        return b(Math.min(yl0Var.a, yl0Var2.a), Math.min(yl0Var.b, yl0Var2.b), Math.min(yl0Var.c, yl0Var2.c), Math.min(yl0Var.d, yl0Var2.d));
    }

    public static yl0 b(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return e;
        }
        return new yl0(i, i2, i3, i4);
    }

    public static yl0 c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return Insets.of(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yl0.class != obj.getClass()) {
            return false;
        }
        yl0 yl0Var = (yl0) obj;
        if (this.d == yl0Var.d && this.a == yl0Var.a && this.c == yl0Var.c && this.b == yl0Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return l90.o(sb, this.d, AbstractJsonLexerKt.END_OBJ);
    }
}
