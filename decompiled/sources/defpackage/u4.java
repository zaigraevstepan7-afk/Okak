package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class u4 implements tl {
    public Canvas a = v4.a;
    public Rect b;
    public Rect c;

    @Override // defpackage.tl
    public final void a(t7 t7Var, f8 f8Var) {
        this.a.drawBitmap(sn0.s(t7Var), Float.intBitsToFloat(0), Float.intBitsToFloat(0), (Paint) f8Var.b);
    }

    @Override // defpackage.tl
    public final void b(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.tl
    public final void c(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.tl
    public final void d(float f, long j, f8 f8Var) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) f8Var.b);
    }

    @Override // defpackage.tl
    public final void e(t7 t7Var, long j, long j2, long j3, f8 f8Var) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap s = sn0.s(t7Var);
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(s, rect, rect2, (Paint) f8Var.b);
    }

    @Override // defpackage.tl
    public final void f(n8 n8Var, f8 f8Var) {
        Canvas canvas = this.a;
        if (n8Var instanceof n8) {
            canvas.drawPath(n8Var.a, (Paint) f8Var.b);
        } else {
            se.v("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.tl
    public final void g(float f, float f2, float f3, float f4, float f5, float f6, f8 f8Var) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) f8Var.b);
    }

    @Override // defpackage.tl
    public final void h() {
        this.a.save();
    }

    @Override // defpackage.tl
    public final void i(long j, long j2, f8 f8Var) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) f8Var.b);
    }

    @Override // defpackage.tl
    public final void j() {
        this.a.disableZ();
    }

    @Override // defpackage.tl
    public final void k(float f, float f2, float f3, float f4, f8 f8Var) {
        this.a.drawRect(f, f2, f3, f4, (Paint) f8Var.b);
    }

    @Override // defpackage.tl
    public final void l(float[] fArr) {
        if (!qo.Q(fArr)) {
            Matrix matrix = new Matrix();
            mp0.L(matrix, fArr);
            this.a.concat(matrix);
        }
    }

    @Override // defpackage.tl
    public final void m(n8 n8Var) {
        Canvas canvas = this.a;
        if (n8Var instanceof n8) {
            canvas.clipPath(n8Var.a, Region.Op.INTERSECT);
        } else {
            se.v("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.tl
    public final void n(float f, float f2, float f3, float f4, int i) {
        Region.Op op;
        Canvas canvas = this.a;
        if (i == 0) {
            op = Region.Op.DIFFERENCE;
        } else {
            op = Region.Op.INTERSECT;
        }
        canvas.clipRect(f, f2, f3, f4, op);
    }

    @Override // defpackage.tl
    public final void o(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.tl
    public final void p() {
        this.a.restore();
    }

    @Override // defpackage.tl
    public final void r(pl1 pl1Var, f8 f8Var) {
        this.a.saveLayer(pl1Var.a, pl1Var.b, pl1Var.c, pl1Var.d, (Paint) f8Var.b, 31);
    }

    @Override // defpackage.tl
    public final void s() {
        this.a.enableZ();
    }

    @Override // defpackage.tl
    public final void t(float f, float f2, float f3, float f4, float f5, float f6, f8 f8Var) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, (Paint) f8Var.b);
    }
}
