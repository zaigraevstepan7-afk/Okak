package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class i8 {
    public final m8 a;
    public final int b;
    public final long c;
    public final u82 d;
    public final CharSequence e;
    public final List f;

    /* JADX WARN: Removed duplicated region for block: B:103:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i8(defpackage.m8 r22, int r23, int r24, long r25) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i8.<init>(m8, int, int, long):void");
    }

    public final u82 a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        boolean z;
        rg1 rg1Var;
        float d = d();
        m8 m8Var = this.a;
        ca caVar = m8Var.g;
        int i8 = m8Var.l;
        oq0 oq0Var = m8Var.i;
        k92 k92Var = m8Var.b;
        j8 j8Var = k8.a;
        eh1 eh1Var = k92Var.c;
        if (eh1Var != null && (rg1Var = eh1Var.b) != null) {
            z = rg1Var.a;
        } else {
            z = false;
        }
        return new u82(charSequence, d, caVar, i, truncateAt, i8, z, i3, i5, i6, i7, i4, i2, oq0Var);
    }

    public final float b() {
        return this.d.a();
    }

    /* JADX WARN: Type inference failed for: r10v23, types: [w7] */
    public final long c(pl1 pl1Var, int i, y61 y61Var) {
        boolean z;
        ot1 sl0Var;
        int i2;
        int[] iArr;
        SegmentFinder k;
        RectF X = fp.X(pl1Var);
        int i3 = 0;
        if (i != 0 && i == 1) {
            z = true;
        } else {
            z = false;
        }
        final h8 h8Var = new h8(y61Var, i3);
        u82 u82Var = this.d;
        TextPaint textPaint = u82Var.a;
        Layout layout = u82Var.f;
        int i4 = 8;
        if (Build.VERSION.SDK_INT >= 34) {
            if (z) {
                k = new ad(new h12(i4, layout.getText(), u82Var.j()));
            } else {
                v7.n();
                k = v7.k(v7.j(layout.getText(), textPaint));
            }
            iArr = layout.getRangeForRect(X, k, new Layout.TextInclusionStrategy() { // from class: w7
                @Override // android.text.Layout.TextInclusionStrategy
                public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
                    return ((Boolean) h8.this.invoke(rectF, rectF2)).booleanValue();
                }
            });
        } else {
            qg c = u82Var.c();
            if (z) {
                sl0Var = new h12(i4, layout.getText(), u82Var.j());
            } else {
                sl0Var = new sl0(layout.getText(), textPaint);
            }
            int lineForVertical = layout.getLineForVertical((int) X.top);
            if (X.top <= u82Var.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < u82Var.g) {
                int i5 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) X.bottom);
                if (lineForVertical2 != 0 || X.bottom >= u82Var.g(0)) {
                    int s = yq1.s(u82Var, layout, c, i5, X, sl0Var, h8Var, true);
                    while (true) {
                        i2 = i5;
                        if (s != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i5 = i2 + 1;
                        s = yq1.s(u82Var, layout, c, i5, X, sl0Var, h8Var, true);
                    }
                    if (s != -1) {
                        int i6 = lineForVertical2;
                        int s2 = yq1.s(u82Var, layout, c, i6, X, sl0Var, h8Var, false);
                        while (s2 == -1 && i2 < i6) {
                            i6--;
                            s2 = yq1.s(u82Var, layout, c, i6, X, sl0Var, h8Var, false);
                        }
                        if (s2 != -1) {
                            iArr = new int[]{sl0Var.k(s + 1), sl0Var.l(s2 - 1)};
                        }
                    }
                }
            }
            iArr = null;
        }
        if (iArr == null) {
            return d92.b;
        }
        return fr1.a(iArr[0], iArr[1]);
    }

    public final float d() {
        return us.h(this.c);
    }

    public final void e(tl tlVar) {
        Canvas a = v4.a(tlVar);
        u82 u82Var = this.d;
        if (u82Var.d) {
            a.save();
            a.clipRect(0.0f, 0.0f, d(), b());
        }
        int i = u82Var.h;
        if (a.getClipBounds(u82Var.p)) {
            if (i != 0) {
                a.translate(0.0f, i);
            }
            ThreadLocal threadLocal = y82.a;
            Object obj = threadLocal.get();
            if (obj == null) {
                obj = new Canvas();
                threadLocal.set(obj);
            }
            d62 d62Var = (d62) obj;
            d62Var.a = a;
            try {
                u82Var.f.draw(d62Var);
                if (i != 0) {
                    a.translate(0.0f, (-1.0f) * i);
                }
            } finally {
                d62Var.a = null;
            }
        }
        if (u82Var.d) {
            a.restore();
        }
    }

    public final void f(tl tlVar, long j, hw1 hw1Var, x62 x62Var, d40 d40Var) {
        ca caVar = this.a.g;
        int i = caVar.c;
        caVar.d(j);
        caVar.f(hw1Var);
        caVar.g(x62Var);
        caVar.e(d40Var);
        caVar.b(3);
        e(tlVar);
        caVar.b(i);
    }

    public final void g(tl tlVar, ck ckVar, float f, hw1 hw1Var, x62 x62Var, d40 d40Var) {
        ca caVar = this.a.g;
        int i = caVar.c;
        float d = d();
        float b = b();
        caVar.c(ckVar, (Float.floatToRawIntBits(b) & 4294967295L) | (Float.floatToRawIntBits(d) << 32), f);
        caVar.f(hw1Var);
        caVar.g(x62Var);
        caVar.e(d40Var);
        caVar.b(3);
        e(tlVar);
        caVar.b(i);
    }
}
