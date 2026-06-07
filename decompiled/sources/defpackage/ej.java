package defpackage;

import android.graphics.Rect;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ej {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        new ej(0, 0, 0, 0);
    }

    public ej(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (i <= i3) {
            if (i2 <= i4) {
                return;
            }
            se.e(l90.j("top must be less than or equal to bottom, top: ", i2, ", bottom: ", i4));
            throw null;
        }
        se.e(l90.j("Left must be less than or equal to right, left: ", i, ", right: ", i3));
        throw null;
    }

    public final int a() {
        return this.d - this.b;
    }

    public final int b() {
        return this.c - this.a;
    }

    public final Rect c() {
        return new Rect(this.a, this.b, this.c, this.d);
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
        if (!ej.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        ej ejVar = (ej) obj;
        if (this.a == ejVar.a && this.b == ejVar.b && this.c == ejVar.c && this.d == ejVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return ej.class.getSimpleName() + " { [" + this.a + AbstractJsonLexerKt.COMMA + this.b + AbstractJsonLexerKt.COMMA + this.c + AbstractJsonLexerKt.COMMA + this.d + "] }";
    }

    public ej(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
    }
}
