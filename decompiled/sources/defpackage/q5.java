package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import com.elixir.loader.R;
import com.google.protobuf.DescriptorProtos;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class q5 extends ViewGroup implements jc1, cp1, qy, tb1, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, ic0 {
    public static Class M0;
    public static Method N0;
    public static final b41 O0 = new b41();
    public static a5 P0;
    public static Method Q0;
    public final q5 A;
    public float A0;
    public final uu1 B;
    public float B0;
    public final w5 C;
    public final n5 C0;
    public p6 D;
    public final z4 D0;
    public final p4 E;
    public boolean E0;
    public final s7 F;
    public final qk0 F0;
    public final hg G;
    public final k5 G0;
    public final b41 H;
    public final el H0;
    public b41 I;
    public boolean I0;
    public boolean J;
    public final rg2 J0;
    public final o21 K;
    public View K0;
    public final xm L;
    public final l5 L0;
    public final je1 M;
    public final q4 N;
    public final t4 O;
    public boolean P;
    public final x4 Q;
    public final w4 R;
    public final lc1 S;
    public oa T;
    public us U;
    public boolean V;
    public final g01 W;
    public long a0;
    public final int[] b0;
    public final float[] c0;
    public final float[] d0;
    public long e;
    public final float[] e0;
    public final boolean f;
    public long f0;
    public ek0 g;
    public boolean g0;
    public final cr0 h;
    public long h0;
    public xu0 i;
    public final je1 i0;
    public yu0 j;
    public final j00 j0;
    public ho1 k;
    public oe0 k0;
    public final te l;
    public final p82 l0;
    public final z4 m;
    public final n82 m0;
    public final je1 n;
    public final AtomicReference n0;
    public final View o;
    public final sz o0;
    public final boolean p;
    public final xl1 p0;
    public final mc0 q;
    public final je1 q0;
    public xu r;
    public final je1 r0;
    public final f7 s;
    public final ky s0;
    public final zt0 t;
    public final wl0 t0;
    public final rg2 u;
    public final f21 u0;
    public final ma v;
    public final da v0;
    public final bm0 w;
    public MotionEvent w0;
    public final ar0 x;
    public long x0;
    public final p31 y;
    public final h12 y0;
    public final rl1 z;
    public final b41 z0;

    /* JADX WARN: Type inference failed for: r0v14, types: [xm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [d21, n60] */
    /* JADX WARN: Type inference failed for: r1v43, types: [f21, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, da] */
    public q5(Context context, xu xuVar) {
        super(context);
        boolean z;
        jq0 jq0Var;
        this.e = 9205357640488583168L;
        int i = 1;
        this.f = true;
        this.h = new cr0();
        this.k = g3.M;
        this.l = new te();
        int i2 = 0;
        this.m = new z4(this, 0);
        e00 d = rx.d(context);
        xl1 xl1Var = xl1.f;
        this.n = new je1(d, xl1Var);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 35) {
            z = true;
        } else {
            z = false;
        }
        this.p = z;
        ?? d21Var = new d21();
        this.q = new mc0(this, this);
        this.r = xuVar;
        this.s = new f7();
        this.t = new zt0();
        this.u = new rg2(6);
        this.v = new ma(ViewConfiguration.get(context));
        this.w = new bm0();
        ar0 ar0Var = new ar0(3);
        ar0Var.e0(dp1.c);
        ar0Var.b0(getDensity());
        ar0Var.g0(getViewConfiguration());
        ar0Var.f0(new o5(this).d(((mc0) getFocusOwner()).e).d(m293getDragAndDropManager().c));
        this.x = ar0Var;
        p31 p31Var = wm0.a;
        this.y = new p31();
        m294getLayoutNodes();
        this.z = new rl1();
        this.A = this;
        this.B = new uu1(getRoot(), d21Var, m294getLayoutNodes());
        w5 w5Var = new w5(this);
        this.C = w5Var;
        this.D = new p6(this, new e5(0, this, d6.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 0));
        this.E = new p4(context);
        this.F = new s7(this);
        this.G = new hg();
        this.H = new b41();
        this.K = new o21();
        ar0 root = getRoot();
        ?? obj = new Object();
        obj.b = root;
        obj.c = new zg0(root.J.c);
        obj.d = new rg2(25);
        obj.e = new ch0();
        this.L = obj;
        this.M = fr1.k(new Configuration(context.getResources().getConfiguration()));
        this.N = new q4(this, getAutofillTree());
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.O = new t4(new rg2(autofillManager, 22), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
            this.Q = new x4(context);
            this.R = new w4(getClipboardManager());
            this.S = new lc1(new j5(this, i));
            this.W = new g01(getRoot());
            this.a0 = 9223372034707292159L;
            this.b0 = new int[]{0, 0};
            this.c0 = d01.a();
            this.d0 = d01.a();
            this.e0 = d01.a();
            this.f0 = -1L;
            this.h0 = 9187343241974906880L;
            this.i0 = fr1.k(null);
            this.j0 = fr1.h(new k5(this, 2));
            p82 p82Var = new p82(getView(), this);
            this.l0 = p82Var;
            this.m0 = new n82(p82Var);
            this.n0 = new AtomicReference(null);
            this.o0 = new sz(getTextInputService());
            this.p0 = new xl1(17);
            this.q0 = new je1(fp.v(context), xl1Var);
            int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
            int[] iArr = gc0.a;
            jq0 jq0Var2 = jq0.e;
            if (layoutDirection != 0) {
                if (layoutDirection != 1) {
                    jq0Var = null;
                } else {
                    jq0Var = jq0.f;
                }
            } else {
                jq0Var = jq0Var2;
            }
            this.r0 = fr1.k(jq0Var != null ? jq0Var : jq0Var2);
            this.s0 = new ky(this, 1);
            this.t0 = new wl0(isInTouchMode() ? 1 : 2);
            ?? obj2 = new Object();
            new q41(new dh[16]);
            new q41(new lo[16]);
            new q41(new ar0[16]);
            new q41(new lo[16]);
            this.u0 = obj2;
            ?? obj3 = new Object();
            new wm1(new s8(obj3, i));
            this.v0 = obj3;
            this.y0 = new h12(5);
            this.z0 = new b41();
            this.C0 = new n5(this);
            this.D0 = new z4(this, 1);
            this.F0 = new qk0(context, new j5(this, i2));
            this.G0 = new k5(this, i);
            this.H0 = new el();
            addOnAttachStateChangeListener(this.D);
            setWillNotDraw(false);
            setFocusable(true);
            c6.a.a(this, 1, false);
            setFocusableInTouchMode(true);
            setClipChildren(false);
            int i4 = eg2.a;
            if (getImportantForAccessibility() == 0) {
                setImportantForAccessibility(1);
            }
            setAccessibilityDelegate(w5Var.f);
            setOnDragListener(m293getDragAndDropManager());
            getRoot().d(this);
            x5.a.a(this);
            if (z) {
                View view = new View(context);
                view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
                view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
                this.o = view;
                addView(view, -1);
            }
            this.J0 = i3 >= 31 ? new rg2(28) : null;
            this.L0 = new l5(this);
            return;
        }
        throw l90.f("Autofill service could not be located.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d5 get_viewTreeOwners() {
        return (d5) this.i0.getValue();
    }

    public static void h(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof q5) {
                ((q5) childAt).v();
            } else if (childAt instanceof ViewGroup) {
                h((ViewGroup) childAt);
            }
        }
    }

    public static long j(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    long j = size;
                    return j | (j << 32);
                }
                throw new IllegalStateException();
            }
            return 2147483647L;
        }
        return size;
    }

    public static void m(ar0 ar0Var) {
        ar0Var.D();
        q41 z = ar0Var.z();
        Object[] objArr = z.e;
        int i = z.g;
        for (int i2 = 0; i2 < i; i2++) {
            m((ar0) objArr[i2]);
        }
    }

    public static boolean o(MotionEvent motionEvent) {
        boolean z;
        if ((Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) < 2139095040) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                if ((Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) < 2139095040 && p21.a.a(motionEvent, i)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private void setDensity(c00 c00Var) {
        this.n.setValue(c00Var);
    }

    private void setFontFamilyResolver(cd0 cd0Var) {
        this.q0.setValue(cd0Var);
    }

    private void setLayoutDirection(jq0 jq0Var) {
        this.r0.setValue(jq0Var);
    }

    private final void set_viewTreeOwners(d5 d5Var) {
        this.i0.setValue(d5Var);
    }

    public final void A() {
        if (!this.g0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.f0) {
                this.f0 = currentAnimationTimeMillis;
                el elVar = this.H0;
                float[] fArr = this.d0;
                elVar.a(this, fArr);
                io.C(fArr, this.e0);
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                int[] iArr = this.b0;
                view.getLocationOnScreen(iArr);
                float f = iArr[0];
                float f2 = iArr[1];
                view.getLocationInWindow(iArr);
                float f3 = iArr[0];
                float f4 = f2 - iArr[1];
                this.h0 = (Float.floatToRawIntBits(f - f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
            }
        }
    }

    public final void B(MotionEvent motionEvent) {
        this.f0 = AnimationUtils.currentAnimationTimeMillis();
        el elVar = this.H0;
        float[] fArr = this.d0;
        elVar.a(this, fArr);
        io.C(fArr, this.e0);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long b = d01.b((Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (b >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (b & 4294967295L));
        this.h0 = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    public final boolean C() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void D(ar0 ar0Var) {
        if (!isLayoutRequested() && isAttachedToWindow()) {
            if (ar0Var != null) {
                while (ar0Var != null && ar0Var.s() == yq0.e) {
                    if (!this.V) {
                        ar0 v = ar0Var.v();
                        if (v == null) {
                            break;
                        }
                        long j = v.J.c.h;
                        if (us.f(j) && us.e(j)) {
                            break;
                        }
                    }
                    ar0Var = ar0Var.v();
                }
                if (ar0Var == getRoot()) {
                    requestLayout();
                    return;
                }
            }
            if (getWidth() != 0 && getHeight() != 0) {
                invalidate();
            } else {
                requestLayout();
            }
        }
    }

    public final long E(long j) {
        A();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.h0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.h0 & 4294967295L));
        return d01.b((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), this.e0);
    }

    public final int F(MotionEvent motionEvent) {
        Object obj;
        if (this.I0) {
            this.I0 = false;
            int metaState = motionEvent.getMetaState();
            this.t.getClass();
            ph2.a.setValue(new vh1(metaState));
        }
        o21 o21Var = this.K;
        sl0 c = o21Var.c(this, motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        xm xmVar = this.L;
        if (c != null) {
            List list = (List) c.e;
            int size = list.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    obj = list.get(size);
                    if (((sh1) obj).e && (actionMasked == 0 || actionMasked == 5)) {
                        break;
                    }
                    if (i < 0) {
                        break;
                    }
                    size = i;
                }
            }
            obj = null;
            sh1 sh1Var = (sh1) obj;
            if (sh1Var != null) {
                this.e = sh1Var.d;
            }
            int a = xmVar.a(c, this, p(motionEvent));
            c.f = null;
            if ((actionMasked != 0 && actionMasked != 5) || (a & 1) != 0) {
                return a;
            }
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            o21Var.c.delete(pointerId);
            o21Var.b.delete(pointerId);
            return a;
        }
        if (!xmVar.a) {
            py0 py0Var = (py0) ((rg2) xmVar.d).f;
            int i2 = py0Var.h;
            Object[] objArr = py0Var.g;
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = null;
            }
            py0Var.h = 0;
            py0Var.e = false;
            ((zg0) xmVar.c).c();
        }
        return 0;
    }

    public final void G(MotionEvent motionEvent, int i, long j, boolean z) {
        int i2;
        int buttonState;
        long downTime;
        int i3;
        int actionMasked = motionEvent.getActionMasked();
        int i4 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i4 = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            i4 = 0;
        }
        int pointerCount = motionEvent.getPointerCount();
        if (i4 >= 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i5 = pointerCount - i2;
        if (i5 == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            pointerPropertiesArr[i6] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[i5];
        for (int i7 = 0; i7 < i5; i7++) {
            pointerCoordsArr[i7] = new MotionEvent.PointerCoords();
        }
        for (int i8 = 0; i8 < i5; i8++) {
            if (i4 >= 0 && i8 >= i4) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            int i9 = i3 + i8;
            motionEvent.getPointerProperties(i9, pointerPropertiesArr[i8]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i8];
            motionEvent.getPointerCoords(i9, pointerCoords);
            float f = pointerCoords.x;
            float f2 = pointerCoords.y;
            long s = s((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (s >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (s & 4294967295L));
        }
        if (z) {
            buttonState = 0;
        } else {
            buttonState = motionEvent.getButtonState();
        }
        if (motionEvent.getDownTime() == motionEvent.getEventTime()) {
            downTime = j;
        } else {
            downTime = motionEvent.getDownTime();
        }
        MotionEvent obtain = MotionEvent.obtain(downTime, j, i, i5, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), buttonState, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        sl0 c = this.K.c(this, obtain);
        c.getClass();
        this.L.a(c, this, true);
        obtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(defpackage.se0 r8, defpackage.wt r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.p5
            if (r0 == 0) goto L13
            r0 = r9
            p5 r0 = (defpackage.p5) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            p5 r0 = new p5
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.e
            int r1 = r0.g
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r7)
            return
        L27:
            defpackage.io.K(r9)
            goto L4b
        L2b:
            defpackage.io.K(r9)
            r9 = r2
            j5 r2 = new j5
            r1 = 2
            r2.<init>(r7, r1)
            r0.g = r9
            a8 r1 = new a8
            r5 = 0
            r6 = 13
            java.util.concurrent.atomic.AtomicReference r3 = r7.n0
            r4 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r7 = defpackage.fp.u(r1, r0)
            hv r8 = defpackage.hv.e
            if (r7 != r8) goto L4b
            return
        L4b:
            defpackage.se.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q5.H(se0, wt):void");
    }

    public final void I(Configuration configuration) {
        int i;
        je1 je1Var;
        Configuration configuration2 = getConfiguration();
        if (!sn0.r(configuration2, configuration)) {
            setConfiguration(new Configuration(configuration));
            if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
                setDensity(rx.d(getContext()));
            }
            if ((configuration2.diff(configuration) & (-1342235264)) != 0 && (je1Var = this.t.b) != null) {
                je1Var.setValue(sn0.v(this));
            }
            int i2 = Build.VERSION.SDK_INT;
            int i3 = 0;
            if (i2 >= 31) {
                i = configuration2.fontWeightAdjustment;
            } else {
                i = 0;
            }
            if (i2 >= 31) {
                i3 = configuration.fontWeightAdjustment;
            }
            if (i != i3) {
                setFontFamilyResolver(fp.v(getContext()));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J() {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q5.J():void");
    }

    public final void K(float f) {
        if (this.p) {
            if (f > 0.0f) {
                if (Float.isNaN(this.A0) || f > this.A0) {
                    this.A0 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.B0) || f < this.B0) {
                    this.B0 = f;
                }
            }
        }
    }

    @Override // defpackage.ic0
    public final void a(tc0 tc0Var, tc0 tc0Var2) {
        boolean z;
        a81 a81Var;
        a81 a81Var2;
        if (tc0Var != null) {
            tc0 tc0Var3 = tc0Var;
            if (!tc0Var3.e.r) {
                kl0.b("visitAncestors called on an unattached node");
            }
            d21 d21Var = tc0Var3.e;
            ar0 M = hp.M(tc0Var);
            LinkedHashSet linkedHashSet = null;
            ArrayList arrayList = null;
            while (M != null) {
                if ((M.J.f.h & 2097152) != 0) {
                    while (d21Var != null) {
                        if ((d21Var.g & 2097152) != 0) {
                            d21 d21Var2 = d21Var;
                            q41 q41Var = null;
                            while (d21Var2 != null) {
                                if (d21Var2 instanceof ok0) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(d21Var2);
                                } else if ((d21Var2.g & 2097152) != 0 && (d21Var2 instanceof rz)) {
                                    int i = 0;
                                    for (d21 d21Var3 = ((rz) d21Var2).t; d21Var3 != null; d21Var3 = d21Var3.j) {
                                        if ((d21Var3.g & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                d21Var2 = d21Var3;
                                            } else {
                                                if (q41Var == null) {
                                                    q41Var = new q41(new d21[16]);
                                                }
                                                if (d21Var2 != null) {
                                                    q41Var.b(d21Var2);
                                                    d21Var2 = null;
                                                }
                                                q41Var.b(d21Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                d21Var2 = hp.l(q41Var);
                            }
                        }
                        d21Var = d21Var.i;
                    }
                }
                M = M.v();
                if (M != null && (a81Var2 = M.J) != null) {
                    d21Var = a81Var2.e;
                } else {
                    d21Var = null;
                }
            }
            if (arrayList != null) {
                if (tc0Var2 != null) {
                    if (!tc0Var2.e.r) {
                        kl0.b("visitAncestors called on an unattached node");
                    }
                    d21 d21Var4 = tc0Var2.e;
                    ar0 M2 = hp.M(tc0Var2);
                    LinkedHashSet linkedHashSet2 = null;
                    while (M2 != null) {
                        if ((M2.J.f.h & 2097152) != 0) {
                            while (d21Var4 != null) {
                                if ((d21Var4.g & 2097152) != 0) {
                                    d21 d21Var5 = d21Var4;
                                    q41 q41Var2 = null;
                                    while (d21Var5 != null) {
                                        if (d21Var5 instanceof ok0) {
                                            if (linkedHashSet2 == null) {
                                                linkedHashSet2 = new LinkedHashSet();
                                            }
                                            linkedHashSet2.add(d21Var5);
                                        } else if ((d21Var5.g & 2097152) != 0 && (d21Var5 instanceof rz)) {
                                            int i2 = 0;
                                            for (d21 d21Var6 = ((rz) d21Var5).t; d21Var6 != null; d21Var6 = d21Var6.j) {
                                                if ((d21Var6.g & 2097152) != 0) {
                                                    i2++;
                                                    if (i2 == 1) {
                                                        d21Var5 = d21Var6;
                                                    } else {
                                                        if (q41Var2 == null) {
                                                            q41Var2 = new q41(new d21[16]);
                                                        }
                                                        if (d21Var5 != null) {
                                                            q41Var2.b(d21Var5);
                                                            d21Var5 = null;
                                                        }
                                                        q41Var2.b(d21Var6);
                                                    }
                                                }
                                            }
                                            if (i2 == 1) {
                                            }
                                        }
                                        d21Var5 = hp.l(q41Var2);
                                    }
                                }
                                d21Var4 = d21Var4.i;
                            }
                        }
                        M2 = M2.v();
                        if (M2 != null && (a81Var = M2.J) != null) {
                            d21Var4 = a81Var.e;
                        } else {
                            d21Var4 = null;
                        }
                    }
                    linkedHashSet = linkedHashSet2;
                }
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ok0 ok0Var = (ok0) arrayList.get(i3);
                    if (linkedHashSet != null) {
                        z = linkedHashSet.contains(ok0Var);
                    } else {
                        z = false;
                    }
                    if (!z) {
                        ok0Var.Y();
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        tc0 tc0Var = ((mc0) getFocusOwner()).c;
        if (tc0Var.r) {
            if (!tc0Var.e.r) {
                kl0.b("visitSubtreeIf called on an unattached node");
            }
            q41 q41Var = new q41(new d21[16]);
            d21 d21Var = tc0Var.e;
            d21 d21Var2 = d21Var.j;
            if (d21Var2 == null) {
                hp.i(q41Var, d21Var);
            } else {
                q41Var.b(d21Var2);
            }
            while (true) {
                int i3 = q41Var.g;
                if (i3 != 0) {
                    d21 d21Var3 = (d21) q41Var.k(i3 - 1);
                    if ((d21Var3.h & 1024) != 0) {
                        for (d21 d21Var4 = d21Var3; d21Var4 != null && d21Var4.r; d21Var4 = d21Var4.j) {
                            if ((d21Var4.g & 1024) != 0) {
                                d21 d21Var5 = d21Var4;
                                q41 q41Var2 = null;
                                while (d21Var5 != null) {
                                    int i4 = 0;
                                    if (d21Var5 instanceof tc0) {
                                        tc0 tc0Var2 = (tc0) d21Var5;
                                        if (tc0Var2.r && tc0Var2.N0().a) {
                                            super.addFocusables(arrayList, i, i2);
                                            tc0 tc0Var3 = ((mc0) getFocusOwner()).c;
                                            if (tc0Var3.r) {
                                                if (!tc0Var3.e.r) {
                                                    kl0.b("visitSubtreeIf called on an unattached node");
                                                }
                                                q41 q41Var3 = new q41(new d21[16]);
                                                d21 d21Var6 = tc0Var3.e;
                                                d21 d21Var7 = d21Var6.j;
                                                if (d21Var7 == null) {
                                                    hp.i(q41Var3, d21Var6);
                                                } else {
                                                    q41Var3.b(d21Var7);
                                                }
                                                while (true) {
                                                    int i5 = q41Var3.g;
                                                    if (i5 == 0) {
                                                        break;
                                                    }
                                                    d21 d21Var8 = (d21) q41Var3.k(i5 - 1);
                                                    if ((d21Var8.h & 1024) != 0) {
                                                        for (d21 d21Var9 = d21Var8; d21Var9 != null && d21Var9.r; d21Var9 = d21Var9.j) {
                                                            if ((d21Var9.g & 1024) != 0) {
                                                                d21 d21Var10 = d21Var9;
                                                                q41 q41Var4 = null;
                                                                while (d21Var10 != null) {
                                                                    if (d21Var10 instanceof tc0) {
                                                                        tc0 tc0Var4 = (tc0) d21Var10;
                                                                        if (tc0Var4.r) {
                                                                            nc0 N02 = tc0Var4.N0();
                                                                            if (tc0Var4.r && N02.a) {
                                                                                return;
                                                                            }
                                                                        }
                                                                    } else if ((d21Var10.g & 1024) != 0 && (d21Var10 instanceof rz)) {
                                                                        int i6 = 0;
                                                                        for (d21 d21Var11 = ((rz) d21Var10).t; d21Var11 != null; d21Var11 = d21Var11.j) {
                                                                            if ((d21Var11.g & 1024) != 0) {
                                                                                i6++;
                                                                                if (i6 == 1) {
                                                                                    d21Var10 = d21Var11;
                                                                                } else {
                                                                                    if (q41Var4 == null) {
                                                                                        q41Var4 = new q41(new d21[16]);
                                                                                    }
                                                                                    if (d21Var10 != null) {
                                                                                        q41Var4.b(d21Var10);
                                                                                        d21Var10 = null;
                                                                                    }
                                                                                    q41Var4.b(d21Var11);
                                                                                }
                                                                            }
                                                                        }
                                                                        if (i6 == 1) {
                                                                        }
                                                                    }
                                                                    d21Var10 = hp.l(q41Var4);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    hp.i(q41Var3, d21Var8);
                                                }
                                            }
                                            if (arrayList != null) {
                                                arrayList.remove(this);
                                                return;
                                            }
                                            return;
                                        }
                                    } else if ((d21Var5.g & 1024) != 0 && (d21Var5 instanceof rz)) {
                                        for (d21 d21Var12 = ((rz) d21Var5).t; d21Var12 != null; d21Var12 = d21Var12.j) {
                                            if ((d21Var12.g & 1024) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    d21Var5 = d21Var12;
                                                } else {
                                                    if (q41Var2 == null) {
                                                        q41Var2 = new q41(new d21[16]);
                                                    }
                                                    if (d21Var5 != null) {
                                                        q41Var2.b(d21Var5);
                                                        d21Var5 = null;
                                                    }
                                                    q41Var2.b(d21Var12);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    d21Var5 = hp.l(q41Var2);
                                }
                            }
                        }
                    }
                    hp.i(q41Var, d21Var3);
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        mu1 x;
        oe0 oe0Var;
        oe0 oe0Var2;
        t4 t4Var = this.O;
        if (t4Var != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(keyAt);
                ar0 ar0Var = (ar0) t4Var.f.c.b(keyAt);
                if (ar0Var != null && (x = ar0Var.x()) != null) {
                    i41 i41Var = x.e;
                    Object g = i41Var.g(lu1.g);
                    Object obj = null;
                    if (g == null) {
                        g = null;
                    }
                    s0 s0Var = (s0) g;
                    if (s0Var != null && (oe0Var2 = (oe0) s0Var.b) != null) {
                    }
                    Object g2 = i41Var.g(lu1.h);
                    if (g2 != null) {
                        obj = g2;
                    }
                    s0 s0Var2 = (s0) obj;
                    if (s0Var2 != null && (oe0Var = (oe0) s0Var2.b) != null) {
                    }
                }
            }
        }
        q4 q4Var = this.N;
        if (q4Var != null) {
            hg hgVar = (hg) q4Var.g;
            if (!hgVar.a.isEmpty()) {
                int size2 = sparseArray.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    int keyAt2 = sparseArray.keyAt(i2);
                    AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(keyAt2);
                    if (autofillValue2.isText()) {
                        autofillValue2.getTextValue().toString();
                        if (hgVar.a.get(Integer.valueOf(keyAt2)) != null) {
                            se.s();
                            return;
                        }
                    } else if (!autofillValue2.isDate()) {
                        if (!autofillValue2.isList()) {
                            if (autofillValue2.isToggle()) {
                                throw new Error("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                            }
                        } else {
                            throw new Error("An operation is not implemented: b/138604541: Add onFill() callback for list");
                        }
                    } else {
                        throw new Error("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                }
            }
        }
    }

    @Override // defpackage.qy
    public final void b(uu0 uu0Var) {
        yu0 yu0Var = this.j;
        if (yu0Var != null) {
            jz0 jz0Var = (jz0) yu0Var.a.f;
            if (jz0Var.e && !jz0Var.g) {
                ql qlVar = yu0Var.d;
                if (qlVar != null) {
                    qlVar.cancel();
                }
                yu0Var.d = null;
                return;
            }
            if (!jz0Var.f) {
                if (!jz0Var.g) {
                    fi1.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
                }
                if (!jz0Var.h.i()) {
                    fi1.a("Attempted to start retaining exited values with pending exited values");
                }
                jz0Var.g = false;
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.C.e(i, this.e, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.C.e(i, this.e, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            m(getRoot());
        }
        t(true);
        q02.j().m();
        this.J = true;
        rg2 rg2Var = this.u;
        u4 u4Var = (u4) rg2Var.f;
        Canvas canvas2 = u4Var.a;
        u4Var.a = canvas;
        getRoot().i(u4Var, null);
        ((u4) rg2Var.f).a = canvas2;
        b41 b41Var = this.H;
        if (b41Var.i()) {
            int i = b41Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((vf0) ((ic1) b41Var.f(i2))).g();
            }
        }
        int i3 = jg2.e;
        b41Var.d();
        this.J = false;
        b41 b41Var2 = this.I;
        if (b41Var2 != null) {
            b41Var.b(b41Var2);
            b41Var2.d();
        }
        if (this.p) {
            bd.a(this, this.A0);
            View view = this.o;
            if (view != null) {
                bd.a(view, this.B0);
                if (!Float.isNaN(this.B0)) {
                    view.invalidate();
                    drawChild(canvas, view, getDrawingTime());
                }
                this.A0 = Float.NaN;
                this.B0 = Float.NaN;
            } else {
                sn0.V("frameRateCategoryView");
                throw null;
            }
        }
        getRectManager().a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:650:0x044a, code lost:
    
        if ((r2 / r3) >= 5.0f) goto L252;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [d21] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v17, types: [n52] */
    /* JADX WARN: Type inference failed for: r0v32, types: [d21] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v40, types: [n52] */
    /* JADX WARN: Type inference failed for: r2v45, types: [d21] */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v50, types: [n52] */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v79 */
    /* JADX WARN: Type inference failed for: r2v81, types: [n52] */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r39v0 */
    /* JADX WARN: Type inference failed for: r39v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r39v2 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30, types: [ok0, qz] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43, types: [d21] */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v7, types: [u7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v29, types: [q41] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33, types: [q41] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36, types: [ok0, qz] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50, types: [d21] */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r4v71 */
    /* JADX WARN: Type inference failed for: r4v72 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33, types: [d21, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35, types: [d21] */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v60, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v61, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v66, types: [q41] */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARN: Type inference failed for: r5v70, types: [q41] */
    /* JADX WARN: Type inference failed for: r5v84 */
    /* JADX WARN: Type inference failed for: r5v85 */
    /* JADX WARN: Type inference failed for: r5v86 */
    /* JADX WARN: Type inference failed for: r5v87 */
    /* JADX WARN: Type inference failed for: r5v88 */
    /* JADX WARN: Type inference failed for: r5v89 */
    /* JADX WARN: Type inference failed for: r5v90 */
    /* JADX WARN: Type inference failed for: r5v91 */
    /* JADX WARN: Type inference failed for: r5v92 */
    /* JADX WARN: Type inference failed for: r5v93 */
    /* JADX WARN: Type inference failed for: r5v94 */
    /* JADX WARN: Type inference failed for: r5v95 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [q41] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [q41] */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36, types: [d21, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38, types: [d21] */
    /* JADX WARN: Type inference failed for: r6v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v65 */
    /* JADX WARN: Type inference failed for: r6v66 */
    /* JADX WARN: Type inference failed for: r6v67 */
    /* JADX WARN: Type inference failed for: r6v68 */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r6v70 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22, types: [q41] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25, types: [q41] */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r44) {
        /*
            Method dump skipped, instructions count: 2009
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q5.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0154, code lost:
    
        if (q(r24) == false) goto L71;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q5.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 0;
        if (isFocused()) {
            int metaState = keyEvent.getMetaState();
            this.t.getClass();
            ph2.a.setValue(new vh1(metaState));
            if (!((mc0) getFocusOwner()).d(keyEvent, hs.k) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }
        return ((mc0) getFocusOwner()).d(keyEvent, new f5(i, this, keyEvent));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        a81 a81Var;
        if (isFocused()) {
            mc0 mc0Var = (mc0) getFocusOwner();
            if (mc0Var.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                tc0 w = lo.w(mc0Var.c);
                if (w != null) {
                    if (!w.e.r) {
                        kl0.b("visitAncestors called on an unattached node");
                    }
                    d21 d21Var = w.e;
                    ar0 M = hp.M(w);
                    while (M != null) {
                        if ((M.J.f.h & 131072) != 0) {
                            while (d21Var != null) {
                                if ((d21Var.g & 131072) != 0) {
                                    d21 d21Var2 = d21Var;
                                    q41 q41Var = null;
                                    while (d21Var2 != null) {
                                        if ((d21Var2.g & 131072) != 0 && (d21Var2 instanceof rz)) {
                                            int i = 0;
                                            for (d21 d21Var3 = ((rz) d21Var2).t; d21Var3 != null; d21Var3 = d21Var3.j) {
                                                if ((d21Var3.g & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        d21Var2 = d21Var3;
                                                    } else {
                                                        if (q41Var == null) {
                                                            q41Var = new q41(new d21[16]);
                                                        }
                                                        if (d21Var2 != null) {
                                                            q41Var.b(d21Var2);
                                                            d21Var2 = null;
                                                        }
                                                        q41Var.b(d21Var3);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        d21Var2 = hp.l(q41Var);
                                    }
                                }
                                d21Var = d21Var.i;
                            }
                        }
                        M = M.v();
                        if (M != null && (a81Var = M.J) != null) {
                            d21Var = a81Var.e;
                        } else {
                            d21Var = null;
                        }
                    }
                }
            }
        }
        if (!super.dispatchKeyEventPreIme(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        View view;
        Object bgVar;
        tc0 f;
        if (this.E0) {
            z4 z4Var = this.D0;
            removeCallbacks(z4Var);
            MotionEvent motionEvent2 = this.w0;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.E0 = false;
            } else {
                z4Var.run();
            }
        }
        if (!o(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || q(motionEvent))) {
            int l = l(motionEvent);
            if ((l & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                z = false;
            } else {
                z = true;
            }
            if (!motionEvent.isFromSource(8194) && !motionEvent.isFromSource(1048584)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z && z2) {
                Object parent = getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
                if (view == null || (bgVar = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    bgVar = new bg(1);
                }
                if (bgVar.equals(new bg(1)) && (f = ((mc0) getFocusOwner()).f()) != null) {
                    e81 L = hp.L(f);
                    if (!qo.D(L).O(L, true).a((Float.floatToRawIntBits(motionEvent.getX()) << 32) | (Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L))) {
                        ((mc0) getFocusOwner()).b(8, false, true);
                    }
                }
            }
            if ((l & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (invoke instanceof View) {
                return (View) invoke;
            }
        } catch (NoSuchMethodException unused) {
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, wl1] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        int i2;
        if (view != null && !this.W.c) {
            View rootView = getRootView();
            rootView.getClass();
            View findNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
            pl1 pl1Var = null;
            if (findNextFocus != null && !findNextFocus.equals(this)) {
                for (ViewParent parent = findNextFocus.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent == this) {
                        break;
                    }
                }
            }
            findNextFocus = null;
            if (view == this) {
                tc0 w = lo.w(((mc0) getFocusOwner()).c);
                if (w != null) {
                    pl1Var = lo.y(w);
                }
                if (pl1Var == null) {
                    pl1Var = gc0.a(view, this);
                }
            } else {
                pl1Var = gc0.a(view, this);
            }
            ac0 b = gc0.b(i);
            if (b != null) {
                i2 = b.a;
            } else {
                i2 = 6;
            }
            ?? obj = new Object();
            if (((mc0) getFocusOwner()).e(i2, pl1Var, new h5(obj, 0)) == null) {
                return view;
            }
            Object obj2 = obj.e;
            if (obj2 == null) {
                if (findNextFocus == null) {
                    return super.focusSearch(view, i);
                }
            } else if (findNextFocus == null || i2 == 1 || i2 == 2 || pp1.x(lo.y((tc0) obj2), gc0.a(findNextFocus, this), pl1Var, i2)) {
                return this;
            }
            return findNextFocus;
        }
        return super.focusSearch(view, i);
    }

    public final oa getAndroidViewsHandler$ui() {
        if (this.T == null) {
            oa oaVar = new oa(getContext());
            this.T = oaVar;
            addView(oaVar, -1);
            requestLayout();
        }
        oa oaVar2 = this.T;
        oaVar2.getClass();
        return oaVar2;
    }

    public cg getAutofill() {
        return this.N;
    }

    public gg getAutofillManager() {
        return this.O;
    }

    public hg getAutofillTree() {
        return this.G;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.M.getValue();
    }

    public final p6 getContentCaptureManager$ui() {
        return this.D;
    }

    public xu getCoroutineContext() {
        return this.r;
    }

    public c00 getDensity() {
        return (c00) this.n.getValue();
    }

    public pl1 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            tc0 w = lo.w(((mc0) getFocusOwner()).c);
            if (w == null) {
                return null;
            }
            return lo.y(w);
        }
        View findFocus = findFocus();
        if (findFocus == null) {
            return null;
        }
        return gc0.a(findFocus, this);
    }

    public jc0 getFocusOwner() {
        return this.q;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        pl1 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (!sn0.r(((mc0) getFocusOwner()).e(6, null, i5.f), Boolean.TRUE)) {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        } else {
            super.getFocusedRect(rect);
        }
    }

    public cd0 getFontFamilyResolver() {
        return (cd0) this.q0.getValue();
    }

    public bd0 getFontLoader() {
        return this.p0;
    }

    public final xu0 getFrameEndScheduler$ui() {
        return this.i;
    }

    public sf0 getGraphicsContext() {
        return this.F;
    }

    public rg0 getHapticFeedBack() {
        return this.s0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        if (!this.W.b.m() && this.l.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public vl0 getInputModeManager() {
        return this.t0;
    }

    public final bm0 getInsetsListener() {
        return this.w;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.f0;
    }

    @Override // android.view.View, android.view.ViewParent
    public jq0 getLayoutDirection() {
        return (jq0) this.r0.getValue();
    }

    public long getMeasureIteration() {
        g01 g01Var = this.W;
        if (!g01Var.c) {
            kl0.a("measureIteration should be only used during the measure/layout pass");
        }
        return g01Var.g;
    }

    public f21 getModifierLocalManager() {
        return this.u0;
    }

    /* renamed from: getOutOfFrameExecutor, reason: merged with bridge method [inline-methods] */
    public q5 m295getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public hg1 getPlacementScope() {
        int i = jg1.b;
        return new uy0(this, 1);
    }

    public ph1 getPointerIconService() {
        return this.L0;
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final ek0 m288getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.g;
    }

    public rl1 getRectManager() {
        return this.z;
    }

    public ho1 getRetainedValuesStore() {
        return this.k;
    }

    public ar0 getRoot() {
        return this.x;
    }

    public cp1 getRootForTest() {
        return this.A;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        rg2 rg2Var;
        if (Build.VERSION.SDK_INT >= 31 && (rg2Var = this.J0) != null) {
            return ((Boolean) ((je1) rg2Var.f).getValue()).booleanValue();
        }
        return false;
    }

    public uu1 getSemanticsOwner() {
        return this.B;
    }

    public cr0 getSharedDrawScope() {
        return this.h;
    }

    public boolean getShowLayoutBounds() {
        return wc.a.a(this);
    }

    public lc1 getSnapshotObserver() {
        return this.S;
    }

    public f12 getSoftwareKeyboardController() {
        return this.o0;
    }

    public n82 getTextInputService() {
        return this.m0;
    }

    public l92 getTextToolbar() {
        return this.v0;
    }

    public final bp1 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public hg2 getViewConfiguration() {
        return this.v;
    }

    public final d5 getViewTreeOwners() {
        return (d5) this.j0.getValue();
    }

    public oh2 getWindowInfo() {
        return this.t;
    }

    public final t4 get_autofillManager$ui() {
        return this.O;
    }

    @Override // defpackage.qy
    public final void i(uu0 uu0Var) {
        ql qlVar;
        yu0 yu0Var = this.j;
        if (yu0Var != null) {
            xu0 xu0Var = this.i;
            xu0Var.getClass();
            rg2 rg2Var = yu0Var.a;
            jz0 jz0Var = (jz0) rg2Var.f;
            if (jz0Var.e && !jz0Var.g) {
                try {
                    qlVar = ((sj2) xu0Var).a.s(new s8(yu0Var, 7));
                } catch (CancellationException unused) {
                    jz0 jz0Var2 = (jz0) rg2Var.f;
                    if (!jz0Var2.f) {
                        if (jz0Var2.g) {
                            fi1.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                        }
                        jz0Var2.a();
                        jz0Var2.g = true;
                    }
                    qlVar = null;
                }
                ql qlVar2 = yu0Var.d;
                if (qlVar2 != null) {
                    qlVar2.cancel();
                }
                yu0Var.d = qlVar;
            }
        }
    }

    public final void k(ar0 ar0Var, boolean z) {
        this.W.f(ar0Var, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cc A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dd A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0136 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014e A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0160 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0163 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x004e A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:90:0x0034, B:92:0x003e, B:97:0x004e, B:100:0x007d, B:102:0x0081, B:104:0x0090, B:106:0x0096, B:13:0x00a1, B:21:0x00b4, B:23:0x00ba, B:107:0x0056, B:113:0x0062, B:116:0x006a), top: B:89:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q5.l(android.view.MotionEvent):int");
    }

    public final void n(ar0 ar0Var) {
        this.W.p(ar0Var, false);
        q41 z = ar0Var.z();
        Object[] objArr = z.e;
        int i = z.g;
        for (int i2 = 0; i2 < i; i2++) {
            n((ar0) objArr[i2]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [a5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, pg2] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ho1 ho1Var;
        wu0 g;
        Object obj;
        Method method;
        super.onAttachedToWindow();
        this.w.onViewAttachedToWindow(this);
        wu0 wu0Var = null;
        int i = 0;
        int i2 = 1;
        if (P0 == null) {
            ?? obj2 = new Object();
            P0 = obj2;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            try {
                if (M0 == null) {
                    M0 = Class.forName("android.os.SystemProperties");
                }
                if (N0 == null) {
                    StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                    Class cls = M0;
                    if (cls != null) {
                        method = cls.getDeclaredMethod("addChangeCallback", Runnable.class);
                    } else {
                        method = null;
                    }
                    N0 = method;
                }
                Method method2 = N0;
                if (method2 != null) {
                    method2.invoke(null, obj2);
                }
            } catch (Throwable unused) {
            }
            StrictMode.setVmPolicy(vmPolicy);
        }
        b41 b41Var = O0;
        synchronized (b41Var) {
            b41Var.a(this);
        }
        this.t.c.setValue(Boolean.valueOf(hasWindowFocus()));
        zt0 zt0Var = this.t;
        k5 k5Var = new k5(this, i);
        je1 je1Var = zt0Var.b;
        if (je1Var == null) {
            zt0Var.a = k5Var;
        }
        if (je1Var != null) {
            je1Var.setValue(sn0.v(this));
        }
        n(getRoot());
        m(getRoot());
        getSnapshotObserver().a.d();
        q4 q4Var = this.N;
        if (q4Var != null) {
            dg dgVar = dg.a;
            dgVar.getClass();
            ((AutofillManager) q4Var.h).registerCallback(dgVar);
        }
        uu0 d = nq1.d(this);
        cr1 k = xq1.k(this);
        tg2 o = yq1.o(this);
        xu0 xu0Var = this.i;
        if (d != null && o != null && xu0Var != null) {
            sg2 e = o.e();
            ?? obj3 = new Object();
            mv mvVar = mv.b;
            mvVar.getClass();
            q4 q4Var2 = new q4(e, obj3, mvVar);
            cn a = yl1.a(zu0.class);
            String c = a.c();
            if (c != null) {
                zu0 zu0Var = (zu0) q4Var2.n(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(c));
                Object parent = getParent();
                parent.getClass();
                int id = ((View) parent).getId();
                p31 p31Var = zu0Var.b;
                Object b = p31Var.b(id);
                if (b == null) {
                    b = new b41(1);
                    p31Var.i(id, b);
                }
                b41 b41Var2 = (b41) b;
                Object[] objArr = b41Var2.a;
                int i3 = b41Var2.b;
                while (true) {
                    if (i < i3) {
                        obj = objArr[i];
                        if (!((yu0) obj).c) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                yu0 yu0Var = (yu0) obj;
                if (yu0Var == null) {
                    yu0Var = new yu0();
                    b41Var2.a(yu0Var);
                }
                yu0Var.c = true;
                this.j = yu0Var;
                ho1Var = yu0Var.b;
            } else {
                se.h("Local and anonymous classes can not be ViewModels");
                return;
            }
        } else {
            ho1Var = null;
        }
        if (ho1Var == null) {
            ho1Var = g3.M;
        }
        this.k = ho1Var;
        d5 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (d != null && k != null && (d != viewTreeOwners.a || k != viewTreeOwners.b || o != viewTreeOwners.c))) {
            if (d != null) {
                if (k != null) {
                    if (viewTreeOwners != null && (g = viewTreeOwners.a.g()) != null) {
                        g.f(this);
                    }
                    d.g().a(this);
                    d5 d5Var = new d5(d, k, o);
                    set_viewTreeOwners(d5Var);
                    oe0 oe0Var = this.k0;
                    if (oe0Var != null) {
                        oe0Var.invoke(d5Var);
                    }
                    this.k0 = null;
                } else {
                    se.p("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                    return;
                }
            } else {
                se.p("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return;
            }
        }
        wl0 wl0Var = this.t0;
        if (!isInTouchMode()) {
            i2 = 2;
        }
        wl0Var.a.setValue(new ul0(i2));
        d5 viewTreeOwners2 = getViewTreeOwners();
        if (viewTreeOwners2 != null) {
            wu0Var = viewTreeOwners2.a.g();
        }
        if (wu0Var != null) {
            wu0Var.a(this);
            wu0Var.a(this.D);
            getViewTreeObserver().addOnGlobalLayoutListener(this);
            getViewTreeObserver().addOnScrollChangedListener(this);
            getViewTreeObserver().addOnTouchModeChangeListener(this);
            if (Build.VERSION.SDK_INT >= 31) {
                a6.a.b(this);
            }
            t4 t4Var = this.O;
            if (t4Var != null) {
                ((mc0) getFocusOwner()).g.a(t4Var);
                getSemanticsOwner().d.a(t4Var);
            }
            ((mc0) getFocusOwner()).g.a(this);
            return;
        }
        throw l90.f("No lifecycle owner exists");
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        Object obj;
        pv1 pv1Var = (pv1) this.n0.get();
        Object obj2 = null;
        if (pv1Var != null) {
            obj = pv1Var.b;
        } else {
            obj = null;
        }
        t8 t8Var = (t8) obj;
        if (t8Var == null) {
            return this.l0.d;
        }
        pv1 pv1Var2 = (pv1) t8Var.h.get();
        if (pv1Var2 != null) {
            obj2 = pv1Var2.b;
        }
        if (((tl0) obj2) != null && (!r1.e)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        I(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r18) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q5.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        ru1 ru1Var;
        TranslationRequestValue forText;
        ViewTranslationRequest build;
        p6 p6Var = this.D;
        p6Var.getClass();
        for (long j : jArr) {
            tu1 tu1Var = (tu1) p6Var.f().b((int) j);
            if (tu1Var != null && (ru1Var = tu1Var.a) != null) {
                y4.q();
                ViewTranslationRequest.Builder l = y4.l(p6Var.e.getAutofillId(), ru1Var.g);
                Object g = ru1Var.d.e.g(vu1.B);
                if (g == null) {
                    g = null;
                }
                List list = (List) g;
                if (list != null) {
                    forText = TranslationRequestValue.forText(new rc(iw0.a(list, "\n", null, 62)));
                    l.setValue("android:text", forText);
                    build = l.build();
                    consumer.accept(build);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        wu0 wu0Var;
        super.onDetachedFromWindow();
        this.w.onViewDetachedFromWindow(this);
        if (this.p) {
            View view = this.o;
            if (view != null) {
                removeView(view);
            } else {
                sn0.V("frameRateCategoryView");
                throw null;
            }
        }
        b41 b41Var = O0;
        synchronized (b41Var) {
            b41Var.j(this);
        }
        c12 c12Var = getSnapshotObserver().a;
        l2 l2Var = c12Var.h;
        if (l2Var != null) {
            l2Var.c();
        }
        c12Var.a();
        zt0 zt0Var = this.t;
        if (zt0Var.b == null) {
            zt0Var.a = null;
        }
        d5 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            wu0Var = viewTreeOwners.a.g();
        } else {
            wu0Var = null;
        }
        if (wu0Var != null) {
            wu0Var.f(this.D);
            wu0Var.f(this);
            q4 q4Var = this.N;
            if (q4Var != null) {
                dg dgVar = dg.a;
                dgVar.getClass();
                ((AutofillManager) q4Var.h).unregisterCallback(dgVar);
            }
            getViewTreeObserver().removeOnGlobalLayoutListener(this);
            getViewTreeObserver().removeOnScrollChangedListener(this);
            getViewTreeObserver().removeOnTouchModeChangeListener(this);
            yu0 yu0Var = this.j;
            if (yu0Var != null) {
                yu0Var.c = false;
            }
            this.j = null;
            if (Build.VERSION.SDK_INT >= 31) {
                a6.a.a(this);
            }
            t4 t4Var = this.O;
            if (t4Var != null) {
                getSemanticsOwner().d.j(t4Var);
                ((mc0) getFocusOwner()).g.j(t4Var);
            }
            rl1 rectManager = getRectManager();
            n2 n2Var = rectManager.g;
            if (n2Var != null) {
                o2.a.removeCallbacks(n2Var);
                rectManager.g = null;
            }
            ((mc0) getFocusOwner()).g.j(this);
            return;
        }
        throw l90.f("No lifecycle owner exists");
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z && !hasFocus()) {
            mc0 mc0Var = (mc0) getFocusOwner();
            io.p(mc0Var.c, true);
            if (mc0Var.f() != null) {
                tc0 f = mc0Var.f();
                mc0Var.i(null);
                if (f != null) {
                    f.M0(sc0.e, sc0.g);
                }
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f0 = 0L;
        J();
        int i = Build.VERSION.SDK_INT;
        if (32 <= i && i < 34) {
            I(getResources().getConfiguration());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f0 = 0L;
        this.W.j(this.G0);
        this.U = null;
        J();
        if (this.T != null) {
            getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        g01 g01Var = this.W;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                n(getRoot());
            }
            long j = j(i);
            long j2 = j(i2);
            long A = go.A((int) (j >>> 32), (int) (j & 4294967295L), (int) (j2 >>> 32), (int) (4294967295L & j2));
            us usVar = this.U;
            if (usVar == null) {
                this.U = new us(A);
                this.V = false;
            } else if (!us.b(usVar.a, A)) {
                this.V = true;
            }
            g01Var.q(A);
            g01Var.l();
            setMeasuredDimension(getRoot().K.p.e, getRoot().K.p.f);
            if (this.T != null) {
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().K.p.e, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().K.p.f, 1073741824));
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (viewStructure != null) {
            t4 t4Var = this.O;
            if (t4Var != null) {
                ar0 ar0Var = t4Var.f.a;
                AutofillId autofillId = t4Var.k;
                String str = t4Var.i;
                rl1 rl1Var = t4Var.h;
                xn.I(viewStructure, ar0Var, autofillId, str, rl1Var);
                Object[] objArr = u81.a;
                b41 b41Var = new b41(2);
                b41Var.a(ar0Var);
                b41Var.a(viewStructure);
                while (b41Var.i()) {
                    Object k = b41Var.k(b41Var.b - 1);
                    k.getClass();
                    ViewStructure viewStructure2 = (ViewStructure) k;
                    Object k2 = b41Var.k(b41Var.b - 1);
                    k2.getClass();
                    z31 z31Var = (z31) ((ar0) k2).n();
                    int i2 = ((q41) z31Var.f).g;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ar0 ar0Var2 = (ar0) z31Var.get(i3);
                        if (!ar0Var2.S && ar0Var2.H() && ar0Var2.I()) {
                            mu1 x = ar0Var2.x();
                            if (x != null) {
                                i41 i41Var = x.e;
                                if (i41Var.b(lu1.g) || i41Var.b(lu1.h) || i41Var.b(vu1.q) || i41Var.b(vu1.r)) {
                                    ViewStructure newChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                    xn.I(newChild, ar0Var2, autofillId, str, rl1Var);
                                    b41Var.a(ar0Var2);
                                    b41Var.a(newChild);
                                }
                            }
                            b41Var.a(ar0Var2);
                            b41Var.a(viewStructure2);
                        }
                    }
                }
            }
            q4 q4Var = this.N;
            if (q4Var != null) {
                hg hgVar = (hg) q4Var.g;
                LinkedHashMap linkedHashMap = hgVar.a;
                LinkedHashMap linkedHashMap2 = hgVar.a;
                if (!linkedHashMap.isEmpty()) {
                    int addChildCount = viewStructure.addChildCount(linkedHashMap2.size());
                    Iterator it = linkedHashMap2.entrySet().iterator();
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        int intValue = ((Number) entry.getKey()).intValue();
                        if (entry.getValue() != null) {
                            se.s();
                            return;
                        }
                        ViewStructure newChild2 = viewStructure.newChild(addChildCount);
                        newChild2.setAutofillId((AutofillId) q4Var.i, intValue);
                        newChild2.setId(intValue, ((q5) q4Var.f).getContext().getPackageName(), null, null);
                        newChild2.setAutofillType(1);
                        throw null;
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        oh1 oh1Var;
        int toolType = motionEvent.getToolType(i);
        if (!motionEvent.isFromSource(8194) && motionEvent.isFromSource(16386) && ((toolType == 2 || toolType == 4) && (oh1Var = ((l5) getPointerIconService()).a) != null)) {
            Context context = getContext();
            if (oh1Var instanceof u8) {
                return PointerIcon.getSystemIcon(context, ((u8) oh1Var).b);
            }
            return PointerIcon.getSystemIcon(context, DescriptorProtos.Edition.EDITION_2023_VALUE);
        }
        return super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        jq0 jq0Var;
        if (this.f) {
            int[] iArr = gc0.a;
            jq0 jq0Var2 = jq0.e;
            if (i != 0) {
                if (i != 1) {
                    jq0Var = null;
                } else {
                    jq0Var = jq0.f;
                }
            } else {
                jq0Var = jq0Var2;
            }
            if (jq0Var != null) {
                jq0Var2 = jq0Var;
            }
            setLayoutDirection(jq0Var2);
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [q2, yr1] */
    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        rg2 rg2Var;
        Object obj;
        if (Build.VERSION.SDK_INT >= 31 && (rg2Var = this.J0) != null) {
            uu1 semanticsOwner = getSemanticsOwner();
            xu coroutineContext = getCoroutineContext();
            q41 q41Var = new q41(new zr1[16]);
            xp1.q(semanticsOwner.a(), 0, new q2(1, 8, q41.class, q41Var, "add", "add(Ljava/lang/Object;)Z"));
            Arrays.sort(q41Var.e, 0, q41Var.g, new gp(new oe0[]{x81.q, x81.r}, 0));
            int i = q41Var.g;
            if (i == 0) {
                obj = null;
            } else {
                obj = q41Var.e[i - 1];
            }
            zr1 zr1Var = (zr1) obj;
            if (zr1Var != null) {
                bn0 bn0Var = zr1Var.c;
                fr frVar = new fr(zr1Var.a, bn0Var, fp.b(coroutineContext), rg2Var, this);
                e81 e81Var = zr1Var.d;
                long j = (bn0Var.a << 32) | (bn0Var.b & 4294967295L);
                ScrollCaptureTarget f = y4.f(this, fp.W(hp.O(qo.D(e81Var).O(e81Var, true))), new Point((int) (j >> 32), (int) (j & 4294967295L)), frVar);
                f.setScrollBounds(fp.W(bn0Var));
                consumer.accept(f);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        J();
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        this.t0.a.setValue(new ul0(i));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        p6 p6Var = this.D;
        p6Var.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (sn0.r(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            d6.v(p6Var, longSparseArray);
        } else {
            p6Var.e.post(new n6(0, p6Var, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        this.t.c.setValue(Boolean.valueOf(z));
        this.I0 = true;
        super.onWindowFocusChanged(z);
    }

    public final boolean p(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (0.0f <= x && x <= getWidth() && 0.0f <= y && y <= getHeight()) {
            return true;
        }
        return false;
    }

    public final boolean q(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.w0) == null || motionEvent2.getPointerCount() != motionEvent.getPointerCount() || motionEvent.getRawX() != motionEvent2.getRawX() || motionEvent.getRawY() != motionEvent2.getRawY()) {
            return true;
        }
        return false;
    }

    public final void r(float[] fArr) {
        A();
        d01.h(fArr, this.d0);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.h0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.h0 & 4294967295L));
        float[] fArr2 = this.c0;
        d01.d(fArr2);
        d01.i(fArr2, intBitsToFloat, intBitsToFloat2);
        float w = d6.w(fArr2, 0, fArr, 0);
        float w2 = d6.w(fArr2, 0, fArr, 1);
        float w3 = d6.w(fArr2, 0, fArr, 2);
        float w4 = d6.w(fArr2, 0, fArr, 3);
        float w5 = d6.w(fArr2, 1, fArr, 0);
        float w6 = d6.w(fArr2, 1, fArr, 1);
        float w7 = d6.w(fArr2, 1, fArr, 2);
        float w8 = d6.w(fArr2, 1, fArr, 3);
        float w9 = d6.w(fArr2, 2, fArr, 0);
        float w10 = d6.w(fArr2, 2, fArr, 1);
        float w11 = d6.w(fArr2, 2, fArr, 2);
        float w12 = d6.w(fArr2, 2, fArr, 3);
        float w13 = d6.w(fArr2, 3, fArr, 0);
        float w14 = d6.w(fArr2, 3, fArr, 1);
        float w15 = d6.w(fArr2, 3, fArr, 2);
        float w16 = d6.w(fArr2, 3, fArr, 3);
        fArr[0] = w;
        fArr[1] = w2;
        fArr[2] = w3;
        fArr[3] = w4;
        fArr[4] = w5;
        fArr[5] = w6;
        fArr[6] = w7;
        fArr[7] = w8;
        fArr[8] = w9;
        fArr[9] = w10;
        fArr[10] = w11;
        fArr[11] = w12;
        fArr[12] = w13;
        fArr[13] = w14;
        fArr[14] = w15;
        fArr[15] = w16;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        int i2;
        pl1 pl1Var;
        int i3 = 1;
        if (!isFocused()) {
            ac0 b = gc0.b(i);
            if (b != null) {
                i2 = b.a;
            } else {
                i2 = 7;
            }
            jc0 focusOwner = getFocusOwner();
            if (rect != null) {
                pl1Var = fp.Y(rect);
            } else {
                pl1Var = null;
            }
            Boolean e = ((mc0) focusOwner).e(i2, pl1Var, new m5(i2, 0));
            Boolean bool = Boolean.TRUE;
            if (!sn0.r(e, bool)) {
                if (!sn0.r(((mc0) getFocusOwner()).e(i2, null, new m5(i2, i3)), bool)) {
                    if (!hasFocus() || (i2 != 1 && i2 != 2)) {
                        return false;
                    }
                    return ((mc0) getFocusOwner()).h(i2);
                }
            }
        }
        return true;
    }

    public final long s(long j) {
        A();
        long b = d01.b(j, this.d0);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.h0 >> 32)) + Float.intBitsToFloat((int) (b >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.h0 & 4294967295L)) + Float.intBitsToFloat((int) (b & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.C.l = j;
    }

    public final void setConfiguration(Configuration configuration) {
        this.M.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(p6 p6Var) {
        this.D = p6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [d21] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [d21] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [q41] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [q41] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public void setCoroutineContext(xu xuVar) {
        this.r = xuVar;
        d21 d21Var = getRoot().J.f;
        if (d21Var instanceof w42) {
            ((w42) d21Var).N0();
        }
        if (!d21Var.e.r) {
            kl0.b("visitSubtreeIf called on an unattached node");
        }
        q41 q41Var = new q41(new d21[16]);
        d21 d21Var2 = d21Var.e;
        d21 d21Var3 = d21Var2.j;
        if (d21Var3 == null) {
            hp.i(q41Var, d21Var2);
        } else {
            q41Var.b(d21Var3);
        }
        while (true) {
            int i = q41Var.g;
            if (i != 0) {
                d21 d21Var4 = (d21) q41Var.k(i - 1);
                if ((d21Var4.h & 16) != 0) {
                    for (d21 d21Var5 = d21Var4; d21Var5 != null && d21Var5.r; d21Var5 = d21Var5.j) {
                        if ((d21Var5.g & 16) != 0) {
                            rz rzVar = d21Var5;
                            ?? r4 = 0;
                            while (rzVar != 0) {
                                if (rzVar instanceof th1) {
                                    th1 th1Var = (th1) rzVar;
                                    if (th1Var instanceof w42) {
                                        ((w42) th1Var).N0();
                                    }
                                } else if ((rzVar.g & 16) != 0 && (rzVar instanceof rz)) {
                                    d21 d21Var6 = rzVar.t;
                                    int i2 = 0;
                                    rzVar = rzVar;
                                    r4 = r4;
                                    while (d21Var6 != null) {
                                        if ((d21Var6.g & 16) != 0) {
                                            i2++;
                                            r4 = r4;
                                            if (i2 == 1) {
                                                rzVar = d21Var6;
                                            } else {
                                                if (r4 == 0) {
                                                    r4 = new q41(new d21[16]);
                                                }
                                                if (rzVar != 0) {
                                                    r4.b(rzVar);
                                                    rzVar = 0;
                                                }
                                                r4.b(d21Var6);
                                            }
                                        }
                                        d21Var6 = d21Var6.j;
                                        rzVar = rzVar;
                                        r4 = r4;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                rzVar = hp.l(r4);
                            }
                        }
                    }
                }
                hp.i(q41Var, d21Var4);
            } else {
                return;
            }
        }
    }

    public final void setFrameEndScheduler$ui(xu0 xu0Var) {
        this.i = xu0Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.f0 = j;
    }

    public final void setOnViewTreeOwnersAvailable(oe0 oe0Var) {
        d5 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            oe0Var.invoke(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.k0 = oe0Var;
        }
    }

    /* renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m289setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(ek0 ek0Var) {
        this.g = ek0Var;
    }

    public void setUncaughtExceptionHandler(bp1 bp1Var) {
        this.W.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(boolean z) {
        k5 k5Var;
        g01 g01Var = this.W;
        if (!g01Var.b.m() && ((q41) g01Var.e.e).g == 0) {
            return;
        }
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (z) {
            try {
                k5Var = this.G0;
            } finally {
                Trace.endSection();
            }
        } else {
            k5Var = null;
        }
        if (g01Var.j(k5Var)) {
            requestLayout();
        }
        g01Var.a(false);
    }

    public final void u(ar0 ar0Var, long j) {
        g01 g01Var = this.W;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            g01Var.k(ar0Var, j);
            if (!g01Var.b.m()) {
                g01Var.a(false);
            }
            getRectManager().a();
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a8, code lost:
    
        r4.l(0, r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v() {
        /*
            r10 = this;
            boolean r0 = r10.P
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L48
            lc1 r0 = r10.getSnapshotObserver()
            c12 r0 = r0.a
            java.lang.Object r3 = r0.g
            monitor-enter(r3)
            q41 r0 = r0.f     // Catch: java.lang.Throwable -> L36
            int r4 = r0.g     // Catch: java.lang.Throwable -> L36
            r5 = r2
            r6 = r5
        L15:
            java.lang.Object[] r7 = r0.e
            if (r5 >= r4) goto L3b
            r7 = r7[r5]     // Catch: java.lang.Throwable -> L36
            b12 r7 = (defpackage.b12) r7     // Catch: java.lang.Throwable -> L36
            r7.d()     // Catch: java.lang.Throwable -> L36
            i41 r7 = r7.f     // Catch: java.lang.Throwable -> L36
            boolean r7 = r7.j()     // Catch: java.lang.Throwable -> L36
            if (r7 != 0) goto L2b
            int r6 = r6 + 1
            goto L38
        L2b:
            if (r6 <= 0) goto L38
            java.lang.Object[] r7 = r0.e     // Catch: java.lang.Throwable -> L36
            int r8 = r5 - r6
            r9 = r7[r5]     // Catch: java.lang.Throwable -> L36
            r7[r8] = r9     // Catch: java.lang.Throwable -> L36
            goto L38
        L36:
            r10 = move-exception
            goto L46
        L38:
            int r5 = r5 + 1
            goto L15
        L3b:
            int r5 = r4 - r6
            java.util.Arrays.fill(r7, r5, r4, r1)     // Catch: java.lang.Throwable -> L36
            r0.g = r5     // Catch: java.lang.Throwable -> L36
            monitor-exit(r3)
            r10.P = r2
            goto L48
        L46:
            monitor-exit(r3)
            throw r10
        L48:
            oa r0 = r10.T
            if (r0 == 0) goto L4f
            h(r0)
        L4f:
            t4 r0 = r10.O
            if (r0 == 0) goto L6f
            q31 r3 = r0.l
            int r4 = r3.d
            if (r4 != 0) goto L68
            boolean r4 = r0.m
            if (r4 == 0) goto L68
            rg2 r4 = r0.e
            java.lang.Object r4 = r4.f
            android.view.autofill.AutofillManager r4 = (android.view.autofill.AutofillManager) r4
            r4.commit()
            r0.m = r2
        L68:
            int r3 = r3.d
            if (r3 == 0) goto L6f
            r3 = 1
            r0.m = r3
        L6f:
            b41 r0 = r10.z0
            boolean r0 = r0.i()
            if (r0 == 0) goto Lac
            b41 r0 = r10.z0
            java.lang.Object r0 = r0.f(r2)
            if (r0 == 0) goto Lac
            b41 r0 = r10.z0
            int r0 = r0.b
            r3 = r2
        L84:
            b41 r4 = r10.z0
            if (r3 >= r0) goto La8
            java.lang.Object r4 = r4.f(r3)
            de0 r4 = (defpackage.de0) r4
            b41 r5 = r10.z0
            if (r3 < 0) goto La4
            int r6 = r5.b
            if (r3 >= r6) goto La4
            java.lang.Object[] r5 = r5.a
            r6 = r5[r3]
            r5[r3] = r1
            if (r4 == 0) goto La1
            r4.invoke()
        La1:
            int r3 = r3 + 1
            goto L84
        La4:
            r5.n(r3)
            throw r1
        La8:
            r4.l(r2, r0)
            goto L6f
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q5.v():void");
    }

    public final void w(ar0 ar0Var) {
        w5 w5Var = this.C;
        w5Var.C = true;
        if (w5Var.n()) {
            w5Var.o(ar0Var);
        }
        p6 p6Var = this.D;
        p6Var.k = true;
        if (p6Var.h()) {
            p6Var.l.j(od2.a);
        }
    }

    public final void x(ar0 ar0Var, boolean z, boolean z2, boolean z3) {
        ar0 v;
        ar0 v2;
        g01 g01Var = this.W;
        if (z) {
            ld ldVar = g01Var.b;
            ar0 ar0Var2 = ar0Var.m;
            er0 er0Var = ar0Var.K;
            if (ar0Var2 == null) {
                kl0.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
            }
            int ordinal = er0Var.d.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2 && ordinal != 3) {
                        if (ordinal == 4) {
                            if (!er0Var.e || z2) {
                                er0Var.e = true;
                                er0Var.p.y = true;
                                if (!ar0Var.S) {
                                    if ((!sn0.r(ar0Var.J(), Boolean.TRUE) && !g01.h(ar0Var)) || ((v = ar0Var.v()) != null && v.K.e)) {
                                        if ((ar0Var.I() || g01.i(ar0Var)) && ((v2 = ar0Var.v()) == null || !v2.q())) {
                                            ldVar.a(ar0Var, zn0.g);
                                        }
                                    } else {
                                        ldVar.a(ar0Var, zn0.e);
                                    }
                                    if (!g01Var.d && z3) {
                                        D(ar0Var);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        se.m();
                        return;
                    }
                } else {
                    return;
                }
            }
            g01Var.h.b(new f01(ar0Var, true, z2));
            return;
        }
        if (g01Var.p(ar0Var, z2) && z3) {
            D(ar0Var);
        }
    }

    public final void y(ar0 ar0Var, boolean z, boolean z2) {
        boolean z3;
        er0 er0Var = ar0Var.K;
        zn0 zn0Var = zn0.h;
        g01 g01Var = this.W;
        if (z) {
            ld ldVar = g01Var.b;
            int ordinal = er0Var.d.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                se.m();
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            if ((!er0Var.e && !er0Var.f) || z2) {
                er0Var.f = true;
                er0Var.g = true;
                i01 i01Var = er0Var.p;
                i01Var.z = true;
                i01Var.A = true;
                if (!ar0Var.S) {
                    ar0 v = ar0Var.v();
                    if (sn0.r(ar0Var.J(), Boolean.TRUE) && ((v == null || !v.K.e) && (v == null || !v.K.f))) {
                        ldVar.a(ar0Var, zn0.f);
                    } else if (ar0Var.I() && ((v == null || !v.p()) && (v == null || !v.q()))) {
                        ldVar.a(ar0Var, zn0Var);
                    }
                    if (!g01Var.d) {
                        D(null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        g01Var.getClass();
        int ordinal2 = er0Var.d.ordinal();
        if (ordinal2 != 0 && ordinal2 != 1 && ordinal2 != 2 && ordinal2 != 3) {
            if (ordinal2 == 4) {
                ar0 v2 = ar0Var.v();
                if (v2 != null && !v2.I()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!z2) {
                    if (!ar0Var.q()) {
                        if (ar0Var.p() && ar0Var.I() == z3 && ar0Var.I() == er0Var.p.x) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                i01 i01Var2 = er0Var.p;
                i01Var2.z = true;
                i01Var2.A = true;
                if (!ar0Var.S && i01Var2.x && z3) {
                    if ((v2 == null || !v2.p()) && (v2 == null || !v2.q())) {
                        g01Var.b.a(ar0Var, zn0Var);
                    }
                    if (!g01Var.d) {
                        D(null);
                        return;
                    }
                    return;
                }
                return;
            }
            se.m();
        }
    }

    public final void z() {
        w5 w5Var = this.C;
        w5Var.C = true;
        if (w5Var.n() && !w5Var.N) {
            w5Var.N = true;
            w5Var.n.post(w5Var.P);
        }
        p6 p6Var = this.D;
        p6Var.k = true;
        if (p6Var.h() && !p6Var.r) {
            p6Var.r = true;
            p6Var.m.post(p6Var.s);
        }
    }

    public p4 getAccessibilityManager() {
        return this.E;
    }

    public w4 getClipboard() {
        return this.R;
    }

    public x4 getClipboardManager() {
        return this.Q;
    }

    /* renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public f7 m293getDragAndDropManager() {
        return this.s;
    }

    /* renamed from: getLayoutNodes, reason: merged with bridge method [inline-methods] */
    public p31 m294getLayoutNodes() {
        return this.y;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i;
        generateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @f00
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m287getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @f00
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public void setShowLayoutBounds(boolean z) {
    }

    public final void setUncaughtExceptionHandler$ui(bp1 bp1Var) {
    }
}
