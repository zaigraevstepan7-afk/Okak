package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class wo1 extends View {
    public static final int[] j = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] k = new int[0];
    public rd2 e;
    public Boolean f;
    public Long g;
    public r5 h;
    public v3 i;

    private final void setRippleState(boolean z) {
        long j2;
        int[] iArr;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.h;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.g;
        if (l != null) {
            j2 = l.longValue();
        } else {
            j2 = 0;
        }
        long j3 = currentAnimationTimeMillis - j2;
        if (!z && j3 < 5) {
            r5 r5Var = new r5(this, 8);
            this.h = r5Var;
            postDelayed(r5Var, 50L);
        } else {
            if (z) {
                iArr = j;
            } else {
                iArr = k;
            }
            rd2 rd2Var = this.e;
            if (rd2Var != null) {
                rd2Var.setState(iArr);
            }
        }
        this.g = Long.valueOf(currentAnimationTimeMillis);
    }

    public static final void setRippleState$lambda$1(wo1 wo1Var) {
        rd2 rd2Var = wo1Var.e;
        if (rd2Var != null) {
            rd2Var.setState(k);
        }
        wo1Var.h = null;
    }

    public final void b(si1 si1Var, boolean z, long j2, int i, long j3, v3 v3Var) {
        if (this.e == null || !Boolean.valueOf(z).equals(this.f)) {
            rd2 rd2Var = new rd2(z);
            setBackground(rd2Var);
            this.e = rd2Var;
            this.f = Boolean.valueOf(z);
        }
        rd2 rd2Var2 = this.e;
        rd2Var2.getClass();
        this.i = v3Var;
        e(j2, j3, i);
        if (z) {
            rd2Var2.setHotspot(Float.intBitsToFloat((int) (si1Var.a >> 32)), Float.intBitsToFloat((int) (si1Var.a & 4294967295L)));
        } else {
            rd2Var2.setHotspot(rd2Var2.getBounds().centerX(), rd2Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.i = null;
        r5 r5Var = this.h;
        if (r5Var != null) {
            removeCallbacks(r5Var);
            r5 r5Var2 = this.h;
            r5Var2.getClass();
            r5Var2.run();
        } else {
            rd2 rd2Var = this.e;
            if (rd2Var != null) {
                rd2Var.setState(k);
            }
        }
        rd2 rd2Var2 = this.e;
        if (rd2Var2 == null) {
            return;
        }
        rd2Var2.setVisible(false, false);
        unscheduleDrawable(rd2Var2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            c();
        } else {
            super.draw(canvas);
        }
    }

    public final void e(long j2, long j3, int i) {
        boolean c;
        rd2 rd2Var = this.e;
        if (rd2Var == null) {
            return;
        }
        Integer num = rd2Var.g;
        if (num == null || num.intValue() != i) {
            rd2Var.g = Integer.valueOf(i);
            rd2Var.setRadius(i);
        }
        long b = co.b(j3, 0.1f);
        co coVar = rd2Var.f;
        if (coVar == null) {
            c = false;
        } else {
            c = co.c(coVar.a, b);
        }
        if (!c) {
            rd2Var.f = new co(b);
            rd2Var.setColor(ColorStateList.valueOf(go.U(b)));
        }
        Rect rect = new Rect(0, 0, c01.R(Float.intBitsToFloat((int) (j2 >> 32))), c01.R(Float.intBitsToFloat((int) (j2 & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        rd2Var.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        v3 v3Var = this.i;
        if (v3Var != null) {
            v3Var.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
