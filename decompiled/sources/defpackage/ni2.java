package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ni2 {
    public static final ni2 b;
    public final ji2 a;

    static {
        if (Build.VERSION.SDK_INT >= 34) {
            b = ii2.h;
        } else {
            b = gi2.g;
        }
    }

    public ni2(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.a = new ii2(this, windowInsets);
        } else if (i >= 31) {
            this.a = new hi2(this, windowInsets);
        } else {
            this.a = new gi2(this, windowInsets);
        }
    }

    public static yl0 a(yl0 yl0Var, int i, int i2, int i3, int i4) {
        int max = Math.max(0, yl0Var.a - i);
        int max2 = Math.max(0, yl0Var.b - i2);
        int max3 = Math.max(0, yl0Var.c - i3);
        int max4 = Math.max(0, yl0Var.d - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return yl0Var;
        }
        return yl0.b(max, max2, max3, max4);
    }

    public static ni2 b(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        ni2 ni2Var = new ni2(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i = eg2.a;
            ni2 a = bg2.a(view);
            ji2 ji2Var = ni2Var.a;
            ji2Var.o(a);
            ji2Var.d(view.getRootView());
            ji2Var.p(view.getWindowSystemUiVisibility());
        }
        return ni2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni2)) {
            return false;
        }
        return Objects.equals(this.a, ((ni2) obj).a);
    }

    public final int hashCode() {
        ji2 ji2Var = this.a;
        if (ji2Var == null) {
            return 0;
        }
        return ji2Var.hashCode();
    }

    public ni2() {
        this.a = new ji2(this);
    }
}
