package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class e40 extends CharacterStyle implements UpdateAppearance {
    public final d40 e;

    public e40(d40 d40Var) {
        this.e = d40Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            o90 o90Var = o90.a;
            d40 d40Var = this.e;
            if (sn0.r(d40Var, o90Var)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (d40Var instanceof q32) {
                textPaint.setStyle(Paint.Style.STROKE);
                q32 q32Var = (q32) d40Var;
                textPaint.setStrokeWidth(q32Var.a);
                textPaint.setStrokeMiter(q32Var.b);
                int i = q32Var.d;
                if (i == 0) {
                    join = Paint.Join.MITER;
                } else if (i == 1) {
                    join = Paint.Join.ROUND;
                } else if (i == 2) {
                    join = Paint.Join.BEVEL;
                } else {
                    join = Paint.Join.MITER;
                }
                textPaint.setStrokeJoin(join);
                int i2 = q32Var.c;
                if (i2 == 0) {
                    cap = Paint.Cap.BUTT;
                } else if (i2 == 1) {
                    cap = Paint.Cap.ROUND;
                } else if (i2 == 2) {
                    cap = Paint.Cap.SQUARE;
                } else {
                    cap = Paint.Cap.BUTT;
                }
                textPaint.setStrokeCap(cap);
                textPaint.setPathEffect(null);
                return;
            }
            se.m();
        }
    }
}
