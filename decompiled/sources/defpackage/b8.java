package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class b8 implements dh1 {
    public bu0 a;
    public i22 b;
    public hu0 c;
    public sw1 d;

    @Override // defpackage.dh1
    public final void a() {
        j(null);
    }

    @Override // defpackage.dh1
    public final void b() {
        f12 f12Var;
        bu0 bu0Var = this.a;
        if (bu0Var != null && (f12Var = (f12) hp.s(bu0Var, is.p)) != null) {
            ((sz) f12Var).b();
        }
    }

    @Override // defpackage.dh1
    public final void c() {
        i22 i22Var = this.b;
        if (i22Var != null) {
            i22Var.c(null);
        }
        this.b = null;
        m41 i = i();
        if (i != null) {
            sw1 sw1Var = (sw1) i;
            synchronized (sw1Var) {
                sw1Var.u(sw1Var.o() + sw1Var.o, sw1Var.n, sw1Var.o() + sw1Var.o, sw1Var.o() + sw1Var.o + sw1Var.p);
            }
        }
    }

    @Override // defpackage.dh1
    public final void d(i82 i82Var, c91 c91Var, w82 w82Var, bk bkVar, pl1 pl1Var, pl1 pl1Var2) {
        hu0 hu0Var = this.c;
        if (hu0Var != null) {
            cu0 cu0Var = hu0Var.m;
            synchronized (cu0Var.c) {
                try {
                    cu0Var.j = i82Var;
                    cu0Var.l = c91Var;
                    cu0Var.k = w82Var;
                    cu0Var.m = pl1Var;
                    cu0Var.n = pl1Var2;
                    if (!cu0Var.e) {
                        if (cu0Var.d) {
                        }
                    }
                    cu0Var.a();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.dh1
    public final void e(i82 i82Var, i82 i82Var2) {
        boolean z;
        int i;
        int i2;
        int i3;
        hu0 hu0Var = this.c;
        if (hu0Var != null) {
            if (d92.b(hu0Var.h.b, i82Var2.b) && sn0.r(hu0Var.h.c, i82Var2.c)) {
                z = false;
            } else {
                z = true;
            }
            hu0Var.h = i82Var2;
            int size = hu0Var.j.size();
            for (int i4 = 0; i4 < size; i4++) {
                ml1 ml1Var = (ml1) ((WeakReference) hu0Var.j.get(i4)).get();
                if (ml1Var != null) {
                    ml1Var.g = i82Var2;
                }
            }
            cu0 cu0Var = hu0Var.m;
            synchronized (cu0Var.c) {
                cu0Var.j = null;
                cu0Var.l = null;
                cu0Var.k = null;
                cu0Var.m = null;
                cu0Var.n = null;
            }
            int i5 = -1;
            if (sn0.r(i82Var, i82Var2)) {
                if (z) {
                    sl0 sl0Var = hu0Var.b;
                    int f = d92.f(i82Var2.b);
                    int e = d92.e(i82Var2.b);
                    d92 d92Var = hu0Var.h.c;
                    if (d92Var != null) {
                        i3 = d92.f(d92Var.a);
                    } else {
                        i3 = -1;
                    }
                    d92 d92Var2 = hu0Var.h.c;
                    if (d92Var2 != null) {
                        i5 = d92.e(d92Var2.a);
                    }
                    sl0Var.t().updateSelection((View) sl0Var.e, f, e, i3, i5);
                    return;
                }
                return;
            }
            if (i82Var != null && (!sn0.r(i82Var.a.f, i82Var2.a.f) || (d92.b(i82Var.b, i82Var2.b) && !sn0.r(i82Var.c, i82Var2.c)))) {
                sl0 sl0Var2 = hu0Var.b;
                sl0Var2.t().restartInput((View) sl0Var2.e);
                return;
            }
            int size2 = hu0Var.j.size();
            for (int i6 = 0; i6 < size2; i6++) {
                ml1 ml1Var2 = (ml1) ((WeakReference) hu0Var.j.get(i6)).get();
                if (ml1Var2 != null) {
                    i82 i82Var3 = hu0Var.h;
                    sl0 sl0Var3 = hu0Var.b;
                    if (ml1Var2.k) {
                        ml1Var2.g = i82Var3;
                        if (ml1Var2.i) {
                            sl0Var3.t().updateExtractedText((View) sl0Var3.e, ml1Var2.h, qo.d(i82Var3));
                        }
                        d92 d92Var3 = i82Var3.c;
                        long j = i82Var3.b;
                        if (d92Var3 != null) {
                            i = d92.f(d92Var3.a);
                        } else {
                            i = -1;
                        }
                        d92 d92Var4 = i82Var3.c;
                        if (d92Var4 != null) {
                            i2 = d92.e(d92Var4.a);
                        } else {
                            i2 = -1;
                        }
                        sl0Var3.t().updateSelection((View) sl0Var3.e, d92.f(j), d92.e(j), i, i2);
                    }
                }
            }
        }
    }

    @Override // defpackage.dh1
    public final void f() {
        f12 f12Var;
        bu0 bu0Var = this.a;
        if (bu0Var != null && (f12Var = (f12) hp.s(bu0Var, is.p)) != null) {
            ((sz) f12Var).a();
        }
    }

    @Override // defpackage.dh1
    public final void g(pl1 pl1Var) {
        Rect rect;
        hu0 hu0Var = this.c;
        if (hu0Var != null) {
            hu0Var.l = new Rect(c01.R(pl1Var.a), c01.R(pl1Var.b), c01.R(pl1Var.c), c01.R(pl1Var.d));
            if (hu0Var.j.isEmpty() && (rect = hu0Var.l) != null) {
                hu0Var.a.requestRectangleOnScreen(new Rect(rect));
            }
        }
    }

    @Override // defpackage.dh1
    public final void h(i82 i82Var, nj0 nj0Var, k1 k1Var, fu fuVar) {
        j(new k2(i82Var, this, nj0Var, k1Var, fuVar, 1));
    }

    public final m41 i() {
        sw1 sw1Var = this.d;
        if (sw1Var != null) {
            return sw1Var;
        }
        if (!t32.a) {
            return null;
        }
        sw1 i = fc2.i(2, jk.g);
        this.d = i;
        return i;
    }

    public final void j(k2 k2Var) {
        bu0 bu0Var = this.a;
        if (bu0Var == null) {
            return;
        }
        i22 i22Var = null;
        a8 a8Var = new a8(k2Var, this, bu0Var, i22Var, 0);
        if (bu0Var.r) {
            i22Var = rx.C(bu0Var.z0(), null, new j(bu0Var, a8Var, i22Var, 24), 1);
        }
        this.b = i22Var;
    }

    public final void k(bu0 bu0Var) {
        boolean z;
        if (this.a == bu0Var) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            nl0.c("Expected textInputModifierNode to be " + bu0Var + " but was " + this.a);
        }
        this.a = null;
    }
}
