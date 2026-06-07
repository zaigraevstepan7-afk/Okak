package defpackage;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class b10 extends bq {
    public de0 i;
    public z00 j;
    public final View k;
    public final w00 l;
    public boolean m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b10(defpackage.de0 r6, defpackage.z00 r7, android.view.View r8, defpackage.jq0 r9, defpackage.c00 r10, java.util.UUID r11) {
        /*
            r5 = this;
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r8.getContext()
            boolean r2 = r7.e
            if (r2 == 0) goto Le
            r2 = 2131361799(0x7f0a0007, float:1.834336E38)
            goto L11
        Le:
            r2 = 2131361802(0x7f0a000a, float:1.8343367E38)
        L11:
            r0.<init>(r1, r2)
            r5.<init>(r0)
            r5.i = r6
            r5.j = r7
            r5.k = r8
            android.view.Window r6 = r5.getWindow()
            r7 = 0
            if (r6 == 0) goto Le2
            r0 = 1
            r6.requestFeature(r0)
            r1 = 17170445(0x106000d, float:2.461195E-38)
            r6.setBackgroundDrawableResource(r1)
            z00 r1 = r5.j
            boolean r1 = r1.e
            defpackage.xq1.s(r6, r1)
            r1 = 17
            r6.setGravity(r1)
            z00 r1 = r5.j
            boolean r1 = r1.e
            r2 = 0
            if (r1 != 0) goto L5b
            r1 = 65792(0x10100, float:9.2194E-41)
            r6.addFlags(r1)
            android.view.WindowManager$LayoutParams r1 = r6.getAttributes()
            uc r3 = defpackage.uc.a
            r3.a(r1)
            vc r3 = defpackage.vc.a
            r3.b(r1, r2)
            r3.c(r1, r2)
            r6.setAttributes(r1)
        L5b:
            w00 r1 = new w00
            android.content.Context r3 = r5.getContext()
            r1.<init>(r3, r6)
            z00 r3 = r5.j
            java.lang.String r3 = r3.f
            r5.setTitle(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Dialog:"
            r3.<init>(r4)
            r3.append(r11)
            java.lang.String r11 = r3.toString()
            r3 = 2131034162(0x7f050032, float:1.7678834E38)
            r1.setTag(r3, r11)
            r1.setClipChildren(r2)
            r11 = 1090519040(0x41000000, float:8.0)
            float r10 = r10.W(r11)
            r1.setElevation(r10)
            a10 r10 = new a10
            r10.<init>(r2)
            r1.setOutlineProvider(r10)
            r5.l = r1
            android.view.View r6 = r6.getDecorView()
            boolean r10 = r6 instanceof android.view.ViewGroup
            if (r10 == 0) goto La0
            r7 = r6
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
        La0:
            if (r7 == 0) goto La5
            h(r7)
        La5:
            r5.setContentView(r1)
            uu0 r6 = defpackage.nq1.d(r8)
            r7 = 2131034230(0x7f050076, float:1.7678972E38)
            r1.setTag(r7, r6)
            tg2 r6 = defpackage.yq1.o(r8)
            r7 = 2131034234(0x7f05007a, float:1.767898E38)
            r1.setTag(r7, r6)
            cr1 r6 = defpackage.xq1.k(r8)
            r7 = 2131034233(0x7f050079, float:1.7678978E38)
            r1.setTag(r7, r6)
            de0 r6 = r5.i
            z00 r7 = r5.j
            r5.i(r6, r7, r9)
            y91 r6 = r5.b()
            y6 r7 = new y6
            r7.<init>(r5, r0)
            r6.getClass()
            tg r8 = new tg
            r8.<init>(r7)
            r6.a(r5, r8)
            return
        Le2:
            java.lang.String r5 = "Dialog has no window"
            defpackage.se.p(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b10.<init>(de0, z00, android.view.View, jq0, c00, java.util.UUID):void");
    }

    public static final void h(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        viewGroup.setClipChildren(false);
        if (!(viewGroup instanceof w00)) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) childAt;
                } else {
                    viewGroup2 = null;
                }
                if (viewGroup2 != null) {
                    h(viewGroup2);
                }
            }
        }
    }

    public final void i(de0 de0Var, z00 z00Var, jq0 jq0Var) {
        int i;
        int i2;
        boolean z;
        int i3;
        this.i = de0Var;
        this.j = z00Var;
        ct1 ct1Var = z00Var.c;
        boolean b = c9.b(this.k);
        int ordinal = ct1Var.ordinal();
        int i4 = 0;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    b = false;
                } else {
                    se.m();
                    return;
                }
            } else {
                b = true;
            }
        }
        Window window = getWindow();
        window.getClass();
        if (b) {
            i = 8192;
        } else {
            i = -8193;
        }
        window.setFlags(i, SharedConstants.DefaultBufferSize);
        int ordinal2 = jq0Var.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                i2 = 1;
            } else {
                se.m();
                return;
            }
        } else {
            i2 = 0;
        }
        w00 w00Var = this.l;
        w00Var.setLayoutDirection(i2);
        boolean z2 = z00Var.e;
        boolean z3 = z00Var.d;
        Window window2 = w00Var.m;
        if (w00Var.q && z3 == w00Var.o && z2 == w00Var.p) {
            z = false;
        } else {
            z = true;
        }
        w00Var.o = z3;
        w00Var.p = z2;
        if (z) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            if (z3) {
                i3 = -2;
            } else {
                i3 = -1;
            }
            if (i3 != attributes.width || !w00Var.q) {
                window2.setLayout(i3, -2);
                w00Var.q = true;
            }
        }
        setCanceledOnTouchOutside(z00Var.b);
        Window window3 = getWindow();
        if (window3 != null) {
            if (!z2) {
                if (Build.VERSION.SDK_INT < 31) {
                    i4 = 16;
                } else {
                    i4 = 48;
                }
            }
            window3.setSoftInputMode(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.j.a && keyEvent.isTracking() && !keyEvent.isCanceled() && i == 111) {
            this.i.invoke();
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if (r5 <= r1) goto L35;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = super.onTouchEvent(r10)
            z00 r1 = r9.j
            boolean r1 = r1.b
            r2 = 3
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L8b
            w00 r1 = r9.l
            r1.getClass()
            float r5 = r10.getX()
            boolean r6 = java.lang.Float.isInfinite(r5)
            if (r6 != 0) goto L6e
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L6e
            float r5 = r10.getY()
            boolean r6 = java.lang.Float.isInfinite(r5)
            if (r6 != 0) goto L6e
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L6e
            android.view.View r5 = r1.getChildAt(r3)
            if (r5 != 0) goto L39
            goto L6e
        L39:
            int r6 = r1.getLeft()
            int r7 = r5.getLeft()
            int r7 = r7 + r6
            int r6 = r5.getWidth()
            int r6 = r6 + r7
            int r1 = r1.getTop()
            int r8 = r5.getTop()
            int r8 = r8 + r1
            int r1 = r5.getHeight()
            int r1 = r1 + r8
            float r5 = r10.getX()
            int r5 = defpackage.c01.R(r5)
            if (r7 > r5) goto L6e
            if (r5 > r6) goto L6e
            float r5 = r10.getY()
            int r5 = defpackage.c01.R(r5)
            if (r8 > r5) goto L6e
            if (r5 > r1) goto L6e
            goto L8b
        L6e:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L88
            if (r10 == r4) goto L7c
            if (r10 == r2) goto L79
            goto L95
        L79:
            r9.m = r3
            return r0
        L7c:
            boolean r10 = r9.m
            if (r10 == 0) goto L95
            de0 r10 = r9.i
            r10.invoke()
            r9.m = r3
            return r4
        L88:
            r9.m = r4
            return r4
        L8b:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L96
            if (r10 == r4) goto L96
            if (r10 == r2) goto L96
        L95:
            return r0
        L96:
            r9.m = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b10.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
