package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ma implements hg2 {
    public final ViewConfiguration a;

    public ma(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.hg2
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.hg2
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.hg2
    public final float c() {
        int scaledHandwritingSlop;
        if (Build.VERSION.SDK_INT >= 34) {
            scaledHandwritingSlop = this.a.getScaledHandwritingSlop();
            return scaledHandwritingSlop;
        }
        return 2.0f;
    }

    @Override // defpackage.hg2
    public final float e() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.hg2
    public final float f() {
        return this.a.getScaledTouchSlop();
    }

    @Override // defpackage.hg2
    public final float g() {
        int scaledHandwritingGestureLineMargin;
        if (Build.VERSION.SDK_INT >= 34) {
            scaledHandwritingGestureLineMargin = this.a.getScaledHandwritingGestureLineMargin();
            return scaledHandwritingGestureLineMargin;
        }
        return 16.0f;
    }
}
