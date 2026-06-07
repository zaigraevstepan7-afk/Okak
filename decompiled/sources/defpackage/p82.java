package defpackage;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class p82 implements dh1 {
    public final View a;
    public final ld b;
    public final q82 c;
    public boolean d;
    public oe0 e;
    public oe0 f;
    public i82 g;
    public nj0 h;
    public final ArrayList i;
    public final rr0 j;
    public Rect k;
    public final wv l;
    public final q41 m;
    public r5 n;

    public p82(View view, q5 q5Var) {
        ld ldVar = new ld(view);
        q82 q82Var = new q82(Choreographer.getInstance());
        this.a = view;
        this.b = ldVar;
        this.c = q82Var;
        this.e = x81.s;
        this.f = x81.t;
        this.g = new i82(4, "", d92.b);
        this.h = nj0.g;
        this.i = new ArrayList();
        this.j = lo.O(xt0.f, new s8(this, 13));
        this.l = new wv(q5Var, ldVar);
        this.m = new q41(new o82[16]);
    }

    @Override // defpackage.dh1
    public final void a() {
        i(o82.e);
    }

    @Override // defpackage.dh1
    public final void b() {
        i(o82.g);
    }

    @Override // defpackage.dh1
    public final void c() {
        this.d = false;
        this.e = x81.u;
        this.f = x81.v;
        this.k = null;
        i(o82.f);
    }

    @Override // defpackage.dh1
    public final void d(i82 i82Var, c91 c91Var, w82 w82Var, bk bkVar, pl1 pl1Var, pl1 pl1Var2) {
        wv wvVar = this.l;
        synchronized (wvVar.c) {
            try {
                wvVar.j = i82Var;
                wvVar.l = c91Var;
                wvVar.k = w82Var;
                wvVar.m = bkVar;
                wvVar.n = pl1Var;
                wvVar.o = pl1Var2;
                if (!wvVar.e) {
                    if (wvVar.d) {
                    }
                }
                wvVar.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.dh1
    public final void e(i82 i82Var, i82 i82Var2) {
        boolean z;
        int i;
        int i2;
        int i3;
        if (d92.b(this.g.b, i82Var2.b) && sn0.r(this.g.c, i82Var2.c)) {
            z = false;
        } else {
            z = true;
        }
        this.g = i82Var2;
        int size = this.i.size();
        for (int i4 = 0; i4 < size; i4++) {
            ll1 ll1Var = (ll1) ((WeakReference) this.i.get(i4)).get();
            if (ll1Var != null) {
                ll1Var.d = i82Var2;
            }
        }
        wv wvVar = this.l;
        synchronized (wvVar.c) {
            wvVar.j = null;
            wvVar.l = null;
            wvVar.k = null;
            wvVar.m = i5.u;
            wvVar.n = null;
            wvVar.o = null;
        }
        int i5 = -1;
        if (sn0.r(i82Var, i82Var2)) {
            if (z) {
                ld ldVar = this.b;
                int f = d92.f(i82Var2.b);
                int e = d92.e(i82Var2.b);
                d92 d92Var = this.g.c;
                if (d92Var != null) {
                    i3 = d92.f(d92Var.a);
                } else {
                    i3 = -1;
                }
                d92 d92Var2 = this.g.c;
                if (d92Var2 != null) {
                    i5 = d92.e(d92Var2.a);
                }
                ((InputMethodManager) ((rr0) ldVar.g).getValue()).updateSelection((View) ldVar.f, f, e, i3, i5);
                return;
            }
            return;
        }
        if (i82Var != null && (!sn0.r(i82Var.a.f, i82Var2.a.f) || (d92.b(i82Var.b, i82Var2.b) && !sn0.r(i82Var.c, i82Var2.c)))) {
            ld ldVar2 = this.b;
            ((InputMethodManager) ((rr0) ldVar2.g).getValue()).restartInput((View) ldVar2.f);
            return;
        }
        int size2 = this.i.size();
        for (int i6 = 0; i6 < size2; i6++) {
            ll1 ll1Var2 = (ll1) ((WeakReference) this.i.get(i6)).get();
            if (ll1Var2 != null) {
                i82 i82Var3 = this.g;
                ld ldVar3 = this.b;
                if (ll1Var2.h) {
                    ll1Var2.d = i82Var3;
                    if (ll1Var2.f) {
                        ((InputMethodManager) ((rr0) ldVar3.g).getValue()).updateExtractedText((View) ldVar3.f, ll1Var2.e, qo.d0(i82Var3));
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
                    ((InputMethodManager) ((rr0) ldVar3.g).getValue()).updateSelection((View) ldVar3.f, d92.f(j), d92.e(j), i, i2);
                }
            }
        }
    }

    @Override // defpackage.dh1
    public final void f() {
        i(o82.h);
    }

    @Override // defpackage.dh1
    public final void g(pl1 pl1Var) {
        Rect rect;
        this.k = new Rect(c01.R(pl1Var.a), c01.R(pl1Var.b), c01.R(pl1Var.c), c01.R(pl1Var.d));
        if (this.i.isEmpty() && (rect = this.k) != null) {
            this.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // defpackage.dh1
    public final void h(i82 i82Var, nj0 nj0Var, k1 k1Var, fu fuVar) {
        this.d = true;
        this.g = i82Var;
        this.h = nj0Var;
        this.e = k1Var;
        this.f = fuVar;
        i(o82.e);
    }

    public final void i(o82 o82Var) {
        this.m.b(o82Var);
        if (this.n == null) {
            r5 r5Var = new r5(this, 13);
            this.c.execute(r5Var);
            this.n = r5Var;
        }
    }
}
