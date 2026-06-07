package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsAnimation;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class cm0 extends uh2 implements Runnable, q91, View.OnAttachStateChangeListener {
    public final pi2 f;
    public boolean g;
    public boolean h;
    public ni2 i;

    public cm0(pi2 pi2Var) {
        super(!pi2Var.t ? 1 : 0);
        this.f = pi2Var;
    }

    @Override // defpackage.uh2
    public final void a(wh2 wh2Var) {
        this.g = false;
        this.h = false;
        ni2 ni2Var = this.i;
        if (((WindowInsetsAnimation) wh2Var.a.f).getDurationMillis() > 0 && ni2Var != null) {
            ji2 ji2Var = ni2Var.a;
            pi2 pi2Var = this.f;
            pi2Var.s.f(fr1.s(ji2Var.f(8)));
            pi2Var.r.f(fr1.s(ji2Var.f(8)));
            pi2.b(pi2Var, ni2Var);
        }
        this.i = null;
    }

    @Override // defpackage.q91
    public final ni2 b(View view, ni2 ni2Var) {
        this.i = ni2Var;
        pi2 pi2Var = this.f;
        he2 he2Var = pi2Var.r;
        ji2 ji2Var = ni2Var.a;
        he2Var.f(fr1.s(ji2Var.f(8)));
        if (this.g) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.h) {
            pi2Var.s.f(fr1.s(ji2Var.f(8)));
            pi2.b(pi2Var, ni2Var);
        }
        if (pi2Var.t) {
            return ni2.b;
        }
        return ni2Var;
    }

    @Override // defpackage.uh2
    public final void c(wh2 wh2Var) {
        this.g = true;
        this.h = true;
    }

    @Override // defpackage.uh2
    public final ni2 d(ni2 ni2Var, List list) {
        pi2 pi2Var = this.f;
        pi2.b(pi2Var, ni2Var);
        if (pi2Var.t) {
            return ni2.b;
        }
        return ni2Var;
    }

    @Override // defpackage.uh2
    public final h12 e(wh2 wh2Var, h12 h12Var) {
        this.g = false;
        return h12Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.g) {
            this.g = false;
            this.h = false;
            ni2 ni2Var = this.i;
            if (ni2Var != null) {
                pi2 pi2Var = this.f;
                pi2Var.s.f(fr1.s(ni2Var.a.f(8)));
                pi2.b(pi2Var, ni2Var);
                this.i = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
