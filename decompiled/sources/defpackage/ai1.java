package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.elixir.loader.R;
import java.util.UUID;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ai1 extends u {
    public final Rect A;
    public final c12 B;
    public yc C;
    public final je1 D;
    public boolean E;
    public final int[] F;
    public de0 m;
    public ci1 n;
    public String o;
    public final View p;
    public final boolean q;
    public final wc0 r;
    public final WindowManager s;
    public final WindowManager.LayoutParams t;
    public bi1 u;
    public jq0 v;
    public final je1 w;
    public final je1 x;
    public bn0 y;
    public final j00 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai1(de0 de0Var, ci1 ci1Var, String str, View view, c00 c00Var, bi1 bi1Var, UUID uuid, boolean z) {
        super(view.getContext());
        wc0 wc0Var = new wc0(23);
        this.m = de0Var;
        this.n = ci1Var;
        this.o = str;
        this.p = view;
        this.q = z;
        this.r = wc0Var;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.s = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        ci1 ci1Var2 = this.n;
        boolean b = c9.b(view);
        boolean z2 = ci1Var2.b;
        int i = ci1Var2.a;
        if (z2 && b) {
            i |= SharedConstants.DefaultBufferSize;
        } else if (z2 && !b) {
            i &= -8193;
        }
        layoutParams.flags = i;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.t = layoutParams;
        this.u = bi1Var;
        this.v = jq0.e;
        this.w = fr1.k(null);
        this.x = fr1.k(null);
        this.z = fr1.h(new s8(this, 10));
        this.A = new Rect();
        this.B = new c12(new y8(this, 2));
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, nq1.d(view));
        setTag(R.id.view_tree_view_model_store_owner, yq1.o(view));
        setTag(R.id.view_tree_saved_state_registry_owner, xq1.k(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(c00Var.W(8.0f));
        setOutlineProvider(new a10(2));
        this.D = fr1.k(hq.a);
        this.F = new int[2];
    }

    private final se0 getContent() {
        return (se0) this.D.getValue();
    }

    public final iq0 getParentLayoutCoordinates() {
        return (iq0) this.x.getValue();
    }

    private final bn0 getVisibleDisplayBounds() {
        this.r.getClass();
        View view = this.p;
        Rect rect = this.A;
        view.getWindowVisibleDisplayFrame(rect);
        return new bn0(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setContent(se0 se0Var) {
        this.D.setValue(se0Var);
    }

    private final void setParentLayoutCoordinates(iq0 iq0Var) {
        this.x.setValue(iq0Var);
    }

    @Override // defpackage.u
    public final void a(int i, ur urVar) {
        int i2;
        boolean z;
        urVar.Y(-857613600);
        if (urVar.h(this)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i3 & 1, z)) {
            getContent().invoke(urVar, 0);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new t(this, i, 8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.n.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                de0 de0Var = this.m;
                if (de0Var != null) {
                    de0Var.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.u
    public final void g(boolean z, int i, int i2, int i3, int i4) {
        super.g(z, i, i2, i3, i4);
        this.n.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.t;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.r.getClass();
        this.s.updateViewLayout(this, layoutParams);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.z.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.t;
    }

    public final jq0 getParentLayoutDirection() {
        return this.v;
    }

    /* renamed from: getPopupContentSize-bOM6tXw */
    public final en0 m0getPopupContentSizebOM6tXw() {
        return (en0) this.w.getValue();
    }

    public final bi1 getPositionProvider() {
        return this.u;
    }

    @Override // defpackage.u
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.E;
    }

    public final String getTestTag() {
        return this.o;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // defpackage.u
    public final void h(int i, int i2) {
        this.n.getClass();
        bn0 visibleDisplayBounds = getVisibleDisplayBounds();
        super.h(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.c(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.b(), Integer.MIN_VALUE));
    }

    public final void k(xr xrVar, se0 se0Var) {
        setParentCompositionContext(xrVar);
        setContent(se0Var);
        this.E = true;
    }

    public final void l(de0 de0Var, ci1 ci1Var, String str, jq0 jq0Var) {
        int i;
        this.m = de0Var;
        this.o = str;
        if (!sn0.r(this.n, ci1Var)) {
            ci1Var.getClass();
            this.n = ci1Var;
            boolean b = c9.b(this.p);
            boolean z = ci1Var.b;
            int i2 = ci1Var.a;
            if (z && b) {
                i2 |= SharedConstants.DefaultBufferSize;
            } else if (z && !b) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.t;
            layoutParams.flags = i2;
            this.r.getClass();
            this.s.updateViewLayout(this, layoutParams);
        }
        int ordinal = jq0Var.ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                se.m();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    public final void m() {
        long e;
        iq0 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.j()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates != null) {
                long m = parentLayoutCoordinates.m();
                if (this.q) {
                    e = parentLayoutCoordinates.u(0L);
                } else {
                    e = parentLayoutCoordinates.e(0L);
                }
                bn0 b = hp.b((Math.round(Float.intBitsToFloat((int) (e >> 32))) << 32) | (4294967295L & Math.round(Float.intBitsToFloat((int) (e & 4294967295L)))), m);
                if (!b.equals(this.y)) {
                    this.y = b;
                    o();
                }
            }
        }
    }

    public final void n(iq0 iq0Var) {
        setParentLayoutCoordinates(iq0Var);
        m();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, vl1] */
    public final void o() {
        en0 m0getPopupContentSizebOM6tXw;
        bn0 bn0Var = this.y;
        if (bn0Var != null && (m0getPopupContentSizebOM6tXw = m0getPopupContentSizebOM6tXw()) != null) {
            long j = m0getPopupContentSizebOM6tXw.a;
            bn0 visibleDisplayBounds = getVisibleDisplayBounds();
            long b = (visibleDisplayBounds.b() & 4294967295L) | (visibleDisplayBounds.c() << 32);
            ?? obj = new Object();
            obj.e = 0L;
            this.B.c(this, x81.o, new zh1(obj, this, bn0Var, b, j));
            long j2 = obj.e;
            WindowManager.LayoutParams layoutParams = this.t;
            layoutParams.x = (int) (j2 >> 32);
            layoutParams.y = (int) (j2 & 4294967295L);
            boolean z = this.n.e;
            wc0 wc0Var = this.r;
            if (z) {
                wc0Var.getClass();
                setSystemGestureExclusionRects(xn.G(new Rect(0, 0, (int) (b >> 32), (int) (b & 4294967295L))));
            }
            wc0Var.getClass();
            this.s.updateViewLayout(this, layoutParams);
        }
    }

    @Override // defpackage.u, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B.d();
        if (this.n.c && Build.VERSION.SDK_INT >= 33) {
            if (this.C == null) {
                this.C = new yc(this.m, 0);
            }
            f1.g(this, this.C);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c12 c12Var = this.B;
        l2 l2Var = c12Var.h;
        if (l2Var != null) {
            l2Var.c();
        }
        c12Var.a();
        if (Build.VERSION.SDK_INT >= 33) {
            f1.h(this, this.C);
        }
        this.C = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.n.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            de0 de0Var = this.m;
            if (de0Var != null) {
                de0Var.invoke();
                return true;
            }
        } else if (motionEvent != null && motionEvent.getAction() == 4) {
            de0 de0Var2 = this.m;
            if (de0Var2 != null) {
                de0Var2.invoke();
            }
        } else {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void setParentLayoutDirection(jq0 jq0Var) {
        this.v = jq0Var;
    }

    /* renamed from: setPopupContentSize-fhxjrPA */
    public final void m1setPopupContentSizefhxjrPA(en0 en0Var) {
        this.w.setValue(en0Var);
    }

    public final void setPositionProvider(bi1 bi1Var) {
        this.u = bi1Var;
    }

    public final void setTestTag(String str) {
        this.o = str;
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public u getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
