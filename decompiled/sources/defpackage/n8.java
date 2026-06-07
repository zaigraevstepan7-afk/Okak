package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class n8 {
    public final Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public n8(Path path) {
        this.a = path;
    }

    public static void a(n8 n8Var, n8 n8Var2) {
        Path path = n8Var.a;
        if (n8Var2 instanceof n8) {
            path.addPath(n8Var2.a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
        } else {
            se.v("Unable to obtain android.graphics.Path");
        }
    }

    public static void b(n8 n8Var, ip1 ip1Var) {
        if (n8Var.b == null) {
            n8Var.b = new RectF();
        }
        RectF rectF = n8Var.b;
        rectF.getClass();
        float f = ip1Var.a;
        long j = ip1Var.h;
        long j2 = ip1Var.g;
        long j3 = ip1Var.f;
        long j4 = ip1Var.e;
        rectF.set(f, ip1Var.b, ip1Var.c, ip1Var.d);
        if (n8Var.c == null) {
            n8Var.c = new float[8];
        }
        float[] fArr = n8Var.c;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = n8Var.a;
        RectF rectF2 = n8Var.b;
        rectF2.getClass();
        float[] fArr2 = n8Var.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final pl1 c() {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        rectF.getClass();
        this.a.computeBounds(rectF, true);
        return new pl1(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void d(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final void e(float f, float f2) {
        this.a.moveTo(f, f2);
    }

    public final boolean f(n8 n8Var, n8 n8Var2, int i) {
        Path.Op op;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i == 1) {
            op = Path.Op.INTERSECT;
        } else if (i == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else if (i == 2) {
            op = Path.Op.UNION;
        } else {
            op = Path.Op.XOR;
        }
        if (n8Var instanceof n8) {
            Path path = n8Var.a;
            if (n8Var2 instanceof n8) {
                return this.a.op(path, n8Var2.a, op);
            }
            se.v("Unable to obtain android.graphics.Path");
            return false;
        }
        se.v("Unable to obtain android.graphics.Path");
        return false;
    }

    public final void g() {
        this.a.reset();
    }

    public final void h() {
        this.a.rewind();
    }

    public final void i(int i) {
        Path.FillType fillType;
        if (i == 1) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        this.a.setFillType(fillType);
    }

    public final void j(float[] fArr) {
        if (this.d == null) {
            this.d = new Matrix();
        }
        Matrix matrix = this.d;
        matrix.getClass();
        mp0.L(matrix, fArr);
        Matrix matrix2 = this.d;
        matrix2.getClass();
        this.a.transform(matrix2);
    }

    public final void k(long j) {
        Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.d;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Matrix matrix3 = this.d;
        matrix3.getClass();
        this.a.transform(matrix3);
    }
}
