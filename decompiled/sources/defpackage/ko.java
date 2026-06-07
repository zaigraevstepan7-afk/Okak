package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.animation.PathInterpolator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ko {
    public final int a;
    public final uj1 b;
    public yl0 c;
    public yl0 d;
    public vj1 e;
    public final ColorDrawable f;
    public final boolean g;
    public int h;

    static {
        new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
        new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, uj1] */
    public ko(int i, int i2) {
        ?? obj = new Object();
        obj.a = -1;
        obj.b = -1;
        yl0 yl0Var = yl0.e;
        obj.c = yl0Var;
        obj.d = false;
        obj.e = null;
        obj.f = 0.0f;
        obj.g = 0.0f;
        obj.h = 1.0f;
        this.b = obj;
        this.c = yl0Var;
        this.d = yl0Var;
        this.e = null;
        if (i != 1 && i != 2 && i != 4 && i != 8) {
            se.h(l90.g(i, "Unexpected side: "));
            throw null;
        }
        this.a = i;
        ColorDrawable colorDrawable = new ColorDrawable();
        this.f = colorDrawable;
        this.h = 0;
        this.g = true;
        if (i2 != 0) {
            this.h = i2;
            colorDrawable.setColor(i2);
            obj.e = colorDrawable;
            sl0 sl0Var = obj.i;
            if (sl0Var != null) {
                ((View) sl0Var.e).setBackground(colorDrawable);
            }
        }
    }

    public final void a(float f) {
        float f2 = f * 1.0f;
        uj1 uj1Var = this.b;
        if (uj1Var.h != f2) {
            uj1Var.h = f2;
            sl0 sl0Var = uj1Var.i;
            if (sl0Var != null) {
                ((View) sl0Var.e).setAlpha(f2);
            }
        }
    }

    public final void b(float f) {
        float f2 = f * 1.0f;
        uj1 uj1Var = this.b;
        int i = this.a;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        float f3 = (1.0f - f2) * uj1Var.b;
                        if (uj1Var.g != f3) {
                            uj1Var.g = f3;
                            sl0 sl0Var = uj1Var.i;
                            if (sl0Var != null) {
                                ((View) sl0Var.e).setTranslationY(f3);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                float f4 = (1.0f - f2) * uj1Var.a;
                if (uj1Var.f != f4) {
                    uj1Var.f = f4;
                    sl0 sl0Var2 = uj1Var.i;
                    if (sl0Var2 != null) {
                        ((View) sl0Var2.e).setTranslationX(f4);
                        return;
                    }
                    return;
                }
                return;
            }
            float f5 = (-(1.0f - f2)) * uj1Var.b;
            if (uj1Var.g != f5) {
                uj1Var.g = f5;
                sl0 sl0Var3 = uj1Var.i;
                if (sl0Var3 != null) {
                    ((View) sl0Var3.e).setTranslationY(f5);
                    return;
                }
                return;
            }
            return;
        }
        float f6 = (-(1.0f - f2)) * uj1Var.a;
        if (uj1Var.f != f6) {
            uj1Var.f = f6;
            sl0 sl0Var4 = uj1Var.i;
            if (sl0Var4 != null) {
                ((View) sl0Var4.e).setTranslationX(f6);
            }
        }
    }
}
