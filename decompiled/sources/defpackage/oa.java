package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class oa extends ViewGroup {
    public final HashMap e;
    public final HashMap f;

    public oa(Context context) {
        super(context);
        setClipChildren(false);
        this.e = new HashMap();
        this.f = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<Object, ar0> getHolderToLayoutNode() {
        return this.e;
    }

    public final HashMap<ar0, Object> getLayoutNodeToHolder() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Iterator it = this.e.keySet().iterator();
        if (!it.hasNext()) {
            return;
        }
        it.next().getClass();
        se.s();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            kl0.a("widthMeasureSpec should be EXACTLY");
        }
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            kl0.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        Iterator it = this.e.keySet().iterator();
        if (!it.hasNext()) {
            return;
        }
        it.next().getClass();
        se.s();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            ar0 ar0Var = (ar0) this.e.get(childAt);
            if (childAt.isLayoutRequested() && ar0Var != null) {
                ar0.X(ar0Var, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
