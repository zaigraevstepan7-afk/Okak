package defpackage;

import android.view.ViewParent;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class vf0 implements ic1 {
    public tf0 e;
    public final sf0 f;
    public final q5 g;
    public se0 h;
    public de0 i;
    public boolean k;
    public float[] m;
    public boolean n;
    public int r;
    public lo t;
    public boolean u;
    public boolean v;
    public boolean x;
    public long j = 9223372034707292159L;
    public final float[] l = d01.a();
    public c00 o = io.a();
    public jq0 p = jq0.e;
    public final vl q = new vl();
    public long s = cb2.b;
    public boolean w = true;
    public final n3 y = new n3(this, 15);

    public vf0(tf0 tf0Var, sf0 sf0Var, q5 q5Var, se0 se0Var, de0 de0Var) {
        this.e = tf0Var;
        this.f = sf0Var;
        this.g = q5Var;
        this.h = se0Var;
        this.i = de0Var;
    }

    public final float[] a() {
        float[] fArr = this.m;
        if (fArr == null) {
            fArr = d01.a();
            this.m = fArr;
        }
        if (!this.v) {
            if (Float.isNaN(fArr[0])) {
                return null;
            }
        } else {
            this.v = false;
            float[] b = b();
            if (this.w) {
                return b;
            }
            if (!io.C(b, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        }
        return fArr;
    }

    public final float[] b() {
        boolean z = this.u;
        float[] fArr = this.l;
        if (z) {
            tf0 tf0Var = this.e;
            long j = tf0Var.v;
            if ((9223372034707292159L & j) == 9205357640488583168L) {
                j = yq1.p(vn.O(this.j));
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            xf0 xf0Var = tf0Var.a;
            float f = xf0Var.l;
            float f2 = xf0Var.p;
            float f3 = xf0Var.j;
            float f4 = xf0Var.k;
            float sin = (float) Math.sin(0.0d);
            float cos = (float) Math.cos(0.0d);
            float f5 = -sin;
            float f6 = (f * cos) - (0.0f * sin);
            float f7 = (0.0f * cos) + (f * sin);
            float sin2 = (float) Math.sin(0.0d);
            float cos2 = (float) Math.cos(0.0d);
            float f8 = -sin2;
            float f9 = sin * sin2;
            float f10 = sin * cos2;
            float f11 = cos * sin2;
            float f12 = cos * cos2;
            float f13 = (f7 * sin2) + (0.0f * cos2);
            float f14 = (f7 * cos2) + ((-0.0f) * sin2);
            double d = f2 * 0.017453292519943295d;
            float sin3 = (float) Math.sin(d);
            float cos3 = (float) Math.cos(d);
            float f15 = -sin3;
            float f16 = (cos3 * f9) + (f15 * cos2);
            float f17 = (f9 * sin3) + (cos2 * cos3);
            float f18 = f17 * f3;
            float f19 = sin3 * cos * f3;
            float f20 = ((sin3 * f10) + (cos3 * f8)) * f3;
            float f21 = f16 * f4;
            float f22 = cos * cos3 * f4;
            float f23 = ((cos3 * f10) + (f15 * f8)) * f4;
            float f24 = f11 * 1.0f;
            float f25 = f5 * 1.0f;
            float f26 = f12 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f18;
                fArr[1] = f19;
                fArr[2] = f20;
                fArr[3] = 0.0f;
                fArr[4] = f21;
                fArr[5] = f22;
                fArr[6] = f23;
                fArr[7] = 0.0f;
                fArr[8] = f24;
                fArr[9] = f25;
                fArr[10] = f26;
                fArr[11] = 0.0f;
                float f27 = -intBitsToFloat;
                fArr[12] = ((f18 * f27) - (f21 * intBitsToFloat2)) + f13 + intBitsToFloat;
                fArr[13] = ((f19 * f27) - (f22 * intBitsToFloat2)) + f6 + intBitsToFloat2;
                fArr[14] = ((f27 * f20) - (intBitsToFloat2 * f23)) + f14;
                fArr[15] = 1.0f;
            }
            this.u = false;
            this.w = qo.Q(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (!this.n && !this.k) {
            this.g.invalidate();
            f(true);
        }
    }

    public final void d(long j) {
        q5 q5Var = this.g;
        if (q5Var.p) {
            q5Var.K(-4.0f);
        }
        tf0 tf0Var = this.e;
        if (!xm0.a(tf0Var.t, j)) {
            tf0Var.t = j;
            tf0Var.h(j, tf0Var.u);
        }
        ViewParent parent = q5Var.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(q5Var, q5Var);
        }
    }

    public final void e(long j) {
        if (!en0.a(j, this.j)) {
            q5 q5Var = this.g;
            if (q5Var.p) {
                q5Var.K(-4.0f);
            }
            this.j = j;
            c();
        }
    }

    public final void f(boolean z) {
        if (z != this.n) {
            this.n = z;
            q5 q5Var = this.g;
            b41 b41Var = q5Var.H;
            boolean z2 = q5Var.J;
            if (!z) {
                if (!z2) {
                    b41Var.j(this);
                    b41 b41Var2 = q5Var.I;
                    if (b41Var2 != null) {
                        b41Var2.j(this);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!z2) {
                b41Var.a(this);
                return;
            }
            b41 b41Var3 = q5Var.I;
            if (b41Var3 == null) {
                b41Var3 = new b41();
                q5Var.I = b41Var3;
            }
            b41Var3.a(this);
        }
    }

    public final void g() {
        if (this.n) {
            if (!cb2.a(this.s, cb2.b) && !en0.a(this.e.u, this.j)) {
                tf0 tf0Var = this.e;
                float intBitsToFloat = Float.intBitsToFloat((int) (this.s >> 32)) * ((int) (this.j >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (this.s & 4294967295L)) * ((int) (this.j & 4294967295L));
                tf0Var.g((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
            }
            tf0 tf0Var2 = this.e;
            c00 c00Var = this.o;
            jq0 jq0Var = this.p;
            long j = this.j;
            if (!en0.a(tf0Var2.u, j)) {
                tf0Var2.u = j;
                tf0Var2.h(tf0Var2.t, j);
                if (tf0Var2.i == 9205357640488583168L) {
                    tf0Var2.g = true;
                    tf0Var2.a();
                }
            }
            tf0Var2.b = c00Var;
            tf0Var2.c = jq0Var;
            tf0Var2.d = this.y;
            tf0Var2.f();
            f(false);
        }
    }
}
