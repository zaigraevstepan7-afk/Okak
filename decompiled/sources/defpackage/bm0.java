package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsetsAnimation;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class bm0 extends uh2 implements Runnable, q91, View.OnAttachStateChangeListener {
    public boolean f;
    public int g;
    public ni2 h;
    public final i41 i;
    public final ge1 j;
    public final b41 k;
    public final a12 l;

    public bm0() {
        super(1);
        i41 i41Var = new i41(9);
        ri2.a.getClass();
        i41Var.m(qi2.b, new kj2("caption bar"));
        i41Var.m(qi2.c, new kj2("display cutout"));
        i41Var.m(qi2.d, new kj2("ime"));
        i41Var.m(qi2.e, new kj2("mandatory system gestures"));
        i41Var.m(qi2.f, new kj2("navigation bars"));
        i41Var.m(qi2.g, new kj2("status bars"));
        i41Var.m(qi2.h, new kj2("system gestures"));
        i41Var.m(qi2.i, new kj2("tappable element"));
        i41Var.m(qi2.j, new kj2("waterfall"));
        this.i = i41Var;
        this.j = new ge1(0);
        this.k = new b41(4);
        this.l = new a12();
    }

    @Override // defpackage.uh2
    public final void a(wh2 wh2Var) {
        boolean z = false;
        this.f = false;
        int typeMask = ((WindowInsetsAnimation) wh2Var.a.f).getTypeMask();
        this.g &= ~typeMask;
        this.h = null;
        ri2 ri2Var = (ri2) ti2.a.b(typeMask);
        if (ri2Var != null) {
            Object g = this.i.g(ri2Var);
            g.getClass();
            kj2 kj2Var = (kj2) g;
            kj2Var.c.h(0.0f);
            kj2Var.e.h(1.0f);
            kj2Var.d.h(0L);
            kj2Var.c.h(0.0f);
            kj2Var.b.setValue(Boolean.FALSE);
            kj2Var.j = -1L;
            kj2Var.k = -1L;
            ge1 ge1Var = this.j;
            ge1Var.h(ge1Var.g() + 1);
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
    }

    @Override // defpackage.q91
    public final ni2 b(View view, ni2 ni2Var) {
        if (this.f) {
            this.h = ni2Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return ni2Var;
            }
        } else if (this.g == 0) {
            f(ni2Var);
        }
        return ni2Var;
    }

    @Override // defpackage.uh2
    public final void c(wh2 wh2Var) {
        this.f = true;
    }

    @Override // defpackage.uh2
    public final ni2 d(ni2 ni2Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            wh2 wh2Var = (wh2) list.get(i);
            ri2 ri2Var = (ri2) ti2.a.b(((WindowInsetsAnimation) wh2Var.a.f).getTypeMask());
            if (ri2Var != null) {
                Object g = this.i.g(ri2Var);
                g.getClass();
                kj2 kj2Var = (kj2) g;
                if (((Boolean) kj2Var.b.getValue()).booleanValue()) {
                    ov1 ov1Var = wh2Var.a;
                    WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) ov1Var.f;
                    WindowInsetsAnimation windowInsetsAnimation2 = (WindowInsetsAnimation) ov1Var.f;
                    kj2Var.c.h(windowInsetsAnimation.getInterpolatedFraction());
                    kj2Var.e.h(windowInsetsAnimation2.getAlpha());
                    kj2Var.d.h(windowInsetsAnimation2.getDurationMillis());
                }
            }
        }
        f(ni2Var);
        return ni2Var;
    }

    @Override // defpackage.uh2
    public final h12 e(wh2 wh2Var, h12 h12Var) {
        ni2 ni2Var = this.h;
        boolean z = false;
        this.f = false;
        this.h = null;
        if (((WindowInsetsAnimation) wh2Var.a.f).getDurationMillis() > 0 && ni2Var != null) {
            int typeMask = ((WindowInsetsAnimation) wh2Var.a.f).getTypeMask();
            this.g |= typeMask;
            ri2 ri2Var = (ri2) ti2.a.b(typeMask);
            if (ri2Var != null) {
                Object g = this.i.g(ri2Var);
                g.getClass();
                kj2 kj2Var = (kj2) g;
                yl0 f = ni2Var.a.f(typeMask);
                long j = (f.a << 48) | (f.b << 32) | (f.c << 16) | f.d;
                long j2 = kj2Var.h;
                if (!xp1.j(j, j2)) {
                    kj2Var.j = j2;
                    kj2Var.k = j;
                    kj2Var.b.setValue(Boolean.TRUE);
                    ov1 ov1Var = wh2Var.a;
                    kj2Var.c.h(((WindowInsetsAnimation) ov1Var.f).getInterpolatedFraction());
                    kj2Var.e.h(((WindowInsetsAnimation) ov1Var.f).getAlpha());
                    kj2Var.d.h(((WindowInsetsAnimation) ov1Var.f).getDurationMillis());
                    ge1 ge1Var = this.j;
                    ge1Var.h(ge1Var.g() + 1);
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
                        return h12Var;
                    }
                }
            }
        }
        return h12Var;
    }

    public final void f(ni2 ni2Var) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        long[] jArr2;
        int[] iArr2;
        Object[] objArr2;
        long j2;
        int i;
        p31 p31Var = ti2.a;
        int[] iArr3 = p31Var.b;
        Object[] objArr3 = p31Var.c;
        long[] jArr3 = p31Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j3 = jArr3[i2];
                z = true;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j3 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            ri2 ri2Var = (ri2) objArr3[i6];
                            yl0 f = ni2Var.a.f(i7);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long j4 = (f.a << 48) | (f.b << 32) | (f.c << 16) | f.d;
                            Object g = this.i.g(ri2Var);
                            g.getClass();
                            kj2 kj2Var = (kj2) g;
                            j2 = j3;
                            if (!xp1.j(j4, kj2Var.h)) {
                                kj2Var.h = j4;
                                z2 = true;
                                if (!xp1.j(j4, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                yl0 g2 = ni2Var.a.g(i7);
                                objArr2 = objArr3;
                                long j5 = (g2.b << 32) | (g2.a << 48) | (g2.c << 16) | g2.d;
                                if (!xp1.j(kj2Var.i, j5)) {
                                    kj2Var.i = j5;
                                    z2 = true;
                                    if (!xp1.j(j5, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            kj2Var.a.setValue(Boolean.valueOf(ni2Var.a.m(i7)));
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            j2 = j3;
                            i = i3;
                        }
                        j3 = j2 >> i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        l10 e = ni2Var.a.e();
        if (e == null) {
            j = 0;
        } else {
            yl0 c4 = yl0.c(e.a.getWaterfallInsets());
            j = (c4.a << c3) | (c4.b << c2) | (c4.c << c) | c4.d;
        }
        i41 i41Var = this.i;
        ri2.a.getClass();
        Object g3 = i41Var.g(qi2.j);
        g3.getClass();
        kj2 kj2Var2 = (kj2) g3;
        kj2Var2.a.setValue(Boolean.valueOf(!xp1.j(j, 0L)));
        if (!xp1.j(kj2Var2.h, j)) {
            kj2Var2.h = j;
            kj2Var2.i = j;
            z2 = z;
            if (!xp1.j(j, 0L)) {
                z3 = z2;
            }
        }
        if (e == null) {
            b41 b41Var = this.k;
            if (b41Var.b > 0) {
                b41Var.d();
                this.l.clear();
                z2 = z;
            }
        } else {
            List<Rect> boundingRects = e.a.getBoundingRects();
            int size = boundingRects.size();
            b41 b41Var2 = this.k;
            if (size < b41Var2.b) {
                b41Var2.l(boundingRects.size(), this.k.b);
                this.l.c(boundingRects.size(), this.l.size());
                z2 = z;
            } else {
                int size2 = boundingRects.size() - this.k.b;
                int i8 = 0;
                while (i8 < size2) {
                    b41 b41Var3 = this.k;
                    b41Var3.a(fr1.k(boundingRects.get(b41Var3.b)));
                    this.l.add(new rl0("display cutout rect " + this.k.b));
                    i8++;
                    z2 = z;
                }
            }
            int size3 = boundingRects.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Rect rect = boundingRects.get(i9);
                o41 o41Var = (o41) this.k.f(i9);
                if (!sn0.r(o41Var.getValue(), rect)) {
                    o41Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!boundingRects.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.j.g() != 0) && z2) {
            ge1 ge1Var = this.j;
            ge1Var.h(ge1Var.g() + 1);
            synchronized (q02.c) {
                j41 j41Var = q02.j.h;
                if (j41Var != null) {
                    boolean z5 = z;
                    if (j41Var.h() == z5) {
                        z4 = z5;
                    }
                }
                z4 = false;
            }
            if (z4) {
                q02.a();
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2;
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            view = view2;
        }
        int i = eg2.a;
        ag2.a(view, this);
        eg2.a(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View view2;
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            view = view2;
        }
        int i = eg2.a;
        ag2.a(view, null);
        view.setWindowInsetsAnimationCallback(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f) {
            this.g = 0;
            this.f = false;
            ni2 ni2Var = this.h;
            if (ni2Var != null) {
                f(ni2Var);
                this.h = null;
            }
        }
    }
}
