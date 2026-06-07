package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.elixir.loader.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class u extends ViewGroup {
    public WeakReference e;
    public IBinder f;
    public rj2 g;
    public xr h;
    public fg2 i;
    public boolean j;
    public boolean k;
    public boolean l;

    public u(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        r7 r7Var = new r7(this, 1);
        addOnAttachStateChangeListener(r7Var);
        y61 y61Var = new y61(27);
        vn.C(this).a.add(y61Var);
        this.i = new fg2(this, r7Var, y61Var);
    }

    private final void setParentContext(xr xrVar) {
        if (this.h != xrVar) {
            this.h = xrVar;
            if (xrVar != null) {
                this.e = null;
            }
            rj2 rj2Var = this.g;
            if (rj2Var != null) {
                rj2Var.a();
                this.g = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f != iBinder) {
            this.f = iBinder;
            this.e = null;
        }
    }

    public abstract void a(int i, ur urVar);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void c() {
        if (this.k) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void d() {
        if (this.h == null && !isAttachedToWindow()) {
            se.p("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        } else {
            f();
        }
    }

    public final void e() {
        rj2 rj2Var = this.g;
        if (rj2Var != null) {
            rj2Var.a();
        }
        this.g = null;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        if (this.g == null) {
            boolean z = false;
            Object[] objArr = 0;
            try {
                this.k = true;
                this.g = tj2.a(this, i(), new fq(-656146368, true, new t(this, objArr == true ? 1 : 0)));
            } finally {
                this.k = false;
            }
        }
    }

    public void g(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m297getAutoClearFocusBehavior4UtRPd4() {
        bg bgVar;
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        if (tag instanceof bg) {
            bgVar = (bg) tag;
        } else {
            bgVar = null;
        }
        if (bgVar != null) {
            return bgVar.a;
        }
        return 1;
    }

    public final boolean getHasComposition() {
        if (this.g != null) {
            return true;
        }
        return false;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.j;
    }

    public void h(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, wl1] */
    public final xr i() {
        jl1 jl1Var;
        xu xuVar;
        ja jaVar;
        wu0 wu0Var;
        xr xrVar;
        xr xrVar2 = this.h;
        if (xrVar2 == null) {
            xrVar2 = gj2.b(this);
            if (xrVar2 == null) {
                Object parent = getParent();
                while (xrVar2 == null && (parent instanceof View)) {
                    View view = (View) parent;
                    xrVar2 = gj2.b(view);
                    parent = xp1.k(view);
                }
            }
            vt vtVar = null;
            if (xrVar2 != null) {
                if ((xrVar2 instanceof jl1) && ((gl1) ((jl1) xrVar2).u.getValue()).compareTo(gl1.f) <= 0) {
                    xrVar = null;
                } else {
                    xrVar = xrVar2;
                }
                if (xrVar != null) {
                    this.e = new WeakReference(xrVar);
                }
            } else {
                xrVar2 = null;
            }
            if (xrVar2 == null) {
                WeakReference weakReference = this.e;
                if (weakReference == null || (xrVar2 = (xr) weakReference.get()) == null || ((xrVar2 instanceof jl1) && ((gl1) ((jl1) xrVar2).u.getValue()).compareTo(gl1.f) <= 0)) {
                    xrVar2 = null;
                }
                if (xrVar2 == null) {
                    if (!isAttachedToWindow()) {
                        kl0.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object parent2 = getParent();
                    View view2 = this;
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    xr b = gj2.b(view2);
                    if (b == null) {
                        ((bj2) cj2.a.get()).getClass();
                        j60 j60Var = j60.e;
                        b52 b52Var = ha.q;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            xuVar = (xu) ha.q.getValue();
                        } else {
                            xuVar = (xu) ha.r.get();
                            if (xuVar == null) {
                                se.p("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        xu G = xuVar.G(j60Var);
                        ja jaVar2 = (ja) G.H(g3.P);
                        if (jaVar2 != null) {
                            ja jaVar3 = new ja(jaVar2);
                            dq0 dq0Var = (dq0) jaVar3.g;
                            synchronized (dq0Var.b) {
                                dq0Var.a = false;
                                jaVar = jaVar3;
                            }
                        } else {
                            jaVar = 0;
                        }
                        ?? obj = new Object();
                        xu xuVar2 = (l21) G.H(g3.Q);
                        if (xuVar2 == null) {
                            xuVar2 = new m21();
                            obj.e = xuVar2;
                        }
                        if (jaVar != 0) {
                            j60Var = jaVar;
                        }
                        xu G2 = G.G(j60Var).G(xuVar2);
                        jl1 jl1Var2 = new jl1(G2);
                        synchronized (jl1Var2.c) {
                            jl1Var2.t = true;
                        }
                        ut b2 = fp.b(G2);
                        uu0 d = nq1.d(view2);
                        if (d != null) {
                            wu0Var = d.g();
                        } else {
                            wu0Var = null;
                        }
                        if (wu0Var != null) {
                            view2.addOnAttachStateChangeListener(new sx1(view2, jl1Var2));
                            wu0Var.a(new ej2(b2, jaVar, jl1Var2, obj, view2));
                            view2.setTag(R.id.androidx_compose_ui_view_composition_context, jl1Var2);
                            mf0 mf0Var = mf0.e;
                            Handler handler = view2.getHandler();
                            int i = ng0.a;
                            view2.addOnAttachStateChangeListener(new r7(rx.C(mf0Var, new mg0(handler, "windowRecomposer cleanup", false).j, new b31(jl1Var2, view2, vtVar, 14), 2), 2));
                            jl1Var = jl1Var2;
                        } else {
                            kl0.c("ViewTreeLifecycleOwner not found from " + view2);
                            se.c();
                            return null;
                        }
                    } else if (b instanceof jl1) {
                        jl1Var = (jl1) b;
                    } else {
                        se.p("root viewTreeParentCompositionContext is not a Recomposer");
                        return null;
                    }
                    if (((gl1) jl1Var.u.getValue()).compareTo(gl1.f) > 0) {
                        vtVar = jl1Var;
                    }
                    if (vtVar != null) {
                        this.e = new WeakReference(vtVar);
                    }
                    return jl1Var;
                }
            }
        }
        return xrVar2;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        if (this.l && !super.isTransitionGroup()) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        g(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        f();
        h(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m298setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new bg(i));
    }

    public final void setParentCompositionContext(xr xrVar) {
        setParentContext(xrVar);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.j = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((q5) ((jc1) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.l = true;
    }

    public final void setViewCompositionStrategy(gg2 gg2Var) {
        fg2 fg2Var = this.i;
        if (fg2Var != null) {
            fg2Var.invoke();
        }
        ((op1) gg2Var).getClass();
        r7 r7Var = new r7(this, 1);
        addOnAttachStateChangeListener(r7Var);
        y61 y61Var = new y61(27);
        vn.C(this).a.add(y61Var);
        this.i = new fg2(this, r7Var, y61Var);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        c();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        c();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        c();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
