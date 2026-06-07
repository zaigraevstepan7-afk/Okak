package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import com.elixir.loader.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class pi2 {
    public static final WeakHashMap w = new WeakHashMap();
    public final sa a;
    public final sa b;
    public final sa c;
    public final sa d;
    public final sa e;
    public final sa f;
    public final sa g;
    public final sa h;
    public final sa i;
    public final he2 j;
    public final je1 k;
    public final ld2 l;
    public final he2 m;
    public final he2 n;
    public final he2 o;
    public final he2 p;
    public final he2 q;
    public final he2 r;
    public final he2 s;
    public final boolean t;
    public int u;
    public final cm0 v;

    public pi2(View view) {
        View view2;
        Object obj;
        Boolean bool;
        sa e = wm1.e(4, "captionBar");
        this.a = e;
        sa e2 = wm1.e(128, "displayCutout");
        this.b = e2;
        sa e3 = wm1.e(8, "ime");
        this.c = e3;
        sa e4 = wm1.e(32, "mandatorySystemGestures");
        this.d = e4;
        sa e5 = wm1.e(2, "navigationBars");
        this.e = e5;
        sa e6 = wm1.e(1, "statusBars");
        this.f = e6;
        sa e7 = wm1.e(519, "systemBars");
        this.g = e7;
        sa e8 = wm1.e(16, "systemGestures");
        this.h = e8;
        sa e9 = wm1.e(64, "tappableElement");
        this.i = e9;
        he2 he2Var = new he2(new hm0(0, 0, 0, 0), "waterfall");
        this.j = he2Var;
        this.k = fr1.k(null);
        this.l = new ld2(new ld2(e7, e3), e2);
        new ld2(new ld2(new ld2(e9, e4), e8), he2Var);
        this.m = wm1.g(4, "captionBarIgnoringVisibility");
        this.n = wm1.g(2, "navigationBarsIgnoringVisibility");
        this.o = wm1.g(1, "statusBarsIgnoringVisibility");
        this.p = wm1.g(519, "systemBarsIgnoringVisibility");
        this.q = wm1.g(64, "tappableElementIgnoringVisibility");
        this.r = new he2(new hm0(0, 0, 0, 0), "imeAnimationTarget");
        this.s = new he2(new hm0(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            obj = view2.getTag(R.id.consume_window_insets_tag);
        } else {
            obj = null;
        }
        if (obj instanceof Boolean) {
            bool = (Boolean) obj;
        } else {
            bool = null;
        }
        this.t = bool != null ? bool.booleanValue() : false;
        this.v = new cm0(this);
        int i = eg2.a;
        ni2 a = bg2.a(view);
        if (a != null) {
            ji2 ji2Var = a.a;
            e.f(ji2Var.m(4));
            e2.f(ji2Var.m(128));
            e3.f(ji2Var.m(8));
            e4.f(ji2Var.m(32));
            e5.f(ji2Var.m(2));
            e6.f(ji2Var.m(1));
            e7.f(ji2Var.m(519));
            e8.f(ji2Var.m(16));
            e9.f(ji2Var.m(64));
        }
    }

    public static void b(pi2 pi2Var, ni2 ni2Var) {
        yl0 yl0Var;
        Path path;
        boolean z = false;
        pi2Var.a.g(ni2Var, 0);
        pi2Var.c.g(ni2Var, 0);
        pi2Var.b.g(ni2Var, 0);
        pi2Var.e.g(ni2Var, 0);
        pi2Var.f.g(ni2Var, 0);
        pi2Var.g.g(ni2Var, 0);
        pi2Var.h.g(ni2Var, 0);
        pi2Var.i.g(ni2Var, 0);
        pi2Var.d.g(ni2Var, 0);
        pi2Var.m.f(fr1.s(ni2Var.a.g(4)));
        pi2Var.n.f(fr1.s(ni2Var.a.g(2)));
        pi2Var.o.f(fr1.s(ni2Var.a.g(1)));
        pi2Var.p.f(fr1.s(ni2Var.a.g(519)));
        pi2Var.q.f(fr1.s(ni2Var.a.g(64)));
        l10 e = ni2Var.a.e();
        he2 he2Var = pi2Var.j;
        if (e != null) {
            yl0Var = yl0.c(e.a.getWaterfallInsets());
        } else {
            yl0Var = yl0.e;
        }
        he2Var.f(fr1.s(yl0Var));
        n8 n8Var = null;
        if (e != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                path = xc.b(e.a);
            } else {
                path = null;
            }
            if (path != null) {
                n8Var = new n8(path);
            }
        }
        pi2Var.k.setValue(n8Var);
        synchronized (q02.c) {
            j41 j41Var = q02.j.h;
            if (j41Var != null) {
                if (j41Var.h()) {
                    z = true;
                }
            }
        }
        if (z) {
            q02.a();
        }
    }

    public final void a(View view) {
        if (this.u == 0) {
            int i = eg2.a;
            cm0 cm0Var = this.v;
            ag2.a(view, cm0Var);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(cm0Var);
            eg2.a(view, cm0Var);
        }
        this.u++;
    }
}
