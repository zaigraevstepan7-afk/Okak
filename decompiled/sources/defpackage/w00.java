package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class w00 extends u implements q91 {
    public final Window m;
    public final je1 n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;

    public w00(Context context, Window window) {
        super(context);
        this.m = window;
        this.n = fr1.k(gq.a);
        int i = eg2.a;
        ag2.a(this, this);
        eg2.a(this, new v00(this));
    }

    @Override // defpackage.u
    public final void a(int i, ur urVar) {
        int i2;
        boolean z;
        urVar.Y(1735448596);
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
            ((se0) this.n.getValue()).invoke(urVar, 0);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new t(this, i, 6);
        }
    }

    @Override // defpackage.q91
    public final ni2 b(View view, ni2 ni2Var) {
        if (!this.p) {
            View childAt = getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, getWidth() - childAt.getRight());
            int max4 = Math.max(0, getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return ni2Var.a.j(max, max2, max3, max4);
            }
        }
        return ni2Var;
    }

    @Override // defpackage.u
    public final void g(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // defpackage.u
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.r;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007d  */
    @Override // defpackage.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r13, int r14) {
        /*
            r12 = this;
            r0 = 0
            android.view.View r1 = r12.getChildAt(r0)
            if (r1 != 0) goto Lb
            super.h(r13, r14)
            return
        Lb:
            int r2 = android.view.View.MeasureSpec.getSize(r13)
            int r3 = android.view.View.MeasureSpec.getSize(r14)
            int r4 = android.view.View.MeasureSpec.getMode(r14)
            r5 = -2
            android.view.Window r6 = r12.m
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r7) goto L3e
            boolean r8 = r12.o
            if (r8 != 0) goto L3e
            android.view.WindowManager$LayoutParams r8 = r6.getAttributes()
            int r8 = r8.height
            if (r8 != r5) goto L3e
            boolean r8 = r12.p
            if (r8 == 0) goto L3b
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 32
            if (r8 >= r9) goto L3e
            vc r8 = defpackage.vc.a
            int r8 = r8.a(r6)
            goto L3f
        L3b:
            int r8 = r3 + 1
            goto L3f
        L3e:
            r8 = r3
        L3f:
            int r9 = r12.getPaddingLeft()
            int r10 = r12.getPaddingRight()
            int r10 = r10 + r9
            int r9 = r12.getPaddingTop()
            int r11 = r12.getPaddingBottom()
            int r11 = r11 + r9
            int r9 = r2 - r10
            if (r9 >= 0) goto L56
            r9 = r0
        L56:
            int r8 = r8 - r11
            if (r8 >= 0) goto L5a
            goto L5b
        L5a:
            r0 = r8
        L5b:
            int r8 = android.view.View.MeasureSpec.getMode(r13)
            if (r8 != 0) goto L62
            goto L66
        L62:
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r7)
        L66:
            if (r4 != 0) goto L69
            goto L6d
        L69:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r7)
        L6d:
            r1.measure(r13, r14)
            r13 = 1073741824(0x40000000, float:2.0)
            if (r8 == r7) goto L7d
            if (r8 == r13) goto L86
            int r14 = r1.getMeasuredWidth()
            int r2 = r14 + r10
            goto L86
        L7d:
            int r14 = r1.getMeasuredWidth()
            int r14 = r14 + r10
            int r2 = java.lang.Math.min(r2, r14)
        L86:
            if (r4 == r7) goto L92
            if (r4 == r13) goto L90
            int r13 = r1.getMeasuredHeight()
            int r13 = r13 + r11
            goto L9b
        L90:
            r13 = r3
            goto L9b
        L92:
            int r13 = r1.getMeasuredHeight()
            int r13 = r13 + r11
            int r13 = java.lang.Math.min(r3, r13)
        L9b:
            r12.setMeasuredDimension(r2, r13)
            boolean r13 = r12.p
            if (r13 != 0) goto Lbc
            int r13 = r1.getMeasuredHeight()
            int r13 = r13 + r11
            if (r13 <= r3) goto Lbc
            android.view.WindowManager$LayoutParams r13 = r6.getAttributes()
            int r13 = r13.height
            if (r13 != r5) goto Lbc
            r6.addFlags(r7)
            boolean r12 = r12.o
            if (r12 != 0) goto Lbc
            r12 = -1
            r6.setLayout(r12, r12)
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w00.h(int, int):void");
    }
}
