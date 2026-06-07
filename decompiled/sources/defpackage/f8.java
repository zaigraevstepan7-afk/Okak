package defpackage;

import android.graphics.BlendModeColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Bundle;
import java.util.Arrays;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class f8 {
    public int a;
    public final Object b;
    public Object c;
    public Object d;

    public f8(Bundle bundle) {
        bundle.getClass();
        String string = bundle.getString("nav-entry-state:id");
        if (string != null) {
            this.b = string;
            int i = bundle.getInt("nav-entry-state:destination-id", Integer.MIN_VALUE);
            if (i == Integer.MIN_VALUE && bundle.getInt("nav-entry-state:destination-id", Integer.MAX_VALUE) == Integer.MAX_VALUE) {
                yq1.u("nav-entry-state:destination-id");
                throw null;
            }
            this.a = i;
            Bundle bundle2 = bundle.getBundle("nav-entry-state:args");
            if (bundle2 != null) {
                this.c = bundle2;
                Bundle bundle3 = bundle.getBundle("nav-entry-state:saved-state");
                if (bundle3 != null) {
                    this.d = bundle3;
                    return;
                } else {
                    yq1.u("nav-entry-state:saved-state");
                    throw null;
                }
            }
            yq1.u("nav-entry-state:args");
            throw null;
        }
        yq1.u("nav-entry-state:id");
        throw null;
    }

    public int a() {
        int i;
        Paint.Cap strokeCap = ((Paint) this.b).getStrokeCap();
        if (strokeCap == null) {
            i = -1;
        } else {
            i = g8.a[strokeCap.ordinal()];
        }
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 3) {
                return 2;
            }
            return 0;
        }
        return 0;
    }

    public int b() {
        int i;
        Paint.Join strokeJoin = ((Paint) this.b).getStrokeJoin();
        if (strokeJoin == null) {
            i = -1;
        } else {
            i = g8.b[strokeJoin.ordinal()];
        }
        if (i != 1) {
            if (i == 2) {
                return 2;
            }
            if (i == 3) {
                return 1;
            }
            return 0;
        }
        return 0;
    }

    public void c(float f) {
        ((Paint) this.b).setAlpha((int) Math.rint(f * 255.0f));
    }

    public void d(int i) {
        if (this.a == i) {
            return;
        }
        this.a = i;
        ((Paint) this.b).setBlendMode(c01.T(i));
    }

    public void e(long j) {
        ((Paint) this.b).setColor(go.U(j));
    }

    public void f(ni niVar) {
        BlendModeColorFilter blendModeColorFilter;
        this.d = niVar;
        Paint paint = (Paint) this.b;
        if (niVar != null) {
            blendModeColorFilter = niVar.a;
        } else {
            blendModeColorFilter = null;
        }
        paint.setColorFilter(blendModeColorFilter);
    }

    public void g(int i) {
        boolean z;
        Paint paint = (Paint) this.b;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        paint.setFilterBitmap(!z);
    }

    public void h(Shader shader) {
        this.c = shader;
        ((Paint) this.b).setShader(shader);
    }

    public void i(int i) {
        Paint.Cap cap;
        Paint paint = (Paint) this.b;
        if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else if (i == 0) {
            cap = Paint.Cap.BUTT;
        } else {
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public void j(int i) {
        Paint.Join join;
        Paint paint = (Paint) this.b;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else if (i == 2) {
            join = Paint.Join.BEVEL;
        } else if (i == 1) {
            join = Paint.Join.ROUND;
        } else {
            join = Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public void k(float f) {
        ((Paint) this.b).setStrokeWidth(f);
    }

    public void l(int i) {
        Paint.Style style;
        Paint paint = (Paint) this.b;
        if (i == 1) {
            style = Paint.Style.STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        paint.setStyle(style);
    }

    public f8(Paint paint) {
        this.b = paint;
        this.a = 3;
    }

    public f8(d51 d51Var, int i) {
        this.b = d51Var.j;
        this.a = i;
        f51 f51Var = d51Var.l;
        this.c = f51Var.a();
        Bundle v = bf.v((xd1[]) Arrays.copyOf(new xd1[0], 0));
        this.d = v;
        f51Var.h.y(v);
    }
}
