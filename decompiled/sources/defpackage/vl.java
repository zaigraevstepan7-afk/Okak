package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class vl implements c40 {
    public final ul e;
    public final ld f;
    public f8 g;
    public f8 h;

    /* JADX WARN: Type inference failed for: r0v0, types: [ul, java.lang.Object] */
    public vl() {
        d00 d00Var = d6.h;
        ?? obj = new Object();
        obj.a = d00Var;
        obj.b = jq0.e;
        obj.c = i60.a;
        obj.d = 0L;
        this.e = obj;
        this.f = new ld(this);
    }

    public static f8 b(vl vlVar, long j, d40 d40Var, float f, int i) {
        f8 h = vlVar.h(d40Var);
        Paint paint = (Paint) h.b;
        if (f != 1.0f) {
            j = co.b(j, co.d(j) * f);
        }
        if (!co.c(go.b(paint.getColor()), j)) {
            h.e(j);
        }
        if (((Shader) h.c) != null) {
            h.h(null);
        }
        if (!sn0.r((ni) h.d, null)) {
            h.f(null);
        }
        if (h.a != i) {
            h.d(i);
        }
        if (paint.isFilterBitmap()) {
            return h;
        }
        h.g(1);
        return h;
    }

    @Override // defpackage.c00
    public final float P() {
        return this.e.a.P();
    }

    @Override // defpackage.c40
    public final void R(float f, long j, long j2) {
        this.e.c.d(f, j2, b(this, j, o90.a, 1.0f, 3));
    }

    @Override // defpackage.c40
    public final void V(long j, long j2, long j3, long j4) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.e.c.g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), b(this, j, o90.a, 1.0f, 3));
    }

    @Override // defpackage.c40
    public final void Z(long j, float f, float f2, long j2, long j3, float f3, q32 q32Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.e.c.t(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, b(this, j, q32Var, f3, 3));
    }

    @Override // defpackage.c00
    public final float a() {
        return this.e.a.a();
    }

    @Override // defpackage.c40
    public final ld b0() {
        return this.f;
    }

    public final f8 c(ck ckVar, d40 d40Var, float f, ni niVar, int i, int i2) {
        f8 h = h(d40Var);
        Paint paint = (Paint) h.b;
        if (ckVar != null) {
            ckVar.a(f, d(), h);
        } else {
            if (((Shader) h.c) != null) {
                h.h(null);
            }
            long b = go.b(paint.getColor());
            long j = co.b;
            if (!co.c(b, j)) {
                h.e(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                h.c(f);
            }
        }
        if (!sn0.r((ni) h.d, niVar)) {
            h.f(niVar);
        }
        if (h.a != i) {
            h.d(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return h;
        }
        h.g(i2);
        return h;
    }

    public final void e(t7 t7Var, ni niVar) {
        this.e.c.a(t7Var, c(null, o90.a, 1.0f, niVar, 3, 1));
    }

    @Override // defpackage.c40
    public final void f(n8 n8Var, ck ckVar, float f, d40 d40Var, int i) {
        this.e.c.f(n8Var, c(ckVar, d40Var, f, null, i, 1));
    }

    @Override // defpackage.c40
    public final void g(n8 n8Var, long j, float f, d40 d40Var) {
        this.e.c.f(n8Var, b(this, j, d40Var, f, 3));
    }

    @Override // defpackage.c40
    public final jq0 getLayoutDirection() {
        return this.e.b;
    }

    public final f8 h(d40 d40Var) {
        if (sn0.r(d40Var, o90.a)) {
            f8 f8Var = this.g;
            if (f8Var == null) {
                f8 j = fc2.j();
                j.l(0);
                this.g = j;
                return j;
            }
            return f8Var;
        }
        if (d40Var instanceof q32) {
            f8 f8Var2 = this.h;
            if (f8Var2 == null) {
                f8Var2 = fc2.j();
                f8Var2.l(1);
                this.h = f8Var2;
            }
            Paint paint = (Paint) f8Var2.b;
            float strokeWidth = paint.getStrokeWidth();
            q32 q32Var = (q32) d40Var;
            float f = q32Var.a;
            if (strokeWidth != f) {
                f8Var2.k(f);
            }
            int a = f8Var2.a();
            int i = q32Var.c;
            if (a != i) {
                f8Var2.i(i);
            }
            float strokeMiter = paint.getStrokeMiter();
            float f2 = q32Var.b;
            if (strokeMiter != f2) {
                paint.setStrokeMiter(f2);
            }
            int b = f8Var2.b();
            int i2 = q32Var.d;
            if (b == i2) {
                return f8Var2;
            }
            f8Var2.j(i2);
            return f8Var2;
        }
        se.m();
        return null;
    }

    @Override // defpackage.c40
    public final void h0(t7 t7Var, long j, long j2, long j3, float f, ni niVar, int i) {
        this.e.c.e(t7Var, j, j2, j3, c(null, o90.a, f, niVar, 3, i));
    }

    @Override // defpackage.c40
    public final void v0(long j, long j2, long j3, float f, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.e.c.k(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3), b(this, j, o90.a, f, i));
    }

    @Override // defpackage.c40
    public final void y(long j, long j2, long j3, float f, int i) {
        tl tlVar = this.e.c;
        f8 f8Var = this.h;
        if (f8Var == null) {
            f8Var = fc2.j();
            f8Var.l(1);
            this.h = f8Var;
        }
        Paint paint = (Paint) f8Var.b;
        if (!co.c(go.b(paint.getColor()), j)) {
            f8Var.e(j);
        }
        if (((Shader) f8Var.c) != null) {
            f8Var.h(null);
        }
        if (!sn0.r((ni) f8Var.d, null)) {
            f8Var.f(null);
        }
        if (f8Var.a != 3) {
            f8Var.d(3);
        }
        if (paint.getStrokeWidth() != f) {
            f8Var.k(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (f8Var.a() != i) {
            f8Var.i(i);
        }
        if (f8Var.b() != 0) {
            f8Var.j(0);
        }
        if (!paint.isFilterBitmap()) {
            f8Var.g(1);
        }
        tlVar.i(j2, j3, f8Var);
    }
}
