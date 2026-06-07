package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class w82 {
    public final v82 a;
    public final g31 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public w82(v82 v82Var, g31 g31Var, long j) {
        float d;
        this.a = v82Var;
        this.b = g31Var;
        this.c = j;
        ArrayList arrayList = g31Var.h;
        float f = 0.0f;
        if (arrayList.isEmpty()) {
            d = 0.0f;
        } else {
            d = ((zd1) arrayList.get(0)).a.d.d(0);
        }
        this.d = d;
        if (!arrayList.isEmpty()) {
            zd1 zd1Var = (zd1) wn.n0(arrayList);
            f = zd1Var.a.d.d(r4.g - 1) + zd1Var.f;
        }
        this.e = f;
        this.f = g31Var.g;
    }

    public final um1 a(int i) {
        int x;
        g31 g31Var = this.b;
        g31Var.k(i);
        int length = ((rc) g31Var.a.a).f.length();
        ArrayList arrayList = g31Var.h;
        if (i == length) {
            x = xn.A(arrayList);
        } else {
            x = vn.x(i, arrayList);
        }
        zd1 zd1Var = (zd1) arrayList.get(x);
        i8 i8Var = zd1Var.a;
        if (i8Var.d.f.isRtlCharAt(zd1Var.d(i))) {
            return um1.f;
        }
        return um1.e;
    }

    public final pl1 b(int i) {
        boolean z;
        float i2;
        float i3;
        float h;
        float h2;
        g31 g31Var = this.b;
        g31Var.j(i);
        ArrayList arrayList = g31Var.h;
        zd1 zd1Var = (zd1) arrayList.get(vn.x(i, arrayList));
        i8 i8Var = zd1Var.a;
        int d = zd1Var.d(i);
        CharSequence charSequence = i8Var.e;
        if (d < 0 || d >= charSequence.length()) {
            StringBuilder q = l90.q("offset(", d, ") is out of bounds [0,");
            q.append(charSequence.length());
            q.append(')');
            ll0.a(q.toString());
        }
        u82 u82Var = i8Var.d;
        Layout layout = u82Var.f;
        int lineForOffset = layout.getLineForOffset(d);
        float g = u82Var.g(lineForOffset);
        float e = u82Var.e(lineForOffset);
        if (layout.getParagraphDirection(lineForOffset) == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean isRtlCharAt = layout.isRtlCharAt(d);
        if (z && !isRtlCharAt) {
            i2 = u82Var.h(d, false);
            i3 = u82Var.h(d + 1, true);
        } else {
            if (z && isRtlCharAt) {
                h = u82Var.i(d, false);
                h2 = u82Var.i(d + 1, true);
            } else if (isRtlCharAt) {
                h = u82Var.h(d, false);
                h2 = u82Var.h(d + 1, true);
            } else {
                i2 = u82Var.i(d, false);
                i3 = u82Var.i(d + 1, true);
            }
            float f = h;
            i2 = h2;
            i3 = f;
        }
        RectF rectF = new RectF(i2, g, i3, e);
        return zd1Var.a(new pl1(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final pl1 c(int i) {
        int x;
        g31 g31Var = this.b;
        g31Var.k(i);
        int length = ((rc) g31Var.a.a).f.length();
        ArrayList arrayList = g31Var.h;
        if (i == length) {
            x = xn.A(arrayList);
        } else {
            x = vn.x(i, arrayList);
        }
        zd1 zd1Var = (zd1) arrayList.get(x);
        i8 i8Var = zd1Var.a;
        int d = zd1Var.d(i);
        CharSequence charSequence = i8Var.e;
        u82 u82Var = i8Var.d;
        if (d < 0 || d > charSequence.length()) {
            StringBuilder q = l90.q("offset(", d, ") is out of bounds [0,");
            q.append(charSequence.length());
            q.append(AbstractJsonLexerKt.END_LIST);
            ll0.a(q.toString());
        }
        float h = u82Var.h(d, false);
        int lineForOffset = u82Var.f.getLineForOffset(d);
        return zd1Var.a(new pl1(h, u82Var.g(lineForOffset), h, u82Var.e(lineForOffset)));
    }

    public final float d(int i) {
        float f;
        g31 g31Var = this.b;
        g31Var.l(i);
        ArrayList arrayList = g31Var.h;
        zd1 zd1Var = (zd1) arrayList.get(vn.y(i, arrayList));
        i8 i8Var = zd1Var.a;
        int i2 = i - zd1Var.d;
        u82 u82Var = i8Var.d;
        float lineLeft = u82Var.f.getLineLeft(i2);
        if (i2 == u82Var.g - 1) {
            f = u82Var.j;
        } else {
            f = 0.0f;
        }
        return lineLeft + f;
    }

    public final float e(int i) {
        float f;
        g31 g31Var = this.b;
        g31Var.l(i);
        ArrayList arrayList = g31Var.h;
        zd1 zd1Var = (zd1) arrayList.get(vn.y(i, arrayList));
        i8 i8Var = zd1Var.a;
        int i2 = i - zd1Var.d;
        u82 u82Var = i8Var.d;
        float lineRight = u82Var.f.getLineRight(i2);
        if (i2 == u82Var.g - 1) {
            f = u82Var.k;
        } else {
            f = 0.0f;
        }
        return lineRight + f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w82) {
                w82 w82Var = (w82) obj;
                if (sn0.r(this.a, w82Var.a) && this.b == w82Var.b && en0.a(this.c, w82Var.c) && this.d == w82Var.d && this.e == w82Var.e && sn0.r(this.f, w82Var.f)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int f(int i) {
        g31 g31Var = this.b;
        g31Var.l(i);
        ArrayList arrayList = g31Var.h;
        zd1 zd1Var = (zd1) arrayList.get(vn.y(i, arrayList));
        i8 i8Var = zd1Var.a;
        return i8Var.d.f.getLineStart(i - zd1Var.d) + zd1Var.b;
    }

    public final um1 g(int i) {
        int x;
        g31 g31Var = this.b;
        g31Var.k(i);
        int length = ((rc) g31Var.a.a).f.length();
        ArrayList arrayList = g31Var.h;
        if (i == length) {
            x = xn.A(arrayList);
        } else {
            x = vn.x(i, arrayList);
        }
        zd1 zd1Var = (zd1) arrayList.get(x);
        i8 i8Var = zd1Var.a;
        int d = zd1Var.d(i);
        u82 u82Var = i8Var.d;
        if (u82Var.f.getParagraphDirection(u82Var.f.getLineForOffset(d)) == 1) {
            return um1.e;
        }
        return um1.f;
    }

    public final n8 h(int i, int i2) {
        g31 g31Var = this.b;
        rc rcVar = (rc) g31Var.a.a;
        if (i < 0 || i > i2 || i2 > rcVar.f.length()) {
            ll0.a("Start(" + i + ") or End(" + i2 + ") is out of range [0.." + rcVar.f.length() + "), or start > end!");
        }
        if (i == i2) {
            return p8.a();
        }
        n8 a = p8.a();
        vn.A(g31Var.h, fr1.a(i, i2), new em0(a, i, i2, 3));
        return a;
    }

    public final int hashCode() {
        return this.f.hashCode() + l90.a(this.e, l90.a(this.d, l90.e(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final long i(int i) {
        int x;
        int i2;
        int i3;
        int i4;
        g31 g31Var = this.b;
        g31Var.k(i);
        int length = ((rc) g31Var.a.a).f.length();
        ArrayList arrayList = g31Var.h;
        if (i == length) {
            x = xn.A(arrayList);
        } else {
            x = vn.x(i, arrayList);
        }
        zd1 zd1Var = (zd1) arrayList.get(x);
        i8 i8Var = zd1Var.a;
        int d = zd1Var.d(i);
        ne1 j = i8Var.d.j();
        if (j.h(j.j(d))) {
            j.a(d);
            i2 = d;
            while (i2 != -1 && (!j.h(i2) || j.d(i2))) {
                i2 = j.j(i2);
            }
        } else {
            j.a(d);
            if (j.g(d)) {
                if (j.e(d) && !j.c(d)) {
                    i2 = d;
                } else {
                    i2 = j.j(d);
                }
            } else if (j.c(d)) {
                i2 = j.j(d);
            } else {
                i2 = -1;
            }
        }
        if (i2 == -1) {
            i2 = d;
        }
        if (j.d(j.i(d))) {
            j.a(d);
            i3 = d;
            while (i3 != -1 && (j.h(i3) || !j.d(i3))) {
                i3 = j.i(i3);
            }
        } else {
            j.a(d);
            if (j.c(d)) {
                if (j.e(d) && !j.g(d)) {
                    i3 = d;
                } else {
                    i4 = j.i(d);
                    i3 = i4;
                }
            } else if (j.g(d)) {
                i4 = j.i(d);
                i3 = i4;
            } else {
                i3 = -1;
            }
        }
        if (i3 != -1) {
            d = i3;
        }
        return zd1Var.b(fr1.a(i2, d), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) en0.b(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }
}
