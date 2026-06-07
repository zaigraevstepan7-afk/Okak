package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class se implements ql, b20, x40 {
    public final /* synthetic */ int e;

    public static /* synthetic */ void c() {
        throw new RuntimeException();
    }

    public static /* synthetic */ void d(int i, String str) {
        throw new IllegalArgumentException((str + i + '.').toString());
    }

    public static /* synthetic */ void e(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void f(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IOException(sb.toString());
    }

    public static /* synthetic */ void g(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void h(String str) {
        throw new IllegalArgumentException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void i(String str, int i, Object obj) {
        throw new IllegalArgumentException((str + obj + ((char) i)).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i));
    }

    public static /* synthetic */ void k(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void l(StringBuilder sb, int i) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void m() {
        throw new RuntimeException();
    }

    public static /* synthetic */ void n(int i, String str) {
        throw new IOException(str + i);
    }

    public static /* synthetic */ void o(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void p(String str) {
        throw new IllegalStateException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void q(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + ((char) i)).toString());
    }

    public static /* synthetic */ void r(StringBuilder sb, int i) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void s() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void t(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void u(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void v(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void w(String str) {
        throw new IOException(str);
    }

    @Override // defpackage.b20
    public double b(double d) {
        double d2;
        double d3;
        double d4;
        double d5;
        switch (this.e) {
            case 8:
                if (d < 0.0d) {
                    d2 = -d;
                } else {
                    d2 = d;
                }
                if (d2 >= 0.0031308049535603718d) {
                    d3 = (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d;
                } else {
                    d3 = d2 / 0.07739938080495357d;
                }
                return Math.copySign(d3, d);
            case 9:
                if (d < 0.0d) {
                    d4 = -d;
                } else {
                    d4 = d;
                }
                if (d4 >= 0.04045d) {
                    d5 = Math.pow((0.9478672985781991d * d4) + 0.05213270142180095d, 2.4d);
                } else {
                    d5 = d4 * 0.07739938080495357d;
                }
                return Math.copySign(d5, d);
            case 10:
                float[] fArr = so.a;
                return so.b(so.c, d);
            case 11:
                float[] fArr2 = so.a;
                return so.a(so.c, d);
            case 12:
                float[] fArr3 = so.a;
                return so.d(so.d, d);
            default:
                float[] fArr4 = so.a;
                return so.c(so.d, d);
        }
    }

    @Override // defpackage.ql
    public void cancel() {
    }

    @Override // defpackage.x40
    public float a(float f) {
        return f;
    }
}
