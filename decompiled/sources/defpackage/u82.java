package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class u82 {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public ne1 e;
    public final Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final Paint.FontMetricsInt m;
    public final int n;
    public final kv0[] o;
    public final Rect p = new Rect();
    public qg q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0289 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0323  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u82(java.lang.CharSequence r22, float r23, android.text.TextPaint r24, int r25, android.text.TextUtils.TruncateAt r26, int r27, boolean r28, int r29, int r30, int r31, int r32, int r33, int r34, defpackage.oq0 r35) {
        /*
            Method dump skipped, instructions count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u82.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, oq0):void");
    }

    public final int a() {
        int height;
        boolean z = this.d;
        Layout layout = this.f;
        if (z) {
            height = layout.getLineBottom(this.g - 1);
        } else {
            height = layout.getHeight();
        }
        return height + this.h + this.i + this.n;
    }

    public final float b(int i) {
        if (i == this.g - 1) {
            return this.j + this.k;
        }
        return 0.0f;
    }

    public final qg c() {
        qg qgVar = this.q;
        if (qgVar == null) {
            qg qgVar2 = new qg(this.f);
            this.q = qgVar2;
            return qgVar2;
        }
        return qgVar;
    }

    public final float d(int i) {
        float lineBaseline;
        Paint.FontMetricsInt fontMetricsInt;
        float f = this.h;
        if (i == this.g - 1 && (fontMetricsInt = this.m) != null) {
            lineBaseline = g(i) - fontMetricsInt.ascent;
        } else {
            lineBaseline = this.f.getLineBaseline(i);
        }
        return f + lineBaseline;
    }

    public final float e(int i) {
        int i2;
        Paint.FontMetricsInt fontMetricsInt;
        int i3 = this.g;
        int i4 = i3 - 1;
        Layout layout = this.f;
        if (i == i4 && (fontMetricsInt = this.m) != null) {
            return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
        }
        float lineBottom = this.h + layout.getLineBottom(i);
        if (i == i3 - 1) {
            i2 = this.i;
        } else {
            i2 = 0;
        }
        return lineBottom + i2;
    }

    public final int f(int i) {
        ThreadLocal threadLocal = y82.a;
        Layout layout = this.f;
        if (layout.getEllipsisCount(i) > 0 && this.b == TextUtils.TruncateAt.END) {
            return layout.getText().length();
        }
        return layout.getLineEnd(i);
    }

    public final float g(int i) {
        int i2;
        float lineTop = this.f.getLineTop(i);
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = this.h;
        }
        return lineTop + i2;
    }

    public final float h(int i, boolean z) {
        return b(this.f.getLineForOffset(i)) + c().h(i, true, z);
    }

    public final float i(int i, boolean z) {
        return b(this.f.getLineForOffset(i)) + c().h(i, false, z);
    }

    public final ne1 j() {
        ne1 ne1Var = this.e;
        if (ne1Var != null) {
            return ne1Var;
        }
        Layout layout = this.f;
        ne1 ne1Var2 = new ne1(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.e = ne1Var2;
        return ne1Var2;
    }
}
