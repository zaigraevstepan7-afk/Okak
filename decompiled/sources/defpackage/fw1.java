package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class fw1 extends ck {
    public ov1 a;
    public long b = 9205357640488583168L;

    @Override // defpackage.ck
    public final void a(float f, long j, f8 f8Var) {
        Shader shader;
        Paint paint = (Paint) f8Var.b;
        ov1 ov1Var = this.a;
        Shader shader2 = null;
        if (ov1Var == null || !fy1.a(this.b, j)) {
            if (fy1.c(j)) {
                this.a = null;
                this.b = 9205357640488583168L;
                ov1Var = null;
            } else {
                ov1Var = this.a;
                if (ov1Var == null) {
                    ov1Var = new ov1(7);
                    this.a = ov1Var;
                }
                ov1Var.f = b(j);
                this.a = ov1Var;
                this.b = j;
            }
        }
        long b = go.b(paint.getColor());
        long j2 = co.b;
        if (!co.c(b, j2)) {
            f8Var.e(j2);
        }
        Shader shader3 = (Shader) f8Var.c;
        if (ov1Var != null) {
            shader = (Shader) ov1Var.f;
        } else {
            shader = null;
        }
        if (!sn0.r(shader3, shader)) {
            if (ov1Var != null) {
                shader2 = (Shader) ov1Var.f;
            }
            f8Var.h(shader2);
        }
        if (paint.getAlpha() / 255.0f == f) {
            return;
        }
        f8Var.c(f);
    }

    public abstract Shader b(long j);
}
